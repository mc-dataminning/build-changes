public class gyi<S extends hbb, M extends geo<S>, A extends geo<S>> extends gyt<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final gye e;

   public gyi(gwc<S, M> $$0, A $$1, A $$2, gye $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public gyi(gwc<S, M> $$0, A $$1, A $$2, A $$3, A $$4, gye $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public static boolean a(cxy $$0, bwc $$1) {
      dgc $$2 = $$0.a(kx.E);
      return $$2 != null && a($$2, $$1);
   }

   private static boolean a(dgc $$0, bwc $$1) {
      return $$0.d().isPresent() && $$0.b() == $$1;
   }

   public void a(fho $$0, gny $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3.W, bwc.e, $$2, this.a($$3, bwc.e));
      this.a($$0, $$1, $$3.X, bwc.d, $$2, this.a($$3, bwc.d));
      this.a($$0, $$1, $$3.Y, bwc.c, $$2, this.a($$3, bwc.c));
      this.a($$0, $$1, $$3.V, bwc.f, $$2, this.a($$3, bwc.f));
   }

   private void a(fho $$0, gny $$1, cxy $$2, bwc $$3, int $$4, A $$5) {
      dgc $$6 = $$2.a(kx.E);
      if ($$6 != null && a($$6, $$3)) {
         this.d().a($$5);
         this.a($$5, $$3);
         hiy.d $$7 = this.a($$3) ? hiy.d.b : hiy.d.a;
         this.e.a($$7, $$6.d().orElseThrow(), $$5, $$2, $$0, $$1, $$4);
      }
   }

   protected void a(A $$0, bwc $$1) {
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

   private A a(S $$0, bwc $$1) {
      if (this.a($$1)) {
         return $$0.aj ? this.c : this.a;
      } else {
         return $$0.aj ? this.d : this.b;
      }
   }

   private boolean a(bwc $$0) {
      return $$0 == bwc.d;
   }
}
