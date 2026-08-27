import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gcz implements asp {
   private static final fya e = fya.n(new ajh("textures/misc/shadow.png"));
   private static final float f = 32.0F;
   private static final float g = 0.5F;
   private Map<bpd<?>, gda<?>> h = ImmutableMap.of();
   private Map<gkb.a, gda<? extends ciu>> i = Map.of();
   public final gjd a;
   private cxb j;
   public eyt b;
   private Quaternionf k;
   public box c;
   private final gdz l;
   private final fym m;
   private final fxo n;
   private final fat o;
   public final ezm d;
   private final frb p;
   private boolean q = true;
   private boolean r;

   public <E extends box> int a(E $$0, float $$1) {
      return this.a($$0).b($$0, $$1);
   }

   public gcz(ezi $$0, gjd $$1, gdz $$2, fym $$3, fat $$4, ezm $$5, frb $$6) {
      this.a = $$1;
      this.l = $$2;
      this.n = new fxo($$0, this, $$2);
      this.m = $$3;
      this.o = $$4;
      this.d = $$5;
      this.p = $$6;
   }

   public <T extends box> gda<? super T> a(T $$0) {
      if ($$0 instanceof fwr $$1) {
         gkb.a $$2 = $$1.b().e();
         gda<? extends ciu> $$3 = this.i.get($$2);
         return (gda<? super T>)($$3 != null ? $$3 : this.i.get(gkb.a.b));
      } else {
         return (gda<? super T>)this.h.get($$0.ai());
      }
   }

   public void a(cxb $$0, eyt $$1, box $$2) {
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

   public <E extends box> boolean a(E $$0, gaw $$1, double $$2, double $$3, double $$4) {
      gda<? super E> $$5 = this.a($$0);
      return $$5.a($$0, $$1, $$2, $$3, $$4);
   }

   public <E extends box> void a(E $$0, double $$1, double $$2, double $$3, float $$4, float $$5, eub $$6, fxs $$7, int $$8) {
      gda<? super E> $$9 = this.a($$0);

      try {
         ept $$10 = $$9.a($$0, $$5);
         double $$11 = $$1 + $$10.a();
         double $$12 = $$2 + $$10.b();
         double $$13 = $$3 + $$10.c();
         $$6.a();
         $$6.a($$11, $$12, $$13);
         $$9.a($$0, $$4, $$5, $$6, $$7, $$8);
         if ($$0.cv()) {
            this.a($$6, $$7, $$0, aww.a(aww.h, this.k, new Quaternionf()));
         }

         $$6.a(-$$10.a(), -$$10.b(), -$$10.c());
         if (this.d.M().c() && this.q && !$$0.ce()) {
            float $$14 = $$9.c($$0);
            if ($$14 > 0.0F) {
               double $$15 = this.a($$0.dr(), $$0.dt(), $$0.dx());
               float $$16 = (float)((1.0 - $$15 / 256.0) * (double)$$9.e);
               if ($$16 > 0.0F) {
                  a($$6, $$7, $$0, $$16, $$5, this.j, Math.min($$14, 32.0F));
               }
            }
         }

         if (this.r && !$$0.ce() && !ezi.Q().ax()) {
            a($$6, $$7.getBuffer(fya.y()), $$0, $$5);
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

   private static void a(eub $$0, euf $$1, box $$2, float $$3) {
      epo $$4 = $$2.cH().d(-$$2.dr(), -$$2.dt(), -$$2.dx());
      fxq.a($$0, $$1, $$4, 1.0F, 1.0F, 1.0F, 1.0F);
      if ($$2 instanceof cdy) {
         double $$5 = -aww.d((double)$$3, $$2.ac, $$2.dr());
         double $$6 = -aww.d((double)$$3, $$2.ad, $$2.dt());
         double $$7 = -aww.d((double)$$3, $$2.ae, $$2.dx());

         for (cdw $$8 : ((cdy)$$2).gj()) {
            $$0.a();
            double $$9 = $$5 + aww.d((double)$$3, $$8.ac, $$8.dr());
            double $$10 = $$6 + aww.d((double)$$3, $$8.ad, $$8.dt());
            double $$11 = $$7 + aww.d((double)$$3, $$8.ae, $$8.dx());
            $$0.a($$9, $$10, $$11);
            fxq.a($$0, $$1, $$8.cH().d(-$$8.dr(), -$$8.dt(), -$$8.dx()), 0.25F, 1.0F, 0.0F, 1.0F);
            $$0.b();
         }
      }

      if ($$2 instanceof bpp) {
         float $$12 = 0.01F;
         fxq.a($$0, $$1, $$4.a, (double)($$2.cI() - 0.01F), $$4.c, $$4.d, (double)($$2.cI() + 0.01F), $$4.f, 1.0F, 0.0F, 0.0F, 1.0F);
      }

      box $$13 = $$2.cZ();
      if ($$13 != null) {
         float $$14 = Math.min($$13.dg(), $$2.dg()) / 2.0F;
         float $$15 = 0.0625F;
         ept $$16 = $$13.m($$2).d($$2.dk());
         fxq.a(
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

      ept $$17 = $$2.f($$3);
      eub.a $$18 = $$0.c();
      $$1.a($$18, 0.0F, $$2.cI(), 0.0F).a(0, 0, 255, 255).b($$18, (float)$$17.c, (float)$$17.d, (float)$$17.e).e();
      $$1.a($$18, (float)($$17.c * 2.0), (float)((double)$$2.cI() + $$17.d * 2.0), (float)($$17.e * 2.0))
         .a(0, 0, 255, 255)
         .b($$18, (float)$$17.c, (float)$$17.d, (float)$$17.e)
         .e();
   }

   private void a(eub $$0, fxs $$1, box $$2, Quaternionf $$3) {
      gjc $$4 = glh.a.c();
      gjc $$5 = glh.b.c();
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
      euf $$13 = $$1.getBuffer(fyh.i());

      for (eub.a $$14 = $$0.c(); $$9 > 0.0F; $$12++) {
         gjc $$15 = $$12 % 2 == 0 ? $$4 : $$5;
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

   private static void a(eub.a $$0, euf $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      $$1.a($$0, $$2, $$3, $$4).a(255, 255, 255, 255).a($$5, $$6).a(0, 10).b(240).b($$0, 0.0F, 1.0F, 0.0F).e();
   }

   private static void a(eub $$0, fxs $$1, box $$2, float $$3, float $$4, cxe $$5, float $$6) {
      double $$7 = aww.d((double)$$4, $$2.ac, $$2.dr());
      double $$8 = aww.d((double)$$4, $$2.ad, $$2.dt());
      double $$9 = aww.d((double)$$4, $$2.ae, $$2.dx());
      float $$10 = Math.min($$3 / 0.5F, $$6);
      int $$11 = aww.a($$7 - (double)$$6);
      int $$12 = aww.a($$7 + (double)$$6);
      int $$13 = aww.a($$8 - (double)$$10);
      int $$14 = aww.a($$8);
      int $$15 = aww.a($$9 - (double)$$6);
      int $$16 = aww.a($$9 + (double)$$6);
      eub.a $$17 = $$0.c();
      euf $$18 = $$1.getBuffer(e);
      ib.a $$19 = new ib.a();

      for (int $$20 = $$15; $$20 <= $$16; $$20++) {
         for (int $$21 = $$11; $$21 <= $$12; $$21++) {
            $$19.d($$21, 0, $$20);
            dox $$22 = $$5.y($$19);

            for (int $$23 = $$13; $$23 <= $$14; $$23++) {
               $$19.q($$23);
               float $$24 = $$3 - (float)($$8 - (double)$$19.v()) * 0.5F;
               a($$17, $$18, $$22, $$5, $$19, $$7, $$8, $$9, $$6, $$24);
            }
         }
      }
   }

   private static void a(eub.a $$0, euf $$1, dox $$2, cxe $$3, ib $$4, double $$5, double $$6, double $$7, float $$8, float $$9) {
      ib $$10 = $$4.d();
      dnb $$11 = $$2.a_($$10);
      if ($$11.l() != dgh.a && $$3.A($$4) > 3) {
         if ($$11.r($$2, $$10)) {
            eqm $$12 = $$11.j($$2, $$10);
            if (!$$12.c()) {
               float $$13 = fxr.a($$3.D_(), $$3.A($$4));
               float $$14 = $$9 * 0.5F * $$13;
               if ($$14 >= 0.0F) {
                  if ($$14 > 1.0F) {
                     $$14 = 1.0F;
                  }

                  epo $$15 = $$12.a();
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

   private static void a(eub.a $$0, euf $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      Vector3f $$8 = $$0.a().transformPosition($$3, $$4, $$5, new Vector3f());
      $$1.a($$8.x(), $$8.y(), $$8.z(), 1.0F, 1.0F, 1.0F, $$2, $$6, $$7, git.d, 15728880, 0.0F, 1.0F, 0.0F);
   }

   public void a(@Nullable cxb $$0) {
      this.j = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   public double b(box $$0) {
      return this.b.b().g($$0.dk());
   }

   public double a(double $$0, double $$1, double $$2) {
      return this.b.b().c($$0, $$1, $$2);
   }

   public Quaternionf b() {
      return this.k;
   }

   public fxo d() {
      return this.n;
   }

   @Override
   public void a(aso $$0) {
      gdb.a $$1 = new gdb.a(this, this.l, this.m, this.n, $$0, this.p, this.o);
      this.h = gdc.a($$1);
      this.i = gdc.b($$1);
   }
}
