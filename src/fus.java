import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fus extends fuw {
   private static final String a = "plank";
   private static final String b = "vChains";
   private static final String c = "normalChains";
   private static final String d = "chainL1";
   private static final String e = "chainL2";
   private static final String f = "chainR1";
   private static final String g = "chainR2";
   private static final String h = "board";
   private static final float i = 1.0F;
   private static final float j = 0.9F;
   private static final elb k = new elb(0.0, -0.32F, 0.073F);
   private final Map<dkc, fus.a> l;

   public fus(fuj.a $$0) {
      super($$0);
      this.l = dkc.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fus.a($$0.a(flx.b($$1)))));
   }

   @Override
   public float b() {
      return 1.0F;
   }

   @Override
   public float c() {
      return 0.9F;
   }

   @Override
   public void a(dhm $$0, float $$1, epd $$2, fsi $$3, int $$4, int $$5) {
      dip $$6 = $$0.r();
      dcy $$7 = (dcy)$$6.b();
      dkc $$8 = dcy.a($$7);
      fus.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(epd $$0, float $$1, dip $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(epd $$0, int $$1, int $$2, fju $$3, eph $$4) {
      fus.a $$5 = (fus.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gfs a(dkc $$0) {
      return fsx.b($$0);
   }

   @Override
   elb d() {
      return k;
   }

   public static fme e() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      $$1.a("board", fmd.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fma.a);
      $$1.a("plank", fmd.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fma.a);
      fmh $$2 = $$1.a("normalChains", fmd.c(), fma.a);
      $$2.a("chainL1", fmd.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fma.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fmd.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fma.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fmd.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fma.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fmd.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fma.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fmd.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fma.a);
      return fme.a($$0, 64, 32);
   }

   public static final class a extends fju {
      public final fly a;
      public final fly b;
      public final fly c;
      public final fly d;

      public a(fly $$0) {
         super(fsq::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dip $$0) {
         boolean $$1 = !($$0.b() instanceof cwy);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(djf.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(epd $$0, eph $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
