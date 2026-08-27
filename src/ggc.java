public class ggc extends ggb<cgx> {
   private static final ajt a = new ajt("textures/entity/illager/illusioner.png");

   public ggc(gfi.a $$0) {
      super($$0, new fra<>($$0.a(ftl.au)), 0.5F);
      this.a(new gjm<cgx, fra<cgx>>(this, $$0.d()) {
         public void a(ewi $$0, fzz $$1, int $$2, cgx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gx() || $$3.gf()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public ajt a(cgx $$0) {
      return a;
   }

   public void a(cgx $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      if ($$0.ce()) {
         esa[] $$6 = $$0.G($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)axk.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)axk.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)axk.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(cgx $$0) {
      return true;
   }
}
