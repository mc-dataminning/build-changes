public class god implements gnr<dxk> {
   private final gmj a;

   public god(gns.a $$0) {
      this.a = $$0.b();
   }

   public void a(dxk $$0, float $$1, fgl $$2, glg $$3, int $$4, int $$5) {
      dgz $$6 = $$0.i();
      if ($$6 != null) {
         jh $$7 = $$0.aB_().a($$0.f().g());
         dxo $$8 = $$0.j();
         if (!$$8.l()) {
            gml.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dkf.bG) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.b(dxi.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dyp $$9 = $$8.a(dkf.by) ? dyp.b : dyp.a;
               dxo $$10 = dkf.bG.m().b(dxi.c, $$9).b(dxi.a, $$8.c(dxh.a));
               $$10 = $$10.b(dxi.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               jh $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.b(dxh.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gml.b();
         }
      }
   }

   private void a(jh $$0, dxo $$1, fgl $$2, glg $$3, dgz $$4, boolean $$5, int $$6) {
      glq $$7 = gky.b($$1);
      fgp $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, bac.a(), $$1.b($$0), $$6);
   }

   @Override
   public int a() {
      return 68;
   }
}
