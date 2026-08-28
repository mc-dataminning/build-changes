import javax.annotation.Nullable;

public class hgb {
   private static final int a = 100;
   private final bam b = bam.a();
   private final flz c;
   @Nullable
   private hfb d;
   private int e = 100;

   public hgb(flz $$0) {
      this.c = $$0;
   }

   public void a() {
      axc $$0 = this.c.al();
      if (this.d != null) {
         if (!$$0.a().a().a().equals(this.d.a()) && $$0.d()) {
            this.c.ak().b(this.d);
            this.e = bae.a(this.b, 0, $$0.b() / 2);
         }

         if (!this.c.ak().c(this.d)) {
            this.d = null;
            this.e = Math.min(this.e, bae.a(this.b, $$0.b(), $$0.c()));
         }
      }

      this.e = Math.min(this.e, $$0.c());
      if (this.d == null && this.e-- <= 0) {
         this.a($$0);
      }
   }

   public void a(axc $$0) {
      this.d = hew.a($$0.a().a());
      if (this.d.b() != hgg.b) {
         this.c.ak().a(this.d);
      }

      this.e = Integer.MAX_VALUE;
   }

   public void b(axc $$0) {
      if (this.c($$0)) {
         this.b();
      }
   }

   public void b() {
      if (this.d != null) {
         this.c.ak().b(this.d);
         this.d = null;
      }

      this.e += 100;
   }

   public boolean c(axc $$0) {
      return this.d == null ? false : $$0.a().a().a().equals(this.d.a());
   }
}
