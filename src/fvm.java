import java.time.Duration;
import javax.annotation.Nullable;

public class fvm {
   @Nullable
   private fvj a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fvj $$0) {
      this.a = $$0;
   }

   @Nullable
   public fvj a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fyf $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fqq.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ag.c();
            }

            this.d = $$3;
         }

         if ($$3 && ag.c() - this.c > this.b.toMillis()) {
            fzq $$4 = fqq.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private gcd a(fyf $$0, boolean $$1, boolean $$2) {
      return (gcd)(!$$1 && $$2 && fqq.Q().aX().b() ? new gby($$0) : new gcf($$0));
   }

   public void a(fxv $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
