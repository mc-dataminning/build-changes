public class ges extends gfe<cbx, fmm<cbx>> {
   private final fmm<cbx> a;

   public ges(gco<cbx, fmm<cbx>> $$0, foy $$1) {
      super($$0);
      this.a = new fmm<>($$1.a(fpb.am));
   }

   public void a(esa $$0, fvm $$1, int $$2, cbx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      coz $$10 = $$3.u();
      if ($$10.d() instanceof cmi $$11 && $$11.d() == cmi.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$11 instanceof cnp) {
            int $$13 = ((cnp)$$11).e_($$10);
            $$14 = (float)($$13 >> 16 & 0xFF) / 255.0F;
            $$15 = (float)($$13 >> 8 & 0xFF) / 255.0F;
            $$16 = (float)($$13 & 0xFF) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         ese $$20 = $$1.getBuffer(fvu.e($$11.b()));
         this.a.a($$0, $$20, $$2, ggl.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
