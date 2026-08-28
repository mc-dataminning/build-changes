import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gke extends gki<cia> {
   public static final akr a = akr.b("textures/entity/end_crystal/end_crystal_beam.png");
   private static final akr g = akr.b("textures/entity/enderdragon/dragon_exploding.png");
   private static final akr h = akr.b("textures/entity/enderdragon/dragon.png");
   private static final akr i = akr.b("textures/entity/enderdragon/dragon_eyes.png");
   private static final gfh j = gfh.e(h);
   private static final gfh k = gfh.l(h);
   private static final gfh l = gfh.p(i);
   private static final gfh m = gfh.k(a);
   private static final float n = (float)(Math.sqrt(3.0) / 2.0);
   private final gke.a o;

   public gke(gkj.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.o = new gke.a($$0.a(fyj.aa));
   }

   public void a(cia $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      $$3.a();
      float $$6 = (float)$$0.a(7, $$2)[0];
      float $$7 = (float)($$0.a(5, $$2)[1] - $$0.a(10, $$2)[1]);
      $$3.a(a.d.rotationDegrees(-$$6));
      $$3.a(a.b.rotationDegrees($$7 * 10.0F));
      $$3.a(0.0F, 0.0F, 1.0F);
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(0.0F, -1.501F, 0.0F);
      boolean $$8 = $$0.aO > 0;
      this.o.a($$0, 0.0F, 0.0F, $$2);
      if ($$0.ce > 0) {
         float $$9 = (float)$$0.ce / 200.0F;
         int $$10 = axy.b.b(ayo.d($$9 * 255.0F), -1);
         fbm $$11 = $$4.getBuffer(gfh.o(g));
         this.o.a($$3, $$11, $$5, gqc.d, $$10);
         fbm $$12 = $$4.getBuffer(k);
         this.o.a($$3, $$12, $$5, gqc.a(0.0F, $$8));
      } else {
         fbm $$13 = $$4.getBuffer(j);
         this.o.a($$3, $$13, $$5, gqc.a(0.0F, $$8));
      }

      fbm $$14 = $$4.getBuffer(l);
      this.o.a($$3, $$14, $$5, gqc.d);
      if ($$0.ce > 0) {
         float $$15 = ((float)$$0.ce + $$2) / 200.0F;
         $$3.a();
         $$3.a(0.0F, -1.0F, -2.0F);
         a($$3, $$15, $$4.getBuffer(gfh.r()));
         a($$3, $$15, $$4.getBuffer(gfh.s()));
         $$3.b();
      }

      $$3.b();
      if ($$0.cg != null) {
         $$3.a();
         float $$16 = (float)($$0.cg.dt() - ayo.d((double)$$2, $$0.L, $$0.dt()));
         float $$17 = (float)($$0.cg.dv() - ayo.d((double)$$2, $$0.M, $$0.dv()));
         float $$18 = (float)($$0.cg.dz() - ayo.d((double)$$2, $$0.N, $$0.dz()));
         a($$16, $$17 + gkd.a($$0.cg, $$2), $$18, $$2, $$0.ai, $$3, $$4, $$5);
         $$3.b();
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void a(fbi $$0, float $$1, fbm $$2) {
      $$0.a();
      float $$3 = Math.min($$1 > 0.8F ? ($$1 - 0.8F) / 0.2F : 0.0F, 1.0F);
      int $$4 = axy.b.a(1.0F - $$3, 1.0F, 1.0F, 1.0F);
      int $$5 = 16711935;
      ayw $$6 = ayw.a(432L);
      Vector3f $$7 = new Vector3f();
      Vector3f $$8 = new Vector3f();
      Vector3f $$9 = new Vector3f();
      Vector3f $$10 = new Vector3f();
      Quaternionf $$11 = new Quaternionf();
      int $$12 = ayo.d(($$1 + $$1 * $$1) / 2.0F * 60.0F);

      for (int $$13 = 0; $$13 < $$12; $$13++) {
         $$11.rotationXYZ($$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2))
            .rotateXYZ($$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2) + $$1 * (float) (Math.PI / 2));
         $$0.a($$11);
         float $$14 = $$6.i() * 20.0F + 5.0F + $$3 * 10.0F;
         float $$15 = $$6.i() * 2.0F + 1.0F + $$3 * 2.0F;
         $$8.set(-n * $$15, $$14, -0.5F * $$15);
         $$9.set(n * $$15, $$14, -0.5F * $$15);
         $$10.set(0.0F, $$14, $$15);
         fbi.a $$16 = $$0.c();
         $$2.a($$16, $$7).a($$4);
         $$2.a($$16, $$8).a(16711935);
         $$2.a($$16, $$9).a(16711935);
         $$2.a($$16, $$7).a($$4);
         $$2.a($$16, $$9).a(16711935);
         $$2.a($$16, $$10).a(16711935);
         $$2.a($$16, $$7).a($$4);
         $$2.a($$16, $$10).a(16711935);
         $$2.a($$16, $$8).a(16711935);
      }

      $$0.b();
   }

   public static void a(float $$0, float $$1, float $$2, float $$3, int $$4, fbi $$5, gez $$6, int $$7) {
      float $$8 = ayo.c($$0 * $$0 + $$2 * $$2);
      float $$9 = ayo.c($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
      $$5.a();
      $$5.a(0.0F, 2.0F, 0.0F);
      $$5.a(a.d.rotation((float)(-Math.atan2((double)$$2, (double)$$0)) - (float) (Math.PI / 2)));
      $$5.a(a.b.rotation((float)(-Math.atan2((double)$$8, (double)$$1)) - (float) (Math.PI / 2)));
      fbm $$10 = $$6.getBuffer(m);
      float $$11 = 0.0F - ((float)$$4 + $$3) * 0.01F;
      float $$12 = ayo.c($$0 * $$0 + $$1 * $$1 + $$2 * $$2) / 32.0F - ((float)$$4 + $$3) * 0.01F;
      int $$13 = 8;
      float $$14 = 0.0F;
      float $$15 = 0.75F;
      float $$16 = 0.0F;
      fbi.a $$17 = $$5.c();

      for (int $$18 = 1; $$18 <= 8; $$18++) {
         float $$19 = ayo.a((float)$$18 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$20 = ayo.b((float)$$18 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$21 = (float)$$18 / 8.0F;
         $$10.a($$17, $$14 * 0.2F, $$15 * 0.2F, 0.0F).a(-16777216).a($$16, $$11).b(gqc.d).c($$7).b($$17, 0.0F, -1.0F, 0.0F);
         $$10.a($$17, $$14, $$15, $$9).a(-1).a($$16, $$12).b(gqc.d).c($$7).b($$17, 0.0F, -1.0F, 0.0F);
         $$10.a($$17, $$19, $$20, $$9).a(-1).a($$21, $$12).b(gqc.d).c($$7).b($$17, 0.0F, -1.0F, 0.0F);
         $$10.a($$17, $$19 * 0.2F, $$20 * 0.2F, 0.0F).a(-16777216).a($$21, $$11).b(gqc.d).c($$7).b($$17, 0.0F, -1.0F, 0.0F);
         $$14 = $$19;
         $$15 = $$20;
         $$16 = $$21;
      }

      $$5.b();
   }

   public akr a(cia $$0) {
      return h;
   }

   public static fyq a() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      float $$2 = -16.0F;
      fyt $$3 = $$1.a(
         "head",
         fyp.c()
            .a("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 176, 44)
            .a("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, 112, 30)
            .a()
            .a("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0)
            .a()
            .a("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0),
         fym.a
      );
      $$3.a("jaw", fyp.c().a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, 176, 65), fym.a(0.0F, 4.0F, -8.0F));
      $$1.a("neck", fyp.c().a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 192, 104).a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 48, 0), fym.a);
      $$1.a(
         "body",
         fyp.c()
            .a("body", -12.0F, 0.0F, -16.0F, 24, 24, 64, 0, 0)
            .a("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12, 220, 53)
            .a("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12, 220, 53),
         fym.a(0.0F, 4.0F, 8.0F)
      );
      fyt $$4 = $$1.a(
         "left_wing", fyp.c().a().a("bone", 0.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), fym.a(12.0F, 5.0F, 2.0F)
      );
      $$4.a(
         "left_wing_tip",
         fyp.c().a().a("bone", 0.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         fym.a(56.0F, 0.0F, 0.0F)
      );
      fyt $$5 = $$1.a("left_front_leg", fyp.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), fym.a(12.0F, 20.0F, 2.0F));
      fyt $$6 = $$5.a("left_front_leg_tip", fyp.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), fym.a(0.0F, 20.0F, -1.0F));
      $$6.a("left_front_foot", fyp.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), fym.a(0.0F, 23.0F, 0.0F));
      fyt $$7 = $$1.a("left_hind_leg", fyp.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), fym.a(16.0F, 16.0F, 42.0F));
      fyt $$8 = $$7.a("left_hind_leg_tip", fyp.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), fym.a(0.0F, 32.0F, -4.0F));
      $$8.a("left_hind_foot", fyp.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), fym.a(0.0F, 31.0F, 4.0F));
      fyt $$9 = $$1.a(
         "right_wing", fyp.c().a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), fym.a(-12.0F, 5.0F, 2.0F)
      );
      $$9.a(
         "right_wing_tip",
         fyp.c().a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
         fym.a(-56.0F, 0.0F, 0.0F)
      );
      fyt $$10 = $$1.a("right_front_leg", fyp.c().a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), fym.a(-12.0F, 20.0F, 2.0F));
      fyt $$11 = $$10.a("right_front_leg_tip", fyp.c().a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), fym.a(0.0F, 20.0F, -1.0F));
      $$11.a("right_front_foot", fyp.c().a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), fym.a(0.0F, 23.0F, 0.0F));
      fyt $$12 = $$1.a("right_hind_leg", fyp.c().a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), fym.a(-16.0F, 16.0F, 42.0F));
      fyt $$13 = $$12.a("right_hind_leg_tip", fyp.c().a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), fym.a(0.0F, 32.0F, -4.0F));
      $$13.a("right_hind_foot", fyp.c().a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), fym.a(0.0F, 31.0F, 4.0F));
      return fyq.a($$0, 256, 256);
   }

   public static class a extends fvk<cia> {
      private final fyk a;
      private final fyk b;
      private final fyk f;
      private final fyk g;
      private final fyk h;
      private final fyk i;
      private final fyk j;
      private final fyk k;
      private final fyk l;
      private final fyk m;
      private final fyk n;
      private final fyk o;
      private final fyk p;
      private final fyk q;
      private final fyk r;
      private final fyk s;
      private final fyk t;
      private final fyk u;
      private final fyk w;
      private final fyk x;
      @Nullable
      private cia y;
      private float z;

      public a(fyk $$0) {
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

      public void a(cia $$0, float $$1, float $$2, float $$3) {
         this.y = $$0;
         this.z = $$3;
      }

      public void a(cia $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      }

      @Override
      public void a(fbi $$0, fbm $$1, int $$2, int $$3, int $$4) {
         $$0.a();
         float $$5 = ayo.i(this.z, this.y.cb, this.y.cc);
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
         float $$12 = ayo.g((float)(this.y.a(5, this.z)[0] - this.y.a(10, this.z)[0]));
         float $$13 = ayo.g((float)(this.y.a(5, this.z)[0] + (double)($$12 / 2.0F)));
         float $$14 = $$5 * (float) (Math.PI * 2);

         for (int $$15 = 0; $$15 < 5; $$15++) {
            double[] $$16 = this.y.a(5 - $$15, this.z);
            float $$17 = (float)Math.cos((double)((float)$$15 * 0.45F + $$14)) * 0.15F;
            this.b.f = ayo.g((float)($$16[0] - $$11[0])) * (float) (Math.PI / 180.0) * 1.5F;
            this.b.e = $$17 + this.y.a($$15, $$11, $$16) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
            this.b.g = -ayo.g((float)($$16[0] - (double)$$13)) * (float) (Math.PI / 180.0) * 1.5F;
            this.b.c = $$8;
            this.b.d = $$9;
            this.b.b = $$7;
            $$8 += ayo.a(this.b.e) * 10.0F;
            $$9 -= ayo.b(this.b.f) * ayo.b(this.b.e) * 10.0F;
            $$7 -= ayo.a(this.b.f) * ayo.b(this.b.e) * 10.0F;
            this.b.a($$0, $$1, $$2, $$3, $$4);
         }

         this.a.c = $$8;
         this.a.d = $$9;
         this.a.b = $$7;
         double[] $$18 = this.y.a(0, this.z);
         this.a.f = ayo.g((float)($$18[0] - $$11[0])) * (float) (Math.PI / 180.0);
         this.a.e = ayo.g(this.y.a(6, $$11, $$18)) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
         this.a.g = -ayo.g((float)($$18[0] - (double)$$13)) * (float) (Math.PI / 180.0);
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
         float $$20 = -ayo.a($$5 * (float) (Math.PI * 2)) * 0.0F;
         $$14 = $$5 * (float) (Math.PI * 2);
         $$8 = 10.0F;
         $$9 = 60.0F;
         $$7 = 0.0F;
         $$11 = this.y.a(11, this.z);

         for (int $$21 = 0; $$21 < 12; $$21++) {
            $$18 = this.y.a(12 + $$21, this.z);
            $$20 += ayo.a((float)$$21 * 0.45F + $$14) * 0.05F;
            this.b.f = (ayo.g((float)($$18[0] - $$11[0])) * 1.5F + 180.0F) * (float) (Math.PI / 180.0);
            this.b.e = $$20 + (float)($$18[1] - $$11[1]) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
            this.b.g = ayo.g((float)($$18[0] - (double)$$13)) * (float) (Math.PI / 180.0) * 1.5F;
            this.b.c = $$8;
            this.b.d = $$9;
            this.b.b = $$7;
            $$8 += ayo.a(this.b.e) * 10.0F;
            $$9 -= ayo.b(this.b.f) * ayo.b(this.b.e) * 10.0F;
            $$7 -= ayo.a(this.b.f) * ayo.b(this.b.e) * 10.0F;
            this.b.a($$0, $$1, $$2, $$3, $$4);
         }

         $$0.b();
      }

      private void a(fbi $$0, fbm $$1, int $$2, int $$3, float $$4, fyk $$5, fyk $$6, fyk $$7, fyk $$8, fyk $$9, fyk $$10, fyk $$11, int $$12) {
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
