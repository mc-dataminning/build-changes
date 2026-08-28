import java.util.function.Consumer;

public interface fwk extends fwl {
   void b(Consumer<fwl> var1);

   @Override
   default void a(Consumer<fst> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fwk $$1) {
            $$1.a();
         }
      });
   }
}
