import java.util.function.Consumer;

@FunctionalInterface
public interface hkd {
   hkd a = ($$0, $$1) -> {
   };

   default hkd decorate(Consumer<hkh.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hke var1, Consumer<hkh.a> var2);
}
