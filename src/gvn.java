import java.util.function.Consumer;

@FunctionalInterface
public interface gvn {
   gvn a = ($$0, $$1) -> {
   };

   default gvn decorate(Consumer<gvr.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gvo var1, Consumer<gvr.a> var2);
}
