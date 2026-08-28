public class gjo implements gjc<dtw> {
   private final ghu a;

   public gjo(gjd.a $$0) {
      this.a = $$0.b();
   }

   public void a(dtw $$0, float $$1, fcu $$2, ggv $$3, int $$4, int $$5) {
      dds $$6 = $$0.i();
      if ($$6 != null) {
         je $$7 = $$0.aD_().a($$0.f().g());
         dua $$8 = $$0.j();
         if (!$$8.l()) {
            ghw.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(dgx.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.b(dtu.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.d() && !$$0.b()) {
               dvc $$9 = $$8.a(dgx.br) ? dvc.b : dvc.a;
               dua $$10 = dgx.bz.o().b(dtu.c, $$9).b(dtu.a, $$8.c(dtt.a));
               $$10 = $$10.b(dtu.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               je $$11 = $$7.a($$0.f());
               $$2.b();
               $$2.a();
               $$8 = $$8.b(dtt.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            ghw.b();
         }
      }
   }

   private void a(je $$0, dua $$1, fcu $$2, ggv $$3, dds $$4, boolean $$5, int $$6) {
      ghe $$7 = ggn.b($$1);
      fcy $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, azk.a(), $$1.b($$0), $$6);
   }

   @Override
   public int aW_() {
      return 68;
   }
}
