import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class gfd extends gfh<cex> {
   public static final ajt a = new ajt("textures/entity/end_crystal/end_crystal_beam.png");
   private static final ajt f = new ajt("textures/entity/enderdragon/dragon_exploding.png");
   private static final ajt g = new ajt("textures/entity/enderdragon/dragon.png");
   private static final ajt h = new ajt("textures/entity/enderdragon/dragon_eyes.png");
   private static final gah i = gah.e(g);
   private static final gah j = gah.l(g);
   private static final gah k = gah.p(h);
   private static final gah l = gah.k(a);
   private static final float m = (float)(Math.sqrt(3.0) / 2.0);
   private final gfd.a n;

   public gfd(gfi.a $$0) {
      super($$0);
      this.d = 0.5F;
      this.n = new gfd.a($$0.a(ftl.Z));
   }

   public void a(cex $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      $$3.a();
      float $$6 = (float)$$0.a(7, $$2)[0];
      float $$7 = (float)($$0.a(5, $$2)[1] - $$0.a(10, $$2)[1]);
      $$3.a(a.d.rotationDegrees(-$$6));
      $$3.a(a.b.rotationDegrees($$7 * 10.0F));
      $$3.a(0.0F, 0.0F, 1.0F);
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(0.0F, -1.501F, 0.0F);
      boolean $$8 = $$0.aN > 0;
      this.n.a($$0, 0.0F, 0.0F, $$2);
      if ($$0.bZ > 0) {
         float $$9 = (float)$$0.bZ / 200.0F;
         ewm $$10 = $$4.getBuffer(gah.o(f));
         this.n.a($$3, $$10, $$5, gla.d, 1.0F, 1.0F, 1.0F, $$9);
         ewm $$11 = $$4.getBuffer(j);
         this.n.a($$3, $$11, $$5, gla.a(0.0F, $$8), 1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         ewm $$12 = $$4.getBuffer(i);
         this.n.a($$3, $$12, $$5, gla.a(0.0F, $$8), 1.0F, 1.0F, 1.0F, 1.0F);
      }

      ewm $$13 = $$4.getBuffer(k);
      this.n.a($$3, $$13, $$5, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if ($$0.bZ > 0) {
         float $$14 = ((float)$$0.bZ + $$2) / 200.0F;
         float $$15 = Math.min($$14 > 0.8F ? ($$14 - 0.8F) / 0.2F : 0.0F, 1.0F);
         axr $$16 = axr.a(432L);
         ewm $$17 = $$4.getBuffer(gah.s());
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
      if ($$0.cb != null) {
         $$3.a();
         float $$23 = (float)($$0.cb.dr() - axk.d((double)$$2, $$0.K, $$0.dr()));
         float $$24 = (float)($$0.cb.dt() - axk.d((double)$$2, $$0.L, $$0.dt()));
         float $$25 = (float)($$0.cb.dx() - axk.d((double)$$2, $$0.M, $$0.dx()));
         a($$23, $$24 + gfc.a($$0.cb, $$2), $$25, $$2, $$0.ah, $$3, $$4, $$5);
         $$3.b();
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void a(ewm $$0, Matrix4f $$1, int $$2) {
      $$0.a($$1, 0.0F, 0.0F, 0.0F).a(255, 255, 255, $$2).e();
   }

   private static void a(ewm $$0, Matrix4f $$1, float $$2, float $$3) {
      $$0.a($$1, -m * $$3, $$2, -0.5F * $$3).a(255, 0, 255, 0).e();
   }

   private static void b(ewm $$0, Matrix4f $$1, float $$2, float $$3) {
      $$0.a($$1, m * $$3, $$2, -0.5F * $$3).a(255, 0, 255, 0).e();
   }

   private static void c(ewm $$0, Matrix4f $$1, float $$2, float $$3) {
      $$0.a($$1, 0.0F, $$2, 1.0F * $$3).a(255, 0, 255, 0).e();
   }

   public static void a(float $$0, float $$1, float $$2, float $$3, int $$4, ewi $$5, fzz $$6, int $$7) {
      float $$8 = axk.c($$0 * $$0 + $$2 * $$2);
      float $$9 = axk.c($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
      $$5.a();
      $$5.a(0.0F, 2.0F, 0.0F);
      $$5.a(a.d.rotation((float)(-Math.atan2((double)$$2, (double)$$0)) - (float) (Math.PI / 2)));
      $$5.a(a.b.rotation((float)(-Math.atan2((double)$$8, (double)$$1)) - (float) (Math.PI / 2)));
      ewm $$10 = $$6.getBuffer(l);
      float $$11 = 0.0F - ((float)$$4 + $$3) * 0.01F;
      float $$12 = axk.c($$0 * $$0 + $$1 * $$1 + $$2 * $$2) / 32.0F - ((float)$$4 + $$3) * 0.01F;
      int $$13 = 8;
      float $$14 = 0.0F;
      float $$15 = 0.75F;
      float $$16 = 0.0F;
      ewi.a $$17 = $$5.c();

      for (int $$18 = 1; $$18 <= 8; $$18++) {
         float $$19 = axk.a((float)$$18 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$20 = axk.b((float)$$18 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$21 = (float)$$18 / 8.0F;
         $$10.a($$17, $$14 * 0.2F, $$15 * 0.2F, 0.0F).a(0, 0, 0, 255).a($$16, $$11).c(gla.d).b($$7).b($$17, 0.0F, -1.0F, 0.0F).e();
         $$10.a($$17, $$14, $$15, $$9).a(255, 255, 255, 255).a($$16, $$12).c(gla.d).b($$7).b($$17, 0.0F, -1.0F, 0.0F).e();
         $$10.a($$17, $$19, $$20, $$9).a(255, 255, 255, 255).a($$21, $$12).c(gla.d).b($$7).b($$17, 0.0F, -1.0F, 0.0F).e();
         $$10.a($$17, $$19 * 0.2F, $$20 * 0.2F, 0.0F).a(0, 0, 0, 255).a($$21, $$11).c(gla.d).b($$7).b($$17, 0.0F, -1.0F, 0.0F).e();
         $$14 = $$19;
         $$15 = $$20;
         $$16 = $$21;
      }

      $$5.b();
   }

   public ajt a(cex $$0) {
      return g;
   }

   public static fts a() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      float $$2 = -16.0F;
      ftv $$3 = $$1.a(
         "head",
         ftr.c()
            .a("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 176, 44)
            .a("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, 112, 30)
            .a()
            .a("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0)
            .a()
            .a("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0),
         fto.a
      );
      $$3.a("jaw", ftr.c().a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, 176, 65), fto.a(0.0F, 4.0F, -8.0F));
      $$1.a("neck", ftr.c().a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 192, 104).a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 48, 0), fto.a);
      $$1.a(
         "body",
         ftr.c()
            .a("body", -12.0F, 0.0F, -16.0F, 24, 24, 64, 0, 0)
            .a("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12, 220, 53),
         fto.a(0.0F, 4.0F, 8.0F)
      );
      ftv $$4 = $$1.a(
         "left_wing", ftr.c().a().a("bone", 0.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), fto.a(12.0F, 5.0F, 2.0F)
      );
      $$4.a(
         "left_wing_tip",
         ftr.c().a().a("bone", 0.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         fto.a(56.0F, 0.0F, 0.0F)
      );
      ftv $$5 = $$1.a("left_front_leg", ftr.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), fto.a(12.0F, 20.0F, 2.0F));
      ftv $$6 = $$5.a("left_front_leg_tip", ftr.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), fto.a(0.0F, 20.0F, -1.0F));
      $$6.a("left_front_foot", ftr.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), fto.a(0.0F, 23.0F, 0.0F));
      ftv $$7 = $$1.a("left_hind_leg", ftr.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), fto.a(16.0F, 16.0F, 42.0F));
      ftv $$8 = $$7.a("left_hind_leg_tip", ftr.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), fto.a(0.0F, 32.0F, -4.0F));
      $$8.a("left_hind_foot", ftr.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), fto.a(0.0F, 31.0F, 4.0F));
      ftv $$9 = $$1.a(
         "right_wing", ftr.c().a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), fto.a(-12.0F, 5.0F, 2.0F)
      );
      $$9.a(
         "right_wing_tip",
         ftr.c().a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         fto.a(-56.0F, 0.0F, 0.0F)
      );
      ftv $$10 = $$1.a("right_front_leg", ftr.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), fto.a(-12.0F, 20.0F, 2.0F));
      ftv $$11 = $$10.a("right_front_leg_tip", ftr.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), fto.a(0.0F, 20.0F, -1.0F));
      $$11.a("right_front_foot", ftr.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), fto.a(0.0F, 23.0F, 0.0F));
      ftv $$12 = $$1.a("right_hind_leg", ftr.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), fto.a(-16.0F, 16.0F, 42.0F));
      ftv $$13 = $$12.a("right_hind_leg_tip", ftr.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), fto.a(0.0F, 32.0F, -4.0F));
      $$13.a("right_hind_foot", ftr.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), fto.a(0.0F, 31.0F, 4.0F));
      return fts.a($$0, 256, 256);
   }

   public static class a extends fqm<cex> {
      private final ftm a;
      private final ftm b;
      private final ftm f;
      private final ftm g;
      private final ftm h;
      private final ftm i;
      private final ftm j;
      private final ftm k;
      private final ftm l;
      private final ftm m;
      private final ftm n;
      private final ftm o;
      private final ftm p;
      private final ftm q;
      private final ftm r;
      private final ftm s;
      private final ftm t;
      private final ftm u;
      private final ftm w;
      private final ftm x;
      @Nullable
      private cex y;
      private float z;

      public a(ftm $$0) {
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

      public void a(cex $$0, float $$1, float $$2, float $$3) {
         this.y = $$0;
         this.z = $$3;
      }

      public void a(cex $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      }

      @Override
      public void a(ewi $$0, ewm $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         $$0.a();
         float $$8 = axk.i(this.z, this.y.bW, this.y.bX);
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
         float $$15 = axk.g((float)(this.y.a(5, this.z)[0] - this.y.a(10, this.z)[0]));
         float $$16 = axk.g((float)(this.y.a(5, this.z)[0] + (double)($$15 / 2.0F)));
         float $$17 = $$8 * (float) (Math.PI * 2);

         for (int $$18 = 0; $$18 < 5; $$18++) {
            double[] $$19 = this.y.a(5 - $$18, this.z);
            float $$20 = (float)Math.cos((double)((float)$$18 * 0.45F + $$17)) * 0.15F;
            this.b.f = axk.g((float)($$19[0] - $$14[0])) * (float) (Math.PI / 180.0) * 1.5F;
            this.b.e = $$20 + this.y.a($$18, $$14, $$19) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
            this.b.g = -axk.g((float)($$19[0] - (double)$$16)) * (float) (Math.PI / 180.0) * 1.5F;
            this.b.c = $$11;
            this.b.d = $$12;
            this.b.b = $$10;
            $$11 += axk.a(this.b.e) * 10.0F;
            $$12 -= axk.b(this.b.f) * axk.b(this.b.e) * 10.0F;
            $$10 -= axk.a(this.b.f) * axk.b(this.b.e) * 10.0F;
            this.b.a($$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F, $$7);
         }

         this.a.c = $$11;
         this.a.d = $$12;
         this.a.b = $$10;
         double[] $$21 = this.y.a(0, this.z);
         this.a.f = axk.g((float)($$21[0] - $$14[0])) * (float) (Math.PI / 180.0);
         this.a.e = axk.g(this.y.a(6, $$14, $$21)) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
         this.a.g = -axk.g((float)($$21[0] - (double)$$16)) * (float) (Math.PI / 180.0);
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
         float $$23 = -axk.a($$8 * (float) (Math.PI * 2)) * 0.0F;
         $$17 = $$8 * (float) (Math.PI * 2);
         $$11 = 10.0F;
         $$12 = 60.0F;
         $$10 = 0.0F;
         $$14 = this.y.a(11, this.z);

         for (int $$24 = 0; $$24 < 12; $$24++) {
            $$21 = this.y.a(12 + $$24, this.z);
            $$23 += axk.a((float)$$24 * 0.45F + $$17) * 0.05F;
            this.b.f = (axk.g((float)($$21[0] - $$14[0])) * 1.5F + 180.0F) * (float) (Math.PI / 180.0);
            this.b.e = $$23 + (float)($$21[1] - $$14[1]) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
            this.b.g = axk.g((float)($$21[0] - (double)$$16)) * (float) (Math.PI / 180.0) * 1.5F;
            this.b.c = $$11;
            this.b.d = $$12;
            this.b.b = $$10;
            $$11 += axk.a(this.b.e) * 10.0F;
            $$12 -= axk.b(this.b.f) * axk.b(this.b.e) * 10.0F;
            $$10 -= axk.a(this.b.f) * axk.b(this.b.e) * 10.0F;
            this.b.a($$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F, $$7);
         }

         $$0.b();
      }

      private void a(ewi $$0, ewm $$1, int $$2, int $$3, float $$4, ftm $$5, ftm $$6, ftm $$7, ftm $$8, ftm $$9, ftm $$10, ftm $$11, float $$12) {
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
