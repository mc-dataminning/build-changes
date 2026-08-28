import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gkb implements aue {
   private static final gfb e = gfb.n(akq.b("textures/misc/shadow.png"));
   private static final float f = 32.0F;
   private static final float g = 0.5F;
   private Map<bsw<?>, gkc<?>> h = ImmutableMap.of();
   private Map<grf.a, gkc<? extends cmv>> i = Map.of();
   public final gqg a;
   private dcu j;
   public ffs b;
   private Quaternionf k;
   public bsq c;
   private final glb l;
   private final gfn m;
   private final gep n;
   private final fhr o;
   public final fgm d;
   private final fya p;
   private boolean q = true;
   private boolean r;

   public <E extends bsq> int a(E $$0, float $$1) {
      return this.a($$0).b($$0, $$1);
   }

   public gkb(fgi $$0, gqg $$1, glb $$2, gfn $$3, fhr $$4, fgm $$5, fya $$6) {
      this.a = $$1;
      this.l = $$2;
      this.n = new gep($$0, this, $$2);
      this.m = $$3;
      this.o = $$4;
      this.d = $$5;
      this.p = $$6;
   }

   public <T extends bsq> gkc<? super T> a(T $$0) {
      if ($$0 instanceof gds $$1) {
         grf.a $$2 = $$1.b().e();
         gkc<? extends cmv> $$3 = this.i.get($$2);
         return (gkc<? super T>)($$3 != null ? $$3 : this.i.get(grf.a.b));
      } else {
         return (gkc<? super T>)this.h.get($$0.am());
      }
   }

   public void a(dcu $$0, ffs $$1, bsq $$2) {
      this.j = $$0;
      this.b = $$1;
      this.k = $$1.f();
      this.c = $$2;
   }

   public void a(Quaternionf $$0) {
      this.k = $$0;
   }

   public void a(boolean $$0) {
      this.q = $$0;
   }

   public void b(boolean $$0) {
      this.r = $$0;
   }

   public boolean a() {
      return this.r;
   }

   public <E extends bsq> boolean a(E $$0, ghy $$1, double $$2, double $$3, double $$4) {
      gkc<? super E> $$5 = this.a($$0);
      return $$5.a($$0, $$1, $$2, $$3, $$4);
   }

   public <E extends bsq> void a(E $$0, double $$1, double $$2, double $$3, float $$4, float $$5, fbc $$6, get $$7, int $$8) {
      gkc<? super E> $$9 = this.a($$0);

      try {
         eww $$10 = $$9.a($$0, $$5);
         double $$11 = $$1 + $$10.a();
         double $$12 = $$2 + $$10.b();
         double $$13 = $$3 + $$10.c();
         $$6.a();
         $$6.a($$11, $$12, $$13);
         $$9.a($$0, $$4, $$5, $$6, $$7, $$8);
         if ($$0.cz()) {
            this.a($$6, $$7, $$0, ayn.a(ayn.h, this.k, new Quaternionf()));
         }

         $$6.a(-$$10.a(), -$$10.b(), -$$10.c());
         if (this.d.O().c() && this.q && !$$0.ci()) {
            float $$14 = $$9.c($$0);
            if ($$14 > 0.0F) {
               double $$15 = this.a($$0.dv(), $$0.dx(), $$0.dB());
               float $$16 = (float)((1.0 - $$15 / 256.0) * (double)$$9.e);
               if ($$16 > 0.0F) {
                  a($$6, $$7, $$0, $$16, $$5, this.j, Math.min($$14, 32.0F));
               }
            }
         }

         if (this.r && !$$0.ci() && !fgi.Q().av()) {
            a($$6, $$7.getBuffer(gfb.w()), $$0, $$5);
         }

         $$6.b();
      } catch (Throwable var25) {
         o $$18 = o.a(var25, "Rendering entity in world");
         p $$19 = $$18.a("Entity being rendered");
         $$0.a($$19);
         p $$20 = $$18.a("Renderer details");
         $$20.a("Assigned renderer", $$9);
         $$20.a("Location", p.a(this.j, $$1, $$2, $$3));
         $$20.a("Rotation", $$4);
         $$20.a("Delta", $$5);
         throw new z($$18);
      }
   }

   private static void a(fbc $$0, fbg $$1, bsq $$2, float $$3) {
      ewr $$4 = $$2.cL().d(-$$2.dv(), -$$2.dx(), -$$2.dB());
      ger.a($$0, $$1, $$4, 1.0F, 1.0F, 1.0F, 1.0F);
      if ($$2 instanceof chy) {
         double $$5 = -ayn.d((double)$$3, $$2.ad, $$2.dv());
         double $$6 = -ayn.d((double)$$3, $$2.ae, $$2.dx());
         double $$7 = -ayn.d((double)$$3, $$2.af, $$2.dB());

         for (chw $$8 : ((chy)$$2).gi()) {
            $$0.a();
            double $$9 = $$5 + ayn.d((double)$$3, $$8.ad, $$8.dv());
            double $$10 = $$6 + ayn.d((double)$$3, $$8.ae, $$8.dx());
            double $$11 = $$7 + ayn.d((double)$$3, $$8.af, $$8.dB());
            $$0.a($$9, $$10, $$11);
            ger.a($$0, $$1, $$8.cL().d(-$$8.dv(), -$$8.dx(), -$$8.dB()), 0.25F, 1.0F, 0.0F, 1.0F);
            $$0.b();
         }
      }

      if ($$2 instanceof btl) {
         float $$12 = 0.01F;
         ger.a($$0, $$1, $$4.a, (double)($$2.cM() - 0.01F), $$4.c, $$4.d, (double)($$2.cM() + 0.01F), $$4.f, 1.0F, 0.0F, 0.0F, 1.0F);
      }

      bsq $$13 = $$2.dd();
      if ($$13 != null) {
         float $$14 = Math.min($$13.dk(), $$2.dk()) / 2.0F;
         float $$15 = 0.0625F;
         eww $$16 = $$13.m($$2).d($$2.do());
         ger.a(
            $$0,
            $$1,
            $$16.c - (double)$$14,
            $$16.d,
            $$16.e - (double)$$14,
            $$16.c + (double)$$14,
            $$16.d + 0.0625,
            $$16.e + (double)$$14,
            1.0F,
            1.0F,
            0.0F,
            1.0F
         );
      }

      eww $$17 = $$2.g($$3);
      fbc.a $$18 = $$0.c();
      $$1.a($$18, 0.0F, $$2.cM(), 0.0F).a(-16776961).b($$18, (float)$$17.c, (float)$$17.d, (float)$$17.e);
      $$1.a($$18, (float)($$17.c * 2.0), (float)((double)$$2.cM() + $$17.d * 2.0), (float)($$17.e * 2.0))
         .a(0, 0, 255, 255)
         .b($$18, (float)$$17.c, (float)$$17.d, (float)$$17.e);
   }

   private void a(fbc $$0, get $$1, bsq $$2, Quaternionf $$3) {
      gqf $$4 = gsl.a.c();
      gqf $$5 = gsl.b.c();
      $$0.a();
      float $$6 = $$2.dk() * 1.4F;
      $$0.b($$6, $$6, $$6);
      float $$7 = 0.5F;
      float $$8 = 0.0F;
      float $$9 = $$2.dl() / $$6;
      float $$10 = 0.0F;
      $$0.a($$3);
      $$0.a(0.0F, 0.0F, 0.3F - (float)((int)$$9) * 0.02F);
      float $$11 = 0.0F;
      int $$12 = 0;
      fbg $$13 = $$1.getBuffer(gfi.i());

      for (fbc.a $$14 = $$0.c(); $$9 > 0.0F; $$12++) {
         gqf $$15 = $$12 % 2 == 0 ? $$4 : $$5;
         float $$16 = $$15.c();
         float $$17 = $$15.g();
         float $$18 = $$15.d();
         float $$19 = $$15.h();
         if ($$12 / 2 % 2 == 0) {
            float $$20 = $$18;
            $$18 = $$16;
            $$16 = $$20;
         }

         a($$14, $$13, -$$7 - 0.0F, 0.0F - $$10, $$11, $$18, $$19);
         a($$14, $$13, $$7 - 0.0F, 0.0F - $$10, $$11, $$16, $$19);
         a($$14, $$13, $$7 - 0.0F, 1.4F - $$10, $$11, $$16, $$17);
         a($$14, $$13, -$$7 - 0.0F, 1.4F - $$10, $$11, $$18, $$17);
         $$9 -= 0.45F;
         $$10 -= 0.45F;
         $$7 *= 0.9F;
         $$11 -= 0.03F;
      }

      $$0.b();
   }

   private static void a(fbc.a $$0, fbg $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      $$1.a($$0, $$2, $$3, $$4).a(-1).a($$5, $$6).a(0, 10).c(240).b($$0, 0.0F, 1.0F, 0.0F);
   }

   private static void a(fbc $$0, get $$1, bsq $$2, float $$3, float $$4, dcx $$5, float $$6) {
      double $$7 = ayn.d((double)$$4, $$2.ad, $$2.dv());
      double $$8 = ayn.d((double)$$4, $$2.ae, $$2.dx());
      double $$9 = ayn.d((double)$$4, $$2.af, $$2.dB());
      float $$10 = Math.min($$3 / 0.5F, $$6);
      int $$11 = ayn.a($$7 - (double)$$6);
      int $$12 = ayn.a($$7 + (double)$$6);
      int $$13 = ayn.a($$8 - (double)$$10);
      int $$14 = ayn.a($$8);
      int $$15 = ayn.a($$9 - (double)$$6);
      int $$16 = ayn.a($$9 + (double)$$6);
      fbc.a $$17 = $$0.c();
      fbg $$18 = $$1.getBuffer(e);
      jd.a $$19 = new jd.a();

      for (int $$20 = $$15; $$20 <= $$16; $$20++) {
         for (int $$21 = $$11; $$21 <= $$12; $$21++) {
            $$19.d($$21, 0, $$20);
            duw $$22 = $$5.y($$19);

            for (int $$23 = $$13; $$23 <= $$14; $$23++) {
               $$19.q($$23);
               float $$24 = $$3 - (float)($$8 - (double)$$19.v()) * 0.5F;
               a($$17, $$18, $$22, $$5, $$19, $$7, $$8, $$9, $$6, $$24);
            }
         }
      }
   }

   private static void a(fbc.a $$0, fbg $$1, duw $$2, dcx $$3, jd $$4, double $$5, double $$6, double $$7, float $$8, float $$9) {
      jd $$10 = $$4.d();
      dta $$11 = $$2.a_($$10);
      if ($$11.l() != dmd.a && $$3.A($$4) > 3) {
         if ($$11.r($$2, $$10)) {
            exp $$12 = $$11.j($$2, $$10);
            if (!$$12.c()) {
               float $$13 = ges.a($$3.D_(), $$3.A($$4));
               float $$14 = $$9 * 0.5F * $$13;
               if ($$14 >= 0.0F) {
                  if ($$14 > 1.0F) {
                     $$14 = 1.0F;
                  }

                  int $$15 = axx.b.a(ayn.d($$14 * 255.0F), 255, 255, 255);
                  ewr $$16 = $$12.a();
                  double $$17 = (double)$$4.u() + $$16.a;
                  double $$18 = (double)$$4.u() + $$16.d;
                  double $$19 = (double)$$4.v() + $$16.b;
                  double $$20 = (double)$$4.w() + $$16.c;
                  double $$21 = (double)$$4.w() + $$16.f;
                  float $$22 = (float)($$17 - $$5);
                  float $$23 = (float)($$18 - $$5);
                  float $$24 = (float)($$19 - $$6);
                  float $$25 = (float)($$20 - $$7);
                  float $$26 = (float)($$21 - $$7);
                  float $$27 = -$$22 / 2.0F / $$8 + 0.5F;
                  float $$28 = -$$23 / 2.0F / $$8 + 0.5F;
                  float $$29 = -$$25 / 2.0F / $$8 + 0.5F;
                  float $$30 = -$$26 / 2.0F / $$8 + 0.5F;
                  a($$0, $$1, $$15, $$22, $$24, $$25, $$27, $$29);
                  a($$0, $$1, $$15, $$22, $$24, $$26, $$27, $$30);
                  a($$0, $$1, $$15, $$23, $$24, $$26, $$28, $$30);
                  a($$0, $$1, $$15, $$23, $$24, $$25, $$28, $$29);
               }
            }
         }
      }
   }

   private static void a(fbc.a $$0, fbg $$1, int $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      Vector3f $$8 = $$0.a().transformPosition($$3, $$4, $$5, new Vector3f());
      $$1.a($$8.x(), $$8.y(), $$8.z(), $$2, $$6, $$7, gpw.d, 15728880, 0.0F, 1.0F, 0.0F);
   }

   public void a(@Nullable dcu $$0) {
      this.j = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   public double b(bsq $$0) {
      return this.b.b().g($$0.do());
   }

   public double a(double $$0, double $$1, double $$2) {
      return this.b.b().c($$0, $$1, $$2);
   }

   public Quaternionf b() {
      return this.k;
   }

   public gep d() {
      return this.n;
   }

   @Override
   public void a(aud $$0) {
      gkd.a $$1 = new gkd.a(this, this.l, this.m, this.n, $$0, this.p, this.o);
      this.h = gke.a($$1);
      this.i = gke.b($$1);
   }
}
