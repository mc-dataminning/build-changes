import java.util.function.Consumer;

@FunctionalInterface
public interface hjw {
   hjw a = ($$0, $$1) -> {
   };

   default hjw decorate(Consumer<hka.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hjx var1, Consumer<hka.a> var2);
}
