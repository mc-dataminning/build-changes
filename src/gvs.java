public class gvs extends gvy<gyn, gbx> {
   private final gbx a;
   private final gbx b;
   private final gvi c;

   public gvs(gtg<gyn, gbx> $$0, ged $$1, gvi $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gbx($$1.a(geg.bs));
      this.b = new gbx($$1.a(geg.br));
   }

   public void a(fgl $$0, gle $$1, int $$2, gyn $$3, float $$4, float $$5) {
      cxk $$6 = $$3.c;
      dfm $$7 = $$6.a(ku.D);
      if ($$7 != null && $$7.c().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.c().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cxk.k, dfl.k, $$2);
      }
   }

   private void a(fgl $$0, gle $$1, gyn $$2, cxk $$3, alz $$4, int $$5) {
      gbx $$6 = $$2.ae ? this.b : this.a;
      $$6.a($$2);
      this.c.a(dfk.d.f, $$4, $$6, $$3, glo::f, $$0, $$1, $$5);
   }
}
