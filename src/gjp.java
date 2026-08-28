public class gjp extends gjo<cjz> {
   private static final ale a = new ale("textures/entity/illager/illusioner.png");

   public gjp(giv.a $$0) {
      super($$0, new fum<>($$0.a(fwx.au)), 0.5F);
      this.a(new gna<cjz, fum<cjz>>(this, $$0.d()) {
         public void a(ezw $$0, gdm $$1, int $$2, cjz $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gA() || $$3.gi()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public ale a(cjz $$0) {
      return a;
   }

   public void a(cjz $$0, float $$1, float $$2, ezw $$3, gdm $$4, int $$5) {
      if ($$0.ch()) {
         evp[] $$6 = $$0.G($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)ayx.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)ayx.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)ayx.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(cjz $$0) {
      return true;
   }
}
