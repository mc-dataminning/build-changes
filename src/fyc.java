import java.util.function.Consumer;

public interface fyc extends fyd {
   void b(Consumer<fyd> var1);

   @Override
   default void a(Consumer<ful> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fyc $$1) {
            $$1.a();
         }
      });
   }
}
