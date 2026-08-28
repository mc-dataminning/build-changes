public abstract class gzb<T extends bxy, S extends hfi, M extends giq<S>> extends gxe<T, S, M> {
   public gzb(gyk.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gzb(gyk.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, hcd.a.a);
   }

   public gzb(gyk.a $$0, M $$1, M $$2, float $$3, hcd.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new hcd<>(this, $$0.f(), $$4));
      this.a(new hdk<>(this, $$0.f(), $$0.h()));
      this.a(new hcq<>(this));
   }

   protected giq.a a(T $$0, bxn $$1) {
      return giq.a.a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2, this.h);
      $$1.h = this.a($$0, bxn.a);
      $$1.f = this.a($$0, bxn.b);
   }

   public static void a(bxw $$0, hfi $$1, float $$2, hhs $$3) {
      hdv.a($$0, $$1, $$3);
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
      $$1.J = (float)cyt.b($$0.fB(), $$0);
      $$1.K = $$0.fD();
      $$1.R = $$0.fz();
      $$1.S = $$0.aZ.a($$2);
      $$1.T = $$0.aZ.b($$2);
      $$1.U = $$0.aZ.c($$2);
      $$1.V = a($$0, bxf.f);
      $$1.W = a($$0, bxf.e);
      $$1.X = a($$0, bxf.d);
      $$1.Y = a($$0, bxf.c);
   }

   private static daa a(bxw $$0, bxf $$1) {
      daa $$2 = $$0.a($$1);
      return hcn.a($$2, $$1) ? $$2.v() : daa.k;
   }

   private static bxn c(bxw $$0) {
      bxn $$1 = $$0.fy();
      return $$0.aJ == bus.a ? $$1 : $$1.e();
   }
}
