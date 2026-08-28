import java.util.function.Consumer;

@FunctionalInterface
public interface hke {
   hke a = ($$0, $$1) -> {
   };

   default hke decorate(Consumer<hki.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hkf var1, Consumer<hki.a> var2);
}
