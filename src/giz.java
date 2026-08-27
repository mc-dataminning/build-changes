import java.util.function.Consumer;

@FunctionalInterface
public interface giz {
   giz a = ($$0, $$1) -> {
   };

   default giz decorate(Consumer<gjd.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gja var1, Consumer<gjd.a> var2);
}
