import java.util.function.Consumer;

@FunctionalInterface
public interface hci {
   hci a = ($$0, $$1) -> {
   };

   default hci decorate(Consumer<hcm.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hcj var1, Consumer<hcm.a> var2);
}
