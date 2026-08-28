public abstract class hcw<S extends hep, M extends gia<? super S>> {
   private final haf<S, M> a;

   public hcw(haf<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends hfp> void a(gia<S> $$0, ali $$1, flo $$2, gsa $$3, int $$4, S $$5, int $$6) {
      if (!$$5.z) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gia<?> $$0, ali $$1, flo $$2, gsa $$3, int $$4, hfp $$5, int $$6) {
      flr $$7 = $$3.getBuffer(gsl.g($$1));
      $$0.a($$2, $$7, $$4, gzj.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(flo var1, gsa var2, int var3, S var4, float var5, float var6);
}
