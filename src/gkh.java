import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gkh implements auf {
   private static final gfh e = gfh.n(akr.b("textures/misc/shadow.png"));
   private static final float f = 32.0F;
   private static final float g = 0.5F;
   private Map<bsx<?>, gki<?>> h = ImmutableMap.of();
   private Map<grl.a, gki<? extends cmx>> i = Map.of();
   public final gqm a;
   private dcw j;
   public ffy b;
   private Quaternionf k;
   public bsr c;
   private final glh l;
   private final gft m;
   private final gev n;
   private final fhx o;
   public final fgs d;
   private final fyg p;
   private boolean q = true;
   private boolean r;

   public <E extends bsr> int a(E $$0, float $$1) {
      return this.a($$0).b($$0, $$1);
   }

   public gkh(fgo $$0, gqm $$1, glh $$2, gft $$3, fhx $$4, fgs $$5, fyg $$6) {
      this.a = $$1;
      this.l = $$2;
      this.n = new gev($$0, this, $$2);
      this.m = $$3;
      this.o = $$4;
      this.d = $$5;
      this.p = $$6;
   }

   public <T extends bsr> gki<? super T> a(T $$0) {
      if ($$0 instanceof gdy $$1) {
         grl.a $$2 = $$1.b().e();
         gki<? extends cmx> $$3 = this.i.get($$2);
         return (gki<? super T>)($$3 != null ? $$3 : this.i.get(grl.a.b));
      } else {
         return (gki<? super T>)this.h.get($$0.am());
      }
   }

   public void a(dcw $$0, ffy $$1, bsr $$2) {
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

   public <E extends bsr> boolean a(E $$0, gie $$1, double $$2, double $$3, double $$4) {
      gki<? super E> $$5 = this.a($$0);
      return $$5.a($$0, $$1, $$2, $$3, $$4);
   }

   public <E extends bsr> void a(E $$0, double $$1, double $$2, double $$3, float $$4, float $$5, fbi $$6, gez $$7, int $$8) {
      gki<? super E> $$9 = this.a($$0);

      try {
         exc $$10 = $$9.a($$0, $$5);
         double $$11 = $$1 + $$10.a();
         double $$12 = $$2 + $$10.b();
         double $$13 = $$3 + $$10.c();
         $$6.a();
         $$6.a($$11, $$12, $$13);
         $$9.a($$0, $$4, $$5, $$6, $$7, $$8);
         if ($$0.cy()) {
            this.a($$6, $$7, $$0, ayo.a(ayo.h, this.k, new Quaternionf()));
         }

         $$6.a(-$$10.a(), -$$10.b(), -$$10.c());
         if (this.d.O().c() && this.q && !$$0.ci()) {
            float $$14 = $$9.c($$0);
            if ($$14 > 0.0F) {
               double $$15 = this.a($$0.dt(), $$0.dv(), $$0.dz());
               float $$16 = (float)((1.0 - $$15 / 256.0) * (double)$$9.f);
               if ($$16 > 0.0F) {
                  a($$6, $$7, $$0, $$16, $$5, this.j, Math.min($$14, 32.0F));
               }
            }
         }

         if (this.r && !$$0.ci() && !fgo.Q().av()) {
            a($$6, $$7.getBuffer(gfh.y()), $$0, $$5, 1.0F, 1.0F, 1.0F);
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

   private static void a(fbi $$0, bsr $$1, gez $$2) {
      bsr $$3 = c($$1);
      if ($$3 == null) {
         gim.a($$0, $$2, "Missing", $$1.dt(), $$1.cK().e + 1.5, $$1.dz(), -65536);
      } else {
         $$0.a();
         $$0.a($$3.dt() - $$1.dt(), $$3.dv() - $$1.dv(), $$3.dz() - $$1.dz());
         a($$0, $$2.getBuffer(gfh.y()), $$3, 1.0F, 0.0F, 1.0F, 0.0F);
         a($$0, $$2.getBuffer(gfh.y()), new Vector3f(), $$3.dr(), -256);
         $$0.b();
      }
   }

   @Nullable
   private static bsr c(bsr $$0) {
      guo $$1 = fgo.Q().V();
      if ($$1 != null) {
         aqu $$2 = $$1.a($$0.dO().af());
         if ($$2 != null) {
            return $$2.a($$0.an());
         }
      }

      return null;
   }

   private static void a(fbi $$0, fbm $$1, bsr $$2, float $$3, float $$4, float $$5, float $$6) {
      ewx $$7 = $$2.cK().d(-$$2.dt(), -$$2.dv(), -$$2.dz());
      gex.a($$0, $$1, $$7, $$4, $$5, $$6, 1.0F);
      if ($$2 instanceof cia) {
         double $$8 = -ayo.d((double)$$3, $$2.ad, $$2.dt());
         double $$9 = -ayo.d((double)$$3, $$2.ae, $$2.dv());
         double $$10 = -ayo.d((double)$$3, $$2.af, $$2.dz());

         for (chy $$11 : ((cia)$$2).gg()) {
            $$0.a();
            double $$12 = $$8 + ayo.d((double)$$3, $$11.ad, $$11.dt());
            double $$13 = $$9 + ayo.d((double)$$3, $$11.ae, $$11.dv());
            double $$14 = $$10 + ayo.d((double)$$3, $$11.af, $$11.dz());
            $$0.a($$12, $$13, $$14);
            gex.a($$0, $$1, $$11.cK().d(-$$11.dt(), -$$11.dv(), -$$11.dz()), 0.25F, 1.0F, 0.0F, 1.0F);
            $$0.b();
         }
      }

      if ($$2 instanceof btn) {
         float $$15 = 0.01F;
         gex.a($$0, $$1, $$7.a, (double)($$2.cL() - 0.01F), $$7.c, $$7.d, (double)($$2.cL() + 0.01F), $$7.f, 1.0F, 0.0F, 0.0F, 1.0F);
      }

      bsr $$16 = $$2.dc();
      if ($$16 != null) {
         float $$17 = Math.min($$16.dj(), $$2.dj()) / 2.0F;
         float $$18 = 0.0625F;
         exc $$19 = $$16.m($$2).d($$2.dm());
         gex.a(
            $$0,
            $$1,
            $$19.c - (double)$$17,
            $$19.d,
            $$19.e - (double)$$17,
            $$19.c + (double)$$17,
            $$19.d + 0.0625,
            $$19.e + (double)$$17,
            1.0F,
            1.0F,
            0.0F,
            1.0F
         );
      }

      a($$0, $$1, new Vector3f(0.0F, $$2.cL(), 0.0F), $$2.g($$3).a(2.0), -16776961);
   }

   private static void a(fbi $$0, fbm $$1, Vector3f $$2, exc $$3, int $$4) {
      fbi.a $$5 = $$0.c();
      $$1.a($$5, $$2).a($$4).b($$5, (float)$$3.c, (float)$$3.d, (float)$$3.e);
      $$1.a($$5, (float)((double)$$2.x() + $$3.c), (float)((double)$$2.y() + $$3.d), (float)((double)$$2.z() + $$3.e))
         .a($$4)
         .b($$5, (float)$$3.c, (float)$$3.d, (float)$$3.e);
   }

   private void a(fbi $$0, gez $$1, bsr $$2, Quaternionf $$3) {
      gql $$4 = gss.a.c();
      gql $$5 = gss.b.c();
      $$0.a();
      float $$6 = $$2.dj() * 1.4F;
      $$0.b($$6, $$6, $$6);
      float $$7 = 0.5F;
      float $$8 = 0.0F;
      float $$9 = $$2.dk() / $$6;
      float $$10 = 0.0F;
      $$0.a($$3);
      $$0.a(0.0F, 0.0F, 0.3F - (float)((int)$$9) * 0.02F);
      float $$11 = 0.0F;
      int $$12 = 0;
      fbm $$13 = $$1.getBuffer(gfo.i());

      for (fbi.a $$14 = $$0.c(); $$9 > 0.0F; $$12++) {
         gql $$15 = $$12 % 2 == 0 ? $$4 : $$5;
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

   private static void a(fbi.a $$0, fbm $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      $$1.a($$0, $$2, $$3, $$4).a(-1).a($$5, $$6).a(0, 10).c(240).b($$0, 0.0F, 1.0F, 0.0F);
   }

   private static void a(fbi $$0, gez $$1, bsr $$2, float $$3, float $$4, dcz $$5, float $$6) {
      double $$7 = ayo.d((double)$$4, $$2.ad, $$2.dt());
      double $$8 = ayo.d((double)$$4, $$2.ae, $$2.dv());
      double $$9 = ayo.d((double)$$4, $$2.af, $$2.dz());
      float $$10 = Math.min($$3 / 0.5F, $$6);
      int $$11 = ayo.a($$7 - (double)$$6);
      int $$12 = ayo.a($$7 + (double)$$6);
      int $$13 = ayo.a($$8 - (double)$$10);
      int $$14 = ayo.a($$8);
      int $$15 = ayo.a($$9 - (double)$$6);
      int $$16 = ayo.a($$9 + (double)$$6);
      fbi.a $$17 = $$0.c();
      fbm $$18 = $$1.getBuffer(e);
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

   private static void a(fbi.a $$0, fbm $$1, duy $$2, dcz $$3, jd $$4, double $$5, double $$6, double $$7, float $$8, float $$9) {
      jd $$10 = $$4.e();
      dtc $$11 = $$2.a_($$10);
      if ($$11.l() != dmf.a && $$3.A($$4) > 3) {
         if ($$11.r($$2, $$10)) {
            exv $$12 = $$11.j($$2, $$10);
            if (!$$12.c()) {
               float $$13 = gey.a($$3.D_(), $$3.A($$4));
               float $$14 = $$9 * 0.5F * $$13;
               if ($$14 >= 0.0F) {
                  if ($$14 > 1.0F) {
                     $$14 = 1.0F;
                  }

                  int $$15 = axy.b.a(ayo.d($$14 * 255.0F), 255, 255, 255);
                  ewx $$16 = $$12.a();
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

   private static void a(fbi.a $$0, fbm $$1, int $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      Vector3f $$8 = $$0.a().transformPosition($$3, $$4, $$5, new Vector3f());
      $$1.a($$8.x(), $$8.y(), $$8.z(), $$2, $$6, $$7, gqc.d, 15728880, 0.0F, 1.0F, 0.0F);
   }

   public void a(@Nullable dcw $$0) {
      this.j = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   public double b(bsr $$0) {
      return this.b.b().g($$0.dm());
   }

   public double a(double $$0, double $$1, double $$2) {
      return this.b.b().c($$0, $$1, $$2);
   }

   public Quaternionf b() {
      return this.k;
   }

   public gev d() {
      return this.n;
   }

   @Override
   public void a(aue $$0) {
      gkj.a $$1 = new gkj.a(this, this.l, this.m, this.n, $$0, this.p, this.o);
      this.h = gkk.a($$1);
      this.i = gkk.b($$1);
   }
}
