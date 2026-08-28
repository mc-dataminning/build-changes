import java.util.function.Consumer;

@FunctionalInterface
public interface hdn {
   hdn a = ($$0, $$1) -> {
   };

   default hdn decorate(Consumer<hdr.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hdo var1, Consumer<hdr.a> var2);
}
