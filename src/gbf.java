public class gbf extends gbl {
   private static final int a = 3;
   private final ged b;
   private final bsd D;
   private final bsd E;
   private int F;
   private final gje G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public gbf(gje $$0, ged $$1, fyd $$2, bsd $$3, bsd $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.ds());
   }

   private gbf(gje $$0, ged $$1, fyd $$2, bsd $$3, bsd $$4, evz $$5) {
      super($$2, $$3.du(), $$3.dw(), $$3.dA(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bsd a(bsd $$0) {
      return (bsd)(!($$0 instanceof cir) ? $$0 : ((cir)$$0).C());
   }

   @Override
   public gbp b() {
      return gbp.e;
   }

   @Override
   public void a(fak $$0, fey $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = aye.d((double)$$2, this.K, this.H);
      double $$5 = aye.d((double)$$2, this.L, this.I);
      double $$6 = aye.d((double)$$2, this.M, this.J);
      double $$7 = aye.d((double)$$3, this.D.du(), $$4);
      double $$8 = aye.d((double)$$3, this.D.dw(), $$5);
      double $$9 = aye.d((double)$$3, this.D.dA(), $$6);
      gdx.a $$10 = this.b.c();
      evz $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dF(), $$2, new fag(), $$10, this.G.a(this.D, $$2));
      $$10.b();
   }

   @Override
   public void a() {
      this.F++;
      if (this.F == 3) {
         this.k();
      }

      this.d();
      this.c();
   }

   private void c() {
      this.H = this.E.du();
      this.I = (this.E.dw() + this.E.dy()) / 2.0;
      this.J = this.E.dA();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
