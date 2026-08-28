public class gle<T extends cgd> extends gkc<T, fwb<T>> {
   private static final ale a = new ale("textures/entity/squid/squid.png");

   public gle(giw.a $$0, fwb<T> $$1) {
      super($$0, $$1, 0.7F);
   }

   public ale a(T $$0) {
      return a;
   }

   protected void a(T $$0, ezx $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = ayy.i($$4, $$0.c, $$0.b);
      float $$7 = ayy.i($$4, $$0.e, $$0.d);
      $$1.a(0.0F, 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      $$1.a(a.b.rotationDegrees($$6));
      $$1.a(a.d.rotationDegrees($$7));
      $$1.a(0.0F, -1.2F, 0.0F);
   }

   protected float a(T $$0, float $$1) {
      return ayy.i($$1, $$0.cb, $$0.ca);
   }
}
