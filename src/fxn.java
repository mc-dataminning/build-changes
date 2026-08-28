import java.util.function.Consumer;

public interface fxn extends fxo {
   void b(Consumer<fxo> var1);

   @Override
   default void a(Consumer<ftw> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fxn $$1) {
            $$1.a();
         }
      });
   }
}
