import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class gjy extends gkc<chy> {
   public static final akq a = akq.b("textures/entity/end_crystal/end_crystal_beam.png");
   private static final akq f = akq.b("textures/entity/enderdragon/dragon_exploding.png");
   private static final akq g = akq.b("textures/entity/enderdragon/dragon.png");
   private static final akq h = akq.b("textures/entity/enderdragon/dragon_eyes.png");
   private static final gfb i = gfb.e(g);
   private static final gfb j = gfb.l(g);
   private static final gfb k = gfb.p(h);
   private static final gfb l = gfb.k(a);
   private static final float m = (float)(Math.sqrt(3.0) / 2.0);
   private final gjy.a n;

   public gjy(gkd.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.n = new gjy.a($$0.a(fyd.aa));
   }

   public void a(chy $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      $$3.a();
      float $$6 = (float)$$0.a(7, $$2)[0];
      float $$7 = (float)($$0.a(5, $$2)[1] - $$0.a(10, $$2)[1]);
      $$3.a(a.d.rotationDegrees(-$$6));
      $$3.a(a.b.rotationDegrees($$7 * 10.0F));
      $$3.a(0.0F, 0.0F, 1.0F);
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(0.0F, -1.501F, 0.0F);
      boolean $$8 = $$0.aO > 0;
      this.n.a($$0, 0.0F, 0.0F, $$2);
      if ($$0.cc > 0) {
         float $$9 = (float)$$0.cc / 200.0F;
         int $$10 = axx.b.b(ayn.d($$9 * 255.0F), -1);
         fbg $$11 = $$4.getBuffer(gfb.o(f));
         this.n.a($$3, $$11, $$5, gpw.d, $$10);
         fbg $$12 = $$4.getBuffer(j);
         this.n.a($$3, $$12, $$5, gpw.a(0.0F, $$8));
      } else {
         fbg $$13 = $$4.getBuffer(i);
         this.n.a($$3, $$13, $$5, gpw.a(0.0F, $$8));
      }

      fbg $$14 = $$4.getBuffer(k);
      this.n.a($$3, $$14, $$5, gpw.d);
      if ($$0.cc > 0) {
         float $$15 = ((float)$$0.cc + $$2) / 200.0F;
         float $$16 = Math.min($$15 > 0.8F ? ($$15 - 0.8F) / 0.2F : 0.0F, 1.0F);
         ayv $$17 = ayv.a(432L);
         fbg $$18 = $$4.getBuffer(gfb.q());
         $$3.a();
         $$3.a(0.0F, -1.0F, -2.0F);

         for (int $$19 = 0; (float)$$19 < ($$15 + $$15 * $$15) / 2.0F * 60.0F; $$19++) {
            $$3.a(a.b.rotationDegrees($$17.i() * 360.0F));
            $$3.a(a.d.rotationDegrees($$17.i() * 360.0F));
            $$3.a(a.f.rotationDegrees($$17.i() * 360.0F));
            $$3.a(a.b.rotationDegrees($$17.i() * 360.0F));
            $$3.a(a.d.rotationDegrees($$17.i() * 360.0F));
            $$3.a(a.f.rotationDegrees($$17.i() * 360.0F + $$15 * 90.0F));
            float $$20 = $$17.i() * 20.0F + 5.0F + $$16 * 10.0F;
            float $$21 = $$17.i() * 2.0F + 1.0F + $$16 * 2.0F;
            Matrix4f $$22 = $$3.c().a();
            int $$23 = (int)(255.0F * (1.0F - $$16));
            a($$18, $$22, $$23);
            a($$18, $$22, $$20, $$21);
            b($$18, $$22, $$20, $$21);
            a($$18, $$22, $$23);
            b($$18, $$22, $$20, $$21);
            c($$18, $$22, $$20, $$21);
            a($$18, $$22, $$23);
            c($$18, $$22, $$20, $$21);
            a($$18, $$22, $$20, $$21);
         }

         $$3.b();
      }

      $$3.b();
      if ($$0.ce != null) {
         $$3.a();
         float $$24 = (float)($$0.ce.dv() - ayn.d((double)$$2, $$0.L, $$0.dv()));
         float $$25 = (float)($$0.ce.dx() - ayn.d((double)$$2, $$0.M, $$0.dx()));
         float $$26 = (float)($$0.ce.dB() - ayn.d((double)$$2, $$0.N, $$0.dB()));
         a($$24, $$25 + gjx.a($$0.ce, $$2), $$26, $$2, $$0.ai, $$3, $$4, $$5);
         $$3.b();
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void a(fbg $$0, Matrix4f $$1, int $$2) {
      $$0.a($$1, 0.0F, 0.0F, 0.0F).d($$2);
   }

   private static void a(fbg $$0, Matrix4f $$1, float $$2, float $$3) {
      $$0.a($$1, -m * $$3, $$2, -0.5F * $$3).a(16711935);
   }

   private static void b(fbg $$0, Matrix4f $$1, float $$2, float $$3) {
      $$0.a($$1, m * $$3, $$2, -0.5F * $$3).a(16711935);
   }

   private static void c(fbg $$0, Matrix4f $$1, float $$2, float $$3) {
      $$0.a($$1, 0.0F, $$2, 1.0F * $$3).a(16711935);
   }

   public static void a(float $$0, float $$1, float $$2, float $$3, int $$4, fbc $$5, get $$6, int $$7) {
      float $$8 = ayn.c($$0 * $$0 + $$2 * $$2);
      float $$9 = ayn.c($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
      $$5.a();
      $$5.a(0.0F, 2.0F, 0.0F);
      $$5.a(a.d.rotation((float)(-Math.atan2((double)$$2, (double)$$0)) - (float) (Math.PI / 2)));
      $$5.a(a.b.rotation((float)(-Math.atan2((double)$$8, (double)$$1)) - (float) (Math.PI / 2)));
      fbg $$10 = $$6.getBuffer(l);
      float $$11 = 0.0F - ((float)$$4 + $$3) * 0.01F;
      float $$12 = ayn.c($$0 * $$0 + $$1 * $$1 + $$2 * $$2) / 32.0F - ((float)$$4 + $$3) * 0.01F;
      int $$13 = 8;
      float $$14 = 0.0F;
      float $$15 = 0.75F;
      float $$16 = 0.0F;
      fbc.a $$17 = $$5.c();

      for (int $$18 = 1; $$18 <= 8; $$18++) {
         float $$19 = ayn.a((float)$$18 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$20 = ayn.b((float)$$18 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$21 = (float)$$18 / 8.0F;
         $$10.a($$17, $$14 * 0.2F, $$15 * 0.2F, 0.0F).a(-16777216).a($$16, $$11).b(gpw.d).c($$7).b($$17, 0.0F, -1.0F, 0.0F);
         $$10.a($$17, $$14, $$15, $$9).a(-1).a($$16, $$12).b(gpw.d).c($$7).b($$17, 0.0F, -1.0F, 0.0F);
         $$10.a($$17, $$19, $$20, $$9).a(-1).a($$21, $$12).b(gpw.d).c($$7).b($$17, 0.0F, -1.0F, 0.0F);
         $$10.a($$17, $$19 * 0.2F, $$20 * 0.2F, 0.0F).a(-16777216).a($$21, $$11).b(gpw.d).c($$7).b($$17, 0.0F, -1.0F, 0.0F);
         $$14 = $$19;
         $$15 = $$20;
         $$16 = $$21;
      }

      $$5.b();
   }

   public akq a(chy $$0) {
      return g;
   }

   public static fyk a() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      float $$2 = -16.0F;
      fyn $$3 = $$1.a(
         "head",
         fyj.c()
            .a("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 176, 44)
            .a("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, 112, 30)
            .a()
            .a("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0)
            .a()
            .a("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0),
         fyg.a
      );
      $$3.a("jaw", fyj.c().a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, 176, 65), fyg.a(0.0F, 4.0F, -8.0F));
      $$1.a("neck", fyj.c().a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 192, 104).a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 48, 0), fyg.a);
      $$1.a(
         "body",
         fyj.c()
            .a("body", -12.0F, 0.0F, -16.0F, 24, 24, 64, 0, 0)
            .a("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12, 220, 53),
         fyg.a(0.0F, 4.0F, 8.0F)
      );
      fyn $$4 = $$1.a(
         "left_wing", fyj.c().a().a("bone", 0.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), fyg.a(12.0F, 5.0F, 2.0F)
      );
      $$4.a(
         "left_wing_tip",
         fyj.c().a().a("bone", 0.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         fyg.a(56.0F, 0.0F, 0.0F)
      );
      fyn $$5 = $$1.a("left_front_leg", fyj.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), fyg.a(12.0F, 20.0F, 2.0F));
      fyn $$6 = $$5.a("left_front_leg_tip", fyj.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), fyg.a(0.0F, 20.0F, -1.0F));
      $$6.a("left_front_foot", fyj.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), fyg.a(0.0F, 23.0F, 0.0F));
      fyn $$7 = $$1.a("left_hind_leg", fyj.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), fyg.a(16.0F, 16.0F, 42.0F));
      fyn $$8 = $$7.a("left_hind_leg_tip", fyj.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), fyg.a(0.0F, 32.0F, -4.0F));
      $$8.a("left_hind_foot", fyj.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), fyg.a(0.0F, 31.0F, 4.0F));
      fyn $$9 = $$1.a(
         "right_wing", fyj.c().a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), fyg.a(-12.0F, 5.0F, 2.0F)
      );
      $$9.a(
         "right_wing_tip",
         fyj.c().a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         fyg.a(-56.0F, 0.0F, 0.0F)
      );
      fyn $$10 = $$1.a("right_front_leg", fyj.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), fyg.a(-12.0F, 20.0F, 2.0F));
      fyn $$11 = $$10.a("right_front_leg_tip", fyj.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), fyg.a(0.0F, 20.0F, -1.0F));
      $$11.a("right_front_foot", fyj.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), fyg.a(0.0F, 23.0F, 0.0F));
      fyn $$12 = $$1.a("right_hind_leg", fyj.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), fyg.a(-16.0F, 16.0F, 42.0F));
      fyn $$13 = $$12.a("right_hind_leg_tip", fyj.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), fyg.a(0.0F, 32.0F, -4.0F));
      $$13.a("right_hind_foot", fyj.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), fyg.a(0.0F, 31.0F, 4.0F));
      return fyk.a($$0, 256, 256);
   }

   public static class a extends fve<chy> {
      private final fye a;
      private final fye b;
      private final fye f;
      private final fye g;
      private final fye h;
      private final fye i;
      private final fye j;
      private final fye k;
      private final fye l;
      private final fye m;
      private final fye n;
      private final fye o;
      private final fye p;
      private final fye q;
      private final fye r;
      private final fye s;
      private final fye t;
      private final fye u;
      private final fye w;
      private final fye x;
      @Nullable
      private chy y;
      private float z;

      public a(fye $$0) {
         this.a = $$0.b("head");
         this.f = this.a.b("jaw");
         this.b = $$0.b("neck");
         this.g = $$0.b("body");
         this.h = $$0.b("left_wing");
         this.i = this.h.b("left_wing_tip");
         this.j = $$0.b("left_front_leg");
         this.k = this.j.b("left_front_leg_tip");
         this.l = this.k.b("left_front_foot");
         this.m = $$0.b("left_hind_leg");
         this.n = this.m.b("left_hind_leg_tip");
         this.o = this.n.b("left_hind_foot");
         this.p = $$0.b("right_wing");
         this.q = this.p.b("right_wing_tip");
         this.r = $$0.b("right_front_leg");
         this.s = this.r.b("right_front_leg_tip");
         this.t = this.s.b("right_front_foot");
         this.u = $$0.b("right_hind_leg");
         this.w = this.u.b("right_hind_leg_tip");
         this.x = this.w.b("right_hind_foot");
      }

      public void a(chy $$0, float $$1, float $$2, float $$3) {
         this.y = $$0;
         this.z = $$3;
      }

      public void a(chy $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      }

      @Override
      public void a(fbc $$0, fbg $$1, int $$2, int $$3, int $$4) {
         $$0.a();
         float $$5 = ayn.i(this.z, this.y.bZ, this.y.ca);
         this.f.e = (float)(Math.sin((double)($$5 * (float) (Math.PI * 2))) + 1.0) * 0.2F;
         float $$6 = (float)(Math.sin((double)($$5 * (float) (Math.PI * 2) - 1.0F)) + 1.0);
         $$6 = ($$6 * $$6 + $$6 * 2.0F) * 0.05F;
         $$0.a(0.0F, $$6 - 2.0F, -3.0F);
         $$0.a(a.b.rotationDegrees($$6 * 2.0F));
         float $$7 = 0.0F;
         float $$8 = 20.0F;
         float $$9 = -12.0F;
         float $$10 = 1.5F;
         double[] $$11 = this.y.a(6, this.z);
         float $$12 = ayn.g((float)(this.y.a(5, this.z)[0] - this.y.a(10, this.z)[0]));
         float $$13 = ayn.g((float)(this.y.a(5, this.z)[0] + (double)($$12 / 2.0F)));
         float $$14 = $$5 * (float) (Math.PI * 2);

         for (int $$15 = 0; $$15 < 5; $$15++) {
            double[] $$16 = this.y.a(5 - $$15, this.z);
            float $$17 = (float)Math.cos((double)((float)$$15 * 0.45F + $$14)) * 0.15F;
            this.b.f = ayn.g((float)($$16[0] - $$11[0])) * (float) (Math.PI / 180.0) * 1.5F;
            this.b.e = $$17 + this.y.a($$15, $$11, $$16) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
            this.b.g = -ayn.g((float)($$16[0] - (double)$$13)) * (float) (Math.PI / 180.0) * 1.5F;
            this.b.c = $$8;
            this.b.d = $$9;
            this.b.b = $$7;
            $$8 += ayn.a(this.b.e) * 10.0F;
            $$9 -= ayn.b(this.b.f) * ayn.b(this.b.e) * 10.0F;
            $$7 -= ayn.a(this.b.f) * ayn.b(this.b.e) * 10.0F;
            this.b.a($$0, $$1, $$2, $$3, $$4);
         }

         this.a.c = $$8;
         this.a.d = $$9;
         this.a.b = $$7;
         double[] $$18 = this.y.a(0, this.z);
         this.a.f = ayn.g((float)($$18[0] - $$11[0])) * (float) (Math.PI / 180.0);
         this.a.e = ayn.g(this.y.a(6, $$11, $$18)) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
         this.a.g = -ayn.g((float)($$18[0] - (double)$$13)) * (float) (Math.PI / 180.0);
         this.a.a($$0, $$1, $$2, $$3, $$4);
         $$0.a();
         $$0.a(0.0F, 1.0F, 0.0F);
         $$0.a(a.f.rotationDegrees(-$$12 * 1.5F));
         $$0.a(0.0F, -1.0F, 0.0F);
         this.g.g = 0.0F;
         this.g.a($$0, $$1, $$2, $$3, $$4);
         float $$19 = $$5 * (float) (Math.PI * 2);
         this.h.e = 0.125F - (float)Math.cos((double)$$19) * 0.2F;
         this.h.f = -0.25F;
         this.h.g = -((float)(Math.sin((double)$$19) + 0.125)) * 0.8F;
         this.i.g = (float)(Math.sin((double)($$19 + 2.0F)) + 0.5) * 0.75F;
         this.p.e = this.h.e;
         this.p.f = -this.h.f;
         this.p.g = -this.h.g;
         this.q.g = -this.i.g;
         this.a($$0, $$1, $$2, $$3, $$6, this.h, this.j, this.k, this.l, this.m, this.n, this.o, $$4);
         this.a($$0, $$1, $$2, $$3, $$6, this.p, this.r, this.s, this.t, this.u, this.w, this.x, $$4);
         $$0.b();
         float $$20 = -ayn.a($$5 * (float) (Math.PI * 2)) * 0.0F;
         $$14 = $$5 * (float) (Math.PI * 2);
         $$8 = 10.0F;
         $$9 = 60.0F;
         $$7 = 0.0F;
         $$11 = this.y.a(11, this.z);

         for (int $$21 = 0; $$21 < 12; $$21++) {
            $$18 = this.y.a(12 + $$21, this.z);
            $$20 += ayn.a((float)$$21 * 0.45F + $$14) * 0.05F;
            this.b.f = (ayn.g((float)($$18[0] - $$11[0])) * 1.5F + 180.0F) * (float) (Math.PI / 180.0);
            this.b.e = $$20 + (float)($$18[1] - $$11[1]) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
            this.b.g = ayn.g((float)($$18[0] - (double)$$13)) * (float) (Math.PI / 180.0) * 1.5F;
            this.b.c = $$8;
            this.b.d = $$9;
            this.b.b = $$7;
            $$8 += ayn.a(this.b.e) * 10.0F;
            $$9 -= ayn.b(this.b.f) * ayn.b(this.b.e) * 10.0F;
            $$7 -= ayn.a(this.b.f) * ayn.b(this.b.e) * 10.0F;
            this.b.a($$0, $$1, $$2, $$3, $$4);
         }

         $$0.b();
      }

      private void a(fbc $$0, fbg $$1, int $$2, int $$3, float $$4, fye $$5, fye $$6, fye $$7, fye $$8, fye $$9, fye $$10, fye $$11, int $$12) {
         $$9.e = 1.0F + $$4 * 0.1F;
         $$10.e = 0.5F + $$4 * 0.1F;
         $$11.e = 0.75F + $$4 * 0.1F;
         $$6.e = 1.3F + $$4 * 0.1F;
         $$7.e = -0.5F - $$4 * 0.1F;
         $$8.e = 0.75F + $$4 * 0.1F;
         $$5.a($$0, $$1, $$2, $$3, $$12);
         $$6.a($$0, $$1, $$2, $$3, $$12);
         $$9.a($$0, $$1, $$2, $$3, $$12);
      }
   }
}
