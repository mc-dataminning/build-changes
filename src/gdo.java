import java.util.function.Consumer;

@FunctionalInterface
public interface gdo {
   gdo a = ($$0, $$1) -> {
   };

   default gdo decorate(Consumer<gds.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gdp var1, Consumer<gds.a> var2);
}
