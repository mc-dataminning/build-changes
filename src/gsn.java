public class gsn<S extends gvd, M extends fyx<S>, A extends fyx<S>> extends gsx<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final gsi e;

   public gsn(gqg<S, M> $$0, A $$1, A $$2, gsi $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public gsn(gqg<S, M> $$0, A $$1, A $$2, A $$3, A $$4, gsi $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public static boolean a(cwb $$0, bum $$1) {
      ddn $$2 = $$0.a(ku.D);
      return $$2 != null && a($$2, $$1);
   }

   private static boolean a(ddn $$0, bum $$1) {
      return $$0.c().isPresent() && $$0.a() == $$1;
   }

   public void a(feb $$0, gih $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3.Q, bum.e, $$2, this.a($$3, bum.e));
      this.a($$0, $$1, $$3.R, bum.d, $$2, this.a($$3, bum.d));
      this.a($$0, $$1, $$3.S, bum.c, $$2, this.a($$3, bum.c));
      this.a($$0, $$1, $$3.ao, bum.f, $$2, this.a($$3, bum.f));
   }

   private void a(feb $$0, gih $$1, cwb $$2, bum $$3, int $$4, A $$5) {
      ddn $$6 = $$2.a(ku.D);
      if ($$6 != null && a($$6, $$3)) {
         this.d().a($$5);
         this.a($$5, $$3);
         ali $$7 = $$6.c().orElseThrow();
         ddl.d $$8 = this.a($$3) ? ddl.d.b : ddl.d.a;
         this.e.a($$8, $$7, $$5, $$2, gir::a, $$0, $$1, $$4);
      }
   }

   protected void a(A $$0, bum $$1) {
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

   private A a(S $$0, bum $$1) {
      if (this.a($$1)) {
         return $$0.ae ? this.c : this.a;
      } else {
         return $$0.ae ? this.d : this.b;
      }
   }

   private boolean a(bum $$0) {
      return $$0 == bum.d;
   }
}
