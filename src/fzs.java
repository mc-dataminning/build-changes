public class fzs extends fzy {
   private static final int a = 3;
   private final gcq b;
   private final bru D;
   private final bru E;
   private int F;
   private final ghr G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public fzs(ghr $$0, gcq $$1, fwr $$2, bru $$3, bru $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.ds());
   }

   private fzs(ghr $$0, gcq $$1, fwr $$2, bru $$3, bru $$4, euk $$5) {
      super($$2, $$3.du(), $$3.dw(), $$3.dA(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bru a(bru $$0) {
      return (bru)(!($$0 instanceof cig) ? $$0 : ((cig)$$0).C());
   }

   @Override
   public gac b() {
      return gac.e;
   }

   @Override
   public void a(eyw $$0, fdk $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = ayd.d((double)$$2, this.K, this.H);
      double $$5 = ayd.d((double)$$2, this.L, this.I);
      double $$6 = ayd.d((double)$$2, this.M, this.J);
      double $$7 = ayd.d((double)$$3, this.D.du(), $$4);
      double $$8 = ayd.d((double)$$3, this.D.dw(), $$5);
      double $$9 = ayd.d((double)$$3, this.D.dA(), $$6);
      gck.a $$10 = this.b.c();
      euk $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dF(), $$2, new eys(), $$10, this.G.a(this.D, $$2));
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
