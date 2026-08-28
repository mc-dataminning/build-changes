public class gvu<S extends gyl, M extends gbz<S>, A extends gbz<S>> extends gwf<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final gvp e;

   public gvu(gtn<S, M> $$0, A $$1, A $$2, gvp $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public gvu(gtn<S, M> $$0, A $$1, A $$2, A $$3, A $$4, gvp $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public static boolean a(cxp $$0, bvs $$1) {
      dfu $$2 = $$0.a(ku.D);
      return $$2 != null && a($$2, $$1);
   }

   private static boolean a(dfu $$0, bvs $$1) {
      return $$0.c().isPresent() && $$0.a() == $$1;
   }

   public void a(fgs $$0, gll $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3.Q, bvs.e, $$2, this.a($$3, bvs.e));
      this.a($$0, $$1, $$3.R, bvs.d, $$2, this.a($$3, bvs.d));
      this.a($$0, $$1, $$3.S, bvs.c, $$2, this.a($$3, bvs.c));
      this.a($$0, $$1, $$3.ao, bvs.f, $$2, this.a($$3, bvs.f));
   }

   private void a(fgs $$0, gll $$1, cxp $$2, bvs $$3, int $$4, A $$5) {
      dfu $$6 = $$2.a(ku.D);
      if ($$6 != null && a($$6, $$3)) {
         this.d().a($$5);
         this.a($$5, $$3);
         alz $$7 = $$6.c().orElseThrow();
         dfs.d $$8 = this.a($$3) ? dfs.d.b : dfs.d.a;
         this.e.a($$8, $$7, $$5, $$2, $$0, $$1, $$4);
      }
   }

   protected void a(A $$0, bvs $$1) {
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

   private A a(S $$0, bvs $$1) {
      if (this.a($$1)) {
         return $$0.ae ? this.c : this.a;
      } else {
         return $$0.ae ? this.d : this.b;
      }
   }

   private boolean a(bvs $$0) {
      return $$0 == bvs.d;
   }
}
