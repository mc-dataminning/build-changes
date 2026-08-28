public class gvm<T extends ciq> extends grx<T, hbj, gfd> {
   private static final aku a = aku.b("textures/entity/squid/squid.png");

   public gvm(gtd.a $$0, gfd $$1, gfd $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public aku a(hbj $$0) {
      return a;
   }

   public hbj b() {
      return new hbj();
   }

   public void a(T $$0, hbj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = ayz.h($$2, $$0.bM, $$0.bL);
      $$1.b = ayz.h($$2, $$0.bG, $$0.bF);
      $$1.c = ayz.h($$2, $$0.bI, $$0.bH);
   }

   protected void a(hbj $$0, fgr $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.aj ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.aj ? -0.6F : -1.2F, 0.0F);
   }
}
