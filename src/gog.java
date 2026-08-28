public class gog implements gnu<dxq> {
   private final gmm a;

   public gog(gnv.a $$0) {
      this.a = $$0.b();
   }

   public void a(dxq $$0, float $$1, fgq $$2, glj $$3, int $$4, int $$5) {
      dhh $$6 = $$0.i();
      if ($$6 != null) {
         jh $$7 = $$0.aB_().a($$0.f().g());
         dxu $$8 = $$0.j();
         if (!$$8.l()) {
            gmo.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dkn.bG) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.b(dxo.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dyv $$9 = $$8.a(dkn.by) ? dyv.b : dyv.a;
               dxu $$10 = dkn.bG.m().b(dxo.c, $$9).b(dxo.a, $$8.c(dxn.a));
               $$10 = $$10.b(dxo.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               jh $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.b(dxn.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gmo.b();
         }
      }
   }

   private void a(jh $$0, dxu $$1, fgq $$2, glj $$3, dhh $$4, boolean $$5, int $$6) {
      glt $$7 = glb.b($$1);
      fgu $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, bam.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aW_() {
      return 68;
   }
}
