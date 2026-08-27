import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface gq<T> {
   void execute(T var1, gn<T> var2, int var3) throws CommandSyntaxException;

   default gm<T> bind(T $$0) {
      return ($$1, $$2) -> this.execute($$0, $$1, $$2);
   }
}
