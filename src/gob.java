import java.util.function.Consumer;

@FunctionalInterface
public interface gob {
   gob a = ($$0, $$1) -> {
   };

   default gob decorate(Consumer<gof.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(goc var1, Consumer<gof.a> var2);
}
