import java.util.List;

public class gvc implements gup<ebb> {
   private final gtf a;

   public gvc(guq.a $$0) {
      this.a = $$0.b();
   }

   public void a(ebb $$0, float $$1, flq $$2, gsc $$3, int $$4, int $$5, ffs $$6) {
      djz $$7 = $$0.i();
      if ($$7 != null) {
         iw $$8 = $$0.aB_().a($$0.f().g());
         ebg $$9 = $$0.j();
         if (!$$9.l()) {
            gth.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$9.a(dng.bJ) && $$0.a($$1) <= 4.0F) {
               $$9 = $$9.b(eaz.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$8, $$9, $$2, $$3, $$7, false, $$5);
            } else if ($$0.d() && !$$0.a()) {
               eci $$10 = $$9.a(dng.by) ? eci.b : eci.a;
               ebg $$11 = dng.bJ.m().b(eaz.c, $$10).b(eaz.a, $$9.c(eay.a));
               $$11 = $$11.b(eaz.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$8, $$11, $$2, $$3, $$7, false, $$5);
               iw $$12 = $$8.a($$0.f());
               $$2.b();
               $$2.a();
               $$9 = $$9.b(eay.c, Boolean.valueOf(true));
               this.a($$12, $$9, $$2, $$3, $$7, true, $$5);
            } else {
               this.a($$8, $$9, $$2, $$3, $$7, false, $$5);
            }

            $$2.b();
            gth.b();
         }
      }
   }

   private void a(iw $$0, ebg $$1, flq $$2, gsc $$3, djz $$4, boolean $$5, int $$6) {
      gsn $$7 = gru.b($$1);
      flt $$8 = $$3.getBuffer($$7);
      List<gto> $$9 = this.a.a($$1).a(azz.a($$1.b($$0)));
      this.a.b().a($$4, $$9, $$1, $$0, $$2, $$8, $$5, $$6);
   }

   @Override
   public int aV_() {
      return 68;
   }
}
