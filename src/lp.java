import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface lp {
   aer a = new aer("recipes/root");

   lp a(String var1, am var2);

   lp a(@Nullable String var1);

   cit a();

   void a(Consumer<lo> var1, aer var2);

   default void a(Consumer<lo> $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(Consumer<lo> $$0, String $$1) {
      aer $$2 = a(this.a());
      aer $$3 = new aer($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static aer a(cpl $$0) {
      return jb.i.b($$0.k());
   }
}
