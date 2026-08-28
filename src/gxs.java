public abstract class gxs<S extends gzj, M extends gda<? super S>> {
   private final gva<S, M> a;

   public gxs(gva<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends haj> void a(gda<S> $$0, aku $$1, fgr $$2, gmx $$3, int $$4, S $$5, int $$6) {
      if (!$$5.z) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gda<?> $$0, aku $$1, fgr $$2, gmx $$3, int $$4, haj $$5, int $$6) {
      fgv $$7 = $$3.getBuffer(gnh.g($$1));
      $$0.a($$2, $$7, $$4, gue.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(fgr var1, gmx var2, int var3, S var4, float var5, float var6);
}
