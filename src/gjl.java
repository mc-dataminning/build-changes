import java.util.function.Consumer;

@FunctionalInterface
public interface gjl {
   gjl a = ($$0, $$1) -> {
   };

   default gjl decorate(Consumer<gjp.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gjm var1, Consumer<gjp.a> var2);
}
