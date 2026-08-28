import java.util.function.Consumer;

@FunctionalInterface
public interface hqn {
   hqn a = ($$0, $$1) -> {
   };

   default hqn decorate(Consumer<hqr.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hqo var1, Consumer<hqr.a> var2);
}
