public class hby<S extends hev, M extends gib<S>, A extends gib<S>> extends hcj<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final hbu e;

   public hby(gzs<S, M> $$0, A $$1, A $$2, hbu $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public hby(gzs<S, M> $$0, A $$1, A $$2, A $$3, A $$4, hbu $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public static boolean a(dak $$0, bxo $$1) {
      dit $$2 = $$0.a(kl.D);
      return $$2 != null && a($$2, $$1);
   }

   private static boolean a(dit $$0, bxo $$1) {
      return $$0.d().isPresent() && $$0.b() == $$1;
   }

   public void a(fld $$0, grn $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3.Z, bxo.e, $$2, this.a($$3, bxo.e));
      this.a($$0, $$1, $$3.aa, bxo.d, $$2, this.a($$3, bxo.d));
      this.a($$0, $$1, $$3.ab, bxo.c, $$2, this.a($$3, bxo.c));
      this.a($$0, $$1, $$3.Y, bxo.f, $$2, this.a($$3, bxo.f));
   }

   private void a(fld $$0, grn $$1, dak $$2, bxo $$3, int $$4, A $$5) {
      dit $$6 = $$2.a(kl.D);
      if ($$6 != null && a($$6, $$3)) {
         this.d().a($$5);
         this.a($$5, $$3);
         hmw.d $$7 = this.a($$3) ? hmw.d.b : hmw.d.a;
         this.e.a($$7, $$6.d().orElseThrow(), $$5, $$2, $$0, $$1, $$4);
      }
   }

   protected void a(A $$0, bxo $$1) {
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

   private A a(S $$0, bxo $$1) {
      if (this.a($$1)) {
         return $$0.am ? this.c : this.a;
      } else {
         return $$0.am ? this.d : this.b;
      }
   }

   private boolean a(bxo $$0) {
      return $$0 == bxo.d;
   }
}
