public class gmr<T extends cgd> extends glp<T, fxm<T>> {
   private static final akr a = akr.b("textures/entity/squid/squid.png");

   public gmr(gkj.a $$0, fxm<T> $$1) {
      super($$0, $$1, 0.7F);
   }

   public akr a(T $$0) {
      return a;
   }

   protected void a(T $$0, fbi $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = ayo.i($$4, $$0.c, $$0.b);
      float $$7 = ayo.i($$4, $$0.e, $$0.d);
      $$1.a(0.0F, 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      $$1.a(a.b.rotationDegrees($$6));
      $$1.a(a.d.rotationDegrees($$7));
      $$1.a(0.0F, -1.2F, 0.0F);
   }

   protected float a(T $$0, float $$1) {
      return ayo.i($$1, $$0.cf, $$0.ce);
   }
}
