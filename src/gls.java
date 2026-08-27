import java.util.function.Consumer;

@FunctionalInterface
public interface gls {
   gls a = ($$0, $$1) -> {
   };

   default gls decorate(Consumer<glw.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(glt var1, Consumer<glw.a> var2);
}
