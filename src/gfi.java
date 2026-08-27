public class gfi<T extends ccd> extends geh<T, fqh<T>> {
   private static final ajh a = new ajh("textures/entity/squid/squid.png");

   public gfi(gdb.a $$0, fqh<T> $$1) {
      super($$0, $$1, 0.7F);
   }

   public ajh a(T $$0) {
      return a;
   }

   protected void a(T $$0, eub $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = aww.i($$4, $$0.c, $$0.b);
      float $$7 = aww.i($$4, $$0.e, $$0.d);
      $$1.a(0.0F, 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      $$1.a(a.b.rotationDegrees($$6));
      $$1.a(a.d.rotationDegrees($$7));
      $$1.a(0.0F, -1.2F, 0.0F);
   }

   protected float a(T $$0, float $$1) {
      return aww.i($$1, $$0.ca, $$0.bZ);
   }
}
