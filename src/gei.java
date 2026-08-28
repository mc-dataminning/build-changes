public class gei extends geo {
   private static final int a = 3;
   private final gho b;
   private final bto D;
   private final bto E;
   private int F;
   private final gnh G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public gei(gnh $$0, gho $$1, gbh $$2, bto $$3, bto $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dv());
   }

   private gei(gnh $$0, gho $$1, gbh $$2, bto $$3, bto $$4, eys $$5) {
      super($$2, $$3.dx(), $$3.dz(), $$3.dD(), $$5.d, $$5.e, $$5.f);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bto a(bto $$0) {
      return (bto)(!($$0 instanceof cke) ? $$0 : ((cke)$$0).A());
   }

   @Override
   public ges b() {
      return ges.d;
   }

   @Override
   public void a(fdi $$0, fhu $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = azd.d((double)$$2, this.K, this.H);
      double $$5 = azd.d((double)$$2, this.L, this.I);
      double $$6 = azd.d((double)$$2, this.M, this.J);
      double $$7 = azd.d((double)$$3, this.D.dx(), $$4);
      double $$8 = azd.d((double)$$3, this.D.dz(), $$5);
      double $$9 = azd.d((double)$$3, this.D.dD(), $$6);
      ghg.a $$10 = this.b.c();
      eys $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), $$2, new fde(), $$10, this.G.a(this.D, $$2));
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
      this.H = this.E.dx();
      this.I = (this.E.dz() + this.E.dB()) / 2.0;
      this.J = this.E.dD();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
