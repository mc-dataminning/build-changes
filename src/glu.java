public class glu<T extends cfq> extends gks<T, fwq<T>> {
   private static final akk a = new akk("textures/entity/squid/squid.png");

   public glu(gjm.a $$0, fwq<T> $$1) {
      super($$0, $$1, 0.7F);
   }

   public akk a(T $$0) {
      return a;
   }

   protected void a(T $$0, fam $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = ayg.i($$4, $$0.c, $$0.b);
      float $$7 = ayg.i($$4, $$0.e, $$0.d);
      $$1.a(0.0F, 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      $$1.a(a.b.rotationDegrees($$6));
      $$1.a(a.d.rotationDegrees($$7));
      $$1.a(0.0F, -1.2F, 0.0F);
   }

   protected float a(T $$0, float $$1) {
      return ayg.i($$1, $$0.cd, $$0.cc);
   }
}
