public class fzu extends fzt<ccu> {
   private static final ahh a = new ahh("textures/entity/illager/illusioner.png");

   public fzu(fza.a $$0) {
      super($$0, new fkx<>($$0.a(fni.aq)), 0.5F);
      this.a(new gde<ccu, fkx<ccu>>(this, $$0.d()) {
         public void a(eqk $$0, ftt $$1, int $$2, ccu $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gp() || $$3.fX()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public ahh a(ccu $$0) {
      return a;
   }

   public void a(ccu $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      if ($$0.ce()) {
         emc[] $$6 = $$0.D($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)aup.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)aup.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)aup.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(ccu $$0) {
      return true;
   }
}
