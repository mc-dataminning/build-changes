import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gn implements Predicate<dxy> {
   private final dxu a;
   private final Set<dyw<?>> b;
   @Nullable
   private final ux c;

   public gn(dxu $$0, Set<dyw<?>> $$1, @Nullable ux $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dxu a() {
      return this.a;
   }

   public Set<dyw<?>> b() {
      return this.b;
   }

   public boolean a(dxy $$0) {
      dxu $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dyw<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            duw $$3 = $$0.b();
            return $$3 != null && vm.a(this.c, $$3.b($$0.c().K_()), true);
         }
      }
   }

   public boolean a(ash $$0, jh $$1) {
      return this.a(new dxy($$0, $$1, false));
   }

   public boolean a(ash $$0, jh $$1, int $$2) {
      dxu $$3 = dkl.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            duw $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.K_());
            }
         }

         return true;
      }
   }
}
