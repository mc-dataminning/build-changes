public class gye extends gzo<cop, heo, ghy<heo>> {
   private static final ali a = ali.b("textures/entity/enderman/enderman.png");
   private final azx j = azx.a();

   public gye(gyi.a $$0) {
      super($$0, new ghy<>($$0.a(gld.aR)), 0.5F);
      this.a(new hcf(this));
      this.a(new hbx(this, $$0.d()));
   }

   public ffq a(heo $$0) {
      ffq $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.af;
         return $$1.b(this.j.k() * $$2, 0.0, this.j.k() * $$2);
      } else {
         return $$1;
      }
   }

   public ali b(heo $$0) {
      return a;
   }

   public heo a() {
      return new heo();
   }

   public void a(cop $$0, heo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyz.a($$0, $$1, $$2, this.h);
      $$1.a = $$0.t();
      $$1.b = $$0.q();
   }
}
