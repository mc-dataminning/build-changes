import java.util.function.Consumer;

@FunctionalInterface
public interface gma {
   gma a = ($$0, $$1) -> {
   };

   default gma decorate(Consumer<gme.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gmb var1, Consumer<gme.a> var2);
}
