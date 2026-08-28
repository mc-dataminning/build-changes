public abstract class gym<T extends byh, S extends hev, M extends gib<S>> extends gwp<T, S, M> {
   public gym(gxv.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gym(gxv.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, hbo.a.a);
   }

   public gym(gxv.a $$0, M $$1, M $$2, float $$3, hbo.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new hbo<>(this, $$0.f(), $$4));
      this.a(new hcv<>(this, $$0.f(), $$0.h()));
      this.a(new hcb<>(this));
   }

   protected gib.a a(T $$0, bxw $$1) {
      return gib.a.a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2, this.h);
      $$1.h = this.a($$0, bxw.a);
      $$1.f = this.a($$0, bxw.b);
   }

   public static void a(byf $$0, hev $$1, float $$2, hhg $$3) {
      hdg.a($$0, $$1, $$3);
      $$1.Q = $$0.ch();
      $$1.R = $$0.fJ();
      $$1.S = $$0.ck();
      $$1.T = $$0.bY();
      $$1.L = 1.0F;
      if ($$1.R) {
         $$1.L = (float)$$0.dy().h();
         $$1.L /= 0.2F;
         $$1.L = $$1.L * $$1.L * $$1.L;
      }

      if ($$1.L < 1.0F) {
         $$1.L = 1.0F;
      }

      $$1.K = $$0.D($$2);
      $$1.J = $$0.a($$2);
      $$1.O = c($$0);
      $$1.P = $$0.fA();
      $$1.M = (float)czd.b($$0.fB(), $$0);
      $$1.N = $$0.fD();
      $$1.U = $$0.fz();
      $$1.V = $$0.aZ.a($$2);
      $$1.W = $$0.aZ.b($$2);
      $$1.X = $$0.aZ.c($$2);
      $$1.Y = a($$0, bxo.f);
      $$1.Z = a($$0, bxo.e);
      $$1.aa = a($$0, bxo.d);
      $$1.ab = a($$0, bxo.c);
   }

   private static dak a(byf $$0, bxo $$1) {
      dak $$2 = $$0.a($$1);
      return hby.a($$2, $$1) ? $$2.v() : dak.l;
   }

   private static bxw c(byf $$0) {
      bxw $$1 = $$0.fy();
      return $$0.aJ == bvb.a ? $$1 : $$1.e();
   }
}
