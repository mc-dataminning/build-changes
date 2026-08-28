public class gwh<S extends gza, M extends gcn<S>, A extends gcn<S>> extends gws<S, M> {
   private final A a;
   private final A b;
   private final A c;
   private final A d;
   private final gwc e;

   public gwh(gua<S, M> $$0, A $$1, A $$2, gwc $$3) {
      this($$0, $$1, $$2, $$1, $$2, $$3);
   }

   public gwh(gua<S, M> $$0, A $$1, A $$2, A $$3, A $$4, gwc $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public static boolean a(cwo $$0, bus $$1) {
      det $$2 = $$0.a(kv.D);
      return $$2 != null && a($$2, $$1);
   }

   private static boolean a(det $$0, bus $$1) {
      return $$0.c().isPresent() && $$0.a() == $$1;
   }

   public void a(fft $$0, glx $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$3.W, bus.e, $$2, this.a($$3, bus.e));
      this.a($$0, $$1, $$3.X, bus.d, $$2, this.a($$3, bus.d));
      this.a($$0, $$1, $$3.Y, bus.c, $$2, this.a($$3, bus.c));
      this.a($$0, $$1, $$3.V, bus.f, $$2, this.a($$3, bus.f));
   }

   private void a(fft $$0, glx $$1, cwo $$2, bus $$3, int $$4, A $$5) {
      det $$6 = $$2.a(kv.D);
      if ($$6 != null && a($$6, $$3)) {
         this.d().a($$5);
         this.a($$5, $$3);
         hgx.d $$7 = this.a($$3) ? hgx.d.b : hgx.d.a;
         this.e.a($$7, $$6.c().orElseThrow(), $$5, $$2, $$0, $$1, $$4);
      }
   }

   protected void a(A $$0, bus $$1) {
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

   private A a(S $$0, bus $$1) {
      if (this.a($$1)) {
         return $$0.aj ? this.c : this.a;
      } else {
         return $$0.aj ? this.d : this.b;
      }
   }

   private boolean a(bus $$0) {
      return $$0 == bus.d;
   }
}
