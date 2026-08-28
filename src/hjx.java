import java.util.function.Consumer;

@FunctionalInterface
public interface hjx {
   hjx a = ($$0, $$1) -> {
   };

   default hjx decorate(Consumer<hkb.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hjy var1, Consumer<hkb.a> var2);
}
