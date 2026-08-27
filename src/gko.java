import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gko implements aue {
   private static final gfo e = gfo.n(new akt("textures/misc/shadow.png"));
   private static final float f = 32.0F;
   private static final float g = 0.5F;
   private Map<bsb<?>, gkp<?>> h = ImmutableMap.of();
   private Map<gry.a, gkp<? extends cly>> i = Map.of();
   public final gqz a;
   private dca j;
   public ffu b;
   private Quaternionf k;
   public brv c;
   private final glp l;
   private final gga m;
   private final gfc n;
   private final fhy o;
   public final fgn d;
   private final fyo p;
   private boolean q = true;
   private boolean r;

   public <E extends brv> int a(E $$0, float $$1) {
      return this.a($$0).b($$0, $$1);
   }

   public gko(fgj $$0, gqz $$1, glp $$2, gga $$3, fhy $$4, fgn $$5, fyo $$6) {
      this.a = $$1;
      this.l = $$2;
      this.n = new gfc($$0, this, $$2);
      this.m = $$3;
      this.o = $$4;
      this.d = $$5;
      this.p = $$6;
   }

   public <T extends brv> gkp<? super T> a(T $$0) {
      if ($$0 instanceof gef $$1) {
         gry.a $$2 = $$1.b().e();
         gkp<? extends cly> $$3 = this.i.get($$2);
         return (gkp<? super T>)($$3 != null ? $$3 : this.i.get(gry.a.b));
      } else {
         return (gkp<? super T>)this.h.get($$0.ak());
      }
   }

   public void a(dca $$0, ffu $$1, brv $$2) {
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

   public <E extends brv> boolean a(E $$0, gik $$1, double $$2, double $$3, double $$4) {
      gkp<? super E> $$5 = this.a($$0);
      return $$5.a($$0, $$1, $$2, $$3, $$4);
   }

   public <E extends brv> void a(E $$0, double $$1, double $$2, double $$3, float $$4, float $$5, fbc $$6, gfg $$7, int $$8) {
      gkp<? super E> $$9 = this.a($$0);

      try {
         ewu $$10 = $$9.a($$0, $$5);
         double $$11 = $$1 + $$10.a();
         double $$12 = $$2 + $$10.b();
         double $$13 = $$3 + $$10.c();
         $$6.a();
         $$6.a($$11, $$12, $$13);
         $$9.a($$0, $$4, $$5, $$6, $$7, $$8);
         if ($$0.cD()) {
            this.a($$6, $$7, $$0, aym.a(aym.h, this.k, new Quaternionf()));
         }

         $$6.a(-$$10.a(), -$$10.b(), -$$10.c());
         if (this.d.O().c() && this.q && !$$0.cm()) {
            float $$14 = $$9.c($$0);
            if ($$14 > 0.0F) {
               double $$15 = this.a($$0.dz(), $$0.dB(), $$0.dF());
               float $$16 = (float)((1.0 - $$15 / 256.0) * (double)$$9.f);
               if ($$16 > 0.0F) {
                  a($$6, $$7, $$0, $$16, $$5, this.j, Math.min($$14, 32.0F));
               }
            }
         }

         if (this.r && !$$0.cm() && !fgj.Q().ax()) {
            a($$6, $$7.getBuffer(gfo.z()), $$0, $$5);
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

   private static void a(fbc $$0, fbg $$1, brv $$2, float $$3) {
      ewp $$4 = $$2.cP().d(-$$2.dz(), -$$2.dB(), -$$2.dF());
      gfe.a($$0, $$1, $$4, 1.0F, 1.0F, 1.0F, 1.0F);
      if ($$2 instanceof cha) {
         double $$5 = -aym.d((double)$$3, $$2.ae, $$2.dz());
         double $$6 = -aym.d((double)$$3, $$2.af, $$2.dB());
         double $$7 = -aym.d((double)$$3, $$2.ag, $$2.dF());

         for (cgy $$8 : ((cha)$$2).gu()) {
            $$0.a();
            double $$9 = $$5 + aym.d((double)$$3, $$8.ae, $$8.dz());
            double $$10 = $$6 + aym.d((double)$$3, $$8.af, $$8.dB());
            double $$11 = $$7 + aym.d((double)$$3, $$8.ag, $$8.dF());
            $$0.a($$9, $$10, $$11);
            gfe.a($$0, $$1, $$8.cP().d(-$$8.dz(), -$$8.dB(), -$$8.dF()), 0.25F, 1.0F, 0.0F, 1.0F);
            $$0.b();
         }
      }

      if ($$2 instanceof bso) {
         float $$12 = 0.01F;
         gfe.a($$0, $$1, $$4.a, (double)($$2.cQ() - 0.01F), $$4.c, $$4.d, (double)($$2.cQ() + 0.01F), $$4.f, 1.0F, 0.0F, 0.0F, 1.0F);
      }

      brv $$13 = $$2.dh();
      if ($$13 != null) {
         float $$14 = Math.min($$13.do(), $$2.do()) / 2.0F;
         float $$15 = 0.0625F;
         ewu $$16 = $$13.m($$2).d($$2.ds());
         gfe.a(
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

      ewu $$17 = $$2.f($$3);
      fbc.a $$18 = $$0.c();
      $$1.a($$18, 0.0F, $$2.cQ(), 0.0F).a(0, 0, 255, 255).b($$18, (float)$$17.c, (float)$$17.d, (float)$$17.e).e();
      $$1.a($$18, (float)($$17.c * 2.0), (float)((double)$$2.cQ() + $$17.d * 2.0), (float)($$17.e * 2.0))
         .a(0, 0, 255, 255)
         .b($$18, (float)$$17.c, (float)$$17.d, (float)$$17.e)
         .e();
   }

   private void a(fbc $$0, gfg $$1, brv $$2, Quaternionf $$3) {
      gqy $$4 = gte.a.c();
      gqy $$5 = gte.b.c();
      $$0.a();
      float $$6 = $$2.do() * 1.4F;
      $$0.b($$6, $$6, $$6);
      float $$7 = 0.5F;
      float $$8 = 0.0F;
      float $$9 = $$2.dp() / $$6;
      float $$10 = 0.0F;
      $$0.a($$3);
      $$0.a(0.0F, 0.0F, -0.3F + (float)((int)$$9) * 0.02F);
      float $$11 = 0.0F;
      int $$12 = 0;
      fbg $$13 = $$1.getBuffer(gfv.i());

      for (fbc.a $$14 = $$0.c(); $$9 > 0.0F; $$12++) {
         gqy $$15 = $$12 % 2 == 0 ? $$4 : $$5;
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

   private static void a(fbc.a $$0, fbg $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      $$1.a($$0, $$2, $$3, $$4).a(255, 255, 255, 255).a($$5, $$6).a(0, 10).b(240).b($$0, 0.0F, 1.0F, 0.0F).e();
   }

   private static void a(fbc $$0, gfg $$1, brv $$2, float $$3, float $$4, dcd $$5, float $$6) {
      double $$7 = aym.d((double)$$4, $$2.ae, $$2.dz());
      double $$8 = aym.d((double)$$4, $$2.af, $$2.dB());
      double $$9 = aym.d((double)$$4, $$2.ag, $$2.dF());
      float $$10 = Math.min($$3 / 0.5F, $$6);
      int $$11 = aym.a($$7 - (double)$$6);
      int $$12 = aym.a($$7 + (double)$$6);
      int $$13 = aym.a($$8 - (double)$$10);
      int $$14 = aym.a($$8);
      int $$15 = aym.a($$9 - (double)$$6);
      int $$16 = aym.a($$9 + (double)$$6);
      fbc.a $$17 = $$0.c();
      fbg $$18 = $$1.getBuffer(e);
      ir.a $$19 = new ir.a();

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

   private static void a(fbc.a $$0, fbg $$1, duy $$2, dcd $$3, ir $$4, double $$5, double $$6, double $$7, float $$8, float $$9) {
      ir $$10 = $$4.d();
      dtc $$11 = $$2.a_($$10);
      if ($$11.l() != dlw.a && $$3.A($$4) > 3) {
         if ($$11.r($$2, $$10)) {
            exn $$12 = $$11.j($$2, $$10);
            if (!$$12.c()) {
               float $$13 = gff.a($$3.E_(), $$3.A($$4));
               float $$14 = $$9 * 0.5F * $$13;
               if ($$14 >= 0.0F) {
                  if ($$14 > 1.0F) {
                     $$14 = 1.0F;
                  }

                  ewp $$15 = $$12.a();
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

   private static void a(fbc.a $$0, fbg $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      Vector3f $$8 = $$0.a().transformPosition($$3, $$4, $$5, new Vector3f());
      $$1.a($$8.x(), $$8.y(), $$8.z(), 1.0F, 1.0F, 1.0F, $$2, $$6, $$7, gqp.d, 15728880, 0.0F, 1.0F, 0.0F);
   }

   public void a(@Nullable dca $$0) {
      this.j = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   public double b(brv $$0) {
      return this.b.b().g($$0.ds());
   }

   public double a(double $$0, double $$1, double $$2) {
      return this.b.b().c($$0, $$1, $$2);
   }

   public Quaternionf b() {
      return this.k;
   }

   public gfc d() {
      return this.n;
   }

   @Override
   public void a(aud $$0) {
      gkq.a $$1 = new gkq.a(this, this.l, this.m, this.n, $$0, this.p, this.o);
      this.h = gkr.a($$1);
      this.i = gkr.b($$1);
   }
}
