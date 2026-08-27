public class fxm<T extends cbu> extends fxp<T, fgi<T>> {
   private final fgd a;

   public fxm(fvc<T, fgi<T>> $$0, fhy $$1) {
      super($$0);
      this.a = new fgd($$1.a(fib.aA));
   }

   public void a(elp $$0, foe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(elp $$0, foe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      qx $$9 = $$8 ? $$3.gi() : $$3.gj();
      biu.a($$9.l("id")).filter($$0x -> $$0x == biu.at).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bX() ? -1.3F : -1.5F, 0.0F);
         bvh.b $$11 = bvh.b.a($$9.h("Variant"));
         elt $$12 = $$1.getBuffer(this.a.a(fut.a($$11)));
         this.a.a($$0, $$12, $$2, fyv.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}
