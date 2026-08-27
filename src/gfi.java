public class gfi extends gfd<car, fob<car>> {
   private final fwf a;
   private final gbq b;

   public gfi(gcn<car, fob<car>> $$0, fwf $$1, gbq $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(esa $$0, fvl $$1, int $$2, car $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.w()) {
         boolean $$10 = exh.O().b($$3) && $$3.ce();
         if (!$$3.ce() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            coz $$12 = new coz(cyq.ee);
            if ($$10) {
               dlf $$13 = cyq.ee.o();
               git $$14 = this.a.a($$13);
               int $$15 = gbt.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(fvt.r(ggs.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cow.f, false, $$0, $$1, $$3.dM(), $$2, gbt.c($$3, 0.0F), $$3.aj());
            }

            $$0.b();
         }
      }
   }
}
