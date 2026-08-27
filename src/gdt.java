import java.util.function.Consumer;

@FunctionalInterface
public interface gdt {
   gdt a = ($$0, $$1) -> {
   };

   default gdt decorate(Consumer<gdx.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gdu var1, Consumer<gdx.a> var2);
}
