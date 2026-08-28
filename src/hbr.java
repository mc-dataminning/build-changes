import java.util.function.Consumer;

@FunctionalInterface
public interface hbr {
   hbr a = ($$0, $$1) -> {
   };

   default hbr decorate(Consumer<hbv.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hbs var1, Consumer<hbv.a> var2);
}
