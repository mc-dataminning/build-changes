public class gsk extends grx<chs, gyz, gcl> {
   public gsk(gtd.a $$0) {
      super($$0, new gcl($$0.a(ggb.O)), new gcl($$0.a(ggb.P)), 0.4F);
      this.a(new gwt(this, $$0.f()));
   }

   public aku a(gyz $$0) {
      return $$0.a;
   }

   public gyz a() {
      return new gyz();
   }

   public void a(chs $$0, gyz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gE().a().a();
      $$1.d = $$0.ch();
      $$1.e = $$0.ci();
      $$1.f = $$0.x();
      $$1.g = $$0.K($$2);
      $$1.h = $$0.L($$2);
      $$1.i = $$0.M($$2);
      $$1.b = $$0.gJ();
      $$1.c = $$0.q() ? $$0.gG() : null;
   }

   protected void a(gyz $$0, fgr $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(ayz.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
