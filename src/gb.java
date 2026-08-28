import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gb implements Predicate<eas> {
   private final eao a;
   private final Set<ebr<?>> b;
   @Nullable
   private final tz c;

   public gb(eao $$0, Set<ebr<?>> $$1, @Nullable tz $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public eao a() {
      return this.a;
   }

   public Set<ebr<?>> b() {
      return this.b;
   }

   public boolean a(eas $$0) {
      eao $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (ebr<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dxm $$3 = $$0.b();
            return $$3 != null && uo.a(this.c, $$3.b($$0.c().F_()), true);
         }
      }
   }

   public boolean a(arq $$0, iv $$1) {
      return this.a(new eas($$0, $$1, false));
   }

   public boolean a(arq $$0, iv $$1, int $$2) {
      eao $$3 = ($$2 & 16) != 0 ? this.a : dmm.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      $$3 = this.a($$3);
      boolean $$4 = false;
      if ($$0.a($$1, $$3, $$2)) {
         $$4 = true;
      }

      if (this.c != null) {
         dxm $$5 = $$0.c_($$1);
         if ($$5 != null) {
            tz $$6 = $$5.d($$0.F_());
            $$5.c(this.c, $$0.F_());
            tz $$7 = $$5.d($$0.F_());
            if (!$$7.equals($$6)) {
               $$4 = true;
               $$5.e();
               $$0.m().a($$1);
            }
         }
      }

      return $$4;
   }

   private eao a(eao $$0) {
      if ($$0 == this.a) {
         return $$0;
      } else {
         for (ebr<?> $$1 : this.b) {
            $$0 = a($$0, this.a, $$1);
         }

         return $$0;
      }
   }

   private static <T extends Comparable<T>> eao a(eao $$0, eao $$1, ebr<T> $$2) {
      return $$0.c($$2, $$1.c($$2));
   }
}
