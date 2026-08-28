import javax.annotation.Nullable;

public class hda {
   private static final int a = 100;
   private final azs b = azs.a();
   private final fji c;
   @Nullable
   private hca d;
   private int e = 100;

   public hda(fji $$0) {
      this.c = $$0;
   }

   public void a() {
      awi $$0 = this.c.al();
      if (this.d != null) {
         if (!$$0.a().a().a().equals(this.d.a()) && $$0.d()) {
            this.c.ak().b(this.d);
            this.e = azk.a(this.b, 0, $$0.b() / 2);
         }

         if (!this.c.ak().c(this.d)) {
            this.d = null;
            this.e = Math.min(this.e, azk.a(this.b, $$0.b(), $$0.c()));
         }
      }

      this.e = Math.min(this.e, $$0.c());
      if (this.d == null && this.e-- <= 0) {
         this.a($$0);
      }
   }

   public void a(awi $$0) {
      this.d = hbv.a($$0.a().a());
      if (this.d.b() != hdf.b) {
         this.c.ak().a(this.d);
      }

      this.e = Integer.MAX_VALUE;
   }

   public void b(awi $$0) {
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

   public boolean c(awi $$0) {
      return this.d == null ? false : $$0.a().a().a().equals(this.d.a());
   }
}
