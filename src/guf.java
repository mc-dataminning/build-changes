import java.util.function.Consumer;

@FunctionalInterface
public interface guf {
   guf a = ($$0, $$1) -> {
   };

   default guf decorate(Consumer<guj.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gug var1, Consumer<guj.a> var2);
}
