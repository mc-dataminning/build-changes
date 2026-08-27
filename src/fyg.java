import javax.annotation.Nullable;
import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class fyg extends fyk<can> {
   public static final ahg a = new ahg("textures/entity/end_crystal/end_crystal_beam.png");
   private static final ahg f = new ahg("textures/entity/enderdragon/dragon_exploding.png");
   private static final ahg g = new ahg("textures/entity/enderdragon/dragon.png");
   private static final ahg h = new ahg("textures/entity/enderdragon/dragon_eyes.png");
   private static final ftn i = ftn.e(g);
   private static final ftn j = ftn.l(g);
   private static final ftn k = ftn.p(h);
   private static final ftn l = ftn.k(a);
   private static final float m = (float)(Math.sqrt(3.0) / 2.0);
   private final fyg.a n;

   public fyg(fyl.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.n = new fyg.a($$0.a(fmu.W));
   }

   public void a(can $$0, float $$1, float $$2, epz $$3, ftf $$4, int $$5) {
      $$3.a();
      float $$6 = (float)$$0.a(7, $$2)[0];
      float $$7 = (float)($$0.a(5, $$2)[1] - $$0.a(10, $$2)[1]);
      $$3.a(a.d.rotationDegrees(-$$6));
      $$3.a(a.b.rotationDegrees($$7 * 10.0F));
      $$3.a(0.0F, 0.0F, 1.0F);
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(0.0F, -1.501F, 0.0F);
      boolean $$8 = $$0.aK > 0;
      this.n.a($$0, 0.0F, 0.0F, $$2);
      if ($$0.bV > 0) {
         float $$9 = (float)$$0.bV / 200.0F;
         eqd $$10 = $$4.getBuffer(ftn.o(f));
         this.n.a($$3, $$10, $$5, gec.d, 1.0F, 1.0F, 1.0F, $$9);
         eqd $$11 = $$4.getBuffer(j);
         this.n.a($$3, $$11, $$5, gec.a(0.0F, $$8), 1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         eqd $$12 = $$4.getBuffer(i);
         this.n.a($$3, $$12, $$5, gec.a(0.0F, $$8), 1.0F, 1.0F, 1.0F, 1.0F);
      }

      eqd $$13 = $$4.getBuffer(k);
      this.n.a($$3, $$13, $$5, gec.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if ($$0.bV > 0) {
         float $$14 = ((float)$$0.bV + $$2) / 200.0F;
         float $$15 = Math.min($$14 > 0.8F ? ($$14 - 0.8F) / 0.2F : 0.0F, 1.0F);
         auu $$16 = auu.a(432L);
         eqd $$17 = $$4.getBuffer(ftn.s());
         $$3.a();
         $$3.a(0.0F, -1.0F, -2.0F);

         for (int $$18 = 0; (float)$$18 < ($$14 + $$14 * $$14) / 2.0F * 60.0F; $$18++) {
            $$3.a(a.b.rotationDegrees($$16.i() * 360.0F));
            $$3.a(a.d.rotationDegrees($$16.i() * 360.0F));
            $$3.a(a.f.rotationDegrees($$16.i() * 360.0F));
            $$3.a(a.b.rotationDegrees($$16.i() * 360.0F));
            $$3.a(a.d.rotationDegrees($$16.i() * 360.0F));
            $$3.a(a.f.rotationDegrees($$16.i() * 360.0F + $$14 * 90.0F));
            float $$19 = $$16.i() * 20.0F + 5.0F + $$15 * 10.0F;
            float $$20 = $$16.i() * 2.0F + 1.0F + $$15 * 2.0F;
            Matrix4f $$21 = $$3.c().a();
            int $$22 = (int)(255.0F * (1.0F - $$15));
            a($$17, $$21, $$22);
            a($$17, $$21, $$19, $$20);
            b($$17, $$21, $$19, $$20);
            a($$17, $$21, $$22);
            b($$17, $$21, $$19, $$20);
            c($$17, $$21, $$19, $$20);
            a($$17, $$21, $$22);
            c($$17, $$21, $$19, $$20);
            a($$17, $$21, $$19, $$20);
         }

         $$3.b();
      }

      $$3.b();
      if ($$0.bX != null) {
         $$3.a();
         float $$23 = (float)($$0.bX.dr() - aun.d((double)$$2, $$0.K, $$0.dr()));
         float $$24 = (float)($$0.bX.dt() - aun.d((double)$$2, $$0.L, $$0.dt()));
         float $$25 = (float)($$0.bX.dx() - aun.d((double)$$2, $$0.M, $$0.dx()));
         a($$23, $$24 + fyf.a($$0.bX, $$2), $$25, $$2, $$0.ah, $$3, $$4, $$5);
         $$3.b();
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void a(eqd $$0, Matrix4f $$1, int $$2) {
      $$0.a($$1, 0.0F, 0.0F, 0.0F).a(255, 255, 255, $$2).e();
   }

   private static void a(eqd $$0, Matrix4f $$1, float $$2, float $$3) {
      $$0.a($$1, -m * $$3, $$2, -0.5F * $$3).a(255, 0, 255, 0).e();
   }

   private static void b(eqd $$0, Matrix4f $$1, float $$2, float $$3) {
      $$0.a($$1, m * $$3, $$2, -0.5F * $$3).a(255, 0, 255, 0).e();
   }

   private static void c(eqd $$0, Matrix4f $$1, float $$2, float $$3) {
      $$0.a($$1, 0.0F, $$2, 1.0F * $$3).a(255, 0, 255, 0).e();
   }

   public static void a(float $$0, float $$1, float $$2, float $$3, int $$4, epz $$5, ftf $$6, int $$7) {
      float $$8 = aun.c($$0 * $$0 + $$2 * $$2);
      float $$9 = aun.c($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
      $$5.a();
      $$5.a(0.0F, 2.0F, 0.0F);
      $$5.a(a.d.rotation((float)(-Math.atan2((double)$$2, (double)$$0)) - (float) (Math.PI / 2)));
      $$5.a(a.b.rotation((float)(-Math.atan2((double)$$8, (double)$$1)) - (float) (Math.PI / 2)));
      eqd $$10 = $$6.getBuffer(l);
      float $$11 = 0.0F - ((float)$$4 + $$3) * 0.01F;
      float $$12 = aun.c($$0 * $$0 + $$1 * $$1 + $$2 * $$2) / 32.0F - ((float)$$4 + $$3) * 0.01F;
      int $$13 = 8;
      float $$14 = 0.0F;
      float $$15 = 0.75F;
      float $$16 = 0.0F;
      epz.a $$17 = $$5.c();
      Matrix4f $$18 = $$17.a();
      Matrix3f $$19 = $$17.b();

      for (int $$20 = 1; $$20 <= 8; $$20++) {
         float $$21 = aun.a((float)$$20 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$22 = aun.b((float)$$20 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$23 = (float)$$20 / 8.0F;
         $$10.a($$18, $$14 * 0.2F, $$15 * 0.2F, 0.0F).a(0, 0, 0, 255).a($$16, $$11).c(gec.d).b($$7).a($$19, 0.0F, -1.0F, 0.0F).e();
         $$10.a($$18, $$14, $$15, $$9).a(255, 255, 255, 255).a($$16, $$12).c(gec.d).b($$7).a($$19, 0.0F, -1.0F, 0.0F).e();
         $$10.a($$18, $$21, $$22, $$9).a(255, 255, 255, 255).a($$23, $$12).c(gec.d).b($$7).a($$19, 0.0F, -1.0F, 0.0F).e();
         $$10.a($$18, $$21 * 0.2F, $$22 * 0.2F, 0.0F).a(0, 0, 0, 255).a($$23, $$11).c(gec.d).b($$7).a($$19, 0.0F, -1.0F, 0.0F).e();
         $$14 = $$21;
         $$15 = $$22;
         $$16 = $$23;
      }

      $$5.b();
   }

   public ahg a(can $$0) {
      return g;
   }

   public static fnb a() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      float $$2 = -16.0F;
      fne $$3 = $$1.a(
         "head",
         fna.c()
            .a("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 176, 44)
            .a("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, 112, 30)
            .a()
            .a("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0)
            .a()
            .a("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0),
         fmx.a
      );
      $$3.a("jaw", fna.c().a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, 176, 65), fmx.a(0.0F, 4.0F, -8.0F));
      $$1.a("neck", fna.c().a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 192, 104).a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 48, 0), fmx.a);
      $$1.a(
         "body",
         fna.c()
            .a("body", -12.0F, 0.0F, -16.0F, 24, 24, 64, 0, 0)
            .a("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12, 220, 53),
         fmx.a(0.0F, 4.0F, 8.0F)
      );
      fne $$4 = $$1.a(
         "left_wing", fna.c().a().a("bone", 0.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), fmx.a(12.0F, 5.0F, 2.0F)
      );
      $$4.a(
         "left_wing_tip",
         fna.c().a().a("bone", 0.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         fmx.a(56.0F, 0.0F, 0.0F)
      );
      fne $$5 = $$1.a("left_front_leg", fna.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), fmx.a(12.0F, 20.0F, 2.0F));
      fne $$6 = $$5.a("left_front_leg_tip", fna.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), fmx.a(0.0F, 20.0F, -1.0F));
      $$6.a("left_front_foot", fna.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), fmx.a(0.0F, 23.0F, 0.0F));
      fne $$7 = $$1.a("left_hind_leg", fna.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), fmx.a(16.0F, 16.0F, 42.0F));
      fne $$8 = $$7.a("left_hind_leg_tip", fna.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), fmx.a(0.0F, 32.0F, -4.0F));
      $$8.a("left_hind_foot", fna.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), fmx.a(0.0F, 31.0F, 4.0F));
      fne $$9 = $$1.a(
         "right_wing", fna.c().a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), fmx.a(-12.0F, 5.0F, 2.0F)
      );
      $$9.a(
         "right_wing_tip",
         fna.c().a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         fmx.a(-56.0F, 0.0F, 0.0F)
      );
      fne $$10 = $$1.a("right_front_leg", fna.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), fmx.a(-12.0F, 20.0F, 2.0F));
      fne $$11 = $$10.a("right_front_leg_tip", fna.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), fmx.a(0.0F, 20.0F, -1.0F));
      $$11.a("right_front_foot", fna.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), fmx.a(0.0F, 23.0F, 0.0F));
      fne $$12 = $$1.a("right_hind_leg", fna.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), fmx.a(-16.0F, 16.0F, 42.0F));
      fne $$13 = $$12.a("right_hind_leg_tip", fna.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), fmx.a(0.0F, 32.0F, -4.0F));
      $$13.a("right_hind_foot", fna.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), fmx.a(0.0F, 31.0F, 4.0F));
      return fnb.a($$0, 256, 256);
   }

   public static class a extends fjv<can> {
      private final fmv a;
      private final fmv b;
      private final fmv f;
      private final fmv g;
      private final fmv h;
      private final fmv i;
      private final fmv j;
      private final fmv k;
      private final fmv l;
      private final fmv m;
      private final fmv n;
      private final fmv o;
      private final fmv p;
      private final fmv q;
      private final fmv r;
      private final fmv s;
      private final fmv t;
      private final fmv u;
      private final fmv w;
      private final fmv x;
      @Nullable
      private can y;
      private float z;

      public a(fmv $$0) {
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

      public void a(can $$0, float $$1, float $$2, float $$3) {
         this.y = $$0;
         this.z = $$3;
      }

      public void a(can $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      }

      @Override
      public void a(epz $$0, eqd $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         $$0.a();
         float $$8 = aun.i(this.z, this.y.bS, this.y.bT);
         this.f.e = (float)(Math.sin((double)($$8 * (float) (Math.PI * 2))) + 1.0) * 0.2F;
         float $$9 = (float)(Math.sin((double)($$8 * (float) (Math.PI * 2) - 1.0F)) + 1.0);
         $$9 = ($$9 * $$9 + $$9 * 2.0F) * 0.05F;
         $$0.a(0.0F, $$9 - 2.0F, -3.0F);
         $$0.a(a.b.rotationDegrees($$9 * 2.0F));
         float $$10 = 0.0F;
         float $$11 = 20.0F;
         float $$12 = -12.0F;
         float $$13 = 1.5F;
         double[] $$14 = this.y.a(6, this.z);
         float $$15 = aun.g((float)(this.y.a(5, this.z)[0] - this.y.a(10, this.z)[0]));
         float $$16 = aun.g((float)(this.y.a(5, this.z)[0] + (double)($$15 / 2.0F)));
         float $$17 = $$8 * (float) (Math.PI * 2);

         for (int $$18 = 0; $$18 < 5; $$18++) {
            double[] $$19 = this.y.a(5 - $$18, this.z);
            float $$20 = (float)Math.cos((double)((float)$$18 * 0.45F + $$17)) * 0.15F;
            this.b.f = aun.g((float)($$19[0] - $$14[0])) * (float) (Math.PI / 180.0) * 1.5F;
            this.b.e = $$20 + this.y.a($$18, $$14, $$19) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
            this.b.g = -aun.g((float)($$19[0] - (double)$$16)) * (float) (Math.PI / 180.0) * 1.5F;
            this.b.c = $$11;
            this.b.d = $$12;
            this.b.b = $$10;
            $$11 += aun.a(this.b.e) * 10.0F;
            $$12 -= aun.b(this.b.f) * aun.b(this.b.e) * 10.0F;
            $$10 -= aun.a(this.b.f) * aun.b(this.b.e) * 10.0F;
            this.b.a($$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F, $$7);
         }

         this.a.c = $$11;
         this.a.d = $$12;
         this.a.b = $$10;
         double[] $$21 = this.y.a(0, this.z);
         this.a.f = aun.g((float)($$21[0] - $$14[0])) * (float) (Math.PI / 180.0);
         this.a.e = aun.g(this.y.a(6, $$14, $$21)) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
         this.a.g = -aun.g((float)($$21[0] - (double)$$16)) * (float) (Math.PI / 180.0);
         this.a.a($$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F, $$7);
         $$0.a();
         $$0.a(0.0F, 1.0F, 0.0F);
         $$0.a(a.f.rotationDegrees(-$$15 * 1.5F));
         $$0.a(0.0F, -1.0F, 0.0F);
         this.g.g = 0.0F;
         this.g.a($$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F, $$7);
         float $$22 = $$8 * (float) (Math.PI * 2);
         this.h.e = 0.125F - (float)Math.cos((double)$$22) * 0.2F;
         this.h.f = -0.25F;
         this.h.g = -((float)(Math.sin((double)$$22) + 0.125)) * 0.8F;
         this.i.g = (float)(Math.sin((double)($$22 + 2.0F)) + 0.5) * 0.75F;
         this.p.e = this.h.e;
         this.p.f = -this.h.f;
         this.p.g = -this.h.g;
         this.q.g = -this.i.g;
         this.a($$0, $$1, $$2, $$3, $$9, this.h, this.j, this.k, this.l, this.m, this.n, this.o, $$7);
         this.a($$0, $$1, $$2, $$3, $$9, this.p, this.r, this.s, this.t, this.u, this.w, this.x, $$7);
         $$0.b();
         float $$23 = -aun.a($$8 * (float) (Math.PI * 2)) * 0.0F;
         $$17 = $$8 * (float) (Math.PI * 2);
         $$11 = 10.0F;
         $$12 = 60.0F;
         $$10 = 0.0F;
         $$14 = this.y.a(11, this.z);

         for (int $$24 = 0; $$24 < 12; $$24++) {
            $$21 = this.y.a(12 + $$24, this.z);
            $$23 += aun.a((float)$$24 * 0.45F + $$17) * 0.05F;
            this.b.f = (aun.g((float)($$21[0] - $$14[0])) * 1.5F + 180.0F) * (float) (Math.PI / 180.0);
            this.b.e = $$23 + (float)($$21[1] - $$14[1]) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
            this.b.g = aun.g((float)($$21[0] - (double)$$16)) * (float) (Math.PI / 180.0) * 1.5F;
            this.b.c = $$11;
            this.b.d = $$12;
            this.b.b = $$10;
            $$11 += aun.a(this.b.e) * 10.0F;
            $$12 -= aun.b(this.b.f) * aun.b(this.b.e) * 10.0F;
            $$10 -= aun.a(this.b.f) * aun.b(this.b.e) * 10.0F;
            this.b.a($$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F, $$7);
         }

         $$0.b();
      }

      private void a(epz $$0, eqd $$1, int $$2, int $$3, float $$4, fmv $$5, fmv $$6, fmv $$7, fmv $$8, fmv $$9, fmv $$10, fmv $$11, float $$12) {
         $$9.e = 1.0F + $$4 * 0.1F;
         $$10.e = 0.5F + $$4 * 0.1F;
         $$11.e = 0.75F + $$4 * 0.1F;
         $$6.e = 1.3F + $$4 * 0.1F;
         $$7.e = -0.5F - $$4 * 0.1F;
         $$8.e = 0.75F + $$4 * 0.1F;
         $$5.a($$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F, $$12);
         $$6.a($$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F, $$12);
         $$9.a($$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F, $$12);
      }
   }
}
