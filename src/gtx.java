public class gtx<T extends civ> extends gqi<T, gzr, gdn> {
   private static final alz a = alz.b("textures/entity/squid/squid.png");

   public gtx(gro.a $$0, gdn $$1, gdn $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public alz a(gzr $$0) {
      return a;
   }

   public gzr b() {
      return new gzr();
   }

   public void a(T $$0, gzr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = bae.h($$2, $$0.cg, $$0.cf);
      $$1.b = bae.h($$2, $$0.ca, $$0.bZ);
      $$1.c = bae.h($$2, $$0.cc, $$0.cb);
   }

   protected void a(gzr $$0, fgq $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.ae ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.ae ? -0.6F : -1.2F, 0.0F);
   }
}
