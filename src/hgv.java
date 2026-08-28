import java.util.function.Consumer;

@FunctionalInterface
public interface hgv {
   hgv a = ($$0, $$1) -> {
   };

   default hgv decorate(Consumer<hgz.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hgw var1, Consumer<hgz.a> var2);
}
