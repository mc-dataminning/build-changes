import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gn implements Predicate<dxz> {
   private final dxv a;
   private final Set<dyx<?>> b;
   @Nullable
   private final ux c;

   public gn(dxv $$0, Set<dyx<?>> $$1, @Nullable ux $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dxv a() {
      return this.a;
   }

   public Set<dyx<?>> b() {
      return this.b;
   }

   public boolean a(dxz $$0) {
      dxv $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dyx<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dux $$3 = $$0.b();
            return $$3 != null && vm.a(this.c, $$3.b($$0.c().K_()), true);
         }
      }
   }

   public boolean a(ash $$0, jh $$1) {
      return this.a(new dxz($$0, $$1, false));
   }

   public boolean a(ash $$0, jh $$1, int $$2) {
      dxv $$3 = dkm.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dux $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.K_());
            }
         }

         return true;
      }
   }
}
