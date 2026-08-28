import java.util.function.Consumer;

@FunctionalInterface
public interface hdc {
   hdc a = ($$0, $$1) -> {
   };

   default hdc decorate(Consumer<hdg.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hdd var1, Consumer<hdg.a> var2);
}
