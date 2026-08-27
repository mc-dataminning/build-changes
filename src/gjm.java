import java.util.function.Consumer;

@FunctionalInterface
public interface gjm {
   gjm a = ($$0, $$1) -> {
   };

   default gjm decorate(Consumer<gjq.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gjn var1, Consumer<gjq.a> var2);
}
