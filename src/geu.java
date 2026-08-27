import java.util.function.Consumer;

@FunctionalInterface
public interface geu {
   geu a = ($$0, $$1) -> {
   };

   default geu decorate(Consumer<gey.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gev var1, Consumer<gey.a> var2);
}
