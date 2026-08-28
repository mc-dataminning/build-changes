public abstract class grw<S extends gtl, M extends fxk<? super S>> {
   private final gpf<S, M> a;

   public grw(gpf<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends guj> void a(fxk<S> $$0, alc $$1, fde $$2, ghg $$3, int $$4, S $$5, int $$6) {
      if (!$$5.u) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(fxk<?> $$0, alc $$1, fde $$2, ghg $$3, int $$4, guj $$5, int $$6) {
      fdi $$7 = $$3.getBuffer(ghq.f($$1));
      $$0.a($$2, $$7, $$4, gok.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.e();
   }

   protected alc b(S $$0) {
      return this.a.a($$0);
   }

   public abstract void a(fde var1, ghg var2, int var3, S var4, float var5, float var6);
}
