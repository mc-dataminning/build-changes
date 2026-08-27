import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface lq {
   aep a = new aep("recipes/root");

   lq a(String var1, am var2);

   lq a(@Nullable String var1);

   cir a();

   void a(Consumer<lp> var1, aep var2);

   default void a(Consumer<lp> $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(Consumer<lp> $$0, String $$1) {
      aep $$2 = a(this.a());
      aep $$3 = new aep($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static aep a(cpj $$0) {
      return jc.i.b($$0.k());
   }
}
