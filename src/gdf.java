import java.util.function.Consumer;

@FunctionalInterface
public interface gdf {
   gdf a = ($$0, $$1) -> {
   };

   default gdf decorate(Consumer<gdj.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(gdg var1, Consumer<gdj.a> var2);
}
