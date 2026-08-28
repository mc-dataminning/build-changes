public class gtc extends gsx<gvl, gak> {
   private final gjk a;
   private final gpi b;

   public gtc(gqg<gvl, gak> $$0, gjk $$1, gpi $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(feb $$0, gih $$1, int $$2, gvl $$3, float $$4, float $$5) {
      haf $$6 = $$3.an;
      if ($$6 != null) {
         boolean $$7 = $$3.aj && $$3.u;
         if (!$$3.u || $$7) {
            $$0.a();
            this.d().b().a($$0);
            float $$8 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cwb $$9 = $$3.ao;
            if ($$7 && $$9.h() instanceof cuh $$10) {
               dvj $$11 = $$10.d().m();
               haf $$12 = this.a.a($$11);
               int $$13 = gpl.a($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gir.r(gyc.d)), $$11, $$12, 0.0F, 0.0F, 0.0F, $$2, $$13);
            } else {
               this.b.a($$9, cvz.f, false, $$0, $$1, $$2, gpl.a($$3, 0.0F), $$6);
            }

            $$0.b();
         }
      }
   }
}
