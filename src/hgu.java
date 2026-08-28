import java.util.function.Consumer;

@FunctionalInterface
public interface hgu {
   hgu a = ($$0, $$1) -> {
   };

   default hgu decorate(Consumer<hgy.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hgv var1, Consumer<hgy.a> var2);
}
