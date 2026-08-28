public class hag extends hbh<hcm, gfq> {
   private static final alg a = alg.b("textures/entity/breeze/breeze_wind.png");
   private final gfq b;

   public hag(gwt.a $$0, gyq<hcm, gfq> $$1) {
      super($$1);
      this.b = new gfq($$0.a(gjn.L));
   }

   public void a(fjy $$0, gqm $$1, int $$2, hcm $$3, float $$4, float $$5) {
      fkc $$6 = $$1.getBuffer(gqx.a(a, this.a($$3.u) % 1.0F, 0.0F));
      this.b.a($$3);
      gvy.a(this.b, this.b.d()).a($$0, $$6, $$2, hja.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
