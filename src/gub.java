import java.util.function.Consumer;

@FunctionalInterface
public interface gub {
   gub a = ($$0, $$1) -> {
   };

   default gub decorate(Consumer<guf.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(guc var1, Consumer<guf.a> var2);
}
