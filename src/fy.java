import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fy implements Predicate<dtg> {
   private final dtc a;
   private final Set<duf<?>> b;
   @Nullable
   private final uk c;

   public fy(dtc $$0, Set<duf<?>> $$1, @Nullable uk $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dtc a() {
      return this.a;
   }

   public Set<duf<?>> b() {
      return this.b;
   }

   public boolean a(dtg $$0) {
      dtc $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (duf<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dqc $$3 = $$0.b();
            return $$3 != null && uz.a(this.c, $$3.b($$0.c().I_()), true);
         }
      }
   }

   public boolean a(aqt $$0, ir $$1) {
      return this.a(new dtg($$0, $$1, false));
   }

   public boolean a(aqt $$0, ir $$1, int $$2) {
      dtc $$3 = dfc.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dqc $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c, $$0.I_());
            }
         }

         return true;
      }
   }
}
