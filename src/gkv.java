import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gkv implements gkh<dts> {
   private static final int a = -988212;
   private static final int b = azj.h(16);
   private static final float c = 0.6666667F;
   private static final ezh d = new ezh(0.0, 0.33333334F, 0.046666667F);
   private final Map<dwq, gkv.a> e;
   private final fkk f;

   public gkv(gki.a $$0) {
      this.e = dwq.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gkv.a(a($$0.e(), $$1, true), a($$0.e(), $$1, false))));
      this.f = $$0.f();
   }

   public void a(dts $$0, float $$1, fdt $$2, ghw $$3, int $$4, int $$5) {
      dvd $$6 = $$0.m();
      doy $$7 = (doy)$$6.b();
      dwq $$8 = doy.a($$7);
      gkv.a $$9 = this.e.get($$8);
      fyu $$10 = $$6.b() instanceof dpt ? $$9.a() : $$9.b();
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dts $$0, fdt $$1, ghw $$2, int $$3, int $$4, dvd $$5, doy $$6, dwq $$7, fyu $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aC_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aC_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(fdt $$0, float $$1, dvd $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dpt)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(fdt $$0, ghw $$1, int $$2, int $$3, dwq $$4, fyu $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      hab $$7 = this.a($$4);
      fdx $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   hab a(dwq $$0) {
      return gir.a($$0);
   }

   void a(jg $$0, dtt $$1, fdt $$2, ghw $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ayv[] $$10 = $$1.a(fja.Q().aV(), $$1x -> {
         List<ayv> $$2x = this.f.c($$1x, $$6);
         return $$2x.isEmpty() ? ayv.a : $$2x.get(0);
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
         ayv $$18 = $$10[$$17];
         float $$19 = (float)(-this.f.a($$18) / 2);
         if ($$12) {
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.f.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fkk.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fdt $$0, boolean $$1, ezh $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   ezh d() {
      return d;
   }

   static boolean a(jg $$0, int $$1) {
      if ($$1 == cuu.p.g()) {
         return true;
      } else {
         fja $$2 = fja.Q();
         ggs $$3 = $$2.t;
         if ($$3 != null && $$2.n.aD().a() && $$3.gI()) {
            return true;
         } else {
            btz $$4 = $$2.ao();
            return $$4 != null && $$4.f(ezh.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dtt $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cuu.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axu.b($$1) * 0.4);
         int $$4 = (int)((double)axu.c($$1) * 0.4);
         int $$5 = (int)((double)axu.d($$1) * 0.4);
         return axu.a(0, $$3, $$4, $$5);
      }
   }

   public static fyu a(gax $$0, dwq $$1, boolean $$2) {
      gaz $$3 = $$2 ? gba.a($$1) : gba.b($$1);
      return new fyu.a($$0.a($$3), gig::f);
   }

   public static gbh a(boolean $$0) {
      gbj $$1 = new gbj();
      gbl $$2 = $$1.a();
      $$2.a("sign", gbg.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gbd.a);
      if ($$0) {
         $$2.a("stick", gbg.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gbd.a);
      }

      return gbh.a($$1, 64, 32);
   }

   static record a(fyu a, fyu b) {
   }
}
