public class gje<T extends ceo> extends gid<T, fud<T>> {
   private static final akh a = new akh("textures/entity/squid/squid.png");

   public gje(ggx.a $$0, fud<T> $$1) {
      super($$0, $$1, 0.7F);
   }

   public akh a(T $$0) {
      return a;
   }

   protected void a(T $$0, exx $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = axz.i($$4, $$0.c, $$0.b);
      float $$7 = axz.i($$4, $$0.e, $$0.d);
      $$1.a(0.0F, 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      $$1.a(a.b.rotationDegrees($$6));
      $$1.a(a.d.rotationDegrees($$7));
      $$1.a(0.0F, -1.2F, 0.0F);
   }

   protected float a(T $$0, float $$1) {
      return axz.i($$1, $$0.cb, $$0.ca);
   }
}
