public class gvr extends gtc<cqx, hbn> {
   public static final aku a = aku.b("textures/entity/trident.png");
   private final gfg b;

   public gvr(gtd.a $$0) {
      super($$0);
      this.b = new gfg($$0.a(ggb.dn));
   }

   public void a(hbn $$0, fgr $$1, gmx $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fgv $$4 = gub.a($$2, this.b.a(a), false, $$0.c);
      this.b.a($$1, $$4, $$3, hfh.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hbn a() {
      return new hbn();
   }

   public void a(cqx $$0, hbn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
      $$1.c = $$0.y();
   }
}
