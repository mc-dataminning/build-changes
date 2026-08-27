public class gcs extends gcr<cfe> {
   private static final ajc a = new ajc("textures/entity/illager/illusioner.png");

   public gcs(gby.a $$0) {
      super($$0, new fns<>($$0.a(fqe.aq)), 0.5F);
      this.a(new ggc<cfe, fns<cfe>>(this, $$0.d()) {
         public void a(etd $$0, fwq $$1, int $$2, cfe $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gv() || $$3.gd()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public ajc a(cfe $$0) {
      return a;
   }

   public void a(cfe $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      if ($$0.cb()) {
         eov[] $$6 = $$0.E($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)awm.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)awm.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)awm.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(cfe $$0) {
      return true;
   }
}
