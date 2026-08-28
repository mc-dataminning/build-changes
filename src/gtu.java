public class gtu<T extends cin> extends gqf<T, gzo, gdk> {
   private static final alp a = alp.b("textures/entity/squid/squid.png");

   public gtu(grl.a $$0, gdk $$1, gdk $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public alp a(gzo $$0) {
      return a;
   }

   public gzo b() {
      return new gzo();
   }

   public void a(T $$0, gzo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azu.h($$2, $$0.cg, $$0.cf);
      $$1.b = azu.h($$2, $$0.ca, $$0.bZ);
      $$1.c = azu.h($$2, $$0.cc, $$0.cb);
   }

   protected void a(gzo $$0, fgl $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.ae ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.ae ? -0.6F : -1.2F, 0.0F);
   }
}
