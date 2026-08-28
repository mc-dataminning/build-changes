public abstract class gwd<S extends gxt, M extends gbk<? super S>> {
   private final gtl<S, M> a;

   public gwd(gtl<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends gyr> void a(gbk<S> $$0, alz $$1, fgq $$2, glj $$3, int $$4, S $$5, int $$6) {
      if (!$$5.u) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gbk<?> $$0, alz $$1, fgq $$2, glj $$3, int $$4, gyr $$5, int $$6) {
      fgu $$7 = $$3.getBuffer(glt.f($$1));
      $$0.a($$2, $$7, $$4, gsp.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(fgq var1, glj var2, int var3, S var4, float var5, float var6);
}
