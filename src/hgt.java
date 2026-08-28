import java.util.function.Consumer;

@FunctionalInterface
public interface hgt {
   hgt a = ($$0, $$1) -> {
   };

   default hgt decorate(Consumer<hgx.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hgu var1, Consumer<hgx.a> var2);
}
