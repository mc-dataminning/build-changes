public abstract class gwf<S extends gxv, M extends gbm<? super S>> {
   private final gtn<S, M> a;

   public gwf(gtn<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends gyt> void a(gbm<S> $$0, alz $$1, fgs $$2, gll $$3, int $$4, S $$5, int $$6) {
      if (!$$5.u) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gbm<?> $$0, alz $$1, fgs $$2, gll $$3, int $$4, gyt $$5, int $$6) {
      fgw $$7 = $$3.getBuffer(glv.g($$1));
      $$0.a($$2, $$7, $$4, gsr.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(fgs var1, gll var2, int var3, S var4, float var5, float var6);
}
