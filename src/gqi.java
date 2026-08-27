import java.util.function.Consumer;

@FunctionalInterface
public interface gqi {
   gqi a = ($$0, $$1) -> {
   };

   default gqi decorate(Consumer<gqm.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gqj var1, Consumer<gqm.a> var2);
}
