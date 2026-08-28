import java.util.function.Consumer;

@FunctionalInterface
public interface hkc {
   hkc a = ($$0, $$1) -> {
   };

   default hkc decorate(Consumer<hkg.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hkd var1, Consumer<hkg.a> var2);
}
