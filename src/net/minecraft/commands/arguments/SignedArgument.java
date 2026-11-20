package net.minecraft.commands.arguments;

public interface SignedArgument<T> extends SerializableArgument<T> {
   @Override
   SerializableArgument.Type<? extends SignedArgument<T>> type();
}
