import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fvr extends fvv {
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
   private static final elt k = new elt(0.0, -0.32F, 0.073F);
   private final Map<dku, fvr.a> l;

   public fvr(fvi.a $$0) {
      super($$0);
      this.l = dku.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fvr.a($$0.a(fmw.b($$1)))));
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
   public void a(die $$0, float $$1, eqb $$2, fth $$3, int $$4, int $$5) {
      djh $$6 = $$0.r();
      ddp $$7 = (ddp)$$6.b();
      dku $$8 = ddp.a($$7);
      fvr.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(eqb $$0, float $$1, djh $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(eqb $$0, int $$1, int $$2, fkt $$3, eqf $$4) {
      fvr.a $$5 = (fvr.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   ggq a(dku $$0) {
      return ftw.b($$0);
   }

   @Override
   elt d() {
      return k;
   }

   public static fnd e() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      $$1.a("board", fnc.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fmz.a);
      $$1.a("plank", fnc.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fmz.a);
      fng $$2 = $$1.a("normalChains", fnc.c(), fmz.a);
      $$2.a("chainL1", fnc.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fmz.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fnc.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fmz.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fnc.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fmz.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fnc.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fmz.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fnc.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fmz.a);
      return fnd.a($$0, 64, 32);
   }

   public static final class a extends fkt {
      public final fmx a;
      public final fmx b;
      public final fmx c;
      public final fmx d;

      public a(fmx $$0) {
         super(ftp::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(djh $$0) {
         boolean $$1 = !($$0.b() instanceof cxp);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(djx.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(eqb $$0, eqf $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
