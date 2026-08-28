import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ga implements Predicate<dzs> {
   private final dzo a;
   private final Set<ear<?>> b;
   @Nullable
   private final tx c;

   public ga(dzo $$0, Set<ear<?>> $$1, @Nullable tx $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dzo a() {
      return this.a;
   }

   public Set<ear<?>> b() {
      return this.b;
   }

   public boolean a(dzs $$0) {
      dzo $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (ear<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dwn $$3 = $$0.b();
            return $$3 != null && um.a(this.c, $$3.b($$0.c().F_()), true);
         }
      }
   }

   public boolean a(aro $$0, iu $$1) {
      return this.a(new dzs($$0, $$1, false));
   }

   public boolean a(aro $$0, iu $$1, int $$2) {
      dzo $$3 = ($$2 & 16) != 0 ? this.a : dlu.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      $$3 = this.a($$3);
      boolean $$4 = false;
      if ($$0.a($$1, $$3, $$2)) {
         $$4 = true;
      }

      if (this.c != null) {
         dwn $$5 = $$0.c_($$1);
         if ($$5 != null) {
            tx $$6 = $$5.d($$0.F_());
            $$5.c(this.c, $$0.F_());
            tx $$7 = $$5.d($$0.F_());
            if (!$$7.equals($$6)) {
               $$4 = true;
               $$5.e();
               $$0.m().a($$1);
            }
         }
      }

      return $$4;
   }

   private dzo a(dzo $$0) {
      if ($$0 == this.a) {
         return $$0;
      } else {
         for (ear<?> $$1 : this.b) {
            $$0 = a($$0, this.a, $$1);
         }

         return $$0;
      }
   }

   private static <T extends Comparable<T>> dzo a(dzo $$0, dzo $$1, ear<T> $$2) {
      return $$0.c($$2, $$1.c($$2));
   }
}
