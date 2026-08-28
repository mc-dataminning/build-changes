import java.time.Duration;
import javax.annotation.Nullable;

public class fuj {
   @Nullable
   private fug a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fug $$0) {
      this.a = $$0;
   }

   @Nullable
   public fug a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fxc $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fpo.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ag.c();
            }

            this.d = $$3;
         }

         if ($$3 && ag.c() - this.c > this.b.toMillis()) {
            fyn $$4 = fpo.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private gba a(fxc $$0, boolean $$1, boolean $$2) {
      return (gba)(!$$1 && $$2 && fpo.Q().aX().b() ? new gav($$0) : new gbc($$0));
   }

   public void a(fws $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
