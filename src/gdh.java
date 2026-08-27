import javax.annotation.Nullable;

public class gdh {
   private static final int a = 100;
   private final ash b = ash.a();
   private final eqp c;
   @Nullable
   private gci d;
   private int e = 100;

   public gdh(eqp $$0) {
      this.c = $$0;
   }

   public void a() {
      apd $$0 = this.c.aj();
      if (this.d != null) {
         if (!$$0.a().a().a().equals(this.d.a()) && $$0.d()) {
            this.c.ai().b(this.d);
            this.e = asb.a(this.b, 0, $$0.b() / 2);
         }

         if (!this.c.ai().c(this.d)) {
            this.d = null;
            this.e = Math.min(this.e, asb.a(this.b, $$0.b(), $$0.c()));
         }
      }

      this.e = Math.min(this.e, $$0.c());
      if (this.d == null && this.e-- <= 0) {
         this.a($$0);
      }
   }

   public void a(apd $$0) {
      this.d = gcd.a($$0.a().a());
      if (this.d.b() != gdm.a) {
         this.c.ai().a(this.d);
      }

      this.e = Integer.MAX_VALUE;
   }

   public void b(apd $$0) {
      if (this.c($$0)) {
         this.b();
      }
   }

   public void b() {
      if (this.d != null) {
         this.c.ai().b(this.d);
         this.d = null;
      }

      this.e += 100;
   }

   public boolean c(apd $$0) {
      return this.d == null ? false : $$0.a().a().a().equals(this.d.a());
   }
}
