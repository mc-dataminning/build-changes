import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gfp implements atf {
   private static final gaq e = gaq.n(new ajv("textures/misc/shadow.png"));
   private static final float f = 32.0F;
   private static final float g = 0.5F;
   private Map<bqg<?>, gfq<?>> h = ImmutableMap.of();
   private Map<gmr.a, gfq<? extends cka>> i = Map.of();
   public final glt a;
   private czg j;
   public fbj b;
   private Quaternionf k;
   public bqa c;
   private final ggp l;
   private final gbc m;
   private final gae n;
   private final fdj o;
   public final fcc d;
   private final ftr p;
   private boolean q = true;
   private boolean r;

   public <E extends bqa> int a(E $$0, float $$1) {
      return this.a($$0).b($$0, $$1);
   }

   public gfp(fby $$0, glt $$1, ggp $$2, gbc $$3, fdj $$4, fcc $$5, ftr $$6) {
      this.a = $$1;
      this.l = $$2;
      this.n = new gae($$0, this, $$2);
      this.m = $$3;
      this.o = $$4;
      this.d = $$5;
      this.p = $$6;
   }

   public <T extends bqa> gfq<? super T> a(T $$0) {
      if ($$0 instanceof fzh $$1) {
         gmr.a $$2 = $$1.b().e();
         gfq<? extends cka> $$3 = this.i.get($$2);
         return (gfq<? super T>)($$3 != null ? $$3 : this.i.get(gmr.a.b));
      } else {
         return (gfq<? super T>)this.h.get($$0.ai());
      }
   }

   public void a(czg $$0, fbj $$1, bqa $$2) {
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

   public <E extends bqa> boolean a(E $$0, gdm $$1, double $$2, double $$3, double $$4) {
      gfq<? super E> $$5 = this.a($$0);
      return $$5.a($$0, $$1, $$2, $$3, $$4);
   }

   public <E extends bqa> void a(E $$0, double $$1, double $$2, double $$3, float $$4, float $$5, ewr $$6, gai $$7, int $$8) {
      gfq<? super E> $$9 = this.a($$0);

      try {
         esj $$10 = $$9.a($$0, $$5);
         double $$11 = $$1 + $$10.a();
         double $$12 = $$2 + $$10.b();
         double $$13 = $$3 + $$10.c();
         $$6.a();
         $$6.a($$11, $$12, $$13);
         $$9.a($$0, $$4, $$5, $$6, $$7, $$8);
         if ($$0.cv()) {
            this.a($$6, $$7, $$0, axm.a(axm.h, this.k, new Quaternionf()));
         }

         $$6.a(-$$10.a(), -$$10.b(), -$$10.c());
         if (this.d.O().c() && this.q && !$$0.ce()) {
            float $$14 = $$9.c($$0);
            if ($$14 > 0.0F) {
               double $$15 = this.a($$0.dr(), $$0.dt(), $$0.dx());
               float $$16 = (float)((1.0 - $$15 / 256.0) * (double)$$9.e);
               if ($$16 > 0.0F) {
                  a($$6, $$7, $$0, $$16, $$5, this.j, Math.min($$14, 32.0F));
               }
            }
         }

         if (this.r && !$$0.ce() && !fby.Q().ax()) {
            a($$6, $$7.getBuffer(gaq.y()), $$0, $$5);
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
         throw new y($$18);
      }
   }

   private static void a(ewr $$0, ewv $$1, bqa $$2, float $$3) {
      ese $$4 = $$2.cH().d(-$$2.dr(), -$$2.dt(), -$$2.dx());
      gag.a($$0, $$1, $$4, 1.0F, 1.0F, 1.0F, 1.0F);
      if ($$2 instanceof cfe) {
         double $$5 = -axm.d((double)$$3, $$2.ac, $$2.dr());
         double $$6 = -axm.d((double)$$3, $$2.ad, $$2.dt());
         double $$7 = -axm.d((double)$$3, $$2.ae, $$2.dx());

         for (cfc $$8 : ((cfe)$$2).gj()) {
            $$0.a();
            double $$9 = $$5 + axm.d((double)$$3, $$8.ac, $$8.dr());
            double $$10 = $$6 + axm.d((double)$$3, $$8.ad, $$8.dt());
            double $$11 = $$7 + axm.d((double)$$3, $$8.ae, $$8.dx());
            $$0.a($$9, $$10, $$11);
            gag.a($$0, $$1, $$8.cH().d(-$$8.dr(), -$$8.dt(), -$$8.dx()), 0.25F, 1.0F, 0.0F, 1.0F);
            $$0.b();
         }
      }

      if ($$2 instanceof bqt) {
         float $$12 = 0.01F;
         gag.a($$0, $$1, $$4.a, (double)($$2.cI() - 0.01F), $$4.c, $$4.d, (double)($$2.cI() + 0.01F), $$4.f, 1.0F, 0.0F, 0.0F, 1.0F);
      }

      bqa $$13 = $$2.cZ();
      if ($$13 != null) {
         float $$14 = Math.min($$13.dg(), $$2.dg()) / 2.0F;
         float $$15 = 0.0625F;
         esj $$16 = $$13.m($$2).d($$2.dk());
         gag.a(
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

      esj $$17 = $$2.f($$3);
      ewr.a $$18 = $$0.c();
      $$1.a($$18, 0.0F, $$2.cI(), 0.0F).a(0, 0, 255, 255).b($$18, (float)$$17.c, (float)$$17.d, (float)$$17.e).e();
      $$1.a($$18, (float)($$17.c * 2.0), (float)((double)$$2.cI() + $$17.d * 2.0), (float)($$17.e * 2.0))
         .a(0, 0, 255, 255)
         .b($$18, (float)$$17.c, (float)$$17.d, (float)$$17.e)
         .e();
   }

   private void a(ewr $$0, gai $$1, bqa $$2, Quaternionf $$3) {
      gls $$4 = gnx.a.c();
      gls $$5 = gnx.b.c();
      $$0.a();
      float $$6 = $$2.dg() * 1.4F;
      $$0.b($$6, $$6, $$6);
      float $$7 = 0.5F;
      float $$8 = 0.0F;
      float $$9 = $$2.dh() / $$6;
      float $$10 = 0.0F;
      $$0.a($$3);
      $$0.a(0.0F, 0.0F, -0.3F + (float)((int)$$9) * 0.02F);
      float $$11 = 0.0F;
      int $$12 = 0;
      ewv $$13 = $$1.getBuffer(gax.i());

      for (ewr.a $$14 = $$0.c(); $$9 > 0.0F; $$12++) {
         gls $$15 = $$12 % 2 == 0 ? $$4 : $$5;
         float $$16 = $$15.c();
         float $$17 = $$15.g();
         float $$18 = $$15.d();
         float $$19 = $$15.h();
         if ($$12 / 2 % 2 == 0) {
            float $$20 = $$18;
            $$18 = $$16;
            $$16 = $$20;
         }

         a($$14, $$13, $$7 - 0.0F, 0.0F - $$10, $$11, $$18, $$19);
         a($$14, $$13, -$$7 - 0.0F, 0.0F - $$10, $$11, $$16, $$19);
         a($$14, $$13, -$$7 - 0.0F, 1.4F - $$10, $$11, $$16, $$17);
         a($$14, $$13, $$7 - 0.0F, 1.4F - $$10, $$11, $$18, $$17);
         $$9 -= 0.45F;
         $$10 -= 0.45F;
         $$7 *= 0.9F;
         $$11 += 0.03F;
      }

      $$0.b();
   }

   private static void a(ewr.a $$0, ewv $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      $$1.a($$0, $$2, $$3, $$4).a(255, 255, 255, 255).a($$5, $$6).a(0, 10).b(240).b($$0, 0.0F, 1.0F, 0.0F).e();
   }

   private static void a(ewr $$0, gai $$1, bqa $$2, float $$3, float $$4, czj $$5, float $$6) {
      double $$7 = axm.d((double)$$4, $$2.ac, $$2.dr());
      double $$8 = axm.d((double)$$4, $$2.ad, $$2.dt());
      double $$9 = axm.d((double)$$4, $$2.ae, $$2.dx());
      float $$10 = Math.min($$3 / 0.5F, $$6);
      int $$11 = axm.a($$7 - (double)$$6);
      int $$12 = axm.a($$7 + (double)$$6);
      int $$13 = axm.a($$8 - (double)$$10);
      int $$14 = axm.a($$8);
      int $$15 = axm.a($$9 - (double)$$6);
      int $$16 = axm.a($$9 + (double)$$6);
      ewr.a $$17 = $$0.c();
      ewv $$18 = $$1.getBuffer(e);
      id.a $$19 = new id.a();

      for (int $$20 = $$15; $$20 <= $$16; $$20++) {
         for (int $$21 = $$11; $$21 <= $$12; $$21++) {
            $$19.d($$21, 0, $$20);
            dre $$22 = $$5.y($$19);

            for (int $$23 = $$13; $$23 <= $$14; $$23++) {
               $$19.q($$23);
               float $$24 = $$3 - (float)($$8 - (double)$$19.v()) * 0.5F;
               a($$17, $$18, $$22, $$5, $$19, $$7, $$8, $$9, $$6, $$24);
            }
         }
      }
   }

   private static void a(ewr.a $$0, ewv $$1, dre $$2, czj $$3, id $$4, double $$5, double $$6, double $$7, float $$8, float $$9) {
      id $$10 = $$4.d();
      dpi $$11 = $$2.a_($$10);
      if ($$11.l() != dim.a && $$3.A($$4) > 3) {
         if ($$11.r($$2, $$10)) {
            etc $$12 = $$11.j($$2, $$10);
            if (!$$12.c()) {
               float $$13 = gah.a($$3.D_(), $$3.A($$4));
               float $$14 = $$9 * 0.5F * $$13;
               if ($$14 >= 0.0F) {
                  if ($$14 > 1.0F) {
                     $$14 = 1.0F;
                  }

                  ese $$15 = $$12.a();
                  double $$16 = (double)$$4.u() + $$15.a;
                  double $$17 = (double)$$4.u() + $$15.d;
                  double $$18 = (double)$$4.v() + $$15.b;
                  double $$19 = (double)$$4.w() + $$15.c;
                  double $$20 = (double)$$4.w() + $$15.f;
                  float $$21 = (float)($$16 - $$5);
                  float $$22 = (float)($$17 - $$5);
                  float $$23 = (float)($$18 - $$6);
                  float $$24 = (float)($$19 - $$7);
                  float $$25 = (float)($$20 - $$7);
                  float $$26 = -$$21 / 2.0F / $$8 + 0.5F;
                  float $$27 = -$$22 / 2.0F / $$8 + 0.5F;
                  float $$28 = -$$24 / 2.0F / $$8 + 0.5F;
                  float $$29 = -$$25 / 2.0F / $$8 + 0.5F;
                  a($$0, $$1, $$14, $$21, $$23, $$24, $$26, $$28);
                  a($$0, $$1, $$14, $$21, $$23, $$25, $$26, $$29);
                  a($$0, $$1, $$14, $$22, $$23, $$25, $$27, $$29);
                  a($$0, $$1, $$14, $$22, $$23, $$24, $$27, $$28);
               }
            }
         }
      }
   }

   private static void a(ewr.a $$0, ewv $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      Vector3f $$8 = $$0.a().transformPosition($$3, $$4, $$5, new Vector3f());
      $$1.a($$8.x(), $$8.y(), $$8.z(), 1.0F, 1.0F, 1.0F, $$2, $$6, $$7, glj.d, 15728880, 0.0F, 1.0F, 0.0F);
   }

   public void a(@Nullable czg $$0) {
      this.j = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   public double b(bqa $$0) {
      return this.b.b().g($$0.dk());
   }

   public double a(double $$0, double $$1, double $$2) {
      return this.b.b().c($$0, $$1, $$2);
   }

   public Quaternionf b() {
      return this.k;
   }

   public gae d() {
      return this.n;
   }

   @Override
   public void a(ate $$0) {
      gfr.a $$1 = new gfr.a(this, this.l, this.m, this.n, $$0, this.p, this.o);
      this.h = gfs.a($$1);
      this.i = gfs.b($$1);
   }
}
