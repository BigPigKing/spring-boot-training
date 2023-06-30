package cht.eric.mappers;

import org.mapstruct.MappingTarget;

public interface BasePutMapper<S, D> {
    public D mapToDestination(S source);
    public S mapToSource(D destination);
    public void updateToSource(@MappingTarget S source, D destination);
    public void updateToDestination(@MappingTarget D destination, S source);
}
