public class fuu<T extends cgv> extends fvt<T> {
   private static final float a = 2.0F;
   private static final float b = 2.5F;
   private static final float f = 0.45F;
   private static final float g = 29.35F;
   private static final String h = "saddle";
   private static final String i = "bridle";
   private static final String j = "reins";
   private final fyk k;
   private final fyk l;
   private final fyk[] m;
   private final fyk[] n;

   public fuu(fyk $$0) {
      this.k = $$0;
      fyk $$1 = $$0.b("body");
      this.l = $$1.b("head");
      this.m = new fyk[]{$$1.b("saddle"), this.l.b("bridle")};
      this.n = new fyk[]{this.l.b("reins")};
   }

   public static fyq b() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      fyo $$2 = new fyo(0.05F);
      fyt $$3 = $$1.a("body", fyp.c().a(0, 25).a(-7.5F, -12.0F, -23.5F, 15.0F, 12.0F, 27.0F), fym.a(0.0F, 4.0F, 9.5F));
      $$3.a("hump", fyp.c().a(74, 0).a(-4.5F, -5.0F, -5.5F, 9.0F, 5.0F, 11.0F), fym.a(0.0F, -12.0F, -10.0F));
      $$3.a("tail", fyp.c().a(122, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 0.0F), fym.a(0.0F, -9.0F, 3.5F));
      fyt $$4 = $$3.a(
         "head",
         fyp.c()
            .a(60, 24)
            .a(-3.5F, -7.0F, -15.0F, 7.0F, 8.0F, 19.0F)
            .a(21, 0)
            .a(-3.5F, -21.0F, -15.0F, 7.0F, 14.0F, 7.0F)
            .a(50, 0)
            .a(-2.5F, -21.0F, -21.0F, 5.0F, 5.0F, 6.0F),
         fym.a(0.0F, -3.0F, -19.5F)
      );
      $$4.a("left_ear", fyp.c().a(45, 0).a(-0.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F), fym.a(2.5F, -21.0F, -9.5F));
      $$4.a("right_ear", fyp.c().a(67, 0).a(-2.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F), fym.a(-2.5F, -21.0F, -9.5F));
      $$1.a("left_hind_leg", fyp.c().a(58, 16).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), fym.a(4.9F, 1.0F, 9.5F));
      $$1.a("right_hind_leg", fyp.c().a(94, 16).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), fym.a(-4.9F, 1.0F, 9.5F));
      $$1.a("left_front_leg", fyp.c().a(0, 0).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), fym.a(4.9F, 1.0F, -10.5F));
      $$1.a("right_front_leg", fyp.c().a(0, 26).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), fym.a(-4.9F, 1.0F, -10.5F));
      $$3.a(
         "saddle",
         fyp.c()
            .a(74, 64)
            .a(-4.5F, -17.0F, -15.5F, 9.0F, 5.0F, 11.0F, $$2)
            .a(92, 114)
            .a(-3.5F, -20.0F, -15.5F, 7.0F, 3.0F, 11.0F, $$2)
            .a(0, 89)
            .a(-7.5F, -12.0F, -23.5F, 15.0F, 12.0F, 27.0F, $$2),
         fym.a(0.0F, 0.0F, 0.0F)
      );
      $$4.a(
         "reins",
         fyp.c()
            .a(98, 42)
            .a(3.51F, -18.0F, -17.0F, 0.0F, 7.0F, 15.0F)
            .a(84, 57)
            .a(-3.5F, -18.0F, -2.0F, 7.0F, 7.0F, 0.0F)
            .a(98, 42)
            .a(-3.51F, -18.0F, -17.0F, 0.0F, 7.0F, 15.0F),
         fym.a(0.0F, 0.0F, 0.0F)
      );
      $$4.a(
         "bridle",
         fyp.c()
            .a(60, 87)
            .a(-3.5F, -7.0F, -15.0F, 7.0F, 8.0F, 19.0F, $$2)
            .a(21, 64)
            .a(-3.5F, -21.0F, -15.0F, 7.0F, 14.0F, 7.0F, $$2)
            .a(50, 64)
            .a(-2.5F, -21.0F, -21.0F, 5.0F, 5.0F, 6.0F, $$2)
            .a(74, 70)
            .a(2.5F, -19.0F, -18.0F, 1.0F, 2.0F, 2.0F)
            .a(74, 70)
            .a()
            .a(-3.5F, -19.0F, -18.0F, 1.0F, 2.0F, 2.0F),
         fym.a(0.0F, 0.0F, 0.0F)
      );
      return fyq.a($$0, 128, 128);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fyk::c);
      this.a($$0, $$4, $$5, $$3);
      this.a($$0);
      this.a(fhj.a, $$1, $$2, 2.0F, 2.5F);
      this.a($$0.ci, fhj.b, $$3, 1.0F);
      this.a($$0.cj, fhj.c, $$3, 1.0F);
      this.a($$0.ck, fhj.d, $$3, 1.0F);
      this.a($$0.cl, fhj.f, $$3, 1.0F);
      this.a($$0.cm, fhj.e, $$3, 1.0F);
   }

   private void a(T $$0, float $$1, float $$2, float $$3) {
      $$1 = ayo.a($$1, -30.0F, 30.0F);
      $$2 = ayo.a($$2, -25.0F, 45.0F);
      if ($$0.c() > 0) {
         float $$4 = $$3 - (float)$$0.ai;
         float $$5 = 45.0F * ((float)$$0.c() - $$4) / 55.0F;
         $$2 = ayo.a($$2 + $$5, -25.0F, 70.0F);
      }

      this.l.f = $$1 * (float) (Math.PI / 180.0);
      this.l.e = $$2 * (float) (Math.PI / 180.0);
   }

   private void a(T $$0) {
      boolean $$1 = $$0.i();
      boolean $$2 = $$0.bT();

      for (fyk $$3 : this.m) {
         $$3.k = $$1;
      }

      for (fyk $$4 : this.n) {
         $$4.k = $$2 && $$1;
      }
   }

   @Override
   public void a(fbi $$0, fbm $$1, int $$2, int $$3, int $$4) {
      if (this.e) {
         $$0.a();
         $$0.b(0.45F, 0.45F, 0.45F);
         $$0.a(0.0F, 1.834375F, 0.0F);
         this.a().a($$0, $$1, $$2, $$3, $$4);
         $$0.b();
      } else {
         this.a().a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public fyk a() {
      return this.k;
   }
}
