public abstract class gst<T extends bvi, S extends gyz, M extends gcn<S>> extends gqw<T, S, M> {
   public gst(gsc.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gst(gsc.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, gvv.a.a);
   }

   public gst(gsc.a $$0, M $$1, M $$2, float $$3, gvv.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new gvv<>(this, $$0.f(), $$4));
      this.a(new gxc<>(this, $$0.f(), $$0.h()));
      this.a(new gwj<>(this));
   }

   protected gcn.a a(T $$0, bva $$1) {
      return gcn.a.a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2, this.i);
      $$1.h = this.a($$0, bva.a);
      $$1.f = this.a($$0, bva.b);
   }

   public static void a(bvg $$0, gyz $$1, float $$2, hbj $$3) {
      gxn.a($$0, $$1, $$3);
      $$1.N = $$0.ci();
      $$1.O = $$0.fJ();
      $$1.P = $$0.cl();
      $$1.Q = $$0.bZ();
      $$1.I = 1.0F;
      if ($$1.O) {
         $$1.I = (float)$$0.dz().h();
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
      $$1.V = a($$0, bus.f);
      $$1.W = a($$0, bus.e);
      $$1.X = a($$0, bus.d);
      $$1.Y = a($$0, bus.c);
   }

   private static cwp a(bvg $$0, bus $$1) {
      cwp $$2 = $$0.a($$1);
      return gwg.a($$2, $$1) ? $$2.v() : cwp.j;
   }

   private static bva c(bvg $$0) {
      bva $$1 = $$0.fy();
      return $$0.aJ == bsi.a ? $$1 : $$1.e();
   }
}
