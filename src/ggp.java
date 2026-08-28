import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ggp extends ggt {
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
   private static final ewh k = new ewh(0.0, -0.32F, 0.073F);
   private final Map<dty, ggp.a> l;

   public ggp(ggg.a $$0) {
      super($$0);
      this.l = dty.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new ggp.a($$0.a(fxp.b($$1)))));
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
   public void a(drb $$0, float $$1, fao $$2, gef $$3, int $$4, int $$5) {
      dsl $$6 = $$0.n();
      dmi $$7 = (dmi)$$6.b();
      dty $$8 = dmi.a($$7);
      ggp.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(fao $$0, float $$1, dsl $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(fao $$0, int $$1, int $$2, fvm $$3, fas $$4) {
      ggp.a $$5 = (ggp.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gru a(dty $$0) {
      return geu.b($$0);
   }

   @Override
   ewh d() {
      return k;
   }

   public static fxw e() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      $$1.a("board", fxv.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fxs.a);
      $$1.a("plank", fxv.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fxs.a);
      fxz $$2 = $$1.a("normalChains", fxv.c(), fxs.a);
      $$2.a("chainL1", fxv.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxs.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fxv.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxs.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fxv.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxs.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fxv.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxs.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fxv.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fxs.a);
      return fxw.a($$0, 64, 32);
   }

   public static final class a extends fvm {
      public final fxq a;
      public final fxq b;
      public final fxq c;
      public final fxq d;

      public a(fxq $$0) {
         super(gen::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dsl $$0) {
         boolean $$1 = !($$0.b() instanceof dgh);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dtb.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(fao $$0, fas $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
