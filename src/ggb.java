import java.util.function.Consumer;

@FunctionalInterface
public interface ggb {
   ggb a = ($$0, $$1) -> {
   };

   default ggb decorate(Consumer<ggf.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(ggc var1, Consumer<ggf.a> var2);
}
