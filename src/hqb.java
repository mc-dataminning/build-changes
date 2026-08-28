import java.util.function.Consumer;

@FunctionalInterface
public interface hqb {
   hqb a = ($$0, $$1) -> {
   };

   default hqb decorate(Consumer<hqf.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hqc var1, Consumer<hqf.a> var2);
}
