public class gdh<T extends caw> extends gcg<T, fok<T>> {
   private static final aiy a = new aiy("textures/entity/squid/squid.png");

   public gdh(gba.a $$0, fok<T> $$1) {
      super($$0, $$1, 0.7F);
   }

   public aiy a(T $$0) {
      return a;
   }

   protected void a(T $$0, esh $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = awi.i($$4, $$0.c, $$0.b);
      float $$7 = awi.i($$4, $$0.e, $$0.d);
      $$1.a(0.0F, 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      $$1.a(a.b.rotationDegrees($$6));
      $$1.a(a.d.rotationDegrees($$7));
      $$1.a(0.0F, -1.2F, 0.0F);
   }

   protected float a(T $$0, float $$1) {
      return awi.i($$1, $$0.bW, $$0.bV);
   }
}
