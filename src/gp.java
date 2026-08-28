import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gp implements Predicate<dyq> {
   private final dym a;
   private final Set<dzp<?>> b;
   @Nullable
   private final tw c;

   public gp(dym $$0, Set<dzp<?>> $$1, @Nullable tw $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dym a() {
      return this.a;
   }

   public Set<dzp<?>> b() {
      return this.b;
   }

   public boolean a(dyq $$0) {
      dym $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dzp<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dvl $$3 = $$0.b();
            return $$3 != null && ul.a(this.c, $$3.b($$0.c().F_()), true);
         }
      }
   }

   public boolean a(arn $$0, jj $$1) {
      return this.a(new dyq($$0, $$1, false));
   }

   public boolean a(arn $$0, jj $$1, int $$2) {
      dym $$3 = ($$2 & 16) != 0 ? this.a : dku.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      $$3 = this.a($$3);
      boolean $$4 = false;
      if ($$0.a($$1, $$3, $$2)) {
         $$4 = true;
      }

      if (this.c != null) {
         dvl $$5 = $$0.c_($$1);
         if ($$5 != null) {
            tw $$6 = $$5.d($$0.F_());
            $$5.c(this.c, $$0.F_());
            tw $$7 = $$5.d($$0.F_());
            if (!$$7.equals($$6)) {
               $$4 = true;
               $$5.e();
               $$0.m().a($$1);
            }
         }
      }

      return $$4;
   }

   private dym a(dym $$0) {
      if ($$0 == this.a) {
         return $$0;
      } else {
         for (dzp<?> $$1 : this.b) {
            $$0 = a($$0, this.a, $$1);
         }

         return $$0;
      }
   }

   private static <T extends Comparable<T>> dym a(dym $$0, dym $$1, dzp<T> $$2) {
      return $$0.c($$2, $$1.c($$2));
   }
}
