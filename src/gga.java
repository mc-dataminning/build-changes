import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class gga implements gfm<dqp> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = ayx.h(16);
   private static final float d = 0.6666667F;
   private static final evp e = new evp(0.0, 0.33333334F, 0.046666667F);
   private final Map<dtn, gga.a> f;
   private final fgn g;

   public gga(gfn.a $$0) {
      this.f = dtn.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gga.a($$0.a(fwx.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dqp $$0, float $$1, ezw $$2, gdm $$3, int $$4, int $$5) {
      dsa $$6 = $$0.n();
      dlx $$7 = (dlx)$$6.b();
      dtn $$8 = dlx.a($$7);
      gga.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dms;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dqp $$0, ezw $$1, gdm $$2, int $$3, int $$4, dsa $$5, dlx $$6, dtn $$7, fuu $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.az_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.az_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(ezw $$0, float $$1, dsa $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dms)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(ezw $$0, gdm $$1, int $$2, int $$3, dtn $$4, fuu $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      grb $$7 = this.a($$4);
      faa $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(ezw $$0, int $$1, int $$2, fuu $$3, faa $$4) {
      gga.a $$5 = (gga.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   grb a(dtn $$0) {
      return geb.a($$0);
   }

   void a(iz $$0, dqq $$1, ezw $$2, gdm $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ayj[] $$10 = $$1.a(ffd.Q().aS(), $$1x -> {
         List<ayj> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? ayj.a : $$2x.get(0);
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
         ayj $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fgn.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(ezw $$0, boolean $$1, evp $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   evp d() {
      return e;
   }

   static boolean a(iz $$0, int $$1) {
      if ($$1 == ctg.p.g()) {
         return true;
      } else {
         ffd $$2 = ffd.Q();
         gco $$3 = $$2.s;
         if ($$3 != null && $$2.m.aA().a() && $$3.gA()) {
            return true;
         } else {
            bss $$4 = $$2.an();
            return $$4 != null && $$4.f(evp.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dqq $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == ctg.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)ayh.b.b($$1) * 0.4);
         int $$4 = (int)((double)ayh.b.c($$1) * 0.4);
         int $$5 = (int)((double)ayh.b.d($$1) * 0.4);
         return ayh.b.a(0, $$3, $$4, $$5);
      }
   }

   public static gga.a a(fwu $$0, dtn $$1) {
      return new gga.a($$0.a(fwx.a($$1)));
   }

   public static fxe f() {
      fxg $$0 = new fxg();
      fxh $$1 = $$0.a();
      $$1.a("sign", fxd.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fxa.a);
      $$1.a("stick", fxd.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fxa.a);
      return fxe.a($$0, 64, 32);
   }

   public static final class a extends fuu {
      public final fwy a;
      public final fwy b;

      public a(fwy $$0) {
         super(gdu::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(ezw $$0, faa $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
