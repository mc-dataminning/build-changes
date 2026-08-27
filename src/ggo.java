public class ggo extends ggj<cbk, fpf<cbk>> {
   private final fxk a;
   private final gcw b;

   public ggo(gdt<cbk, fpf<cbk>> $$0, fxk $$1, gcw $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(etd $$0, fwq $$1, int $$2, cbk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.w()) {
         boolean $$10 = eyk.P().b($$3) && $$3.cb();
         if (!$$3.cb() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cpq $$12 = new cpq(czh.ee);
            if ($$10) {
               dme $$13 = czh.ee.o();
               gjz $$14 = this.a.a($$13);
               int $$15 = gcz.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(fwy.r(ghy.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cpn.f, false, $$0, $$1, $$3.dJ(), $$2, gcz.c($$3, 0.0F), $$3.aj());
            }

            $$0.b();
         }
      }
   }
}
