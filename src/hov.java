import java.util.function.Consumer;

@FunctionalInterface
public interface hov {
   hov a = ($$0, $$1) -> {
   };

   default hov decorate(Consumer<hoz.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(how var1, Consumer<hoz.a> var2);
}
