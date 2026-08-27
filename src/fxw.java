public class fxw extends fxr<bvr, fhf<bvr>> {
   private final fpa a;
   private final fuh b;

   public fxw(fve<bvr, fhf<bvr>> $$0, fpa $$1, fuh $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(elr $$0, fog $$1, int $$2, bvr $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.t()) {
         boolean $$10 = eqx.O().b($$3) && $$3.cd();
         if (!$$3.cd() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cjh $$12 = new cjh(csy.ef);
            if ($$10) {
               dfl $$13 = csy.ef.n();
               gbh $$14 = this.a.a($$13);
               int $$15 = fuk.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(foo.q(fzf.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cje.f, false, $$0, $$1, $$3.dL(), $$2, fuk.c($$3, 0.0F), $$3.ah());
            }

            $$0.b();
         }
      }
   }
}
