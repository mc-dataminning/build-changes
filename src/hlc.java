import java.util.function.Consumer;

@FunctionalInterface
public interface hlc {
   hlc a = ($$0, $$1) -> {
   };

   default hlc decorate(Consumer<hlg.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hld var1, Consumer<hlg.a> var2);
}
