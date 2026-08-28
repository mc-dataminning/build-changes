public class gnj<T extends bst & bue, M extends ftz<T>> extends gni<T, M> {
   private final ale a;
   private final M b;

   public gnj(gks<T, M> $$0, M $$1, ale $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(ezx $$0, gdn $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         fab $$10 = $$1.getBuffer(gdv.e(this.a));
         this.b.a($$0, $$10, $$2, gop.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
