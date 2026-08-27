import javax.annotation.Nullable;

public class gfo {
   private static final int a = 100;
   private final ato b = ato.a();
   private final esr c;
   @Nullable
   private gep d;
   private int e = 100;

   public gfo(esr $$0) {
      this.c = $$0;
   }

   public void a() {
      aqk $$0 = this.c.ai();
      if (this.d != null) {
         if (!$$0.a().a().a().equals(this.d.a()) && $$0.d()) {
            this.c.ah().b(this.d);
            this.e = ati.a(this.b, 0, $$0.b() / 2);
         }

         if (!this.c.ah().c(this.d)) {
            this.d = null;
            this.e = Math.min(this.e, ati.a(this.b, $$0.b(), $$0.c()));
         }
      }

      this.e = Math.min(this.e, $$0.c());
      if (this.d == null && this.e-- <= 0) {
         this.a($$0);
      }
   }

   public void a(aqk $$0) {
      this.d = gek.a($$0.a().a());
      if (this.d.b() != gft.a) {
         this.c.ah().a(this.d);
      }

      this.e = Integer.MAX_VALUE;
   }

   public void b(aqk $$0) {
      if (this.c($$0)) {
         this.b();
      }
   }

   public void b() {
      if (this.d != null) {
         this.c.ah().b(this.d);
         this.d = null;
      }

      this.e += 100;
   }

   public boolean c(aqk $$0) {
      return this.d == null ? false : $$0.a().a().a().equals(this.d.a());
   }
}
