import java.util.function.Consumer;

@FunctionalInterface
public interface gvl {
   gvl a = ($$0, $$1) -> {
   };

   default gvl decorate(Consumer<gvp.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gvm var1, Consumer<gvp.a> var2);
}
