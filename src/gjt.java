public abstract class gjt<T extends bpv, M extends fqm<T>> {
   private final ghd<T, M> a;

   public gjt(ghd<T, M> $$0) {
      this.a = $$0;
   }

   protected static <T extends bqo> void a(
      fqm<T> $$0,
      fqm<T> $$1,
      ajt $$2,
      ewi $$3,
      fzz $$4,
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
      if (!$$6.ce()) {
         $$0.a($$1);
         $$1.a($$6, $$7, $$8, $$12);
         $$1.a($$6, $$7, $$8, $$9, $$10, $$11);
         a($$1, $$2, $$3, $$4, $$5, $$6, $$13, $$14, $$15);
      }
   }

   protected static <T extends bqo> void a(fqm<T> $$0, ajt $$1, ewi $$2, fzz $$3, int $$4, T $$5, float $$6, float $$7, float $$8) {
      ewm $$9 = $$3.getBuffer(gah.e($$1));
      $$0.a($$2, $$9, $$4, ggj.c($$5, 0.0F), $$6, $$7, $$8, 1.0F);
   }

   public M c() {
      return this.a.a();
   }

   protected ajt a(T $$0) {
      return this.a.a($$0);
   }

   public abstract void a(ewi var1, fzz var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10);
}
