import java.util.function.Consumer;

@FunctionalInterface
public interface gny {
   gny a = ($$0, $$1) -> {
   };

   default gny decorate(Consumer<goc.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gnz var1, Consumer<goc.a> var2);
}
