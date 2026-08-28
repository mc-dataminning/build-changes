public class gts<T extends cir> extends gqd<T, gzm, gdi> {
   private static final alz a = alz.b("textures/entity/squid/squid.png");

   public gts(grj.a $$0, gdi $$1, gdi $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public alz a(gzm $$0) {
      return a;
   }

   public gzm b() {
      return new gzm();
   }

   public void a(T $$0, gzm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = bae.h($$2, $$0.cg, $$0.cf);
      $$1.b = bae.h($$2, $$0.ca, $$0.bZ);
      $$1.c = bae.h($$2, $$0.cc, $$0.cb);
   }

   protected void a(gzm $$0, fgl $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.ae ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.ae ? -0.6F : -1.2F, 0.0F);
   }
}
