public class hat extends gxc<cpm, hgp, gkf> {
   private static final ali a = ali.b("textures/entity/strider/strider.png");
   private static final ali j = ali.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public hat(gyi.a $$0) {
      super($$0, new gkf($$0.a(gld.dv)), new gkf($$0.a(gld.dx)), 0.5F);
      this.a(new hcz<>(this, $$0.h(), hng.d.h, $$0x -> $$0x.a, new gkf($$0.a(gld.dw)), new gkf($$0.a(gld.dy))));
   }

   public ali a(hgp $$0) {
      return $$0.b ? j : a;
   }

   protected float b(hgp $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hgp b() {
      return new hgp();
   }

   public void a(cpm $$0, hgp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bxd.h).v();
      $$1.b = $$0.q();
      $$1.c = $$0.bZ();
   }

   protected boolean c(hgp $$0) {
      return super.a($$0) || $$0.b;
   }
}
