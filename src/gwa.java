public abstract class gwa<S extends gxq, M extends gbh<? super S>> {
   private final gti<S, M> a;

   public gwa(gti<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends gyo> void a(gbh<S> $$0, alp $$1, fgl $$2, glg $$3, int $$4, S $$5, int $$6) {
      if (!$$5.u) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gbh<?> $$0, alp $$1, fgl $$2, glg $$3, int $$4, gyo $$5, int $$6) {
      fgp $$7 = $$3.getBuffer(glq.g($$1));
      $$0.a($$2, $$7, $$4, gsm.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(fgl var1, glg var2, int var3, S var4, float var5, float var6);
}
