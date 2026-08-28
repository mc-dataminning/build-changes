import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gof implements gnr<dwd> {
   private static final int a = -988212;
   private static final int b = azu.h(16);
   private static final float c = 0.6666667F;
   private static final fbr d = new fbr(0.0, 0.33333334F, 0.046666667F);
   private final Map<dza, gof.a> e;
   private final fnj f;

   public gof(gns.a $$0) {
      this.e = dza.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gof.a(a($$0.e(), $$1, true), a($$0.e(), $$1, false))));
      this.f = $$0.f();
   }

   public void a(dwd $$0, float $$1, fgl $$2, glg $$3, int $$4, int $$5) {
      dxo $$6 = $$0.m();
      dri $$7 = (dri)$$6.b();
      dza $$8 = dri.a($$7);
      gof.a $$9 = this.e.get($$8);
      gcc $$10 = $$6.b() instanceof dsd ? $$9.a() : $$9.b();
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dwd $$0, fgl $$1, glg $$2, int $$3, int $$4, dxo $$5, dri $$6, dza $$7, gcc $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aB_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aB_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fgl $$0, float $$1, dxo $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dsd)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fgl $$0, glg $$1, int $$2, int $$3, dza $$4, gcc $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      hdp $$7 = this.a($$4);
      fgp $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   hdp a(dza $$0) {
      return gmb.a($$0);
   }

   void a(jh $$0, dwe $$1, fgl $$2, glg $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      azg[] $$10 = $$1.a(flz.Q().aU(), $$1x -> {
         List<azg> $$2x = this.f.c($$1x, $$6);
         return $$2x.isEmpty() ? azg.a : $$2x.get(0);
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
         azg $$18 = $$10[$$17];
         float $$19 = (float)(-this.f.a($$18) / 2);
         if ($$12) {
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fnj.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fgl $$0, boolean $$1, fbr $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   fbr d() {
      return d;
   }

   static boolean a(jh $$0, int $$1) {
      if ($$1 == cwd.p.g()) {
         return true;
      } else {
         flz $$2 = flz.Q();
         gkc $$3 = $$2.t;
         if ($$3 != null && $$2.n.aE().a() && $$3.gH()) {
            return true;
         } else {
            bvb $$4 = $$2.ao();
            return $$4 != null && $$4.f(fbr.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dwe $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cwd.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)ayf.b($$1) * 0.4);
         int $$4 = (int)((double)ayf.c($$1) * 0.4);
         int $$5 = (int)((double)ayf.d($$1) * 0.4);
         return ayf.a(0, $$3, $$4, $$5);
      }
   }

   public static gcc a(gef $$0, dza $$1, boolean $$2) {
      geh $$3 = $$2 ? gei.a($$1) : gei.b($$1);
      return new gcc.a($$0.a($$3), glq::g);
   }

   public static gep a(boolean $$0) {
      ger $$1 = new ger();
      get $$2 = $$1.a();
      $$2.a("sign", geo.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gel.a);
      if ($$0) {
         $$2.a("stick", geo.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gel.a);
      }

      return gep.a($$1, 64, 32);
   }

   static record a(gcc a, gcc b) {
   }
}
