package cht.eric.services;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import cht.eric.mappers.BasePostMapper;
import cht.eric.mappers.BasePutMapper;

@Service
public class BaseRestfulService<Entity, EntityId, PostDTO, PutDTO> {
    private final JpaRepository<Entity, EntityId> repository;
    private final BasePostMapper<PostDTO, Entity> createdMapper;
    private final BasePutMapper<PutDTO, Entity> updatedMapper;

    public BaseRestfulService(
        JpaRepository<Entity, EntityId> repository,
        BasePostMapper<PostDTO, Entity> createdMapper,
        BasePutMapper<PutDTO, Entity> updatedMapper
    ) {
        this.repository = repository;
        this.createdMapper = createdMapper;
        this.updatedMapper = updatedMapper;
    }

    public Entity createEntity(PostDTO postDTO) {
        Entity createdEntity = createdMapper.mapToDestination(postDTO);
        return repository.save(createdEntity);
    }

    public Entity updateEntity(EntityId updateEntityId, PutDTO putDTO) {
        Optional<Entity> targetUpdatedEntity = repository.findById(
            updateEntityId
        );

        if (targetUpdatedEntity.isPresent()) {
            updatedMapper.updateToDestination(targetUpdatedEntity.get(), putDTO);
            return repository.save(targetUpdatedEntity.get());
        } else {
            return null;
        }
    }

    public boolean deleteEntity(EntityId deleteEntityId) {
        if (repository.existsById(deleteEntityId)) {
            repository.deleteById(deleteEntityId);
            return true;
        } else {
            return false;
        }
    }
}
