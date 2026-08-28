public class gwj<S extends gzc, M extends gcp<S>, A extends gcp<S>> extends gwu<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final gwe e;

   public gwj(guc<S, M> $$0, A $$1, A $$2, gwe $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public gwj(guc<S, M> $$0, A $$1, A $$2, A $$3, A $$4, gwe $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public static boolean a(cwq $$0, buu $$1) {
      dev $$2 = $$0.a(kv.D);
      return $$2 != null && a($$2, $$1);
   }

   private static boolean a(dev $$0, buu $$1) {
      return $$0.c().isPresent() && $$0.a() == $$1;
   }

   public void a(ffv $$0, glz $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3.W, buu.e, $$2, this.a($$3, buu.e));
      this.a($$0, $$1, $$3.X, buu.d, $$2, this.a($$3, buu.d));
      this.a($$0, $$1, $$3.Y, buu.c, $$2, this.a($$3, buu.c));
      this.a($$0, $$1, $$3.V, buu.f, $$2, this.a($$3, buu.f));
   }

   private void a(ffv $$0, glz $$1, cwq $$2, buu $$3, int $$4, A $$5) {
      dev $$6 = $$2.a(kv.D);
      if ($$6 != null && a($$6, $$3)) {
         this.d().a($$5);
         this.a($$5, $$3);
         hgz.d $$7 = this.a($$3) ? hgz.d.b : hgz.d.a;
         this.e.a($$7, $$6.c().orElseThrow(), $$5, $$2, $$0, $$1, $$4);
      }
   }

   protected void a(A $$0, buu $$1) {
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

   private A a(S $$0, buu $$1) {
      if (this.a($$1)) {
         return $$0.aj ? this.c : this.a;
      } else {
         return $$0.aj ? this.d : this.b;
      }
   }

   private boolean a(buu $$0) {
      return $$0 == buu.d;
   }
}
