import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gkf implements auf {
   private static final gff e = gff.n(akr.b("textures/misc/shadow.png"));
   private static final float f = 32.0F;
   private static final float g = 0.5F;
   private Map<bsx<?>, gkg<?>> h = ImmutableMap.of();
   private Map<grj.a, gkg<? extends cmx>> i = Map.of();
   public final gqk a;
   private dcw j;
   public ffw b;
   private Quaternionf k;
   public bsr c;
   private final glf l;
   private final gfr m;
   private final get n;
   private final fhv o;
   public final fgq d;
   private final fye p;
   private boolean q = true;
   private boolean r;

   public <E extends bsr> int a(E $$0, float $$1) {
      return this.a($$0).b($$0, $$1);
   }

   public gkf(fgm $$0, gqk $$1, glf $$2, gfr $$3, fhv $$4, fgq $$5, fye $$6) {
      this.a = $$1;
      this.l = $$2;
      this.n = new get($$0, this, $$2);
      this.m = $$3;
      this.o = $$4;
      this.d = $$5;
      this.p = $$6;
   }

   public <T extends bsr> gkg<? super T> a(T $$0) {
      if ($$0 instanceof gdw $$1) {
         grj.a $$2 = $$1.b().e();
         gkg<? extends cmx> $$3 = this.i.get($$2);
         return (gkg<? super T>)($$3 != null ? $$3 : this.i.get(grj.a.b));
      } else {
         return (gkg<? super T>)this.h.get($$0.am());
      }
   }

   public void a(dcw $$0, ffw $$1, bsr $$2) {
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

   public <E extends bsr> boolean a(E $$0, gic $$1, double $$2, double $$3, double $$4) {
      gkg<? super E> $$5 = this.a($$0);
      return $$5.a($$0, $$1, $$2, $$3, $$4);
   }

   public <E extends bsr> void a(E $$0, double $$1, double $$2, double $$3, float $$4, float $$5, fbg $$6, gex $$7, int $$8) {
      gkg<? super E> $$9 = this.a($$0);

      try {
         exa $$10 = $$9.a($$0, $$5);
         double $$11 = $$1 + $$10.a();
         double $$12 = $$2 + $$10.b();
         double $$13 = $$3 + $$10.c();
         $$6.a();
         $$6.a($$11, $$12, $$13);
         $$9.a($$0, $$4, $$5, $$6, $$7, $$8);
         if ($$0.cz()) {
            this.a($$6, $$7, $$0, ayo.a(ayo.h, this.k, new Quaternionf()));
         }

         $$6.a(-$$10.a(), -$$10.b(), -$$10.c());
         if (this.d.O().c() && this.q && !$$0.ci()) {
            float $$14 = $$9.c($$0);
            if ($$14 > 0.0F) {
               double $$15 = this.a($$0.du(), $$0.dw(), $$0.dA());
               float $$16 = (float)((1.0 - $$15 / 256.0) * (double)$$9.f);
               if ($$16 > 0.0F) {
                  a($$6, $$7, $$0, $$16, $$5, this.j, Math.min($$14, 32.0F));
               }
            }
         }

         if (this.r && !$$0.ci() && !fgm.Q().av()) {
            a($$6, $$7.getBuffer(gff.x()), $$0, $$5);
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

   private static void a(fbg $$0, fbk $$1, bsr $$2, float $$3) {
      ewv $$4 = $$2.cL().d(-$$2.du(), -$$2.dw(), -$$2.dA());
      gev.a($$0, $$1, $$4, 1.0F, 1.0F, 1.0F, 1.0F);
      if ($$2 instanceof cia) {
         double $$5 = -ayo.d((double)$$3, $$2.ad, $$2.du());
         double $$6 = -ayo.d((double)$$3, $$2.ae, $$2.dw());
         double $$7 = -ayo.d((double)$$3, $$2.af, $$2.dA());

         for (chy $$8 : ((cia)$$2).gh()) {
            $$0.a();
            double $$9 = $$5 + ayo.d((double)$$3, $$8.ad, $$8.du());
            double $$10 = $$6 + ayo.d((double)$$3, $$8.ae, $$8.dw());
            double $$11 = $$7 + ayo.d((double)$$3, $$8.af, $$8.dA());
            $$0.a($$9, $$10, $$11);
            gev.a($$0, $$1, $$8.cL().d(-$$8.du(), -$$8.dw(), -$$8.dA()), 0.25F, 1.0F, 0.0F, 1.0F);
            $$0.b();
         }
      }

      if ($$2 instanceof btn) {
         float $$12 = 0.01F;
         gev.a($$0, $$1, $$4.a, (double)($$2.cM() - 0.01F), $$4.c, $$4.d, (double)($$2.cM() + 0.01F), $$4.f, 1.0F, 0.0F, 0.0F, 1.0F);
      }

      bsr $$13 = $$2.dd();
      if ($$13 != null) {
         float $$14 = Math.min($$13.dk(), $$2.dk()) / 2.0F;
         float $$15 = 0.0625F;
         exa $$16 = $$13.m($$2).d($$2.dn());
         gev.a(
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

      exa $$17 = $$2.g($$3);
      fbg.a $$18 = $$0.c();
      $$1.a($$18, 0.0F, $$2.cM(), 0.0F).a(-16776961).b($$18, (float)$$17.c, (float)$$17.d, (float)$$17.e);
      $$1.a($$18, (float)($$17.c * 2.0), (float)((double)$$2.cM() + $$17.d * 2.0), (float)($$17.e * 2.0))
         .a(0, 0, 255, 255)
         .b($$18, (float)$$17.c, (float)$$17.d, (float)$$17.e);
   }

   private void a(fbg $$0, gex $$1, bsr $$2, Quaternionf $$3) {
      gqj $$4 = gsq.a.c();
      gqj $$5 = gsq.b.c();
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
      fbk $$13 = $$1.getBuffer(gfm.i());

      for (fbg.a $$14 = $$0.c(); $$9 > 0.0F; $$12++) {
         gqj $$15 = $$12 % 2 == 0 ? $$4 : $$5;
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

   private static void a(fbg.a $$0, fbk $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      $$1.a($$0, $$2, $$3, $$4).a(-1).a($$5, $$6).a(0, 10).c(240).b($$0, 0.0F, 1.0F, 0.0F);
   }

   private static void a(fbg $$0, gex $$1, bsr $$2, float $$3, float $$4, dcz $$5, float $$6) {
      double $$7 = ayo.d((double)$$4, $$2.ad, $$2.du());
      double $$8 = ayo.d((double)$$4, $$2.ae, $$2.dw());
      double $$9 = ayo.d((double)$$4, $$2.af, $$2.dA());
      float $$10 = Math.min($$3 / 0.5F, $$6);
      int $$11 = ayo.a($$7 - (double)$$6);
      int $$12 = ayo.a($$7 + (double)$$6);
      int $$13 = ayo.a($$8 - (double)$$10);
      int $$14 = ayo.a($$8);
      int $$15 = ayo.a($$9 - (double)$$6);
      int $$16 = ayo.a($$9 + (double)$$6);
      fbg.a $$17 = $$0.c();
      fbk $$18 = $$1.getBuffer(e);
      jd.a $$19 = new jd.a();

      for (int $$20 = $$15; $$20 <= $$16; $$20++) {
         for (int $$21 = $$11; $$21 <= $$12; $$21++) {
            $$19.d($$21, 0, $$20);
            duy $$22 = $$5.y($$19);

            for (int $$23 = $$13; $$23 <= $$14; $$23++) {
               $$19.q($$23);
               float $$24 = $$3 - (float)($$8 - (double)$$19.v()) * 0.5F;
               a($$17, $$18, $$22, $$5, $$19, $$7, $$8, $$9, $$6, $$24);
            }
         }
      }
   }

   private static void a(fbg.a $$0, fbk $$1, duy $$2, dcz $$3, jd $$4, double $$5, double $$6, double $$7, float $$8, float $$9) {
      jd $$10 = $$4.e();
      dtc $$11 = $$2.a_($$10);
      if ($$11.l() != dmf.a && $$3.A($$4) > 3) {
         if ($$11.r($$2, $$10)) {
            ext $$12 = $$11.j($$2, $$10);
            if (!$$12.c()) {
               float $$13 = gew.a($$3.D_(), $$3.A($$4));
               float $$14 = $$9 * 0.5F * $$13;
               if ($$14 >= 0.0F) {
                  if ($$14 > 1.0F) {
                     $$14 = 1.0F;
                  }

                  int $$15 = axy.b.a(ayo.d($$14 * 255.0F), 255, 255, 255);
                  ewv $$16 = $$12.a();
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

   private static void a(fbg.a $$0, fbk $$1, int $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      Vector3f $$8 = $$0.a().transformPosition($$3, $$4, $$5, new Vector3f());
      $$1.a($$8.x(), $$8.y(), $$8.z(), $$2, $$6, $$7, gqa.d, 15728880, 0.0F, 1.0F, 0.0F);
   }

   public void a(@Nullable dcw $$0) {
      this.j = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   public double b(bsr $$0) {
      return this.b.b().g($$0.dn());
   }

   public double a(double $$0, double $$1, double $$2) {
      return this.b.b().c($$0, $$1, $$2);
   }

   public Quaternionf b() {
      return this.k;
   }

   public get d() {
      return this.n;
   }

   @Override
   public void a(aue $$0) {
      gkh.a $$1 = new gkh.a(this, this.l, this.m, this.n, $$0, this.p, this.o);
      this.h = gki.a($$1);
      this.i = gki.b($$1);
   }
}
