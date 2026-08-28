import javax.annotation.Nullable;

public class gto {
   private static final int a = 100;
   private final azf b = azf.a();
   private final ffd c;
   @Nullable
   private gsl d;
   private int e = 100;

   public gto(ffd $$0) {
      this.c = $$0;
   }

   public void a() {
      avw $$0 = this.c.ak();
      if (this.d != null) {
         if (!$$0.a().a().a().equals(this.d.a()) && $$0.d()) {
            this.c.aj().b(this.d);
            this.e = ayx.a(this.b, 0, $$0.b() / 2);
         }

         if (!this.c.aj().c(this.d)) {
            this.d = null;
            this.e = Math.min(this.e, ayx.a(this.b, $$0.b(), $$0.c()));
         }
      }

      this.e = Math.min(this.e, $$0.c());
      if (this.d == null && this.e-- <= 0) {
         this.a($$0);
      }
   }

   public void a(avw $$0) {
      this.d = gsg.a($$0.a().a());
      if (this.d.b() != gtt.a) {
         this.c.aj().a(this.d);
      }

      this.e = Integer.MAX_VALUE;
   }

   public void b(avw $$0) {
      if (this.c($$0)) {
         this.b();
      }
   }

   public void b() {
      if (this.d != null) {
         this.c.aj().b(this.d);
         this.d = null;
      }

      this.e += 100;
   }

   public boolean c(avw $$0) {
      return this.d == null ? false : $$0.a().a().a().equals(this.d.a());
   }
}
