import java.util.function.Consumer;

@FunctionalInterface
public interface gii {
   gii a = ($$0, $$1) -> {
   };

   default gii decorate(Consumer<gim.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gij var1, Consumer<gim.a> var2);
}
