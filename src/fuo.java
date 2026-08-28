import java.time.Duration;
import javax.annotation.Nullable;

public class fuo {
   @Nullable
   private ful a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable ful $$0) {
      this.a = $$0;
   }

   @Nullable
   public ful a() {
      return this.a;
   }

   public void a(boolean $$0, boolean $$1, fxh $$2) {
      if (this.a == null) {
         this.d = false;
      } else {
         boolean $$3 = $$0 || $$1 && fpt.Q().aX().b();
         if ($$3 != this.d) {
            if ($$3) {
               this.c = ag.c();
            }

            this.d = $$3;
         }

         if ($$3 && ag.c() - this.c > this.b.toMillis()) {
            fys $$4 = fpt.Q().z;
            if ($$4 != null) {
               $$4.a(this.a, this.a($$2, $$0, $$1), $$1);
            }
         }
      }
   }

   private gbf a(fxh $$0, boolean $$1, boolean $$2) {
      return (gbf)(!$$1 && $$2 && fpt.Q().aX().b() ? new gba($$0) : new gbh($$0));
   }

   public void a(fwx $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
