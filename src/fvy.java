import java.util.function.Consumer;

public interface fvy extends fvz {
   void b(Consumer<fvz> var1);

   @Override
   default void a(Consumer<fsh> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fvy $$1) {
            $$1.a();
         }
      });
   }
}
