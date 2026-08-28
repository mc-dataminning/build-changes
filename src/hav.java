public class hav extends gxe<cpo, hgr, gkh> {
   private static final alk a = alk.b("textures/entity/strider/strider.png");
   private static final alk j = alk.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public hav(gyk.a $$0) {
      super($$0, new gkh($$0.a(glf.dv)), new gkh($$0.a(glf.dx)), 0.5F);
      this.a(new hdb<>(this, $$0.h(), hni.d.h, $$0x -> $$0x.a, new gkh($$0.a(glf.dw)), new gkh($$0.a(glf.dy))));
   }

   public alk a(hgr $$0) {
      return $$0.b ? j : a;
   }

   protected float b(hgr $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hgr b() {
      return new hgr();
   }

   public void a(cpo $$0, hgr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bxf.h).v();
      $$1.b = $$0.q();
      $$1.c = $$0.bZ();
   }

   protected boolean c(hgr $$0) {
      return super.a($$0) || $$0.b;
   }
}
