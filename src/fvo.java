public class fvo<T extends bvq> extends fun<T, fhf<T>> {
   private static final aex a = new aex("textures/entity/squid/squid.png");

   public fvo(fth.a $$0, fhf<T> $$1) {
      super($$0, $$1, 0.7F);
   }

   public aex a(T $$0) {
      return a;
   }

   protected void a(T $$0, elp $$1, float $$2, float $$3, float $$4) {
      float $$5 = arx.i($$4, $$0.c, $$0.b);
      float $$6 = arx.i($$4, $$0.e, $$0.d);
      $$1.a(0.0F, 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      $$1.a(a.b.rotationDegrees($$5));
      $$1.a(a.d.rotationDegrees($$6));
      $$1.a(0.0F, -1.2F, 0.0F);
   }

   protected float a(T $$0, float $$1) {
      return arx.i($$1, $$0.bW, $$0.bV);
   }
}
