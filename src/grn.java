import java.util.function.Consumer;

@FunctionalInterface
public interface grn {
   grn a = ($$0, $$1) -> {
   };

   default grn decorate(Consumer<grr.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gro var1, Consumer<grr.a> var2);
}
