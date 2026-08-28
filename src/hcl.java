public class hcl<S extends hfg, M extends gio<S>, A extends gio<S>> extends hcw<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final hch e;

   public hcl(haf<S, M> $$0, A $$1, A $$2, hch $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public hcl(haf<S, M> $$0, A $$1, A $$2, A $$3, A $$4, hch $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public static boolean a(czy $$0, bxd $$1) {
      dih $$2 = $$0.a(kk.D);
      return $$2 != null && a($$2, $$1);
   }

   private static boolean a(dih $$0, bxd $$1) {
      return $$0.d().isPresent() && $$0.b() == $$1;
   }

   public void a(flo $$0, gsa $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3.W, bxd.e, $$2, this.a($$3, bxd.e));
      this.a($$0, $$1, $$3.X, bxd.d, $$2, this.a($$3, bxd.d));
      this.a($$0, $$1, $$3.Y, bxd.c, $$2, this.a($$3, bxd.c));
      this.a($$0, $$1, $$3.V, bxd.f, $$2, this.a($$3, bxd.f));
   }

   private void a(flo $$0, gsa $$1, czy $$2, bxd $$3, int $$4, A $$5) {
      dih $$6 = $$2.a(kk.D);
      if ($$6 != null && a($$6, $$3)) {
         this.d().a($$5);
         this.a($$5, $$3);
         hng.d $$7 = this.a($$3) ? hng.d.b : hng.d.a;
         this.e.a($$7, $$6.d().orElseThrow(), $$5, $$2, $$0, $$1, $$4);
      }
   }

   protected void a(A $$0, bxd $$1) {
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

   private A a(S $$0, bxd $$1) {
      if (this.a($$1)) {
         return $$0.aj ? this.c : this.a;
      } else {
         return $$0.aj ? this.d : this.b;
      }
   }

   private boolean a(bxd $$0) {
      return $$0 == bxd.d;
   }
}
