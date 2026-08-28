public class gng extends gmu<cid, gts, fxl> {
   private static final alh a = alh.b("textures/entity/camel/camel.png");

   public gng(gnz.a $$0) {
      super($$0, new fxl($$0.a(gba.H)), new fxl($$0.a(gba.I)), 0.7F);
   }

   public alh a(gts $$0) {
      return a;
   }

   public gts a() {
      return new gts();
   }

   public void a(cid $$0, gts $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.i();
      $$1.b = $$0.cb();
      $$1.c = Math.max((float)$$0.c() - $$2, 0.0F);
      $$1.d.a($$0.ce);
      $$1.e.a($$0.cf);
      $$1.f.a($$0.cg);
      $$1.g.a($$0.ch);
      $$1.h.a($$0.ci);
   }
}
