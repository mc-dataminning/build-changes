import java.util.function.Consumer;

public interface fya extends fyb {
   void b(Consumer<fyb> var1);

   @Override
   default void a(Consumer<fuj> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fya $$1) {
            $$1.a();
         }
      });
   }
}
