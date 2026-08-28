import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gm implements Predicate<dvh> {
   private final dvd a;
   private final Set<dwg<?>> b;
   @Nullable
   private final uj c;

   public gm(dvd $$0, Set<dwg<?>> $$1, @Nullable uj $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dvd a() {
      return this.a;
   }

   public Set<dwg<?>> b() {
      return this.b;
   }

   public boolean a(dvh $$0) {
      dvd $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dwg<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dsg $$3 = $$0.b();
            return $$3 != null && uy.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(arm $$0, jg $$1) {
      return this.a(new dvh($$0, $$1, false));
   }

   public boolean a(arm $$0, jg $$1, int $$2) {
      dvd $$3 = dhy.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dsg $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
