import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class gpt extends gpd {
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
   private static final fbx k = new fbx(0.0, -0.32F, 0.073F);
   private final Map<gpt.b, gdv> l;

   public gpt(gpk.a $$0) {
      super($$0);
      Stream<gpt.b> $$1 = dzd.a().flatMap($$0x -> Arrays.stream(gpt.a.values()).map($$1x -> new gpt.b($$0x, $$1x)));
      this.l = $$1.collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1x -> a($$0.f(), $$1x.a, $$1x.b)));
   }

   public static gdv a(gfy $$0, dzd $$1, gpt.a $$2) {
      return new gdv.a($$0.a(ggb.a($$1, $$2)), gnh::g);
   }

   @Override
   protected float a() {
      return 1.0F;
   }

   @Override
   protected float b() {
      return 0.9F;
   }

   private static void a(fgr $$0, float $$1) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   protected void a(fgr $$0, float $$1, dxq $$2) {
      a($$0, $$1);
   }

   @Override
   protected gdv a(dxq $$0, dzd $$1) {
      gpt.a $$2 = gpt.a.a($$0);
      return this.l.get(new gpt.b($$1, $$2));
   }

   @Override
   protected hhy a(dzd $$0) {
      return gns.b($$0);
   }

   @Override
   protected fbx c() {
      return k;
   }

   public static void a(fgr $$0, gmx $$1, int $$2, int $$3, gdv $$4, hhy $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(1.0F, -1.0F, -1.0F);
      fgv $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static ggi a(gpt.a $$0) {
      ggk $$1 = new ggk();
      ggm $$2 = $$1.a();
      $$2.a("board", ggh.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gge.a);
      if ($$0 == gpt.a.a) {
         $$2.a("plank", ggh.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gge.a);
      }

      if ($$0 == gpt.a.a || $$0 == gpt.a.b) {
         ggm $$3 = $$2.a("normalChains", ggh.c(), gge.a);
         $$3.a("chainL1", ggh.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gge.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainL2", ggh.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gge.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
         $$3.a("chainR1", ggh.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gge.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainR2", ggh.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gge.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      }

      if ($$0 == gpt.a.c) {
         $$2.a("vChains", ggh.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gge.a);
      }

      return ggi.a($$1, 64, 32);
   }

   public static enum a implements azv {
      a("wall"),
      b("ceiling"),
      c("ceiling_middle");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public static gpt.a a(dxq $$0) {
         if ($$0.b() instanceof dle) {
            return $$0.c(dyg.a) ? c : b;
         } else {
            return a;
         }
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   public static record b(dzd a, gpt.a b) {
   }
}
