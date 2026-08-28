import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gxt implements avp {
   private static final gry e = gry.o(alr.b("textures/misc/shadow.png"));
   private static final float f = 32.0F;
   private static final float g = 0.5F;
   private Map<bxn<?>, gxu<?, ?>> h = ImmutableMap.of();
   private Map<hls.a, gxu<? extends csi, ?>> i = Map.of();
   public final hks a;
   private dkj j;
   public fpy b;
   private Quaternionf k;
   public bxe c;
   private final hhg l;
   private final grl m;
   private final gsq n;
   private final grg o;
   private final fti p;
   public final fqu d;
   private final Supplier<gkn> q;
   private final hmv r;
   private boolean s = true;
   private boolean t;

   public <E extends bxe> int a(E $$0, float $$1) {
      return this.a($$0).a($$0, $$1);
   }

   public gxt(fqq $$0, hks $$1, hhg $$2, gyt $$3, grl $$4, gsq $$5, fti $$6, fqu $$7, Supplier<gkn> $$8, hmv $$9) {
      this.a = $$1;
      this.l = $$2;
      this.m = $$4;
      this.o = new grg($$0, this, $$3, $$2);
      this.n = $$5;
      this.p = $$6;
      this.d = $$7;
      this.q = $$8;
      this.r = $$9;
   }

   public <T extends bxe> gxu<? super T, ?> a(T $$0) {
      if ($$0 instanceof gqj $$1) {
         hls.a $$2 = $$1.c().e();
         gxu<? extends csi, ?> $$3 = this.i.get($$2);
         return (gxu<? super T, ?>)($$3 != null ? $$3 : this.i.get(hls.a.b));
      } else {
         return (gxu<? super T, ?>)this.h.get($$0.an());
      }
   }

   public <S extends hec> gxu<?, ? super S> a(S $$0) {
      if ($$0 instanceof hfq $$1) {
         hls.a $$2 = $$1.a.e();
         gxu<? extends csi, ?> $$3 = this.i.get($$2);
         return (gxu<?, ? super S>)($$3 != null ? $$3 : (gxu)this.i.get(hls.a.b));
      } else {
         return (gxu<?, ? super S>)this.h.get($$0.r);
      }
   }

   public void a(dkj $$0, fpy $$1, bxe $$2) {
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

   public <E extends bxe> boolean a(E $$0, gvh $$1, double $$2, double $$3, double $$4) {
      gxu<? super E, ?> $$5 = this.a($$0);
      return $$5.a($$0, $$1, $$2, $$3, $$4);
   }

   public <E extends bxe> void a(E $$0, double $$1, double $$2, double $$3, float $$4, fld $$5, grn $$6, int $$7) {
      gxu<? super E, ?> $$8 = this.a($$0);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   private <E extends bxe, S extends hec> void a(E $$0, double $$1, double $$2, double $$3, float $$4, fld $$5, grn $$6, int $$7, gxu<? super E, S> $$8) {
      S $$9;
      try {
         $$9 = $$8.b($$0, $$4);
      } catch (Throwable var19) {
         p $$11 = p.a(var19, "Extracting render state for an entity in world");
         q $$12 = $$11.a("Entity being extracted");
         $$0.a($$12);
         q $$13 = this.a($$1, $$2, $$3, $$8, $$11);
         $$13.a("Delta", $$4);
         throw new aa($$11);
      }

      try {
         this.a($$9, $$1, $$2, $$3, $$5, $$6, $$7, $$8);
      } catch (Throwable var18) {
         p $$16 = p.a(var18, "Rendering entity in world");
         q $$17 = $$16.a("Entity being rendered");
         $$0.a($$17);
         throw new aa($$16);
      }
   }

   public <S extends hec> void a(S $$0, double $$1, double $$2, double $$3, fld $$4, grn $$5, int $$6) {
      gxu<?, ? super S> $$7 = this.a($$0);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private <S extends hec> void a(S $$0, double $$1, double $$2, double $$3, fld $$4, grn $$5, int $$6, gxu<?, S> $$7) {
      try {
         fgc $$8 = $$7.a($$0);
         double $$9 = $$1 + $$8.a();
         double $$10 = $$2 + $$8.b();
         double $$11 = $$3 + $$8.c();
         $$4.a();
         $$4.a($$9, $$10, $$11);
         $$7.a($$0, $$4, $$5, $$6);
         if ($$0.C) {
            this.a($$4, $$5, $$0, azz.a(azz.h, this.k, new Quaternionf()));
         }

         if ($$0 instanceof hfq) {
            $$4.a(-$$8.a(), -$$8.b(), -$$8.c());
         }

         if (this.d.R().c() && this.s && !$$0.A) {
            float $$12 = $$7.c($$0);
            if ($$12 > 0.0F) {
               double $$13 = $$0.z;
               float $$14 = (float)((1.0 - $$13 / 256.0) * (double)$$7.b($$0));
               if ($$14 > 0.0F) {
                  a($$4, $$5, $$0, $$14, this.j, Math.min($$12, 32.0F));
               }
            }
         }

         if (!($$0 instanceof hfq)) {
            $$4.a(-$$8.a(), -$$8.b(), -$$8.c());
         }

         if ($$0.H != null) {
            this.a($$4, $$0, $$0.H, $$5);
         }

         $$4.b();
      } catch (Throwable var23) {
         p $$16 = p.a(var23, "Rendering entity in world");
         q $$17 = $$16.a("EntityRenderState being rendered");
         $$0.a($$17);
         this.a($$1, $$2, $$3, $$7, $$16);
         throw new aa($$16);
      }
   }

   private <S extends hec> q a(double $$0, double $$1, double $$2, gxu<?, S> $$3, p $$4) {
      q $$5 = $$4.a("Renderer details");
      $$5.a("Assigned renderer", $$3);
      $$5.a("Location", q.a(this.j, $$0, $$1, $$2));
      return $$5;
   }

   private void a(fld $$0, hec $$1, her $$2, grn $$3) {
      flg $$4 = $$3.getBuffer(gry.w());
      a($$0, $$2, $$4, $$1.y);
      hfw $$5 = $$1.I;
      if ($$5 != null) {
         if ($$5.a()) {
            heq $$6 = (heq)$$2.d().getFirst();
            gvq.a($$0, $$3, "Missing", $$1.s, $$6.e() + 1.5, $$1.u, -65536);
         } else if ($$5.i() != null) {
            $$0.a();
            $$0.a($$5.b() - $$1.s, $$5.c() - $$1.t, $$5.d() - $$1.u);
            a($$0, $$5.i(), $$4, $$5.h());
            fgc $$7 = new fgc($$5.e(), $$5.f(), $$5.g());
            gsg.a($$0, $$4, new Vector3f(), $$7, -256);
            $$0.b();
         }
      }
   }

   private static void a(fld $$0, her $$1, flg $$2, float $$3) {
      UnmodifiableIterator $$5 = $$1.d().iterator();

      while ($$5.hasNext()) {
         heq $$4 = (heq)$$5.next();
         a($$0, $$2, $$4);
      }

      fgc $$5x = new fgc($$1.a(), $$1.b(), $$1.c());
      gsg.a($$0, $$2, new Vector3f(0.0F, $$3, 0.0F), $$5x.c(2.0), -16776961);
   }

   private static void a(fld $$0, flg $$1, heq $$2) {
      $$0.a();
      $$0.a($$2.g(), $$2.h(), $$2.i());
      gsg.a($$0, $$1, $$2.a(), $$2.b(), $$2.c(), $$2.d(), $$2.e(), $$2.f(), $$2.j(), $$2.k(), $$2.l(), 1.0F);
      $$0.b();
   }

   private void a(fld $$0, grn $$1, hec $$2, Quaternionf $$3) {
      hkq $$4 = hna.a.c();
      hkq $$5 = hna.b.c();
      $$0.a();
      float $$6 = $$2.w * 1.4F;
      $$0.b($$6, $$6, $$6);
      float $$7 = 0.5F;
      float $$8 = 0.0F;
      float $$9 = $$2.x / $$6;
      float $$10 = 0.0F;
      $$0.a($$3);
      $$0.a(0.0F, 0.0F, 0.3F - (float)((int)$$9) * 0.02F);
      float $$11 = 0.0F;
      int $$12 = 0;
      flg $$13 = $$1.getBuffer(gsh.i());

      for (fld.a $$14 = $$0.c(); $$9 > 0.0F; $$12++) {
         hkq $$15 = $$12 % 2 == 0 ? $$4 : $$5;
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

   private static void a(fld.a $$0, flg $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      $$1.a($$0, $$2, $$3, $$4).a(-1).a($$5, $$6).a(0, 10).c(240).b($$0, 0.0F, 1.0F, 0.0F);
   }

   private static void a(fld $$0, grn $$1, hec $$2, float $$3, dkm $$4, float $$5) {
      float $$6 = Math.min($$3 / 0.5F, $$5);
      int $$7 = azz.a($$2.s - (double)$$5);
      int $$8 = azz.a($$2.s + (double)$$5);
      int $$9 = azz.a($$2.t - (double)$$6);
      int $$10 = azz.a($$2.t);
      int $$11 = azz.a($$2.u - (double)$$5);
      int $$12 = azz.a($$2.u + (double)$$5);
      fld.a $$13 = $$0.c();
      flg $$14 = $$1.getBuffer(e);
      iw.a $$15 = new iw.a();

      for (int $$16 = $$11; $$16 <= $$12; $$16++) {
         for (int $$17 = $$7; $$17 <= $$8; $$17++) {
            $$15.d($$17, 0, $$16);
            edn $$18 = $$4.z($$15);

            for (int $$19 = $$9; $$19 <= $$10; $$19++) {
               $$15.q($$19);
               float $$20 = $$3 - (float)($$2.t - (double)$$15.v()) * 0.5F;
               a($$13, $$14, $$18, $$4, $$15, $$2.s, $$2.t, $$2.u, $$5, $$20);
            }
         }
      }
   }

   private static void a(fld.a $$0, flg $$1, edn $$2, dkm $$3, iw $$4, double $$5, double $$6, double $$7, float $$8, float $$9) {
      iw $$10 = $$4.e();
      ebq $$11 = $$2.a_($$10);
      if ($$11.o() != dub.a && $$3.B($$4) > 3) {
         if ($$11.m($$2, $$10)) {
            fgw $$12 = $$11.f($$2, $$10);
            if (!$$12.c()) {
               float $$13 = grk.a($$3.F_(), $$3.B($$4));
               float $$14 = $$9 * 0.5F * $$13;
               if ($$14 >= 0.0F) {
                  if ($$14 > 1.0F) {
                     $$14 = 1.0F;
                  }

                  int $$15 = ayh.a(azz.d($$14 * 255.0F), 255, 255, 255);
                  ffx $$16 = $$12.a();
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

   private static void a(fld.a $$0, flg $$1, int $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      Vector3f $$8 = $$0.a().transformPosition($$3, $$4, $$5, new Vector3f());
      $$1.a($$8.x(), $$8.y(), $$8.z(), $$2, $$6, $$7, hkg.d, 15728880, 0.0F, 1.0F, 0.0F);
   }

   public void a(@Nullable dkj $$0) {
      this.j = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   public double b(bxe $$0) {
      return this.b.b().g($$0.dt());
   }

   public double a(double $$0, double $$1, double $$2) {
      return this.b.b().c($$0, $$1, $$2);
   }

   public Quaternionf b() {
      return this.k;
   }

   public grg c() {
      return this.o;
   }

   @Override
   public void a(avo $$0) {
      gxv.a $$1 = new gxv.a(this, this.l, this.m, this.n, $$0, this.q.get(), this.r, this.p);
      this.h = gxw.a($$1);
      this.i = gxw.b($$1);
   }
}
