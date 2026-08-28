public abstract class hbm<S extends hdf, M extends ggp<? super S>> {
   private final gyv<S, M> a;

   public hbm(gyv<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends hef> void a(ggp<S> $$0, alg $$1, fkd $$2, gqr $$3, int $$4, S $$5, int $$6) {
      if (!$$5.z) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(ggp<?> $$0, alg $$1, fkd $$2, gqr $$3, int $$4, hef $$5, int $$6) {
      fkh $$7 = $$3.getBuffer(grc.g($$1));
      $$0.a($$2, $$7, $$4, gxz.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(fkd var1, gqr var2, int var3, S var4, float var5, float var6);
}
