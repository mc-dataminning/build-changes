import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gn implements Predicate<dvs> {
   private final dvo a;
   private final Set<dwq<?>> b;
   @Nullable
   private final un c;

   public gn(dvo $$0, Set<dwq<?>> $$1, @Nullable un $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dvo a() {
      return this.a;
   }

   public Set<dwq<?>> b() {
      return this.b;
   }

   public boolean a(dvs $$0) {
      dvo $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dwq<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dsr $$3 = $$0.b();
            return $$3 != null && vc.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(arq $$0, jh $$1) {
      return this.a(new dvs($$0, $$1, false));
   }

   public boolean a(arq $$0, jh $$1, int $$2) {
      dvo $$3 = dij.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dsr $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
