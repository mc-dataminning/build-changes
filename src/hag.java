public class hag extends gwp<cpx, hgf, gjs> {
   private static final alr a = alr.b("textures/entity/strider/strider.png");
   private static final alr j = alr.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public hag(gxv.a $$0) {
      super($$0, new gjs($$0.a(gkq.dv)), new gjs($$0.a(gkq.dx)), 0.5F);
      this.a(new hcm<>(this, $$0.h(), hmw.d.h, $$0x -> $$0x.a, new gjs($$0.a(gkq.dw)), new gjs($$0.a(gkq.dy))));
   }

   public alr a(hgf $$0) {
      return $$0.b ? j : a;
   }

   protected float b(hgf $$0) {
      float $$1 = super.g($$0);
      return $$0.am ? $$1 * 0.5F : $$1;
   }

   public hgf b() {
      return new hgf();
   }

   public void a(cpx $$0, hgf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bxo.h).v();
      $$1.b = $$0.q();
      $$1.c = $$0.bZ();
   }

   protected boolean c(hgf $$0) {
      return super.a($$0) || $$0.b;
   }
}
