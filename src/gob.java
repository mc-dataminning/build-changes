public class gob implements gnp<dxj> {
   private final gmh a;

   public gob(gnq.a $$0) {
      this.a = $$0.b();
   }

   public void a(dxj $$0, float $$1, fgl $$2, gle $$3, int $$4, int $$5) {
      dha $$6 = $$0.i();
      if ($$6 != null) {
         jh $$7 = $$0.aB_().a($$0.f().g());
         dxn $$8 = $$0.j();
         if (!$$8.l()) {
            gmj.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dkg.bG) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.b(dxh.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dyo $$9 = $$8.a(dkg.by) ? dyo.b : dyo.a;
               dxn $$10 = dkg.bG.m().b(dxh.c, $$9).b(dxh.a, $$8.c(dxg.a));
               $$10 = $$10.b(dxh.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               jh $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.b(dxg.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gmj.b();
         }
      }
   }

   private void a(jh $$0, dxn $$1, fgl $$2, gle $$3, dha $$4, boolean $$5, int $$6) {
      glo $$7 = gkw.b($$1);
      fgp $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, bam.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aW_() {
      return 68;
   }
}
