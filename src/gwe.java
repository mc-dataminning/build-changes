public abstract class gwe<S extends gxu, M extends gbl<? super S>> {
   private final gtm<S, M> a;

   public gwe(gtm<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends gys> void a(gbl<S> $$0, alz $$1, fgr $$2, glk $$3, int $$4, S $$5, int $$6) {
      if (!$$5.u) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gbl<?> $$0, alz $$1, fgr $$2, glk $$3, int $$4, gys $$5, int $$6) {
      fgv $$7 = $$3.getBuffer(glu.g($$1));
      $$0.a($$2, $$7, $$4, gsq.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(fgr var1, glk var2, int var3, S var4, float var5, float var6);
}
