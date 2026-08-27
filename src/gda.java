import java.util.function.Consumer;

@FunctionalInterface
public interface gda {
   gda a = ($$0, $$1) -> {
   };

   default gda decorate(Consumer<gde.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gdb var1, Consumer<gde.a> var2);
}
