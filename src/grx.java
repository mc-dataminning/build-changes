public class grx extends gth<clm, gyg, gbw<gyg>> {
   private static final aku a = aku.b("textures/entity/enderman/enderman.png");
   private final azg b = azg.a();

   public grx(gsb.a $$0) {
      super($$0, new gbw<>($$0.a(gez.aH)), 0.5F);
      this.a(new gvy(this));
      this.a(new gvq(this, $$0.d()));
   }

   public fay a(gyg $$0) {
      fay $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.af;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public aku b(gyg $$0) {
      return a;
   }

   public gyg a() {
      return new gyg();
   }

   public void a(clm $$0, gyg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gss.a($$0, $$1, $$2, this.i);
      $$1.a = $$0.gp();
      $$1.b = $$0.x();
   }
}
