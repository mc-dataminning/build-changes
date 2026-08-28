public class gpp extends gpx {
   private static final bai a = bai.a();
   private final gps b;
   private float F = 1.0F;

   gpp(glo $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gps $$7) {
      super($$0, $$1, $$2, $$3, 0.5 - a.j(), $$5, 0.5 - a.j());
      this.B = 0.96F;
      this.u = -0.1F;
      this.C = true;
      this.b = $$7;
      this.k *= 0.2F;
      if ($$4 == 0.0 && $$6 == 0.0) {
         this.j *= 0.1F;
         this.l *= 0.1F;
      }

      this.D *= 0.75F;
      this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.n = false;
      this.b($$7);
      if (this.g()) {
         this.e(0.0F);
      }
   }

   @Override
   public gpb b() {
      return gpb.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
      if (this.g()) {
         this.y = 0.0F;
      } else {
         this.y = azz.h(0.05F, this.y, this.F);
      }
   }

   @Override
   protected void e(float $$0) {
      super.e($$0);
      this.F = $$0;
   }

   private boolean g() {
      fqq $$0 = fqq.Q();
      gqm $$1 = $$0.t;
      return $$1 != null && $$1.bD().c(this.g, this.h, this.i) <= 9.0 && $$0.n.aE().a() && $$1.gI();
   }

   public static class a implements gpa<md> {
      private final gps a;

      public a(gps $$0) {
         this.a = $$0;
      }

      public gox a(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gpp($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class b implements gpa<ls> {
      private final gps a;

      public b(gps $$0) {
         this.a = $$0;
      }

      public gox a(ls $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gox $$8 = new gpp($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a($$0.b(), $$0.c(), $$0.d());
         $$8.e($$0.e());
         return $$8;
      }
   }

   public static class c implements gpa<md> {
      private final gps a;

      public c(gps $$0) {
         this.a = $$0;
      }

      public gox a(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gpp($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class d implements gpa<md> {
      private final gps a;

      public d(gps $$0) {
         this.a = $$0;
      }

      public gox a(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gpp $$8 = new gpp($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         float $$9 = $$1.A.i() * 0.5F + 0.35F;
         $$8.a(1.0F * $$9, 0.0F * $$9, 1.0F * $$9);
         return $$8;
      }
   }
}
