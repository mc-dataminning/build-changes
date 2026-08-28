public class hcn<S extends hfi, M extends giq<S>, A extends giq<S>> extends hcy<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final hcj e;

   public hcn(hah<S, M> $$0, A $$1, A $$2, hcj $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public hcn(hah<S, M> $$0, A $$1, A $$2, A $$3, A $$4, hcj $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public static boolean a(daa $$0, bxf $$1) {
      dij $$2 = $$0.a(kl.D);
      return $$2 != null && a($$2, $$1);
   }

   private static boolean a(dij $$0, bxf $$1) {
      return $$0.d().isPresent() && $$0.b() == $$1;
   }

   public void a(flq $$0, gsc $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3.W, bxf.e, $$2, this.a($$3, bxf.e));
      this.a($$0, $$1, $$3.X, bxf.d, $$2, this.a($$3, bxf.d));
      this.a($$0, $$1, $$3.Y, bxf.c, $$2, this.a($$3, bxf.c));
      this.a($$0, $$1, $$3.V, bxf.f, $$2, this.a($$3, bxf.f));
   }

   private void a(flq $$0, gsc $$1, daa $$2, bxf $$3, int $$4, A $$5) {
      dij $$6 = $$2.a(kl.D);
      if ($$6 != null && a($$6, $$3)) {
         this.d().a($$5);
         this.a($$5, $$3);
         hni.d $$7 = this.a($$3) ? hni.d.b : hni.d.a;
         this.e.a($$7, $$6.d().orElseThrow(), $$5, $$2, $$0, $$1, $$4);
      }
   }

   protected void a(A $$0, bxf $$1) {
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

   private A a(S $$0, bxf $$1) {
      if (this.a($$1)) {
         return $$0.aj ? this.c : this.a;
      } else {
         return $$0.aj ? this.d : this.b;
      }
   }

   private boolean a(bxf $$0) {
      return $$0 == bxf.d;
   }
}
