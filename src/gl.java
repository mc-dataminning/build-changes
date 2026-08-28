import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gl implements Predicate<duw> {
   private final dus a;
   private final Set<dvv<?>> b;
   @Nullable
   private final ug c;

   public gl(dus $$0, Set<dvv<?>> $$1, @Nullable ug $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dus a() {
      return this.a;
   }

   public Set<dvv<?>> b() {
      return this.b;
   }

   public boolean a(duw $$0) {
      dus $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dvv<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            drv $$3 = $$0.b();
            return $$3 != null && uv.a(this.c, $$3.b($$0.c().G_()), true);
         }
      }
   }

   public boolean a(arj $$0, jf $$1) {
      return this.a(new duw($$0, $$1, false));
   }

   public boolean a(arj $$0, jf $$1, int $$2) {
      dus $$3 = dhm.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            drv $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.G_());
            }
         }

         return true;
      }
   }
}
