import java.util.function.Consumer;

public interface fvf extends fvg {
   void b(Consumer<fvg> var1);

   @Override
   default void a(Consumer<fro> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fvf $$1) {
            $$1.a();
         }
      });
   }
}
