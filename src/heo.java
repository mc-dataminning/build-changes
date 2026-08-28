import java.util.function.Consumer;

@FunctionalInterface
public interface heo {
   heo a = ($$0, $$1) -> {
   };

   default heo decorate(Consumer<hes.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hep var1, Consumer<hes.a> var2);
}
