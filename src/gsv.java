import java.util.function.Consumer;

@FunctionalInterface
public interface gsv {
   gsv a = ($$0, $$1) -> {
   };

   default gsv decorate(Consumer<gsz.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gsw var1, Consumer<gsz.a> var2);
}
