public abstract class gyz<T extends bxw, S extends hfg, M extends gio<S>> extends gxc<T, S, M> {
   public gyz(gyi.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gyz(gyi.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, hcb.a.a);
   }

   public gyz(gyi.a $$0, M $$1, M $$2, float $$3, hcb.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new hcb<>(this, $$0.f(), $$4));
      this.a(new hdi<>(this, $$0.f(), $$0.h()));
      this.a(new hco<>(this));
   }

   protected gio.a a(T $$0, bxl $$1) {
      return gio.a.a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2, this.h);
      $$1.h = this.a($$0, bxl.a);
      $$1.f = this.a($$0, bxl.b);
   }

   public static void a(bxu $$0, hfg $$1, float $$2, hhq $$3) {
      hdt.a($$0, $$1, $$3);
      $$1.N = $$0.ch();
      $$1.O = $$0.fJ();
      $$1.P = $$0.ck();
      $$1.Q = $$0.bY();
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
      $$1.J = (float)cyr.b($$0.fB(), $$0);
      $$1.K = $$0.fD();
      $$1.R = $$0.fz();
      $$1.S = $$0.aZ.a($$2);
      $$1.T = $$0.aZ.b($$2);
      $$1.U = $$0.aZ.c($$2);
      $$1.V = a($$0, bxd.f);
      $$1.W = a($$0, bxd.e);
      $$1.X = a($$0, bxd.d);
      $$1.Y = a($$0, bxd.c);
   }

   private static czy a(bxu $$0, bxd $$1) {
      czy $$2 = $$0.a($$1);
      return hcl.a($$2, $$1) ? $$2.v() : czy.k;
   }

   private static bxl c(bxu $$0) {
      bxl $$1 = $$0.fy();
      return $$0.aJ == buq.a ? $$1 : $$1.e();
   }
}
