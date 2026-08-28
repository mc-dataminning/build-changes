public class guc extends gtc<clq, gzj> {
   private static final aku a = aku.b("textures/entity/lead_knot.png");
   private final gdr b;

   public guc(gtd.a $$0) {
      super($$0);
      this.b = new gdr($$0.a(ggb.bt));
   }

   @Override
   public void a(gzj $$0, fgr $$1, gmx $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      fgv $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hfh.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public gzj d() {
      return new gzj();
   }
}
