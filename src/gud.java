public class gud extends gty<gwm, gbj> {
   private final gkj a;
   private final gqi b;

   public gud(grh<gwm, gbj> $$0, gkj $$1, gqi $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(fer $$0, gjg $$1, int $$2, gwm $$3, float $$4, float $$5) {
      hbg $$6 = $$3.an;
      if ($$6 != null) {
         boolean $$7 = $$3.aj && $$3.u;
         if (!$$3.u || $$7) {
            $$0.a();
            this.d().b().a($$0);
            float $$8 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cwm $$9 = $$3.ao;
            if ($$7 && $$9.h() instanceof cus $$10) {
               dvv $$11 = $$10.d().m();
               hbg $$12 = this.a.a($$11);
               int $$13 = gql.a($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gjq.r(gzd.d)), $$11, $$12, 0.0F, 0.0F, 0.0F, $$2, $$13);
            } else {
               this.b.a($$9, cwk.f, false, $$0, $$1, $$2, gql.a($$3, 0.0F), $$6);
            }

            $$0.b();
         }
      }
   }
}
