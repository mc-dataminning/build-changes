public abstract class gwq<S extends gyh, M extends gby<? super S>> {
   private final gty<S, M> a;

   public gwq(gty<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends gzh> void a(gby<S> $$0, aku $$1, ffs $$2, glv $$3, int $$4, S $$5, int $$6) {
      if (!$$5.z) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gby<?> $$0, aku $$1, ffs $$2, glv $$3, int $$4, gzh $$5, int $$6) {
      ffw $$7 = $$3.getBuffer(gmf.g($$1));
      $$0.a($$2, $$7, $$4, gtc.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(ffs var1, glv var2, int var3, S var4, float var5, float var6);
}
