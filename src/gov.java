public abstract class gov<T extends bsr, M extends fvk<T>> {
   private final gmf<T, M> a;

   public gov(gmf<T, M> $$0) {
      this.a = $$0;
   }

   protected static <T extends btn> void a(
      fvk<T> $$0, fvk<T> $$1, akr $$2, fbi $$3, gez $$4, int $$5, T $$6, float $$7, float $$8, float $$9, float $$10, float $$11, float $$12, int $$13
   ) {
      if (!$$6.ci()) {
         $$0.a($$1);
         $$1.a($$6, $$7, $$8, $$12);
         $$1.a($$6, $$7, $$8, $$9, $$10, $$11);
         a($$1, $$2, $$3, $$4, $$5, $$6, $$13);
      }
   }

   protected static <T extends btn> void a(fvk<T> $$0, akr $$1, fbi $$2, gez $$3, int $$4, T $$5, int $$6) {
      fbm $$7 = $$3.getBuffer(gfh.e($$1));
      $$0.a($$2, $$7, $$4, glk.c($$5, 0.0F), $$6);
   }

   public M c() {
      return this.a.a();
   }

   protected akr a(T $$0) {
      return this.a.a($$0);
   }

   public abstract void a(fbi var1, gez var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10);
}
