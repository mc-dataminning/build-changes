import java.util.function.Consumer;

public interface fvr extends fvs {
   void b(Consumer<fvs> var1);

   @Override
   default void a(Consumer<fsa> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fvr $$1) {
            $$1.a();
         }
      });
   }
}
