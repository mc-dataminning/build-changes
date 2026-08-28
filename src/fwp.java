import java.util.function.Consumer;

public interface fwp extends fwq {
   void b(Consumer<fwq> var1);

   @Override
   default void a(Consumer<fsy> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fwp $$1) {
            $$1.a();
         }
      });
   }
}
