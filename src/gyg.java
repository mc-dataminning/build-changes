public class gyg extends gzq<cor, heq, gia<heq>> {
   private static final alk a = alk.b("textures/entity/enderman/enderman.png");
   private final azz j = azz.a();

   public gyg(gyk.a $$0) {
      super($$0, new gia<>($$0.a(glf.aR)), 0.5F);
      this.a(new hch(this));
      this.a(new hbz(this, $$0.d()));
   }

   public ffs a(heq $$0) {
      ffs $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.af;
         return $$1.b(this.j.k() * $$2, 0.0, this.j.k() * $$2);
      } else {
         return $$1;
      }
   }

   public alk b(heq $$0) {
      return a;
   }

   public heq a() {
      return new heq();
   }

   public void a(cor $$0, heq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gzb.a($$0, $$1, $$2, this.h);
      $$1.a = $$0.t();
      $$1.b = $$0.q();
   }
}
