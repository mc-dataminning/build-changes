import java.util.function.Consumer;

@FunctionalInterface
public interface hgo {
   hgo a = ($$0, $$1) -> {
   };

   default hgo decorate(Consumer<hgs.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hgp var1, Consumer<hgs.a> var2);
}
