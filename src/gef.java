public class gef<T extends cbl> extends gde<T, fph<T>> {
   private static final ajc a = new ajc("textures/entity/squid/squid.png");

   public gef(gby.a $$0, fph<T> $$1) {
      super($$0, $$1, 0.7F);
   }

   public ajc a(T $$0) {
      return a;
   }

   protected void a(T $$0, etd $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = awm.i($$4, $$0.c, $$0.b);
      float $$7 = awm.i($$4, $$0.e, $$0.d);
      $$1.a(0.0F, 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      $$1.a(a.b.rotationDegrees($$6));
      $$1.a(a.d.rotationDegrees($$7));
      $$1.a(0.0F, -1.2F, 0.0F);
   }

   protected float a(T $$0, float $$1) {
      return awm.i($$1, $$0.bY, $$0.bX);
   }
}
