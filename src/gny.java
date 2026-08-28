public abstract class gny<T extends bsg, M extends fuo<T>> {
   private final gli<T, M> a;

   public gny(gli<T, M> $$0) {
      this.a = $$0;
   }

   protected static <T extends btb> void a(
      fuo<T> $$0,
      fuo<T> $$1,
      akk $$2,
      fam $$3,
      ged $$4,
      int $$5,
      T $$6,
      float $$7,
      float $$8,
      float $$9,
      float $$10,
      float $$11,
      float $$12,
      float $$13,
      float $$14,
      float $$15
   ) {
      if (!$$6.ci()) {
         $$0.a($$1);
         $$1.a($$6, $$7, $$8, $$12);
         $$1.a($$6, $$7, $$8, $$9, $$10, $$11);
         a($$1, $$2, $$3, $$4, $$5, $$6, $$13, $$14, $$15);
      }
   }

   protected static <T extends btb> void a(fuo<T> $$0, akk $$1, fam $$2, ged $$3, int $$4, T $$5, float $$6, float $$7, float $$8) {
      faq $$9 = $$3.getBuffer(gel.e($$1));
      $$0.a($$2, $$9, $$4, gkn.c($$5, 0.0F), $$6, $$7, $$8, 1.0F);
   }

   public M c() {
      return this.a.a();
   }

   protected akk a(T $$0) {
      return this.a.a($$0);
   }

   public abstract void a(fam var1, ged var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10);
}
