import java.util.function.Consumer;

@FunctionalInterface
public interface hed {
   hed a = ($$0, $$1) -> {
   };

   default hed decorate(Consumer<heh.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hee var1, Consumer<heh.a> var2);
}
