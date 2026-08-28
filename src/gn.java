import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gn implements Predicate<dvz> {
   private final dvv a;
   private final Set<dwx<?>> b;
   @Nullable
   private final ul c;

   public gn(dvv $$0, Set<dwx<?>> $$1, @Nullable ul $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dvv a() {
      return this.a;
   }

   public Set<dwx<?>> b() {
      return this.b;
   }

   public boolean a(dvz $$0) {
      dvv $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dwx<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dsy $$3 = $$0.b();
            return $$3 != null && va.a(this.c, $$3.b($$0.c().J_()), true);
         }
      }
   }

   public boolean a(arp $$0, jh $$1) {
      return this.a(new dvz($$0, $$1, false));
   }

   public boolean a(arp $$0, jh $$1, int $$2) {
      dvv $$3 = diq.b(this.a, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dsy $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.c(this.c, $$0.J_());
            }
         }

         return true;
      }
   }
}
