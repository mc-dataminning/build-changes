public abstract class gss<T extends bvh, S extends gyy, M extends gcl<S>> extends gqv<T, S, M> {
   public gss(gsb.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gss(gsb.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, gvu.a.a);
   }

   public gss(gsb.a $$0, M $$1, M $$2, float $$3, gvu.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new gvu<>(this, $$0.f(), $$4));
      this.a(new gxb<>(this, $$0.f(), $$0.h()));
      this.a(new gwi<>(this));
   }

   protected gcl.a a(T $$0, buz $$1) {
      return gcl.a.a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2, this.i);
      $$1.h = this.a($$0, buz.a);
      $$1.f = this.a($$0, buz.b);
   }

   public static void a(bvf $$0, gyy $$1, float $$2, hbi $$3) {
      gxm.a($$0, $$1, $$3);
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
      $$1.J = (float)cve.b($$0.fB(), $$0);
      $$1.K = $$0.fD();
      $$1.R = $$0.fz();
      $$1.S = $$0.bb.a($$2);
      $$1.T = $$0.bb.b($$2);
      $$1.U = $$0.bb.c($$2);
      $$1.V = a($$0, bur.f);
      $$1.W = a($$0, bur.e);
      $$1.X = a($$0, bur.d);
      $$1.Y = a($$0, bur.c);
   }

   private static cwn a(bvf $$0, bur $$1) {
      cwn $$2 = $$0.a($$1);
      return gwf.a($$2, $$1) ? $$2.v() : cwn.j;
   }

   private static buz c(bvf $$0) {
      buz $$1 = $$0.fy();
      return $$0.aJ == bsh.a ? $$1 : $$1.e();
   }
}
