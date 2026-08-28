public abstract class gzy<S extends hbp, M extends gfd<? super S>> {
   private final gxh<S, M> a;

   public gzy(gxh<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends hcp> void a(gfd<S> $$0, ale $$1, fiq $$2, gpd $$3, int $$4, S $$5, int $$6) {
      if (!$$5.z) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gfd<?> $$0, ale $$1, fiq $$2, gpd $$3, int $$4, hcp $$5, int $$6) {
      fiu $$7 = $$3.getBuffer(gpn.g($$1));
      $$0.a($$2, $$7, $$4, gwl.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(fiq var1, gpd var2, int var3, S var4, float var5, float var6);
}
