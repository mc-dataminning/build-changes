import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface lp {
   acq a = new acq("recipes/root");

   lp a(String var1, am var2);

   lp a(@Nullable String var1);

   cfu a();

   void a(Consumer<lo> var1, acq var2);

   default void a(Consumer<lo> $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(Consumer<lo> $$0, String $$1) {
      acq $$2 = a(this.a());
      acq $$3 = new acq($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static acq a(cml $$0) {
      return jb.i.b($$0.k());
   }
}
