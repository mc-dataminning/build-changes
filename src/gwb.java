public abstract class gwb<T extends bxb, S extends hcg, M extends gfr<S>> extends gue<T, S, M> {
   public gwb(gvk.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gwb(gvk.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, gzd.a.a);
   }

   public gwb(gvk.a $$0, M $$1, M $$2, float $$3, gzd.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new gzd<>(this, $$0.f(), $$4));
      this.a(new haj<>(this, $$0.f(), $$0.h()));
      this.a(new gzq<>(this));
   }

   protected gfr.a a(T $$0, bws $$1) {
      return gfr.a.a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2, this.h);
      $$1.h = this.a($$0, bws.a);
      $$1.f = this.a($$0, bws.b);
   }

   public static void a(bwz $$0, hcg $$1, float $$2, heq $$3) {
      hau.a($$0, $$1, $$3);
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

      $$1.H = $$0.D($$2);
      $$1.G = $$0.a($$2);
      $$1.L = c($$0);
      $$1.M = $$0.fz();
      $$1.J = (float)cxl.b($$0.fA(), $$0);
      $$1.K = $$0.fC();
      $$1.R = $$0.fy();
      $$1.S = $$0.aZ.a($$2);
      $$1.T = $$0.aZ.b($$2);
      $$1.U = $$0.aZ.c($$2);
      $$1.V = a($$0, bwk.f);
      $$1.W = a($$0, bwk.e);
      $$1.X = a($$0, bwk.d);
      $$1.Y = a($$0, bwk.c);
   }

   private static cys a(bwz $$0, bwk $$1) {
      cys $$2 = $$0.a($$1);
      return gzn.a($$2, $$1) ? $$2.v() : cys.k;
   }

   private static bws c(bwz $$0) {
      bws $$1 = $$0.fx();
      return $$0.aJ == btx.a ? $$1 : $$1.e();
   }
}
