public class fyw extends fzc {
   private static final int a = 3;
   private final gbu b;
   private final brh D;
   private final brh E;
   private int F;
   private final ggv G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public fyw(ggv $$0, gbu $$1, fvw $$2, brh $$3, brh $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dq());
   }

   private fyw(ggv $$0, gbu $$1, fvw $$2, brh $$3, brh $$4, etp $$5) {
      super($$2, $$3.ds(), $$3.du(), $$3.dy(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private brh a(brh $$0) {
      return (brh)(!($$0 instanceof chr) ? $$0 : ((chr)$$0).C());
   }

   @Override
   public fzg b() {
      return fzg.e;
   }

   @Override
   public void a(eyb $$0, fcp $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = axz.d((double)$$2, this.K, this.H);
      double $$5 = axz.d((double)$$2, this.L, this.I);
      double $$6 = axz.d((double)$$2, this.M, this.J);
      double $$7 = axz.d((double)$$3, this.D.ds(), $$4);
      double $$8 = axz.d((double)$$3, this.D.du(), $$5);
      double $$9 = axz.d((double)$$3, this.D.dy(), $$6);
      gbo.a $$10 = this.b.c();
      etp $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dD(), $$2, new exx(), $$10, this.G.a(this.D, $$2));
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
      this.H = this.E.ds();
      this.I = (this.E.du() + this.E.dw()) / 2.0;
      this.J = this.E.dy();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
