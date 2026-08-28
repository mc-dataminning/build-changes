public class gxh<S extends haa, M extends gdn<S>, A extends gdn<S>> extends gxs<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final gxc e;

   public gxh(gva<S, M> $$0, A $$1, A $$2, gxc $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public gxh(gva<S, M> $$0, A $$1, A $$2, A $$3, A $$4, gxc $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public static boolean a(cxh $$0, bvj $$1) {
      dfm $$2 = $$0.a(kv.E);
      return $$2 != null && a($$2, $$1);
   }

   private static boolean a(dfm $$0, bvj $$1) {
      return $$0.c().isPresent() && $$0.a() == $$1;
   }

   public void a(fgr $$0, gmx $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3.W, bvj.e, $$2, this.a($$3, bvj.e));
      this.a($$0, $$1, $$3.X, bvj.d, $$2, this.a($$3, bvj.d));
      this.a($$0, $$1, $$3.Y, bvj.c, $$2, this.a($$3, bvj.c));
      this.a($$0, $$1, $$3.V, bvj.f, $$2, this.a($$3, bvj.f));
   }

   private void a(fgr $$0, gmx $$1, cxh $$2, bvj $$3, int $$4, A $$5) {
      dfm $$6 = $$2.a(kv.E);
      if ($$6 != null && a($$6, $$3)) {
         this.d().a($$5);
         this.a($$5, $$3);
         hhx.d $$7 = this.a($$3) ? hhx.d.b : hhx.d.a;
         this.e.a($$7, $$6.c().orElseThrow(), $$5, $$2, $$0, $$1, $$4);
      }
   }

   protected void a(A $$0, bvj $$1) {
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

   private A a(S $$0, bvj $$1) {
      if (this.a($$1)) {
         return $$0.aj ? this.c : this.a;
      } else {
         return $$0.aj ? this.d : this.b;
      }
   }

   private boolean a(bvj $$0) {
      return $$0 == bvj.d;
   }
}
