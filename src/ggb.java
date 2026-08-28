import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class ggb implements gfn<dqq> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = ayy.h(16);
   private static final float d = 0.6666667F;
   private static final evq e = new evq(0.0, 0.33333334F, 0.046666667F);
   private final Map<dto, ggb.a> f;
   private final fgo g;

   public ggb(gfo.a $$0) {
      this.f = dto.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new ggb.a($$0.a(fwy.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dqq $$0, float $$1, ezx $$2, gdn $$3, int $$4, int $$5) {
      dsb $$6 = $$0.n();
      dly $$7 = (dly)$$6.b();
      dto $$8 = dly.a($$7);
      ggb.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dmt;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dqq $$0, ezx $$1, gdn $$2, int $$3, int $$4, dsb $$5, dly $$6, dto $$7, fuv $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.ay_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.ay_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   void a(ezx $$0, float $$1, dsb $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dmt)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(ezx $$0, gdn $$1, int $$2, int $$3, dto $$4, fuv $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      grc $$7 = this.a($$4);
      fab $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(ezx $$0, int $$1, int $$2, fuv $$3, fab $$4) {
      ggb.a $$5 = (ggb.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   grc a(dto $$0) {
      return gec.a($$0);
   }

   void a(iz $$0, dqr $$1, ezx $$2, gdn $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ayk[] $$10 = $$1.a(ffe.Q().aS(), $$1x -> {
         List<ayk> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? ayk.a : $$2x.get(0);
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
         ayk $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fgo.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(ezx $$0, boolean $$1, evq $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   evq d() {
      return e;
   }

   static boolean a(iz $$0, int $$1) {
      if ($$1 == cth.p.g()) {
         return true;
      } else {
         ffe $$2 = ffe.Q();
         gcp $$3 = $$2.s;
         if ($$3 != null && $$2.m.aA().a() && $$3.gA()) {
            return true;
         } else {
            bst $$4 = $$2.an();
            return $$4 != null && $$4.f(evq.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dqr $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cth.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)ayi.b.b($$1) * 0.4);
         int $$4 = (int)((double)ayi.b.c($$1) * 0.4);
         int $$5 = (int)((double)ayi.b.d($$1) * 0.4);
         return ayi.b.a(0, $$3, $$4, $$5);
      }
   }

   public static ggb.a a(fwv $$0, dto $$1) {
      return new ggb.a($$0.a(fwy.a($$1)));
   }

   public static fxf f() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      $$1.a("sign", fxe.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fxb.a);
      $$1.a("stick", fxe.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fxb.a);
      return fxf.a($$0, 64, 32);
   }

   public static final class a extends fuv {
      public final fwz a;
      public final fwz b;

      public a(fwz $$0) {
         super(gdv::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(ezx $$0, fab $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
