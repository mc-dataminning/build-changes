public class goy<T extends bso, M extends fvq<T> & fuo> extends gpi<T, M> {
   private final gfc a;

   public goy(gmp<T, M> $$0, gfc $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fbc $$0, gfg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fD() == bsi.b;
      cuh $$11 = $$10 ? $$3.fh() : $$3.fg();
      cuh $$12 = $$10 ? $$3.fg() : $$3.fh();
      if (!$$11.d() || !$$12.d()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, cue.c, bsi.b, $$0, $$1, $$2);
         this.a($$3, $$11, cue.b, bsi.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(bso $$0, cuh $$1, cue $$2, bsi $$3, fbc $$4, gfg $$5, int $$6) {
      if (!$$1.d()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == bsi.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
