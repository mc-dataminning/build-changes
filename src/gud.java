import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gud implements avb {
   private static final goi e = goi.o(ald.b("textures/misc/shadow.png"));
   private static final float f = 32.0F;
   private static final float g = 0.5F;
   private Map<bwb<?>, gue<?, ?>> h = ImmutableMap.of();
   private Map<hhu.a, gue<? extends cqi, ?>> i = Map.of();
   public final hgu a;
   private dhp j;
   public fml b;
   private Quaternionf k;
   public bvs c;
   private final hdl l;
   private final gnx m;
   private final gpc n;
   private final gns o;
   private final fpx p;
   public final fnh d;
   private final Supplier<ggz> q;
   private final hix r;
   private boolean s = true;
   private boolean t;

   public <E extends bvs> int a(E $$0, float $$1) {
      return this.a($$0).a($$0, $$1);
   }

   public gud(fnd $$0, hgu $$1, hdl $$2, gvd $$3, gnx $$4, gpc $$5, fpx $$6, fnh $$7, Supplier<ggz> $$8, hix $$9) {
      this.a = $$1;
      this.l = $$2;
      this.m = $$4;
      this.o = new gns($$0, this, $$3, $$2);
      this.n = $$5;
      this.p = $$6;
      this.d = $$7;
      this.q = $$8;
      this.r = $$9;
   }

   public <T extends bvs> gue<? super T, ?> a(T $$0) {
      if ($$0 instanceof gmt $$1) {
         hhu.a $$2 = $$1.c().e();
         gue<? extends cqi, ?> $$3 = this.i.get($$2);
         return (gue<? super T, ?>)($$3 != null ? $$3 : this.i.get(hhu.a.b));
      } else {
         return (gue<? super T, ?>)this.h.get($$0.aq());
      }
   }

   public void a(dhp $$0, fml $$1, bvs $$2) {
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

   public <E extends bvs> boolean a(E $$0, grr $$1, double $$2, double $$3, double $$4) {
      gue<? super E, ?> $$5 = this.a($$0);
      return $$5.a($$0, $$1, $$2, $$3, $$4);
   }

   public <E extends bvs> void a(E $$0, double $$1, double $$2, double $$3, float $$4, fho $$5, gny $$6, int $$7) {
      gue<? super E, ?> $$8 = this.a($$0);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   private <E extends bvs, S extends hak> void a(E $$0, double $$1, double $$2, double $$3, float $$4, fho $$5, gny $$6, int $$7, gue<? super E, S> $$8) {
      try {
         S $$9 = $$8.b($$0, $$4);
         fcu $$10 = $$8.a($$9);
         double $$11 = $$1 + $$10.a();
         double $$12 = $$2 + $$10.b();
         double $$13 = $$3 + $$10.c();
         $$5.a();
         $$5.a($$11, $$12, $$13);
         $$8.a($$9, $$5, $$6, $$7);
         if ($$9.B) {
            this.a($$5, $$6, $$9, azk.a(azk.h, this.k, new Quaternionf()));
         }

         if ($$0 instanceof cqi) {
            $$5.a(-$$10.a(), -$$10.b(), -$$10.c());
         }

         if (this.d.R().c() && this.s && !$$9.z) {
            float $$14 = $$8.c($$9);
            if ($$14 > 0.0F) {
               double $$15 = $$9.y;
               float $$16 = (float)((1.0 - $$15 / 256.0) * (double)$$8.b($$9));
               if ($$16 > 0.0F) {
                  a($$5, $$6, $$9, $$16, $$4, this.j, Math.min($$14, 32.0F));
               }
            }
         }

         if (!($$0 instanceof cqi)) {
            $$5.a(-$$10.a(), -$$10.b(), -$$10.c());
         }

         if (this.t && !$$9.z && !fnd.Q().az()) {
            a($$5, $$6.getBuffer(goi.y()), $$0, $$4, 1.0F, 1.0F, 1.0F);
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

   private static void a(fho $$0, bvs $$1, gny $$2) {
      bvs $$3 = c($$1);
      if ($$3 == null) {
         gsa.a($$0, $$2, "Missing", $$1.dA(), $$1.cR().e + 1.5, $$1.dG(), -65536);
      } else {
         $$0.a();
         $$0.a($$3.dA() - $$1.dA(), $$3.dC() - $$1.dC(), $$3.dG() - $$1.dG());
         a($$0, $$2.getBuffer(goi.y()), $$3, 1.0F, 0.0F, 1.0F, 0.0F);
         gos.a($$0, $$2.getBuffer(goi.y()), new Vector3f(), $$3.dy(), -256);
         $$0.b();
      }
   }

   @Nullable
   private static bvs c(bvs $$0) {
      hld $$1 = fnd.Q().V();
      if ($$1 != null) {
         arn $$2 = $$1.a($$0.dV().aj());
         if ($$2 != null) {
            return $$2.a($$0.ar());
         }
      }

      return null;
   }

   private static void a(fho $$0, fhs $$1, bvs $$2, float $$3, float $$4, float $$5, float $$6) {
      fcp $$7 = $$2.cR().d(-$$2.dA(), -$$2.dC(), -$$2.dG());
      gos.a($$0, $$1, $$7, $$4, $$5, $$6, 1.0F);
      if ($$2 instanceof clg) {
         double $$8 = -azk.d((double)$$3, $$2.aa, $$2.dA());
         double $$9 = -azk.d((double)$$3, $$2.ab, $$2.dC());
         double $$10 = -azk.d((double)$$3, $$2.ac, $$2.dG());

         for (cld $$11 : ((clg)$$2).q()) {
            $$0.a();
            double $$12 = $$8 + azk.d((double)$$3, $$11.aa, $$11.dA());
            double $$13 = $$9 + azk.d((double)$$3, $$11.ab, $$11.dC());
            double $$14 = $$10 + azk.d((double)$$3, $$11.ac, $$11.dG());
            $$0.a($$12, $$13, $$14);
            gos.a($$0, $$1, $$11.cR().d(-$$11.dA(), -$$11.dC(), -$$11.dG()), 0.25F, 1.0F, 0.0F, 1.0F);
            $$0.b();
         }
      }

      if ($$2 instanceof bwr) {
         float $$15 = 0.01F;
         gos.a($$0, $$1, $$7.a, (double)($$2.cS() - 0.01F), $$7.c, $$7.d, (double)($$2.cS() + 0.01F), $$7.f, 1.0F, 0.0F, 0.0F, 1.0F);
      }

      bvs $$16 = $$2.dk();
      if ($$16 != null) {
         float $$17 = Math.min($$16.dq(), $$2.dq()) / 2.0F;
         float $$18 = 0.0625F;
         fcu $$19 = $$16.m($$2).d($$2.dt());
         gos.a(
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

      gos.a($$0, $$1, new Vector3f(0.0F, $$2.cS(), 0.0F), $$2.h($$3).c(2.0), -16776961);
   }

   private void a(fho $$0, gny $$1, hak $$2, Quaternionf $$3) {
      hgs $$4 = hjc.a.c();
      hgs $$5 = hjc.b.c();
      $$0.a();
      float $$6 = $$2.v * 1.4F;
      $$0.b($$6, $$6, $$6);
      float $$7 = 0.5F;
      float $$8 = 0.0F;
      float $$9 = $$2.w / $$6;
      float $$10 = 0.0F;
      $$0.a($$3);
      $$0.a(0.0F, 0.0F, 0.3F - (float)((int)$$9) * 0.02F);
      float $$11 = 0.0F;
      int $$12 = 0;
      fhs $$13 = $$1.getBuffer(got.i());

      for (fho.a $$14 = $$0.c(); $$9 > 0.0F; $$12++) {
         hgs $$15 = $$12 % 2 == 0 ? $$4 : $$5;
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

   private static void a(fho.a $$0, fhs $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      $$1.a($$0, $$2, $$3, $$4).a(-1).a($$5, $$6).a(0, 10).c(240).b($$0, 0.0F, 1.0F, 0.0F);
   }

   private static void a(fho $$0, gny $$1, hak $$2, float $$3, float $$4, dhs $$5, float $$6) {
      float $$7 = Math.min($$3 / 0.5F, $$6);
      int $$8 = azk.a($$2.r - (double)$$6);
      int $$9 = azk.a($$2.r + (double)$$6);
      int $$10 = azk.a($$2.s - (double)$$7);
      int $$11 = azk.a($$2.s);
      int $$12 = azk.a($$2.t - (double)$$6);
      int $$13 = azk.a($$2.t + (double)$$6);
      fho.a $$14 = $$0.c();
      fhs $$15 = $$1.getBuffer(e);
      jj.a $$16 = new jj.a();

      for (int $$17 = $$12; $$17 <= $$13; $$17++) {
         for (int $$18 = $$8; $$18 <= $$9; $$18++) {
            $$16.d($$18, 0, $$17);
            eaj $$19 = $$5.y($$16);

            for (int $$20 = $$10; $$20 <= $$11; $$20++) {
               $$16.q($$20);
               float $$21 = $$3 - (float)($$2.s - (double)$$16.v()) * 0.5F;
               a($$14, $$15, $$19, $$5, $$16, $$2.r, $$2.s, $$2.t, $$6, $$21);
            }
         }
      }
   }

   private static void a(fho.a $$0, fhs $$1, eaj $$2, dhs $$3, jj $$4, double $$5, double $$6, double $$7, float $$8, float $$9) {
      jj $$10 = $$4.e();
      dym $$11 = $$2.a_($$10);
      if ($$11.o() != drf.a && $$3.A($$4) > 3) {
         if ($$11.m($$2, $$10)) {
            fdo $$12 = $$11.f($$2, $$10);
            if (!$$12.c()) {
               float $$13 = gnw.a($$3.B_(), $$3.A($$4));
               float $$14 = $$9 * 0.5F * $$13;
               if ($$14 >= 0.0F) {
                  if ($$14 > 1.0F) {
                     $$14 = 1.0F;
                  }

                  int $$15 = axu.a(azk.d($$14 * 255.0F), 255, 255, 255);
                  fcp $$16 = $$12.a();
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

   private static void a(fho.a $$0, fhs $$1, int $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      Vector3f $$8 = $$0.a().transformPosition($$3, $$4, $$5, new Vector3f());
      $$1.a($$8.x(), $$8.y(), $$8.z(), $$2, $$6, $$7, hgi.d, 15728880, 0.0F, 1.0F, 0.0F);
   }

   public void a(@Nullable dhp $$0) {
      this.j = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   public double b(bvs $$0) {
      return this.b.b().g($$0.dt());
   }

   public double a(double $$0, double $$1, double $$2) {
      return this.b.b().c($$0, $$1, $$2);
   }

   public Quaternionf b() {
      return this.k;
   }

   public gns d() {
      return this.o;
   }

   @Override
   public void a(ava $$0) {
      guf.a $$1 = new guf.a(this, this.l, this.m, this.n, $$0, this.q.get(), this.r, this.p);
      this.h = gug.a($$1);
      this.i = gug.b($$1);
   }
}
