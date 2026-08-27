import java.util.function.Consumer;

@FunctionalInterface
public interface gry {
   gry a = ($$0, $$1) -> {
   };

   default gry decorate(Consumer<gsc.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(grz var1, Consumer<gsc.a> var2);
}
