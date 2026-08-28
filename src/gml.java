public class gml<T extends cgb> extends glj<T, fxg<T>> {
   private static final akq a = akq.b("textures/entity/squid/squid.png");

   public gml(gkd.a $$0, fxg<T> $$1) {
      super($$0, $$1, 0.7F);
   }

   public akq a(T $$0) {
      return a;
   }

   protected void a(T $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = ayn.i($$4, $$0.c, $$0.b);
      float $$7 = ayn.i($$4, $$0.e, $$0.d);
      $$1.a(0.0F, 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      $$1.a(a.b.rotationDegrees($$6));
      $$1.a(a.d.rotationDegrees($$7));
      $$1.a(0.0F, -1.2F, 0.0F);
   }

   protected float a(T $$0, float $$1) {
      return ayn.i($$1, $$0.cd, $$0.cc);
   }
}
