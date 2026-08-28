public abstract class gvy<S extends gxo, M extends gbf<? super S>> {
   private final gtg<S, M> a;

   public gvy(gtg<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends gym> void a(gbf<S> $$0, alz $$1, fgl $$2, gle $$3, int $$4, S $$5, int $$6) {
      if (!$$5.u) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gbf<?> $$0, alz $$1, fgl $$2, gle $$3, int $$4, gym $$5, int $$6) {
      fgp $$7 = $$3.getBuffer(glo.f($$1));
      $$0.a($$2, $$7, $$4, gsk.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(fgl var1, gle var2, int var3, S var4, float var5, float var6);
}
