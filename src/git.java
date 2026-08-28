import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class git implements aup {
   private static final gdu e = gdu.n(new ale("textures/misc/shadow.png"));
   private static final float f = 32.0F;
   private static final float g = 0.5F;
   private Map<bsy<?>, giu<?>> h = ImmutableMap.of();
   private Map<gpx.a, giu<? extends cmv>> i = Map.of();
   public final goy a;
   private dbw j;
   public feo b;
   private Quaternionf k;
   public bss c;
   private final gjt l;
   private final geg m;
   private final gdi n;
   private final fgn o;
   public final ffh d;
   private final fwu p;
   private boolean q = true;
   private boolean r;

   public <E extends bss> int a(E $$0, float $$1) {
      return this.a($$0).b($$0, $$1);
   }

   public git(ffd $$0, goy $$1, gjt $$2, geg $$3, fgn $$4, ffh $$5, fwu $$6) {
      this.a = $$1;
      this.l = $$2;
      this.n = new gdi($$0, this, $$2);
      this.m = $$3;
      this.o = $$4;
      this.d = $$5;
      this.p = $$6;
   }

   public <T extends bss> giu<? super T> a(T $$0) {
      if ($$0 instanceof gcl $$1) {
         gpx.a $$2 = $$1.b().e();
         giu<? extends cmv> $$3 = this.i.get($$2);
         return (giu<? super T>)($$3 != null ? $$3 : this.i.get(gpx.a.b));
      } else {
         return (giu<? super T>)this.h.get($$0.ak());
      }
   }

   public void a(dbw $$0, feo $$1, bss $$2) {
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

   public <E extends bss> boolean a(E $$0, ggq $$1, double $$2, double $$3, double $$4) {
      giu<? super E> $$5 = this.a($$0);
      return $$5.a($$0, $$1, $$2, $$3, $$4);
   }

   public <E extends bss> void a(E $$0, double $$1, double $$2, double $$3, float $$4, float $$5, ezw $$6, gdm $$7, int $$8) {
      giu<? super E> $$9 = this.a($$0);

      try {
         evp $$10 = $$9.a($$0, $$5);
         double $$11 = $$1 + $$10.a();
         double $$12 = $$2 + $$10.b();
         double $$13 = $$3 + $$10.c();
         $$6.a();
         $$6.a($$11, $$12, $$13);
         $$9.a($$0, $$4, $$5, $$6, $$7, $$8);
         if ($$0.cy()) {
            this.a($$6, $$7, $$0, ayx.a(ayx.h, this.k, new Quaternionf()));
         }

         $$6.a(-$$10.a(), -$$10.b(), -$$10.c());
         if (this.d.O().c() && this.q && !$$0.ch()) {
            float $$14 = $$9.c($$0);
            if ($$14 > 0.0F) {
               double $$15 = this.a($$0.du(), $$0.dw(), $$0.dA());
               float $$16 = (float)((1.0 - $$15 / 256.0) * (double)$$9.e);
               if ($$16 > 0.0F) {
                  a($$6, $$7, $$0, $$16, $$5, this.j, Math.min($$14, 32.0F));
               }
            }
         }

         if (this.r && !$$0.ch() && !ffd.Q().aw()) {
            a($$6, $$7.getBuffer(gdu.y()), $$0, $$5);
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

   private static void a(ezw $$0, faa $$1, bss $$2, float $$3) {
      evk $$4 = $$2.cK().d(-$$2.du(), -$$2.dw(), -$$2.dA());
      gdk.a($$0, $$1, $$4, 1.0F, 1.0F, 1.0F, 1.0F);
      if ($$2 instanceof chz) {
         double $$5 = -ayx.d((double)$$3, $$2.ad, $$2.du());
         double $$6 = -ayx.d((double)$$3, $$2.ae, $$2.dw());
         double $$7 = -ayx.d((double)$$3, $$2.af, $$2.dA());

         for (chx $$8 : ((chz)$$2).gm()) {
            $$0.a();
            double $$9 = $$5 + ayx.d((double)$$3, $$8.ad, $$8.du());
            double $$10 = $$6 + ayx.d((double)$$3, $$8.ae, $$8.dw());
            double $$11 = $$7 + ayx.d((double)$$3, $$8.af, $$8.dA());
            $$0.a($$9, $$10, $$11);
            gdk.a($$0, $$1, $$8.cK().d(-$$8.du(), -$$8.dw(), -$$8.dA()), 0.25F, 1.0F, 0.0F, 1.0F);
            $$0.b();
         }
      }

      if ($$2 instanceof btn) {
         float $$12 = 0.01F;
         gdk.a($$0, $$1, $$4.a, (double)($$2.cL() - 0.01F), $$4.c, $$4.d, (double)($$2.cL() + 0.01F), $$4.f, 1.0F, 0.0F, 0.0F, 1.0F);
      }

      bss $$13 = $$2.dc();
      if ($$13 != null) {
         float $$14 = Math.min($$13.dj(), $$2.dj()) / 2.0F;
         float $$15 = 0.0625F;
         evp $$16 = $$13.m($$2).d($$2.dn());
         gdk.a(
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

      evp $$17 = $$2.f($$3);
      ezw.a $$18 = $$0.c();
      $$1.a($$18, 0.0F, $$2.cL(), 0.0F).a(0, 0, 255, 255).b($$18, (float)$$17.c, (float)$$17.d, (float)$$17.e).e();
      $$1.a($$18, (float)($$17.c * 2.0), (float)((double)$$2.cL() + $$17.d * 2.0), (float)($$17.e * 2.0))
         .a(0, 0, 255, 255)
         .b($$18, (float)$$17.c, (float)$$17.d, (float)$$17.e)
         .e();
   }

   private void a(ezw $$0, gdm $$1, bss $$2, Quaternionf $$3) {
      gox $$4 = grd.a.c();
      gox $$5 = grd.b.c();
      $$0.a();
      float $$6 = $$2.dj() * 1.4F;
      $$0.b($$6, $$6, $$6);
      float $$7 = 0.5F;
      float $$8 = 0.0F;
      float $$9 = $$2.dk() / $$6;
      float $$10 = 0.0F;
      $$0.a($$3);
      $$0.a(0.0F, 0.0F, -0.3F + (float)((int)$$9) * 0.02F);
      float $$11 = 0.0F;
      int $$12 = 0;
      faa $$13 = $$1.getBuffer(geb.i());

      for (ezw.a $$14 = $$0.c(); $$9 > 0.0F; $$12++) {
         gox $$15 = $$12 % 2 == 0 ? $$4 : $$5;
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

   private static void a(ezw.a $$0, faa $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      $$1.a($$0, $$2, $$3, $$4).a(255, 255, 255, 255).a($$5, $$6).a(0, 10).b(240).b($$0, 0.0F, 1.0F, 0.0F).e();
   }

   private static void a(ezw $$0, gdm $$1, bss $$2, float $$3, float $$4, dbz $$5, float $$6) {
      double $$7 = ayx.d((double)$$4, $$2.ad, $$2.du());
      double $$8 = ayx.d((double)$$4, $$2.ae, $$2.dw());
      double $$9 = ayx.d((double)$$4, $$2.af, $$2.dA());
      float $$10 = Math.min($$3 / 0.5F, $$6);
      int $$11 = ayx.a($$7 - (double)$$6);
      int $$12 = ayx.a($$7 + (double)$$6);
      int $$13 = ayx.a($$8 - (double)$$10);
      int $$14 = ayx.a($$8);
      int $$15 = ayx.a($$9 - (double)$$6);
      int $$16 = ayx.a($$9 + (double)$$6);
      ezw.a $$17 = $$0.c();
      faa $$18 = $$1.getBuffer(e);
      iz.a $$19 = new iz.a();

      for (int $$20 = $$15; $$20 <= $$16; $$20++) {
         for (int $$21 = $$11; $$21 <= $$12; $$21++) {
            $$19.d($$21, 0, $$20);
            dtw $$22 = $$5.y($$19);

            for (int $$23 = $$13; $$23 <= $$14; $$23++) {
               $$19.q($$23);
               float $$24 = $$3 - (float)($$8 - (double)$$19.v()) * 0.5F;
               a($$17, $$18, $$22, $$5, $$19, $$7, $$8, $$9, $$6, $$24);
            }
         }
      }
   }

   private static void a(ezw.a $$0, faa $$1, dtw $$2, dbz $$3, iz $$4, double $$5, double $$6, double $$7, float $$8, float $$9) {
      iz $$10 = $$4.d();
      dsa $$11 = $$2.a_($$10);
      if ($$11.l() != dld.a && $$3.A($$4) > 3) {
         if ($$11.r($$2, $$10)) {
            ewi $$12 = $$11.j($$2, $$10);
            if (!$$12.c()) {
               float $$13 = gdl.a($$3.D_(), $$3.A($$4));
               float $$14 = $$9 * 0.5F * $$13;
               if ($$14 >= 0.0F) {
                  if ($$14 > 1.0F) {
                     $$14 = 1.0F;
                  }

                  evk $$15 = $$12.a();
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

   private static void a(ezw.a $$0, faa $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      Vector3f $$8 = $$0.a().transformPosition($$3, $$4, $$5, new Vector3f());
      $$1.a($$8.x(), $$8.y(), $$8.z(), 1.0F, 1.0F, 1.0F, $$2, $$6, $$7, goo.d, 15728880, 0.0F, 1.0F, 0.0F);
   }

   public void a(@Nullable dbw $$0) {
      this.j = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   public double b(bss $$0) {
      return this.b.b().g($$0.dn());
   }

   public double a(double $$0, double $$1, double $$2) {
      return this.b.b().c($$0, $$1, $$2);
   }

   public Quaternionf b() {
      return this.k;
   }

   public gdi d() {
      return this.n;
   }

   @Override
   public void a(auo $$0) {
      giv.a $$1 = new giv.a(this, this.l, this.m, this.n, $$0, this.p, this.o);
      this.h = giw.a($$1);
      this.i = giw.b($$1);
   }
}
