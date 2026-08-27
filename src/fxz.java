public class fxz extends fyu<cbu, fjl<cbu>> {
   private static final agt a = new agt("textures/entity/zombie/zombie.png");
   private final float i;

   public fxz(fxo.a $$0, float $$1) {
      super($$0, new fjd($$0.a(flx.ae)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gbs<>(this, $$0.d()));
      this.a(new gbp<>(this, new fjd($$0.a(flx.af)), new fjd($$0.a(flx.ag)), $$0.g()));
   }

   protected void a(cbu $$0, epd $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public agt a(cbu $$0) {
      return a;
   }
}
