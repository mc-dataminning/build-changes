public class gzj extends gvs<cpb, hff, giu> {
   private static final alg a = alg.b("textures/entity/strider/strider.png");
   private static final alg j = alg.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gzj(gwy.a $$0) {
      super($$0, new giu($$0.a(gjs.dv)), new giu($$0.a(gjs.dx)), 0.5F);
      this.a(new hbp<>(this, $$0.h(), hlw.d.h, $$0x -> $$0x.a, new giu($$0.a(gjs.dw)), new giu($$0.a(gjs.dy))));
   }

   public alg a(hff $$0) {
      return $$0.b ? j : a;
   }

   protected float b(hff $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hff b() {
      return new hff();
   }

   public void a(cpb $$0, hff $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bws.h).v();
      $$1.b = $$0.q();
      $$1.c = $$0.bY();
   }

   protected boolean c(hff $$0) {
      return super.a($$0) || $$0.b;
   }
}
