public class gkd implements gjr<duk> {
   private final gij a;

   public gkd(gjs.a $$0) {
      this.a = $$0.b();
   }

   public void a(duk $$0, float $$1, fde $$2, ghg $$3, int $$4, int $$5) {
      deg $$6 = $$0.i();
      if ($$6 != null) {
         je $$7 = $$0.aB_().a($$0.f().g());
         duo $$8 = $$0.j();
         if (!$$8.l()) {
            gil.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dhl.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.b(dui.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dvq $$9 = $$8.a(dhl.br) ? dvq.b : dvq.a;
               duo $$10 = dhl.bz.o().b(dui.c, $$9).b(dui.a, $$8.c(duh.a));
               $$10 = $$10.b(dui.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               je $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.b(duh.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            gil.b();
         }
      }
   }

   private void a(je $$0, duo $$1, fde $$2, ghg $$3, deg $$4, boolean $$5, int $$6) {
      ghq $$7 = ggy.b($$1);
      fdi $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azl.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aU_() {
      return 68;
   }
}
