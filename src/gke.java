public class gke extends gkg {
   gke(gfy $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      float $$7 = this.r.i() * 0.1F + 0.2F;
      this.v = $$7;
      this.w = $$7;
      this.x = $$7;
      this.b(0.02F, 0.02F);
      this.D = this.D * (this.r.i() * 0.6F + 0.5F);
      this.j *= 0.02F;
      this.k *= 0.02F;
      this.l *= 0.02F;
      this.t = (int)(20.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public gjk b() {
      return gjk.b;
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.a(this.n().d($$0, $$1, $$2));
      this.l();
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.t-- <= 0) {
         this.k();
      } else {
         this.a(this.j, this.k, this.l);
         this.j *= 0.99;
         this.k *= 0.99;
         this.l *= 0.99;
      }
   }

   public static class a implements gjj<lx> {
      private final gkb a;

      public a(gkb $$0) {
         this.a = $$0;
      }

      public gjg a(lx $$0, gfy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gke $$8 = new gke($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         $$8.a(1.0F, 1.0F, 1.0F);
         $$8.a(3 + $$1.H_().a(5));
         return $$8;
      }
   }

   public static class b implements gjj<lx> {
      private final gkb a;

      public b(gkb $$0) {
         this.a = $$0;
      }

      public gjg a(lx $$0, gfy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gke $$8 = new gke($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(0.3F, 0.5F, 1.0F);
         $$8.a(this.a);
         $$8.e(1.0F - $$1.A.i() * 0.7F);
         $$8.a($$8.j() / 2);
         return $$8;
      }
   }

   public static class c implements gjj<lx> {
      private final gkb a;

      public c(gkb $$0) {
         this.a = $$0;
      }

      public gjg a(lx $$0, gfy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gke $$8 = new gke($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         $$8.a(1.0F, 1.0F, 1.0F);
         return $$8;
      }
   }

   public static class d implements gjj<lx> {
      private final gkb a;

      public d(gkb $$0) {
         this.a = $$0;
      }

      public gjg a(lx $$0, gfy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gke $$8 = new gke($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         $$8.a(1.0F, 1.0F, 1.0F);
         return $$8;
      }
   }

   public static class e implements gjj<lx> {
      private final gkb a;

      public e(gkb $$0) {
         this.a = $$0;
      }

      public gjg a(lx $$0, gfy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gke $$8 = new gke($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }
}
