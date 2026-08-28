public abstract class gsv<T extends bvj, S extends gzb, M extends gco<S>> extends gqy<T, S, M> {
   public gsv(gse.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gsv(gse.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, gvx.a.a);
   }

   public gsv(gse.a $$0, M $$1, M $$2, float $$3, gvx.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new gvx<>(this, $$0.f(), $$4));
      this.a(new gxe<>(this, $$0.f(), $$0.h()));
      this.a(new gwl<>(this));
   }

   protected gco.a a(T $$0, bvb $$1) {
      return gco.a.a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2, this.i);
      $$1.h = this.a($$0, bvb.a);
      $$1.f = this.a($$0, bvb.b);
   }

   public static void a(bvh $$0, gzb $$1, float $$2, hbm $$3) {
      gxp.a($$0, $$1, $$3);
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
      $$1.J = (float)cvg.b($$0.fB(), $$0);
      $$1.K = $$0.fD();
      $$1.R = $$0.fz();
      $$1.S = $$0.bb.a($$2);
      $$1.T = $$0.bb.b($$2);
      $$1.U = $$0.bb.c($$2);
      $$1.V = a($$0, but.f);
      $$1.W = a($$0, but.e);
      $$1.X = a($$0, but.d);
      $$1.Y = a($$0, but.c);
   }

   private static cwp a(bvh $$0, but $$1) {
      cwp $$2 = $$0.a($$1);
      return gwi.a($$2, $$1) ? $$2.v() : cwp.j;
   }

   private static bvb c(bvh $$0) {
      bvb $$1 = $$0.fy();
      return $$0.aJ == bsj.a ? $$1 : $$1.e();
   }
}
