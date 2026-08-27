import java.util.function.Consumer;

@FunctionalInterface
public interface gvy {
   gvy a = ($$0, $$1) -> {
   };

   default gvy decorate(Consumer<gwc.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gvz var1, Consumer<gwc.a> var2);
}
