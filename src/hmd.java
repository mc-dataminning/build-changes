import java.util.function.Consumer;

@FunctionalInterface
public interface hmd {
   hmd a = ($$0, $$1) -> {
   };

   default hmd decorate(Consumer<hmh.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hme var1, Consumer<hmh.a> var2);
}
