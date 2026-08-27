public class fuy extends fve {
   private static final int a = 3;
   private final fxw b;
   private final bow D;
   private final bow E;
   private int F;
   private final gcw G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public fuy(gcw $$0, fxw $$1, fry $$2, bow $$3, bow $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dp());
   }

   private fuy(gcw $$0, fxw $$1, fry $$2, bow $$3, bow $$4, epr $$5) {
      super($$2, $$3.dr(), $$3.dt(), $$3.dx(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bow a(bow $$0) {
      return (bow)(!($$0 instanceof cfd) ? $$0 : ((cfd)$$0).C());
   }

   @Override
   public fvi b() {
      return fvi.e;
   }

   @Override
   public void a(eud $$0, eyr $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = aww.d((double)$$2, this.K, this.H);
      double $$5 = aww.d((double)$$2, this.L, this.I);
      double $$6 = aww.d((double)$$2, this.M, this.J);
      double $$7 = aww.d((double)$$3, this.D.dr(), $$4);
      double $$8 = aww.d((double)$$3, this.D.dt(), $$5);
      double $$9 = aww.d((double)$$3, this.D.dx(), $$6);
      fxq.a $$10 = this.b.c();
      epr $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dC(), $$2, new etz(), $$10, this.G.a(this.D, $$2));
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
      this.H = this.E.dr();
      this.I = (this.E.dt() + this.E.dv()) / 2.0;
      this.J = this.E.dx();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
