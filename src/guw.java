public abstract class guw<T extends bwt, S extends hbb, M extends geo<S>> extends gsz<T, S, M> {
   public guw(guf.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public guw(guf.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, gxy.a.a);
   }

   public guw(guf.a $$0, M $$1, M $$2, float $$3, gxy.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new gxy<>(this, $$0.f(), $$4));
      this.a(new gze<>(this, $$0.f(), $$0.h()));
      this.a(new gyl<>(this));
   }

   protected geo.a a(T $$0, bwk $$1) {
      return geo.a.a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2, this.h);
      $$1.h = this.a($$0, bwk.a);
      $$1.f = this.a($$0, bwk.b);
   }

   public static void a(bwr $$0, hbb $$1, float $$2, hdl $$3) {
      gzp.a($$0, $$1, $$3);
      $$1.N = $$0.ci();
      $$1.O = $$0.fI();
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

      $$1.H = $$0.E($$2);
      $$1.G = $$0.a($$2);
      $$1.L = c($$0);
      $$1.M = $$0.fz();
      $$1.J = (float)cwq.b($$0.fA(), $$0);
      $$1.K = $$0.fC();
      $$1.R = $$0.fy();
      $$1.S = $$0.aY.a($$2);
      $$1.T = $$0.aY.b($$2);
      $$1.U = $$0.aY.c($$2);
      $$1.V = a($$0, bwc.f);
      $$1.W = a($$0, bwc.e);
      $$1.X = a($$0, bwc.d);
      $$1.Y = a($$0, bwc.c);
   }

   private static cxy a(bwr $$0, bwc $$1) {
      cxy $$2 = $$0.a($$1);
      return gyi.a($$2, $$1) ? $$2.v() : cxy.k;
   }

   private static bwk c(bwr $$0) {
      bwk $$1 = $$0.fx();
      return $$0.aI == btp.a ? $$1 : $$1.e();
   }
}
