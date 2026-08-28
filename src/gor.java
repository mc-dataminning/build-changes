import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class gor extends gob {
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
   private static final fay k = new fay(0.0, -0.32F, 0.073F);
   private final Map<gor.b, gct> l;

   public gor(goi.a $$0) {
      super($$0);
      Stream<gor.b> $$1 = dyh.a().flatMap($$0x -> Arrays.stream(gor.a.values()).map($$1x -> new gor.b($$0x, $$1x)));
      this.l = $$1.collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1x -> a($$0.f(), $$1x.a, $$1x.b)));
   }

   public static gct a(gew $$0, dyh $$1, gor.a $$2) {
      return new gct.a($$0.a(gez.a($$1, $$2)), gmf::g);
   }

   @Override
   protected float a() {
      return 1.0F;
   }

   @Override
   protected float b() {
      return 0.9F;
   }

   private static void a(ffs $$0, float $$1) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   protected void a(ffs $$0, float $$1, dwv $$2) {
      a($$0, $$1);
   }

   @Override
   protected gct a(dwv $$0, dyh $$1) {
      gor.a $$2 = gor.a.a($$0);
      return this.l.get(new gor.b($$1, $$2));
   }

   @Override
   protected hgt a(dyh $$0) {
      return gmq.b($$0);
   }

   @Override
   protected fay c() {
      return k;
   }

   public static void a(ffs $$0, glv $$1, int $$2, int $$3, gct $$4, hgt $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(1.0F, -1.0F, -1.0F);
      ffw $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gfg a(gor.a $$0) {
      gfi $$1 = new gfi();
      gfk $$2 = $$1.a();
      $$2.a("board", gff.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gfc.a);
      if ($$0 == gor.a.a) {
         $$2.a("plank", gff.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gfc.a);
      }

      if ($$0 == gor.a.a || $$0 == gor.a.b) {
         gfk $$3 = $$2.a("normalChains", gff.c(), gfc.a);
         $$3.a("chainL1", gff.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gfc.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainL2", gff.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gfc.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
         $$3.a("chainR1", gff.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gfc.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainR2", gff.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gfc.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      }

      if ($$0 == gor.a.c) {
         $$2.a("vChains", gff.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gfc.a);
      }

      return gfg.a($$1, 64, 32);
   }

   public static enum a implements azu {
      a("wall"),
      b("ceiling"),
      c("ceiling_middle");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public static gor.a a(dwv $$0) {
         if ($$0.b() instanceof dkk) {
            return $$0.c(dxl.b) ? c : b;
         } else {
            return a;
         }
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   public static record b(dyh a, gor.a b) {
   }
}
