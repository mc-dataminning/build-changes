public class fxq extends fxl<bvv, fgy<bvv>> {
   private final fou a;
   private final fub b;

   public fxq(fuy<bvv, fgy<bvv>> $$0, fou $$1, fub $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(elj $$0, foa $$1, int $$2, bvv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.t()) {
         boolean $$10 = eqp.O().b($$3) && $$3.cd();
         if (!$$3.cd() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cjl $$12 = new cjl(cte.ee);
            if ($$10) {
               dfd $$13 = cte.ee.o();
               gbb $$14 = this.a.a($$13);
               int $$15 = fue.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(foi.q(fyz.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cji.f, false, $$0, $$1, $$3.dL(), $$2, fue.c($$3, 0.0F), $$3.ah());
            }

            $$0.b();
         }
      }
   }
}
