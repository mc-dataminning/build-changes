import java.util.function.Consumer;

@FunctionalInterface
public interface gty {
   gty a = ($$0, $$1) -> {
   };

   default gty decorate(Consumer<guc.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gtz var1, Consumer<guc.a> var2);
}
