import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gkf implements gjr<dte> {
   private static final int a = -988212;
   private static final int b = azd.h(16);
   private static final float c = 0.6666667F;
   private static final eys d = new eys(0.0, 0.33333334F, 0.046666667F);
   private final Map<dwb, gkf.a> e;
   private final fjv f;

   public gkf(gjs.a $$0) {
      this.e = dwb.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gkf.a(a($$0.e(), $$1, true), a($$0.e(), $$1, false))));
      this.f = $$0.f();
   }

   public void a(dte $$0, float $$1, fde $$2, ghg $$3, int $$4, int $$5) {
      duo $$6 = $$0.m();
      dok $$7 = (dok)$$6.b();
      dwb $$8 = dok.a($$7);
      gkf.a $$9 = this.e.get($$8);
      fyf $$10 = $$6.b() instanceof dpf ? $$9.a() : $$9.b();
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dte $$0, fde $$1, ghg $$2, int $$3, int $$4, duo $$5, dok $$6, dwb $$7, fyf $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aB_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aB_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fde $$0, float $$1, duo $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dpf)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fde $$0, ghg $$1, int $$2, int $$3, dwb $$4, fyf $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gzh $$7 = this.a($$4);
      fdi $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   gzh a(dwb $$0) {
      return gib.a($$0);
   }

   void a(je $$0, dtf $$1, fde $$2, ghg $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ayp[] $$10 = $$1.a(fil.Q().aU(), $$1x -> {
         List<ayp> $$2x = this.f.c($$1x, $$6);
         return $$2x.isEmpty() ? ayp.a : $$2x.get(0);
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
         ayp $$18 = $$10[$$17];
         float $$19 = (float)(-this.f.a($$18) / 2);
         if ($$12) {
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fjv.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fde $$0, boolean $$1, eys $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   eys d() {
      return d;
   }

   static boolean a(je $$0, int $$1) {
      if ($$1 == cuj.p.g()) {
         return true;
      } else {
         fil $$2 = fil.Q();
         ggc $$3 = $$2.t;
         if ($$3 != null && $$2.n.aD().a() && $$3.gA()) {
            return true;
         } else {
            bto $$4 = $$2.ao();
            return $$4 != null && $$4.f(eys.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dtf $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cuj.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axo.b($$1) * 0.4);
         int $$4 = (int)((double)axo.c($$1) * 0.4);
         int $$5 = (int)((double)axo.d($$1) * 0.4);
         return axo.a(0, $$3, $$4, $$5);
      }
   }

   public static fyf a(gah $$0, dwb $$1, boolean $$2) {
      gaj $$3 = $$2 ? gak.a($$1) : gak.b($$1);
      return new fyf.a($$0.a($$3), ghq::f);
   }

   public static gar a(boolean $$0) {
      gat $$1 = new gat();
      gav $$2 = $$1.a();
      $$2.a("sign", gaq.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gan.a);
      if ($$0) {
         $$2.a("stick", gaq.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gan.a);
      }

      return gar.a($$1, 64, 32);
   }

   static record a(fyf a, fyf b) {
   }
}
