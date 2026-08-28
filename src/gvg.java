import java.util.function.Consumer;

@FunctionalInterface
public interface gvg {
   gvg a = ($$0, $$1) -> {
   };

   default gvg decorate(Consumer<gvk.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gvh var1, Consumer<gvk.a> var2);
}
