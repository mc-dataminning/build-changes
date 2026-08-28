public class gto<S extends gwe, M extends fzw<S>, A extends fzw<S>> extends gty<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final gtj e;

   public gto(grh<S, M> $$0, A $$1, A $$2, gtj $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public gto(grh<S, M> $$0, A $$1, A $$2, A $$3, A $$4, gtj $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public static boolean a(cwm $$0, but $$1) {
      ddy $$2 = $$0.a(ku.D);
      return $$2 != null && a($$2, $$1);
   }

   private static boolean a(ddy $$0, but $$1) {
      return $$0.c().isPresent() && $$0.a() == $$1;
   }

   public void a(fer $$0, gjg $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3.Q, but.e, $$2, this.a($$3, but.e));
      this.a($$0, $$1, $$3.R, but.d, $$2, this.a($$3, but.d));
      this.a($$0, $$1, $$3.S, but.c, $$2, this.a($$3, but.c));
      this.a($$0, $$1, $$3.ao, but.f, $$2, this.a($$3, but.f));
   }

   private void a(fer $$0, gjg $$1, cwm $$2, but $$3, int $$4, A $$5) {
      ddy $$6 = $$2.a(ku.D);
      if ($$6 != null && a($$6, $$3)) {
         this.d().a($$5);
         this.a($$5, $$3);
         alj $$7 = $$6.c().orElseThrow();
         ddw.d $$8 = this.a($$3) ? ddw.d.b : ddw.d.a;
         this.e.a($$8, $$7, $$5, $$2, gjq::a, $$0, $$1, $$4);
      }
   }

   protected void a(A $$0, but $$1) {
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

   private A a(S $$0, but $$1) {
      if (this.a($$1)) {
         return $$0.ae ? this.c : this.a;
      } else {
         return $$0.ae ? this.d : this.b;
      }
   }

   private boolean a(but $$0) {
      return $$0 == but.d;
   }
}
