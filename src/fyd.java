import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fyd implements aqd {
   private static final fth e = fth.n(new ahd("textures/misc/shadow.png"));
   private static final float f = 32.0F;
   private static final float g = 0.5F;
   private Map<blt<?>, fye<?>> h = ImmutableMap.of();
   private Map<gff.a, fye<? extends cfb>> i = Map.of();
   public final geg a;
   private cti j;
   public eul b;
   private Quaternionf k;
   public blp c;
   private final fzd l;
   private final ftt m;
   private final fsv n;
   private final ewk o;
   public final eve d;
   private final fml p;
   private boolean q = true;
   private boolean r;

   public <E extends blp> int a(E $$0, float $$1) {
      return this.a($$0).b($$0, $$1);
   }

   public fyd(eva $$0, geg $$1, fzd $$2, ftt $$3, ewk $$4, eve $$5, fml $$6) {
      this.a = $$1;
      this.l = $$2;
      this.n = new fsv($$0, this, $$2);
      this.m = $$3;
      this.o = $$4;
      this.d = $$5;
      this.p = $$6;
   }

   public <T extends blp> fye<? super T> a(T $$0) {
      if ($$0 instanceof fry $$1) {
         gff.a $$2 = $$1.b().e();
         fye<? extends cfb> $$3 = this.i.get($$2);
         return (fye<? super T>)($$3 != null ? $$3 : this.i.get(gff.a.b));
      } else {
         return (fye<? super T>)this.h.get($$0.ai());
      }
   }

   public void a(cti $$0, eul $$1, blp $$2) {
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

   public <E extends blp> boolean a(E $$0, fwc $$1, double $$2, double $$3, double $$4) {
      fye<? super E> $$5 = this.a($$0);
      return $$5.a($$0, $$1, $$2, $$3, $$4);
   }

   public <E extends blp> void a(E $$0, double $$1, double $$2, double $$3, float $$4, float $$5, ept $$6, fsz $$7, int $$8) {
      fye<? super E> $$9 = this.a($$0);

      try {
         elm $$10 = $$9.a($$0, $$5);
         double $$11 = $$1 + $$10.a();
         double $$12 = $$2 + $$10.b();
         double $$13 = $$3 + $$10.c();
         $$6.a();
         $$6.a($$11, $$12, $$13);
         $$9.a($$0, $$4, $$5, $$6, $$7, $$8);
         if ($$0.cv()) {
            this.a($$6, $$7, $$0, aui.a(aui.h, this.k, new Quaternionf()));
         }

         $$6.a(-$$10.a(), -$$10.b(), -$$10.c());
         if (this.d.M().c() && this.q && $$9.d > 0.0F && !$$0.ce()) {
            double $$14 = this.a($$0.dr(), $$0.dt(), $$0.dx());
            float $$15 = (float)((1.0 - $$14 / 256.0) * (double)$$9.e);
            if ($$15 > 0.0F) {
               a($$6, $$7, $$0, $$15, $$5, this.j, Math.min($$9.d, 32.0F));
            }
         }

         if (this.r && !$$0.ce() && !eva.N().au()) {
            a($$6, $$7.getBuffer(fth.w()), $$0, $$5);
         }

         $$6.b();
      } catch (Throwable var24) {
         o $$17 = o.a(var24, "Rendering entity in world");
         p $$18 = $$17.a("Entity being rendered");
         $$0.a($$18);
         p $$19 = $$17.a("Renderer details");
         $$19.a("Assigned renderer", $$9);
         $$19.a("Location", p.a(this.j, $$1, $$2, $$3));
         $$19.a("Rotation", $$4);
         $$19.a("Delta", $$5);
         throw new y($$17);
      }
   }

   private static void a(ept $$0, epx $$1, blp $$2, float $$3) {
      elh $$4 = $$2.cH().d(-$$2.dr(), -$$2.dt(), -$$2.dx());
      fsx.a($$0, $$1, $$4, 1.0F, 1.0F, 1.0F, 1.0F);
      if ($$2 instanceof cai) {
         double $$5 = -aui.d((double)$$3, $$2.ac, $$2.dr());
         double $$6 = -aui.d((double)$$3, $$2.ad, $$2.dt());
         double $$7 = -aui.d((double)$$3, $$2.ae, $$2.dx());

         for (cag $$8 : ((cai)$$2).ga()) {
            $$0.a();
            double $$9 = $$5 + aui.d((double)$$3, $$8.ac, $$8.dr());
            double $$10 = $$6 + aui.d((double)$$3, $$8.ad, $$8.dt());
            double $$11 = $$7 + aui.d((double)$$3, $$8.ae, $$8.dx());
            $$0.a($$9, $$10, $$11);
            fsx.a($$0, $$1, $$8.cH().d(-$$8.dr(), -$$8.dt(), -$$8.dx()), 0.25F, 1.0F, 0.0F, 1.0F);
            $$0.b();
         }
      }

      if ($$2 instanceof bmf) {
         float $$12 = 0.01F;
         fsx.a($$0, $$1, $$4.a, (double)($$2.cI() - 0.01F), $$4.c, $$4.d, (double)($$2.cI() + 0.01F), $$4.f, 1.0F, 0.0F, 0.0F, 1.0F);
      }

      blp $$13 = $$2.cZ();
      if ($$13 != null) {
         float $$14 = Math.min($$13.dg(), $$2.dg()) / 2.0F;
         float $$15 = 0.0625F;
         elm $$16 = $$13.m($$2).d($$2.dk());
         fsx.a(
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

      elm $$17 = $$2.f($$3);
      Matrix4f $$18 = $$0.c().a();
      Matrix3f $$19 = $$0.c().b();
      $$1.a($$18, 0.0F, $$2.cI(), 0.0F).a(0, 0, 255, 255).a($$19, (float)$$17.c, (float)$$17.d, (float)$$17.e).e();
      $$1.a($$18, (float)($$17.c * 2.0), (float)((double)$$2.cI() + $$17.d * 2.0), (float)($$17.e * 2.0))
         .a(0, 0, 255, 255)
         .a($$19, (float)$$17.c, (float)$$17.d, (float)$$17.e)
         .e();
   }

   private void a(ept $$0, fsz $$1, blp $$2, Quaternionf $$3) {
      gef $$4 = ggl.a.c();
      gef $$5 = ggl.b.c();
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
      epx $$13 = $$1.getBuffer(fto.i());

      for (ept.a $$14 = $$0.c(); $$9 > 0.0F; $$12++) {
         gef $$15 = $$12 % 2 == 0 ? $$4 : $$5;
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

   private static void a(ept.a $$0, epx $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      $$1.a($$0.a(), $$2, $$3, $$4).a(255, 255, 255, 255).a($$5, $$6).a(0, 10).b(240).a($$0.b(), 0.0F, 1.0F, 0.0F).e();
   }

   private static void a(ept $$0, fsz $$1, blp $$2, float $$3, float $$4, ctl $$5, float $$6) {
      float $$7 = $$6;
      if ($$2 instanceof bmh $$8 && $$8.o_()) {
         $$7 = $$6 * 0.5F;
      }

      double $$9 = aui.d((double)$$4, $$2.ac, $$2.dr());
      double $$10 = aui.d((double)$$4, $$2.ad, $$2.dt());
      double $$11 = aui.d((double)$$4, $$2.ae, $$2.dx());
      float $$12 = Math.min($$3 / 0.5F, $$7);
      int $$13 = aui.a($$9 - (double)$$7);
      int $$14 = aui.a($$9 + (double)$$7);
      int $$15 = aui.a($$10 - (double)$$12);
      int $$16 = aui.a($$10);
      int $$17 = aui.a($$11 - (double)$$7);
      int $$18 = aui.a($$11 + (double)$$7);
      ept.a $$19 = $$0.c();
      epx $$20 = $$1.getBuffer(e);
      hx.a $$21 = new hx.a();

      for (int $$22 = $$17; $$22 <= $$18; $$22++) {
         for (int $$23 = $$13; $$23 <= $$14; $$23++) {
            $$21.d($$23, 0, $$22);
            dkw $$24 = $$5.y($$21);

            for (int $$25 = $$15; $$25 <= $$16; $$25++) {
               $$21.q($$25);
               float $$26 = $$3 - (float)($$10 - (double)$$21.v()) * 0.5F;
               a($$19, $$20, $$24, $$5, $$21, $$9, $$10, $$11, $$7, $$26);
            }
         }
      }
   }

   private static void a(ept.a $$0, epx $$1, dkw $$2, ctl $$3, hx $$4, double $$5, double $$6, double $$7, float $$8, float $$9) {
      hx $$10 = $$4.d();
      dja $$11 = $$2.a_($$10);
      if ($$11.l() != dco.a && $$3.A($$4) > 3) {
         if ($$11.r($$2, $$10)) {
            emf $$12 = $$11.j($$2, $$10);
            if (!$$12.c()) {
               float $$13 = fsy.a($$3.E_(), $$3.A($$4));
               float $$14 = $$9 * 0.5F * $$13;
               if ($$14 >= 0.0F) {
                  if ($$14 > 1.0F) {
                     $$14 = 1.0F;
                  }

                  elh $$15 = $$12.a();
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

   private static void a(ept.a $$0, epx $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      Vector3f $$8 = $$0.a().transformPosition($$3, $$4, $$5, new Vector3f());
      $$1.a($$8.x(), $$8.y(), $$8.z(), 1.0F, 1.0F, 1.0F, $$2, $$6, $$7, gdw.d, 15728880, 0.0F, 1.0F, 0.0F);
   }

   public void a(@Nullable cti $$0) {
      this.j = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   public double b(blp $$0) {
      return this.b.b().g($$0.dk());
   }

   public double a(double $$0, double $$1, double $$2) {
      return this.b.b().c($$0, $$1, $$2);
   }

   public Quaternionf b() {
      return this.k;
   }

   public fsv d() {
      return this.n;
   }

   @Override
   public void a(aqc $$0) {
      fyf.a $$1 = new fyf.a(this, this.l, this.m, this.n, $$0, this.p, this.o);
      this.h = fyg.a($$1);
      this.i = fyg.b($$1);
   }
}
