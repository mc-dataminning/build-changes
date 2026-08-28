public class gty<T extends civ> extends gqj<T, gzs, gdo> {
   private static final alz a = alz.b("textures/entity/squid/squid.png");

   public gty(grp.a $$0, gdo $$1, gdo $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public alz a(gzs $$0) {
      return a;
   }

   public gzs b() {
      return new gzs();
   }

   public void a(T $$0, gzs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = bae.h($$2, $$0.cg, $$0.cf);
      $$1.b = bae.h($$2, $$0.ca, $$0.bZ);
      $$1.c = bae.h($$2, $$0.cc, $$0.cb);
   }

   protected void a(gzs $$0, fgr $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.ae ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.ae ? -0.6F : -1.2F, 0.0F);
   }
}
