public abstract class gsx<S extends gun, M extends fyk<? super S>> {
   private final gqg<S, M> a;

   public gsx(gqg<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends gvl> void a(fyk<S> $$0, ali $$1, feb $$2, gih $$3, int $$4, S $$5, int $$6) {
      if (!$$5.u) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(fyk<?> $$0, ali $$1, feb $$2, gih $$3, int $$4, gvl $$5, int $$6) {
      fef $$7 = $$3.getBuffer(gir.f($$1));
      $$0.a($$2, $$7, $$4, gpl.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.e();
   }

   public abstract void a(feb var1, gih var2, int var3, S var4, float var5, float var6);
}
