import java.util.function.Consumer;

@FunctionalInterface
public interface hcn {
   hcn a = ($$0, $$1) -> {
   };

   default hcn decorate(Consumer<hcr.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hco var1, Consumer<hcr.a> var2);
}
