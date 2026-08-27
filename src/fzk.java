import java.util.function.Consumer;

@FunctionalInterface
public interface fzk {
   fzk a = ($$0, $$1) -> {
   };

   default fzk decorate(Consumer<fzo.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(fzl var1, Consumer<fzo.a> var2);
}
