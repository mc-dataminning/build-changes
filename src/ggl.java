import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ggl implements atp {
   private static final gbm e = gbm.n(new akf("textures/misc/shadow.png"));
   private static final float f = 32.0F;
   private static final float g = 0.5F;
   private Map<bqr<?>, ggm<?>> h = ImmutableMap.of();
   private Map<gnn.a, ggm<? extends ckl>> i = Map.of();
   public final gmp a;
   private czu j;
   public fcf b;
   private Quaternionf k;
   public bql c;
   private final ghl l;
   private final gby m;
   private final gba n;
   private final fef o;
   public final fcy d;
   private final fun p;
   private boolean q = true;
   private boolean r;

   public <E extends bql> int a(E $$0, float $$1) {
      return this.a($$0).b($$0, $$1);
   }

   public ggl(fcu $$0, gmp $$1, ghl $$2, gby $$3, fef $$4, fcy $$5, fun $$6) {
      this.a = $$1;
      this.l = $$2;
      this.n = new gba($$0, this, $$2);
      this.m = $$3;
      this.o = $$4;
      this.d = $$5;
      this.p = $$6;
   }

   public <T extends bql> ggm<? super T> a(T $$0) {
      if ($$0 instanceof gad $$1) {
         gnn.a $$2 = $$1.b().e();
         ggm<? extends ckl> $$3 = this.i.get($$2);
         return (ggm<? super T>)($$3 != null ? $$3 : this.i.get(gnn.a.b));
      } else {
         return (ggm<? super T>)this.h.get($$0.ai());
      }
   }

   public void a(czu $$0, fcf $$1, bql $$2) {
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

   public <E extends bql> boolean a(E $$0, gei $$1, double $$2, double $$3, double $$4) {
      ggm<? super E> $$5 = this.a($$0);
      return $$5.a($$0, $$1, $$2, $$3, $$4);
   }

   public <E extends bql> void a(E $$0, double $$1, double $$2, double $$3, float $$4, float $$5, exn $$6, gbe $$7, int $$8) {
      ggm<? super E> $$9 = this.a($$0);

      try {
         etf $$10 = $$9.a($$0, $$5);
         double $$11 = $$1 + $$10.a();
         double $$12 = $$2 + $$10.b();
         double $$13 = $$3 + $$10.c();
         $$6.a();
         $$6.a($$11, $$12, $$13);
         $$9.a($$0, $$4, $$5, $$6, $$7, $$8);
         if ($$0.cw()) {
            this.a($$6, $$7, $$0, axw.a(axw.h, this.k, new Quaternionf()));
         }

         $$6.a(-$$10.a(), -$$10.b(), -$$10.c());
         if (this.d.O().c() && this.q && !$$0.cf()) {
            float $$14 = $$9.c($$0);
            if ($$14 > 0.0F) {
               double $$15 = this.a($$0.ds(), $$0.du(), $$0.dy());
               float $$16 = (float)((1.0 - $$15 / 256.0) * (double)$$9.e);
               if ($$16 > 0.0F) {
                  a($$6, $$7, $$0, $$16, $$5, this.j, Math.min($$14, 32.0F));
               }
            }
         }

         if (this.r && !$$0.cf() && !fcu.Q().ax()) {
            a($$6, $$7.getBuffer(gbm.y()), $$0, $$5);
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

   private static void a(exn $$0, exr $$1, bql $$2, float $$3) {
      eta $$4 = $$2.cI().d(-$$2.ds(), -$$2.du(), -$$2.dy());
      gbc.a($$0, $$1, $$4, 1.0F, 1.0F, 1.0F, 1.0F);
      if ($$2 instanceof cfp) {
         double $$5 = -axw.d((double)$$3, $$2.ad, $$2.ds());
         double $$6 = -axw.d((double)$$3, $$2.ae, $$2.du());
         double $$7 = -axw.d((double)$$3, $$2.af, $$2.dy());

         for (cfn $$8 : ((cfp)$$2).gl()) {
            $$0.a();
            double $$9 = $$5 + axw.d((double)$$3, $$8.ad, $$8.ds());
            double $$10 = $$6 + axw.d((double)$$3, $$8.ae, $$8.du());
            double $$11 = $$7 + axw.d((double)$$3, $$8.af, $$8.dy());
            $$0.a($$9, $$10, $$11);
            gbc.a($$0, $$1, $$8.cI().d(-$$8.ds(), -$$8.du(), -$$8.dy()), 0.25F, 1.0F, 0.0F, 1.0F);
            $$0.b();
         }
      }

      if ($$2 instanceof bre) {
         float $$12 = 0.01F;
         gbc.a($$0, $$1, $$4.a, (double)($$2.cJ() - 0.01F), $$4.c, $$4.d, (double)($$2.cJ() + 0.01F), $$4.f, 1.0F, 0.0F, 0.0F, 1.0F);
      }

      bql $$13 = $$2.da();
      if ($$13 != null) {
         float $$14 = Math.min($$13.dh(), $$2.dh()) / 2.0F;
         float $$15 = 0.0625F;
         etf $$16 = $$13.m($$2).d($$2.dl());
         gbc.a(
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

      etf $$17 = $$2.f($$3);
      exn.a $$18 = $$0.c();
      $$1.a($$18, 0.0F, $$2.cJ(), 0.0F).a(0, 0, 255, 255).b($$18, (float)$$17.c, (float)$$17.d, (float)$$17.e).e();
      $$1.a($$18, (float)($$17.c * 2.0), (float)((double)$$2.cJ() + $$17.d * 2.0), (float)($$17.e * 2.0))
         .a(0, 0, 255, 255)
         .b($$18, (float)$$17.c, (float)$$17.d, (float)$$17.e)
         .e();
   }

   private void a(exn $$0, gbe $$1, bql $$2, Quaternionf $$3) {
      gmo $$4 = got.a.c();
      gmo $$5 = got.b.c();
      $$0.a();
      float $$6 = $$2.dh() * 1.4F;
      $$0.b($$6, $$6, $$6);
      float $$7 = 0.5F;
      float $$8 = 0.0F;
      float $$9 = $$2.di() / $$6;
      float $$10 = 0.0F;
      $$0.a($$3);
      $$0.a(0.0F, 0.0F, -0.3F + (float)((int)$$9) * 0.02F);
      float $$11 = 0.0F;
      int $$12 = 0;
      exr $$13 = $$1.getBuffer(gbt.i());

      for (exn.a $$14 = $$0.c(); $$9 > 0.0F; $$12++) {
         gmo $$15 = $$12 % 2 == 0 ? $$4 : $$5;
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

   private static void a(exn.a $$0, exr $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      $$1.a($$0, $$2, $$3, $$4).a(255, 255, 255, 255).a($$5, $$6).a(0, 10).b(240).b($$0, 0.0F, 1.0F, 0.0F).e();
   }

   private static void a(exn $$0, gbe $$1, bql $$2, float $$3, float $$4, czx $$5, float $$6) {
      double $$7 = axw.d((double)$$4, $$2.ad, $$2.ds());
      double $$8 = axw.d((double)$$4, $$2.ae, $$2.du());
      double $$9 = axw.d((double)$$4, $$2.af, $$2.dy());
      float $$10 = Math.min($$3 / 0.5F, $$6);
      int $$11 = axw.a($$7 - (double)$$6);
      int $$12 = axw.a($$7 + (double)$$6);
      int $$13 = axw.a($$8 - (double)$$10);
      int $$14 = axw.a($$8);
      int $$15 = axw.a($$9 - (double)$$6);
      int $$16 = axw.a($$9 + (double)$$6);
      exn.a $$17 = $$0.c();
      exr $$18 = $$1.getBuffer(e);
      im.a $$19 = new im.a();

      for (int $$20 = $$15; $$20 <= $$16; $$20++) {
         for (int $$21 = $$11; $$21 <= $$12; $$21++) {
            $$19.d($$21, 0, $$20);
            dru $$22 = $$5.y($$19);

            for (int $$23 = $$13; $$23 <= $$14; $$23++) {
               $$19.q($$23);
               float $$24 = $$3 - (float)($$8 - (double)$$19.v()) * 0.5F;
               a($$17, $$18, $$22, $$5, $$19, $$7, $$8, $$9, $$6, $$24);
            }
         }
      }
   }

   private static void a(exn.a $$0, exr $$1, dru $$2, czx $$3, im $$4, double $$5, double $$6, double $$7, float $$8, float $$9) {
      im $$10 = $$4.d();
      dpy $$11 = $$2.a_($$10);
      if ($$11.l() != djb.a && $$3.A($$4) > 3) {
         if ($$11.r($$2, $$10)) {
            ety $$12 = $$11.j($$2, $$10);
            if (!$$12.c()) {
               float $$13 = gbd.a($$3.D_(), $$3.A($$4));
               float $$14 = $$9 * 0.5F * $$13;
               if ($$14 >= 0.0F) {
                  if ($$14 > 1.0F) {
                     $$14 = 1.0F;
                  }

                  eta $$15 = $$12.a();
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

   private static void a(exn.a $$0, exr $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      Vector3f $$8 = $$0.a().transformPosition($$3, $$4, $$5, new Vector3f());
      $$1.a($$8.x(), $$8.y(), $$8.z(), 1.0F, 1.0F, 1.0F, $$2, $$6, $$7, gmf.d, 15728880, 0.0F, 1.0F, 0.0F);
   }

   public void a(@Nullable czu $$0) {
      this.j = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   public double b(bql $$0) {
      return this.b.b().g($$0.dl());
   }

   public double a(double $$0, double $$1, double $$2) {
      return this.b.b().c($$0, $$1, $$2);
   }

   public Quaternionf b() {
      return this.k;
   }

   public gba d() {
      return this.n;
   }

   @Override
   public void a(ato $$0) {
      ggn.a $$1 = new ggn.a(this, this.l, this.m, this.n, $$0, this.p, this.o);
      this.h = ggo.a($$1);
      this.i = ggo.b($$1);
   }
}
