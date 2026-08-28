import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gfy extends ggc {
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
   private static final evr k = new evr(0.0, -0.32F, 0.073F);
   private final Map<dtp, gfy.a> l;

   public gfy(gfp.a $$0) {
      super($$0);
      this.l = dtp.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gfy.a($$0.a(fwz.b($$1)))));
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
   public void a(dqr $$0, float $$1, ezy $$2, gdo $$3, int $$4, int $$5) {
      dsc $$6 = $$0.n();
      dlz $$7 = (dlz)$$6.b();
      dtp $$8 = dlz.a($$7);
      gfy.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(ezy $$0, float $$1, dsc $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(ezy $$0, int $$1, int $$2, fuw $$3, fac $$4) {
      gfy.a $$5 = (gfy.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   grd a(dtp $$0) {
      return ged.b($$0);
   }

   @Override
   evr d() {
      return k;
   }

   public static fxg e() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      $$1.a("board", fxf.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fxc.a);
      $$1.a("plank", fxf.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fxc.a);
      fxj $$2 = $$1.a("normalChains", fxf.c(), fxc.a);
      $$2.a("chainL1", fxf.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxc.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fxf.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxc.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fxf.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxc.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fxf.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxc.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fxf.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fxc.a);
      return fxg.a($$0, 64, 32);
   }

   public static final class a extends fuw {
      public final fxa a;
      public final fxa b;
      public final fxa c;
      public final fxa d;

      public a(fxa $$0) {
         super(gdw::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dsc $$0) {
         boolean $$1 = !($$0.b() instanceof dfy);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dss.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(ezy $$0, fac $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
