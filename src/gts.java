public class gts extends gtn<gwb, gba> {
   private final gka a;
   private final gpy b;

   public gts(gqw<gwb, gba> $$0, gka $$1, gpy $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(fek $$0, gix $$1, int $$2, gwb $$3, float $$4, float $$5) {
      hav $$6 = $$3.an;
      if ($$6 != null) {
         boolean $$7 = $$3.aj && $$3.u;
         if (!$$3.u || $$7) {
            $$0.a();
            this.d().b().a($$0);
            float $$8 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cwf $$9 = $$3.ao;
            if ($$7 && $$9.h() instanceof cul $$10) {
               dvo $$11 = $$10.d().m();
               hav $$12 = this.a.a($$11);
               int $$13 = gqb.a($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gjh.r(gys.d)), $$11, $$12, 0.0F, 0.0F, 0.0F, $$2, $$13);
            } else {
               this.b.a($$9, cwd.f, false, $$0, $$1, $$2, gqb.a($$3, 0.0F), $$6);
            }

            $$0.b();
         }
      }
   }
}
