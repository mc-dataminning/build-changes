import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gey implements gek<dpq> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = ayd.h(16);
   private static final float d = 0.6666667F;
   private static final euk e = new euk(0.0, 0.33333334F, 0.046666667F);
   private final Map<dso, gey.a> f;
   private final ffk g;

   public gey(gel.a $$0) {
      this.f = dso.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gey.a($$0.a(fvv.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dpq $$0, float $$1, eys $$2, gck $$3, int $$4, int $$5) {
      drb $$6 = $$0.n();
      dky $$7 = (dky)$$6.b();
      dso $$8 = dky.a($$7);
      gey.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dlt;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dpq $$0, eys $$1, gck $$2, int $$3, int $$4, drb $$5, dky $$6, dso $$7, fts $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.az_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.az_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(eys $$0, float $$1, drb $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dlt)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(eys $$0, gck $$1, int $$2, int $$3, dso $$4, fts $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gpz $$7 = this.a($$4);
      eyw $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(eys $$0, int $$1, int $$2, fts $$3, eyw $$4) {
      gey.a $$5 = (gey.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gpz a(dso $$0) {
      return gcz.a($$0);
   }

   void a(io $$0, dpr $$1, eys $$2, gck $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      axq[] $$10 = $$1.a(fdz.Q().aT(), $$1x -> {
         List<axq> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? axq.a : $$2x.get(0);
      });
      int $$11;
      boolean $$12;
      int $$13;
      if ($$1.a()) {
         $$11 = $$1.b().g();
         $$12 = a($$0, $$11);
         $$13 = 15728880;
      } else {
         $$11 = $$8;
         $$12 = false;
         $$13 = $$4;
      }

      for (int $$17 = 0; $$17 < 4; $$17++) {
         axq $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, ffk.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(eys $$0, boolean $$1, euk $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   euk d() {
      return e;
   }

   static boolean a(io $$0, int $$1) {
      if ($$1 == csh.p.g()) {
         return true;
      } else {
         fdz $$2 = fdz.Q();
         gbm $$3 = $$2.s;
         if ($$3 != null && $$2.m.aA().a() && $$3.gA()) {
            return true;
         } else {
            bru $$4 = $$2.ao();
            return $$4 != null && $$4.f(euk.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dpr $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == csh.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axo.b.b($$1) * 0.4);
         int $$4 = (int)((double)axo.b.c($$1) * 0.4);
         int $$5 = (int)((double)axo.b.d($$1) * 0.4);
         return axo.b.a(0, $$3, $$4, $$5);
      }
   }

   public static gey.a a(fvs $$0, dso $$1) {
      return new gey.a($$0.a(fvv.a($$1)));
   }

   public static fwc f() {
      fwe $$0 = new fwe();
      fwf $$1 = $$0.a();
      $$1.a("sign", fwb.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fvy.a);
      $$1.a("stick", fwb.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fvy.a);
      return fwc.a($$0, 64, 32);
   }

   public static final class a extends fts {
      public final fvw a;
      public final fvw b;

      public a(fvw $$0) {
         super(gcs::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(eys $$0, eyw $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
