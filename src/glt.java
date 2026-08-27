import java.util.function.Consumer;

@FunctionalInterface
public interface glt {
   glt a = ($$0, $$1) -> {
   };

   default glt decorate(Consumer<glx.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(glu var1, Consumer<glx.a> var2);
}
