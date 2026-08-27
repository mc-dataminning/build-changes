public class gdv extends gdu<cfy> {
   private static final ajh a = new ajh("textures/entity/illager/illusioner.png");

   public gdv(gdb.a $$0) {
      super($$0, new fot<>($$0.a(fre.au)), 0.5F);
      this.a(new ghf<cfy, fot<cfy>>(this, $$0.d()) {
         public void a(eub $$0, fxs $$1, int $$2, cfy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gx() || $$3.gf()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public ajh a(cfy $$0) {
      return a;
   }

   public void a(cfy $$0, float $$1, float $$2, eub $$3, fxs $$4, int $$5) {
      if ($$0.ce()) {
         ept[] $$6 = $$0.G($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)aww.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)aww.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)aww.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(cfy $$0) {
      return true;
   }
}
