import java.time.Duration;
import javax.annotation.Nullable;

public class fwb {
   @Nullable
   private fvy a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fvy $$0) {
      this.a = $$0;
   }

   @Nullable
   public fvy a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fyu $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && frf.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ag.c();
            }

            this.d = $$3;
         }

         if ($$3 && ag.c() - this.c > this.b.toMillis()) {
            gaf $$4 = frf.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private gcs a(fyu $$0, boolean $$1, boolean $$2) {
      return (gcs)(!$$1 && $$2 && frf.Q().aX().b() ? new gcn($$0) : new gcu($$0));
   }

   public void a(fyk $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
