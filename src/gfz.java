public class gfz extends ggf {
   private static final int a = 3;
   private final gjf b;
   private final bui D;
   private final bui E;
   private int F;
   private final goy G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public gfz(goy $$0, gjf $$1, gcy $$2, bui $$3, bui $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dB());
   }

   private gfz(goy $$0, gjf $$1, gcy $$2, bui $$3, bui $$4, ezr $$5) {
      super($$2, $$3.dD(), $$3.dF(), $$3.dJ(), $$5.d, $$5.e, $$5.f);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bui a(bui $$0) {
      return (bui)(!($$0 instanceof ckz) ? $$0 : ((ckz)$$0).A());
   }

   @Override
   public ggj b() {
      return ggj.d;
   }

   @Override
   public void a(feo $$0, fjg $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = azn.d((double)$$2, this.K, this.H);
      double $$5 = azn.d((double)$$2, this.L, this.I);
      double $$6 = azn.d((double)$$2, this.M, this.J);
      double $$7 = azn.d((double)$$3, this.D.dD(), $$4);
      double $$8 = azn.d((double)$$3, this.D.dF(), $$5);
      double $$9 = azn.d((double)$$3, this.D.dJ(), $$6);
      gix.a $$10 = this.b.c();
      ezr $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), $$2, new fek(), $$10, this.G.a(this.D, $$2));
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
      this.H = this.E.dD();
      this.I = (this.E.dF() + this.E.dH()) / 2.0;
      this.J = this.E.dJ();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
