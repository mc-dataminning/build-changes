public abstract class gsw<T extends bvk, S extends gzc, M extends gcp<S>> extends gqz<T, S, M> {
   public gsw(gsf.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gsw(gsf.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, gvy.a.a);
   }

   public gsw(gsf.a $$0, M $$1, M $$2, float $$3, gvy.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new gvy<>(this, $$0.f(), $$4));
      this.a(new gxf<>(this, $$0.f(), $$0.h()));
      this.a(new gwm<>(this));
   }

   protected gcp.a a(T $$0, bvc $$1) {
      return gcp.a.a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2, this.i);
      $$1.h = this.a($$0, bvc.a);
      $$1.f = this.a($$0, bvc.b);
   }

   public static void a(bvi $$0, gzc $$1, float $$2, hbn $$3) {
      gxq.a($$0, $$1, $$3);
      $$1.N = $$0.ci();
      $$1.O = $$0.fJ();
      $$1.P = $$0.cl();
      $$1.Q = $$0.bZ();
      $$1.I = 1.0F;
      if ($$1.O) {
         $$1.I = (float)$$0.dy().h();
         $$1.I /= 0.2F;
         $$1.I = $$1.I * $$1.I * $$1.I;
      }

      if ($$1.I < 1.0F) {
         $$1.I = 1.0F;
      }

      $$1.H = $$0.D($$2);
      $$1.G = $$0.a($$2);
      $$1.L = c($$0);
      $$1.M = $$0.fA();
      $$1.J = (float)cvh.b($$0.fB(), $$0);
      $$1.K = $$0.fD();
      $$1.R = $$0.fz();
      $$1.S = $$0.bb.a($$2);
      $$1.T = $$0.bb.b($$2);
      $$1.U = $$0.bb.c($$2);
      $$1.V = a($$0, buu.f);
      $$1.W = a($$0, buu.e);
      $$1.X = a($$0, buu.d);
      $$1.Y = a($$0, buu.c);
   }

   private static cwq a(bvi $$0, buu $$1) {
      cwq $$2 = $$0.a($$1);
      return gwj.a($$2, $$1) ? $$2.v() : cwq.j;
   }

   private static bvc c(bvi $$0) {
      bvc $$1 = $$0.fy();
      return $$0.aJ == bsk.a ? $$1 : $$1.e();
   }
}
