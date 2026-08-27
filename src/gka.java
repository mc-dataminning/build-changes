import java.util.function.Consumer;

@FunctionalInterface
public interface gka {
   gka a = ($$0, $$1) -> {
   };

   default gka decorate(Consumer<gke.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gkb var1, Consumer<gke.a> var2);
}
