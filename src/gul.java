import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class gul extends gtu {
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
   private static final fgc k = new fgc(0.0, -0.32F, 0.073F);
   private final Map<gul.b, gij> l;

   public gul(gub.a $$0) {
      super($$0);
      Stream<gul.b> $$1 = ede.a().flatMap($$0x -> Arrays.stream(gul.a.values()).map($$1x -> new gul.b($$0x, $$1x)));
      this.l = $$1.collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1x -> a($$0.f(), $$1x.a, $$1x.b)));
   }

   public static gij a(gkn $$0, ede $$1, gul.a $$2) {
      return new gij.a($$0.a(gkq.a($$1, $$2)), gry::g);
   }

   @Override
   protected float a() {
      return 1.0F;
   }

   @Override
   protected float b() {
      return 0.9F;
   }

   private static void a(fld $$0, float $$1) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   protected void a(fld $$0, float $$1, ebq $$2) {
      a($$0, $$1);
   }

   @Override
   protected gij a(ebq $$0, ede $$1) {
      gul.a $$2 = gul.a.a($$0);
      return this.l.get(new gul.b($$1, $$2));
   }

   @Override
   protected hmx a(ede $$0) {
      return gsh.b($$0);
   }

   @Override
   protected fgc c() {
      return k;
   }

   public static void a(fld $$0, grn $$1, int $$2, int $$3, gij $$4, hmx $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(1.0F, -1.0F, -1.0F);
      flg $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gkx a(gul.a $$0) {
      gkz $$1 = new gkz();
      glb $$2 = $$1.a();
      $$2.a("board", gkw.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gkt.a);
      if ($$0 == gul.a.a) {
         $$2.a("plank", gkw.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gkt.a);
      }

      if ($$0 == gul.a.a || $$0 == gul.a.b) {
         glb $$3 = $$2.a("normalChains", gkw.c(), gkt.a);
         $$3.a("chainL1", gkw.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gkt.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainL2", gkw.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gkt.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
         $$3.a("chainR1", gkw.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gkt.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainR2", gkw.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gkt.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      }

      if ($$0 == gul.a.c) {
         $$2.a("vChains", gkw.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gkt.a);
      }

      return gkx.a($$1, 64, 32);
   }

   public static enum a implements bax {
      a("wall"),
      b("ceiling"),
      c("ceiling_middle");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public static gul.a a(ebq $$0) {
         if ($$0.b() instanceof dop) {
            return $$0.c(ecg.a) ? c : b;
         } else {
            return a;
         }
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   public static record b(ede a, gul.a b) {
   }
}
