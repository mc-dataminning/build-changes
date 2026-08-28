public abstract class gop<T extends bsq, M extends fve<T>> {
   private final glz<T, M> a;

   public gop(glz<T, M> $$0) {
      this.a = $$0;
   }

   protected static <T extends btl> void a(
      fve<T> $$0, fve<T> $$1, akq $$2, fbc $$3, get $$4, int $$5, T $$6, float $$7, float $$8, float $$9, float $$10, float $$11, float $$12, int $$13
   ) {
      if (!$$6.ci()) {
         $$0.a($$1);
         $$1.a($$6, $$7, $$8, $$12);
         $$1.a($$6, $$7, $$8, $$9, $$10, $$11);
         a($$1, $$2, $$3, $$4, $$5, $$6, $$13);
      }
   }

   protected static <T extends btl> void a(fve<T> $$0, akq $$1, fbc $$2, get $$3, int $$4, T $$5, int $$6) {
      fbg $$7 = $$3.getBuffer(gfb.e($$1));
      $$0.a($$2, $$7, $$4, gle.c($$5, 0.0F), $$6);
   }

   public M c() {
      return this.a.a();
   }

   protected akq a(T $$0) {
      return this.a.a($$0);
   }

   public abstract void a(fbc var1, get var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10);
}
