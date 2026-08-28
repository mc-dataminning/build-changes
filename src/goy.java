import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class goy implements avf {
   private static final gjh e = gjh.n(all.b("textures/misc/shadow.png"));
   private static final float f = 32.0F;
   private static final float g = 0.5F;
   private Map<bup<?>, goz<?, ?>> h = ImmutableMap.of();
   private Map<gzu.a, goz<? extends cor, ?>> i = Map.of();
   public final gyu a;
   private dff j;
   public fjg b;
   private Quaternionf k;
   public bui c;
   private final gpy l;
   private final giw m;
   private final gka n;
   private final giq o;
   private final flh p;
   public final fkb d;
   private final gby q;
   private final hba r;
   private boolean s = true;
   private boolean t;

   public <E extends bui> int a(E $$0, float $$1) {
      return this.a($$0).a($$0, $$1);
   }

   public goy(fjx $$0, gyu $$1, gpy $$2, giw $$3, gka $$4, flh $$5, fkb $$6, gby $$7, hba $$8) {
      this.a = $$1;
      this.l = $$2;
      this.m = $$3;
      this.o = new giq($$0, this, $$2);
      this.n = $$4;
      this.p = $$5;
      this.d = $$6;
      this.q = $$7;
      this.r = $$8;
   }

   public <T extends bui> goz<? super T, ?> a(T $$0) {
      if ($$0 instanceof ghq $$1) {
         gzu.a $$2 = $$1.b().e();
         goz<? extends cor, ?> $$3 = this.i.get($$2);
         return (goz<? super T, ?>)($$3 != null ? $$3 : this.i.get(gzu.a.b));
      } else {
         return (goz<? super T, ?>)this.h.get($$0.ar());
      }
   }

   public void a(dff $$0, fjg $$1, bui $$2) {
      this.j = $$0;
      this.b = $$1;
      this.k = $$1.f();
      this.c = $$2;
   }

   public void a(Quaternionf $$0) {
      this.k = $$0;
   }

   public void a(boolean $$0) {
      this.s = $$0;
   }

   public void b(boolean $$0) {
      this.t = $$0;
   }

   public boolean a() {
      return this.t;
   }

   public <E extends bui> boolean a(E $$0, gmo $$1, double $$2, double $$3, double $$4) {
      goz<? super E, ?> $$5 = this.a($$0);
      return $$5.a($$0, $$1, $$2, $$3, $$4);
   }

   public <E extends bui> void a(E $$0, double $$1, double $$2, double $$3, float $$4, fek $$5, gix $$6, int $$7) {
      goz<? super E, ?> $$8 = this.a($$0);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   private <E extends bui, S extends gvd> void a(E $$0, double $$1, double $$2, double $$3, float $$4, fek $$5, gix $$6, int $$7, goz<? super E, S> $$8) {
      try {
         S $$9 = $$8.b($$0, $$4);
         ezr $$10 = $$8.a($$9);
         double $$11 = $$1 + $$10.a();
         double $$12 = $$2 + $$10.b();
         double $$13 = $$3 + $$10.c();
         $$5.a();
         $$5.a($$11, $$12, $$13);
         $$8.a($$9, $$5, $$6, $$7);
         if ($$9.w) {
            this.a($$5, $$6, $$9, azn.a(azn.h, this.k, new Quaternionf()));
         }

         if ($$0 instanceof cor) {
            $$5.a(-$$10.a(), -$$10.b(), -$$10.c());
         }

         if (this.d.Q().c() && this.s && !$$9.u) {
            float $$14 = $$8.b($$9);
            if ($$14 > 0.0F) {
               double $$15 = $$9.t;
               float $$16 = (float)((1.0 - $$15 / 256.0) * (double)$$8.g);
               if ($$16 > 0.0F) {
                  a($$5, $$6, $$9, $$16, $$4, this.j, Math.min($$14, 32.0F));
               }
            }
         }

         if (!($$0 instanceof cor)) {
            $$5.a(-$$10.a(), -$$10.b(), -$$10.c());
         }

         if (this.t && !$$9.u && !fjx.Q().az()) {
            a($$5, $$6.getBuffer(gjh.y()), $$0, $$4, 1.0F, 1.0F, 1.0F);
         }

         $$5.b();
      } catch (Throwable var25) {
         o $$18 = o.a(var25, "Rendering entity in world");
         p $$19 = $$18.a("Entity being rendered");
         $$0.a($$19);
         p $$20 = $$18.a("Renderer details");
         $$20.a("Assigned renderer", $$8);
         $$20.a("Location", p.a(this.j, $$1, $$2, $$3));
         $$20.a("Delta", $$4);
         throw new z($$18);
      }
   }

   private static void a(fek $$0, bui $$1, gix $$2) {
      bui $$3 = c($$1);
      if ($$3 == null) {
         gmx.a($$0, $$2, "Missing", $$1.dD(), $$1.cT().e + 1.5, $$1.dJ(), -65536);
      } else {
         $$0.a();
         $$0.a($$3.dD() - $$1.dD(), $$3.dF() - $$1.dF(), $$3.dJ() - $$1.dJ());
         a($$0, $$2.getBuffer(gjh.y()), $$3, 1.0F, 0.0F, 1.0F, 0.0F);
         gjr.a($$0, $$2.getBuffer(gjh.y()), new Vector3f(), $$3.dB(), -256);
         $$0.b();
      }
   }

   @Nullable
   private static bui c(bui $$0) {
      hde $$1 = fjx.Q().V();
      if ($$1 != null) {
         arq $$2 = $$1.a($$0.dY().ag());
         if ($$2 != null) {
            return $$2.a($$0.as());
         }
      }

      return null;
   }

   private static void a(fek $$0, feo $$1, bui $$2, float $$3, float $$4, float $$5, float $$6) {
      ezm $$7 = $$2.cT().d(-$$2.dD(), -$$2.dF(), -$$2.dJ());
      gjr.a($$0, $$1, $$7, $$4, $$5, $$6, 1.0F);
      if ($$2 instanceof cjs) {
         double $$8 = -azn.d((double)$$3, $$2.ab, $$2.dD());
         double $$9 = -azn.d((double)$$3, $$2.ac, $$2.dF());
         double $$10 = -azn.d((double)$$3, $$2.ad, $$2.dJ());

         for (cjp $$11 : ((cjs)$$2).gr()) {
            $$0.a();
            double $$12 = $$8 + azn.d((double)$$3, $$11.ab, $$11.dD());
            double $$13 = $$9 + azn.d((double)$$3, $$11.ac, $$11.dF());
            double $$14 = $$10 + azn.d((double)$$3, $$11.ad, $$11.dJ());
            $$0.a($$12, $$13, $$14);
            gjr.a($$0, $$1, $$11.cT().d(-$$11.dD(), -$$11.dF(), -$$11.dJ()), 0.25F, 1.0F, 0.0F, 1.0F);
            $$0.b();
         }
      }

      if ($$2 instanceof bve) {
         float $$15 = 0.01F;
         gjr.a($$0, $$1, $$7.a, (double)($$2.cU() - 0.01F), $$7.c, $$7.d, (double)($$2.cU() + 0.01F), $$7.f, 1.0F, 0.0F, 0.0F, 1.0F);
      }

      bui $$16 = $$2.dm();
      if ($$16 != null) {
         float $$17 = Math.min($$16.dt(), $$2.dt()) / 2.0F;
         float $$18 = 0.0625F;
         ezr $$19 = $$16.m($$2).d($$2.dw());
         gjr.a(
            $$0,
            $$1,
            $$19.d - (double)$$17,
            $$19.e,
            $$19.f - (double)$$17,
            $$19.d + (double)$$17,
            $$19.e + 0.0625,
            $$19.f + (double)$$17,
            1.0F,
            1.0F,
            0.0F,
            1.0F
         );
      }

      gjr.a($$0, $$1, new Vector3f(0.0F, $$2.cU(), 0.0F), $$2.g($$3).c(2.0), -16776961);
   }

   private void a(fek $$0, gix $$1, gvd $$2, Quaternionf $$3) {
      gyt $$4 = hbf.a.c();
      gyt $$5 = hbf.b.c();
      $$0.a();
      float $$6 = $$2.q * 1.4F;
      $$0.b($$6, $$6, $$6);
      float $$7 = 0.5F;
      float $$8 = 0.0F;
      float $$9 = $$2.r / $$6;
      float $$10 = 0.0F;
      $$0.a($$3);
      $$0.a(0.0F, 0.0F, 0.3F - (float)((int)$$9) * 0.02F);
      float $$11 = 0.0F;
      int $$12 = 0;
      feo $$13 = $$1.getBuffer(gjs.i());

      for (fek.a $$14 = $$0.c(); $$9 > 0.0F; $$12++) {
         gyt $$15 = $$12 % 2 == 0 ? $$4 : $$5;
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

   private static void a(fek.a $$0, feo $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      $$1.a($$0, $$2, $$3, $$4).a(-1).a($$5, $$6).a(0, 10).c(240).b($$0, 0.0F, 1.0F, 0.0F);
   }

   private static void a(fek $$0, gix $$1, gvd $$2, float $$3, float $$4, dfi $$5, float $$6) {
      float $$7 = Math.min($$3 / 0.5F, $$6);
      int $$8 = azn.a($$2.m - (double)$$6);
      int $$9 = azn.a($$2.m + (double)$$6);
      int $$10 = azn.a($$2.n - (double)$$7);
      int $$11 = azn.a($$2.n);
      int $$12 = azn.a($$2.o - (double)$$6);
      int $$13 = azn.a($$2.o + (double)$$6);
      fek.a $$14 = $$0.c();
      feo $$15 = $$1.getBuffer(e);
      jh.a $$16 = new jh.a();

      for (int $$17 = $$12; $$17 <= $$13; $$17++) {
         for (int $$18 = $$8; $$18 <= $$9; $$18++) {
            $$16.d($$18, 0, $$17);
            dxj $$19 = $$5.y($$16);

            for (int $$20 = $$10; $$20 <= $$11; $$20++) {
               $$16.q($$20);
               float $$21 = $$3 - (float)($$2.n - (double)$$16.v()) * 0.5F;
               a($$14, $$15, $$19, $$5, $$16, $$2.m, $$2.n, $$2.o, $$6, $$21);
            }
         }
      }
   }

   private static void a(fek.a $$0, feo $$1, dxj $$2, dfi $$3, jh $$4, double $$5, double $$6, double $$7, float $$8, float $$9) {
      jh $$10 = $$4.e();
      dvo $$11 = $$2.a_($$10);
      if ($$11.o() != dop.a && $$3.A($$4) > 3) {
         if ($$11.m($$2, $$10)) {
            fal $$12 = $$11.f($$2, $$10);
            if (!$$12.c()) {
               float $$13 = giv.a($$3.D_(), $$3.A($$4));
               float $$14 = $$9 * 0.5F * $$13;
               if ($$14 >= 0.0F) {
                  if ($$14 > 1.0F) {
                     $$14 = 1.0F;
                  }

                  int $$15 = axy.a(azn.d($$14 * 255.0F), 255, 255, 255);
                  ezm $$16 = $$12.a();
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

   private static void a(fek.a $$0, feo $$1, int $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      Vector3f $$8 = $$0.a().transformPosition($$3, $$4, $$5, new Vector3f());
      $$1.a($$8.x(), $$8.y(), $$8.z(), $$2, $$6, $$7, gyk.d, 15728880, 0.0F, 1.0F, 0.0F);
   }

   public void a(@Nullable dff $$0) {
      this.j = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   public double b(bui $$0) {
      return this.b.b().g($$0.dw());
   }

   public double a(double $$0, double $$1, double $$2) {
      return this.b.b().c($$0, $$1, $$2);
   }

   public Quaternionf b() {
      return this.k;
   }

   public giq d() {
      return this.o;
   }

   @Override
   public void a(ave $$0) {
      gpa.a $$1 = new gpa.a(this, this.l, this.m, this.n, $$0, this.q, this.r, this.p);
      this.h = gpb.a($$1);
      this.i = gpb.b($$1);
   }
}
