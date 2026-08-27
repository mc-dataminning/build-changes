import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gcs extends gcw {
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
   private static final esj k = new esj(0.0, -0.32F, 0.073F);
   private final Map<dqv, gcs.a> l;

   public gcs(gcj.a $$0) {
      super($$0);
      this.l = dqv.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gcs.a($$0.a(ftu.b($$1)))));
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
   public void a(dny $$0, float $$1, ewr $$2, gai $$3, int $$4, int $$5) {
      dpi $$6 = $$0.n();
      djg $$7 = (djg)$$6.b();
      dqv $$8 = djg.a($$7);
      gcs.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(ewr $$0, float $$1, dpi $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(ewr $$0, int $$1, int $$2, frr $$3, ewv $$4) {
      gcs.a $$5 = (gcs.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gnv a(dqv $$0) {
      return gax.b($$0);
   }

   @Override
   esj d() {
      return k;
   }

   public static fub e() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      $$1.a("board", fua.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), ftx.a);
      $$1.a("plank", fua.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), ftx.a);
      fue $$2 = $$1.a("normalChains", fua.c(), ftx.a);
      $$2.a("chainL1", fua.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), ftx.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fua.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), ftx.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fua.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), ftx.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fua.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), ftx.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fua.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), ftx.a);
      return fub.a($$0, 64, 32);
   }

   public static final class a extends frr {
      public final ftv a;
      public final ftv b;
      public final ftv c;
      public final ftv d;

      public a(ftv $$0) {
         super(gaq::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dpi $$0) {
         boolean $$1 = !($$0.b() instanceof ddg);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dpy.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(ewr $$0, ewv $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
