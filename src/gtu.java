public abstract class gtu<T extends bwa, S extends haa, M extends gdn<S>> extends grx<T, S, M> {
   public gtu(gtd.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gtu(gtd.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, gww.a.a);
   }

   public gtu(gtd.a $$0, M $$1, M $$2, float $$3, gww.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new gww<>(this, $$0.f(), $$4));
      this.a(new gyd<>(this, $$0.f(), $$0.h()));
      this.a(new gxk<>(this));
   }

   protected gdn.a a(T $$0, bvr $$1) {
      return gdn.a.a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2, this.i);
      $$1.h = this.a($$0, bvr.a);
      $$1.f = this.a($$0, bvr.b);
   }

   public static void a(bvy $$0, haa $$1, float $$2, hcl $$3) {
      gyo.a($$0, $$1, $$3);
      $$1.N = $$0.ch();
      $$1.O = $$0.fL();
      $$1.P = $$0.ck();
      $$1.Q = $$0.bY();
      $$1.I = 1.0F;
      if ($$1.O) {
         $$1.I = (float)$$0.dx().h();
         $$1.I /= 0.2F;
         $$1.I = $$1.I * $$1.I * $$1.I;
      }

      if ($$1.I < 1.0F) {
         $$1.I = 1.0F;
      }

      $$1.H = $$0.E($$2);
      $$1.G = $$0.a($$2);
      $$1.L = c($$0);
      $$1.M = $$0.fC();
      $$1.J = (float)cvz.b($$0.fD(), $$0);
      $$1.K = $$0.fF();
      $$1.R = $$0.fB();
      $$1.S = $$0.aZ.a($$2);
      $$1.T = $$0.aZ.b($$2);
      $$1.U = $$0.aZ.c($$2);
      $$1.V = a($$0, bvj.f);
      $$1.W = a($$0, bvj.e);
      $$1.X = a($$0, bvj.d);
      $$1.Y = a($$0, bvj.c);
   }

   private static cxh a(bvy $$0, bvj $$1) {
      cxh $$2 = $$0.a($$1);
      return gxh.a($$2, $$1) ? $$2.v() : cxh.k;
   }

   private static bvr c(bvy $$0) {
      bvr $$1 = $$0.fA();
      return $$0.aJ == bsx.a ? $$1 : $$1.e();
   }
}
