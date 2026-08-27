public class ghy<T extends cdh> extends ggx<T, fsx<T>> {
   private static final ajv a = new ajv("textures/entity/squid/squid.png");

   public ghy(gfr.a $$0, fsx<T> $$1) {
      super($$0, $$1, 0.7F);
   }

   public ajv a(T $$0) {
      return a;
   }

   protected void a(T $$0, ewr $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = axm.i($$4, $$0.c, $$0.b);
      float $$7 = axm.i($$4, $$0.e, $$0.d);
      $$1.a(0.0F, 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      $$1.a(a.b.rotationDegrees($$6));
      $$1.a(a.d.rotationDegrees($$7));
      $$1.a(0.0F, -1.2F, 0.0F);
   }

   protected float a(T $$0, float $$1) {
      return axm.i($$1, $$0.ca, $$0.bZ);
   }
}
