import java.util.List;

public class gun implements gua<ebl> {
   private final gsq a;

   public gun(gub.a $$0) {
      this.a = $$0.b();
   }

   public void a(ebl $$0, float $$1, fld $$2, grn $$3, int $$4, int $$5, fgc $$6) {
      dkj $$7 = $$0.i();
      if ($$7 != null) {
         iw $$8 = $$0.aC_().a($$0.f().g());
         ebq $$9 = $$0.j();
         if (!$$9.l()) {
            gss.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$9.a(dnq.bJ) && $$0.a($$1) <= 4.0F) {
               $$9 = $$9.b(ebj.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$8, $$9, $$2, $$3, $$7, false, $$5);
            } else if ($$0.d() && !$$0.a()) {
               ecs $$10 = $$9.a(dnq.by) ? ecs.b : ecs.a;
               ebq $$11 = dnq.bJ.m().b(ebj.c, $$10).b(ebj.a, $$9.c(ebi.a));
               $$11 = $$11.b(ebj.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$8, $$11, $$2, $$3, $$7, false, $$5);
               iw $$12 = $$8.a($$0.f());
               $$2.b();
               $$2.a();
               $$9 = $$9.b(ebi.c, Boolean.valueOf(true));
               this.a($$12, $$9, $$2, $$3, $$7, true, $$5);
            } else {
               this.a($$8, $$9, $$2, $$3, $$7, false, $$5);
            }

            $$2.b();
            gss.b();
         }
      }
   }

   private void a(iw $$0, ebq $$1, fld $$2, grn $$3, dkj $$4, boolean $$5, int $$6) {
      gry $$7 = grf.b($$1);
      flg $$8 = $$3.getBuffer($$7);
      List<gsz> $$9 = this.a.a($$1).a(bai.a($$1.b($$0)));
      this.a.b().a($$4, $$9, $$1, $$0, $$2, $$8, $$5, $$6);
   }

   @Override
   public int aW_() {
      return 68;
   }
}
