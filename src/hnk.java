import java.util.function.Consumer;

@FunctionalInterface
public interface hnk {
   hnk a = ($$0, $$1) -> {
   };

   default hnk decorate(Consumer<hno.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hnl var1, Consumer<hno.a> var2);
}
