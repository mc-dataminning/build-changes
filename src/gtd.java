public class gtd<S extends gvt, M extends fzn<S>, A extends fzn<S>> extends gtn<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final gsy e;

   public gtd(gqw<S, M> $$0, A $$1, A $$2, gsy $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public gtd(gqw<S, M> $$0, A $$1, A $$2, A $$3, A $$4, gsy $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public static boolean a(cwf $$0, buq $$1) {
      ddr $$2 = $$0.a(ku.D);
      return $$2 != null && a($$2, $$1);
   }

   private static boolean a(ddr $$0, buq $$1) {
      return $$0.c().isPresent() && $$0.a() == $$1;
   }

   public void a(fek $$0, gix $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3.Q, buq.e, $$2, this.a($$3, buq.e));
      this.a($$0, $$1, $$3.R, buq.d, $$2, this.a($$3, buq.d));
      this.a($$0, $$1, $$3.S, buq.c, $$2, this.a($$3, buq.c));
      this.a($$0, $$1, $$3.ao, buq.f, $$2, this.a($$3, buq.f));
   }

   private void a(fek $$0, gix $$1, cwf $$2, buq $$3, int $$4, A $$5) {
      ddr $$6 = $$2.a(ku.D);
      if ($$6 != null && a($$6, $$3)) {
         this.d().a($$5);
         this.a($$5, $$3);
         all $$7 = $$6.c().orElseThrow();
         ddp.d $$8 = this.a($$3) ? ddp.d.b : ddp.d.a;
         this.e.a($$8, $$7, $$5, $$2, gjh::a, $$0, $$1, $$4);
      }
   }

   protected void a(A $$0, buq $$1) {
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

   private A a(S $$0, buq $$1) {
      if (this.a($$1)) {
         return $$0.ae ? this.c : this.a;
      } else {
         return $$0.ae ? this.d : this.b;
      }
   }

   private boolean a(buq $$0) {
      return $$0 == buq.d;
   }
}
