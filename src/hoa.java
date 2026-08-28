import java.util.function.Consumer;

@FunctionalInterface
public interface hoa {
   hoa a = ($$0, $$1) -> {
   };

   default hoa decorate(Consumer<hoe.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hob var1, Consumer<hoe.a> var2);
}
