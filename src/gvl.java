public class gvl extends gvy<gyd, gbq> {
   private final gbq a;
   private final gbq b;
   private final gvi c;

   public gvl(gtg<gyd, gbq> $$0, ged $$1, gvi $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gbq($$1.a(geg.bb));
      this.b = new gbq($$1.a(geg.bd));
   }

   public void a(fgl $$0, gle $$1, int $$2, gyd $$3, float $$4, float $$5) {
      cxk $$6 = $$3.i;
      dfm $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gbq $$8 = $$3.ae ? this.b : this.a;
         alz $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(dfk.d.e, $$9, $$8, $$6, glo::f, $$0, $$1, $$2);
      }
   }
}
