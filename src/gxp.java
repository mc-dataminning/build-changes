public abstract class gxp<T extends bxl, S extends hdw, M extends ghd<S>> extends gvs<T, S, M> {
   public gxp(gwy.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gxp(gwy.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, har.a.a);
   }

   public gxp(gwy.a $$0, M $$1, M $$2, float $$3, har.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new har<>(this, $$0.f(), $$4));
      this.a(new hby<>(this, $$0.f(), $$0.h()));
      this.a(new hbe<>(this));
   }

   protected ghd.a a(T $$0, bxa $$1) {
      return ghd.a.a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2, this.h);
      $$1.h = this.a($$0, bxa.a);
      $$1.f = this.a($$0, bxa.b);
   }

   public static void a(bxj $$0, hdw $$1, float $$2, hgg $$3) {
      hcj.a($$0, $$1, $$3);
      $$1.N = $$0.cg();
      $$1.O = $$0.fI();
      $$1.P = $$0.cj();
      $$1.Q = $$0.bX();
      $$1.I = 1.0F;
      if ($$1.O) {
         $$1.I = (float)$$0.dx().h();
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
      $$1.J = (float)cyg.b($$0.fA(), $$0);
      $$1.K = $$0.fC();
      $$1.R = $$0.fy();
      $$1.S = $$0.aZ.a($$2);
      $$1.T = $$0.aZ.b($$2);
      $$1.U = $$0.aZ.c($$2);
      $$1.V = a($$0, bws.f);
      $$1.W = a($$0, bws.e);
      $$1.X = a($$0, bws.d);
      $$1.Y = a($$0, bws.c);
   }

   private static czn a(bxj $$0, bws $$1) {
      czn $$2 = $$0.a($$1);
      return hbb.a($$2, $$1) ? $$2.v() : czn.k;
   }

   private static bxa c(bxj $$0) {
      bxa $$1 = $$0.fx();
      return $$0.aJ == buf.a ? $$1 : $$1.e();
   }
}
