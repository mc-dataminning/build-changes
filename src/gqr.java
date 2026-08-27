import java.util.function.Consumer;

@FunctionalInterface
public interface gqr {
   gqr a = ($$0, $$1) -> {
   };

   default gqr decorate(Consumer<gqv.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gqs var1, Consumer<gqv.a> var2);
}
