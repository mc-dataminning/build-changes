import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gn implements Predicate<dxs> {
   private final dxo a;
   private final Set<dyq<?>> b;
   @Nullable
   private final um c;

   public gn(dxo $$0, Set<dyq<?>> $$1, @Nullable um $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dxo a() {
      return this.a;
   }

   public Set<dyq<?>> b() {
      return this.b;
   }

   public boolean a(dxs $$0) {
      dxo $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dyq<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            duq $$3 = $$0.b();
            return $$3 != null && vb.a(this.c, $$3.b($$0.c().K_()), true);
         }
      }
   }

   public boolean a(arx $$0, jh $$1) {
      return this.a(new dxs($$0, $$1, false));
   }

   public boolean a(arx $$0, jh $$1, int $$2) {
      dxo $$3 = dkd.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      $$3 = this.a($$3);
      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            duq $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.K_());
            }
         }

         return true;
      }
   }

   private dxo a(dxo $$0) {
      if ($$0 == this.a) {
         return $$0;
      } else {
         for (dyq<?> $$1 : this.b) {
            $$0 = a($$0, this.a, $$1);
         }

         return $$0;
      }
   }

   private static <T extends Comparable<T>> dxo a(dxo $$0, dxo $$1, dyq<T> $$2) {
      return $$0.b($$2, $$1.c($$2));
   }
}
