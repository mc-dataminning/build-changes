public class gyy extends gxu<ctc, hfg> {
   private static final alr a = alr.b("textures/entity/llama/spit.png");
   private final gih g;

   public gyy(gxv.a $$0) {
      super($$0);
      this.g = new gih($$0.a(gkq.bI));
   }

   public void a(hfg $$0, fld $$1, grn $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.g.a($$0);
      flg $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hkg.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hfg a() {
      return new hfg();
   }

   public void a(ctc $$0, hfg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.l($$2);
   }
}
