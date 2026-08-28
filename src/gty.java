public abstract class gty<S extends gvo, M extends fzj<? super S>> {
   private final grh<S, M> a;

   public gty(grh<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends gwm> void a(fzj<S> $$0, alj $$1, fer $$2, gjg $$3, int $$4, S $$5, int $$6) {
      if (!$$5.u) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(fzj<?> $$0, alj $$1, fer $$2, gjg $$3, int $$4, gwm $$5, int $$6) {
      fev $$7 = $$3.getBuffer(gjq.f($$1));
      $$0.a($$2, $$7, $$4, gql.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(fer var1, gjg var2, int var3, S var4, float var5, float var6);
}
