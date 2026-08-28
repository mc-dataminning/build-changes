import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gn implements Predicate<dxr> {
   private final dxn a;
   private final Set<dyp<?>> b;
   @Nullable
   private final ux c;

   public gn(dxn $$0, Set<dyp<?>> $$1, @Nullable ux $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dxn a() {
      return this.a;
   }

   public Set<dyp<?>> b() {
      return this.b;
   }

   public boolean a(dxr $$0) {
      dxn $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dyp<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dup $$3 = $$0.b();
            return $$3 != null && vm.a(this.c, $$3.b($$0.c().K_()), true);
         }
      }
   }

   public boolean a(ash $$0, jh $$1) {
      return this.a(new dxr($$0, $$1, false));
   }

   public boolean a(ash $$0, jh $$1, int $$2) {
      dxn $$3 = dke.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dup $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.K_());
            }
         }

         return true;
      }
   }
}
