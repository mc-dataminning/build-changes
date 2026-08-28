public class gzh<T extends ckd> extends gvs<T, hfe, git> {
   private static final alg a = alg.b("textures/entity/squid/squid.png");

   public gzh(gwy.a $$0, git $$1, git $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public alg a(hfe $$0) {
      return a;
   }

   public hfe b() {
      return new hfe();
   }

   public void a(T $$0, hfe $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.bN, $$0.bM);
      $$1.b = azm.h($$2, $$0.bH, $$0.bG);
      $$1.c = azm.h($$2, $$0.bJ, $$0.bI);
   }

   protected void a(hfe $$0, fkd $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.aj ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.aj ? -0.6F : -1.2F, 0.0F);
   }
}
