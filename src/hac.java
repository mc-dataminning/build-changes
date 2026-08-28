public class hac<S extends hcw, M extends gge<S>, A extends gge<S>> extends han<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final gzy e;

   public hac(gxw<S, M> $$0, A $$1, A $$2, gzy $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public hac(gxw<S, M> $$0, A $$1, A $$2, A $$3, A $$4, gzy $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public static boolean a(cyy $$0, bwn $$1) {
      dhh $$2 = $$0.a(kj.D);
      return $$2 != null && a($$2, $$1);
   }

   private static boolean a(dhh $$0, bwn $$1) {
      return $$0.d().isPresent() && $$0.b() == $$1;
   }

   public void a(fjc $$0, gps $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3.W, bwn.e, $$2, this.a($$3, bwn.e));
      this.a($$0, $$1, $$3.X, bwn.d, $$2, this.a($$3, bwn.d));
      this.a($$0, $$1, $$3.Y, bwn.c, $$2, this.a($$3, bwn.c));
      this.a($$0, $$1, $$3.V, bwn.f, $$2, this.a($$3, bwn.f));
   }

   private void a(fjc $$0, gps $$1, cyy $$2, bwn $$3, int $$4, A $$5) {
      dhh $$6 = $$2.a(kj.D);
      if ($$6 != null && a($$6, $$3)) {
         this.d().a($$5);
         this.a($$5, $$3);
         hkv.d $$7 = this.a($$3) ? hkv.d.b : hkv.d.a;
         this.e.a($$7, $$6.d().orElseThrow(), $$5, $$2, $$0, $$1, $$4);
      }
   }

   protected void a(A $$0, bwn $$1) {
      $$0.c_(false);
      switch ($$1) {
         case f:
            $$0.o.k = true;
            $$0.p.k = true;
            break;
         case e:
            $$0.q.k = true;
            $$0.r.k = true;
            $$0.s.k = true;
            break;
         case d:
            $$0.q.k = true;
            $$0.t.k = true;
            $$0.u.k = true;
            break;
         case c:
            $$0.t.k = true;
            $$0.u.k = true;
      }
   }

   private A a(S $$0, bwn $$1) {
      if (this.a($$1)) {
         return $$0.aj ? this.c : this.a;
      } else {
         return $$0.aj ? this.d : this.b;
      }
   }

   private boolean a(bwn $$0) {
      return $$0 == bwn.d;
   }
}
