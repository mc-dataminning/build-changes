import java.util.function.Consumer;

@FunctionalInterface
public interface gjk {
   gjk a = ($$0, $$1) -> {
   };

   default gjk decorate(Consumer<gjo.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gjl var1, Consumer<gjo.a> var2);
}
