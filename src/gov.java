import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class gov extends gof {
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
   private static final fbb k = new fbb(0.0, -0.32F, 0.073F);
   private final Map<gov.b, gcx> l;

   public gov(gom.a $$0) {
      super($$0);
      Stream<gov.b> $$1 = dyk.a().flatMap($$0x -> Arrays.stream(gov.a.values()).map($$1x -> new gov.b($$0x, $$1x)));
      this.l = $$1.collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1x -> a($$0.f(), $$1x.a, $$1x.b)));
   }

   public static gcx a(gfa $$0, dyk $$1, gov.a $$2) {
      return new gcx.a($$0.a(gfd.a($$1, $$2)), gmj::g);
   }

   @Override
   protected float a() {
      return 1.0F;
   }

   @Override
   protected float b() {
      return 0.9F;
   }

   private static void a(ffv $$0, float $$1) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   protected void a(ffv $$0, float $$1, dwy $$2) {
      a($$0, $$1);
   }

   @Override
   protected gcx a(dwy $$0, dyk $$1) {
      gov.a $$2 = gov.a.a($$0);
      return this.l.get(new gov.b($$1, $$2));
   }

   @Override
   protected hha a(dyk $$0) {
      return gmu.b($$0);
   }

   @Override
   protected fbb c() {
      return k;
   }

   public static void a(ffv $$0, glz $$1, int $$2, int $$3, gcx $$4, hha $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(1.0F, -1.0F, -1.0F);
      ffz $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gfk a(gov.a $$0) {
      gfm $$1 = new gfm();
      gfo $$2 = $$1.a();
      $$2.a("board", gfj.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gfg.a);
      if ($$0 == gov.a.a) {
         $$2.a("plank", gfj.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gfg.a);
      }

      if ($$0 == gov.a.a || $$0 == gov.a.b) {
         gfo $$3 = $$2.a("normalChains", gfj.c(), gfg.a);
         $$3.a("chainL1", gfj.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gfg.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainL2", gfj.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gfg.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
         $$3.a("chainR1", gfj.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gfg.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainR2", gfj.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gfg.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      }

      if ($$0 == gov.a.c) {
         $$2.a("vChains", gfj.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gfg.a);
      }

      return gfk.a($$1, 64, 32);
   }

   public static enum a implements azv {
      a("wall"),
      b("ceiling"),
      c("ceiling_middle");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public static gov.a a(dwy $$0) {
         if ($$0.b() instanceof dkn) {
            return $$0.c(dxo.b) ? c : b;
         } else {
            return a;
         }
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   public static record b(dyk a, gov.a b) {
   }
}
