import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class gqv extends gqe {
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
   private static final fcu k = new fcu(0.0, -0.32F, 0.073F);
   private final Map<gqv.b, gew> l;

   public gqv(gql.a $$0) {
      super($$0);
      Stream<gqv.b> $$1 = eaa.a().flatMap($$0x -> Arrays.stream(gqv.a.values()).map($$1x -> new gqv.b($$0x, $$1x)));
      this.l = $$1.collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1x -> a($$0.f(), $$1x.a, $$1x.b)));
   }

   public static gew a(ggz $$0, eaa $$1, gqv.a $$2) {
      return new gew.a($$0.a(ghc.a($$1, $$2)), goi::g);
   }

   @Override
   protected float a() {
      return 1.0F;
   }

   @Override
   protected float b() {
      return 0.9F;
   }

   private static void a(fho $$0, float $$1) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   protected void a(fho $$0, float $$1, dym $$2) {
      a($$0, $$1);
   }

   @Override
   protected gew a(dym $$0, eaa $$1) {
      gqv.a $$2 = gqv.a.a($$0);
      return this.l.get(new gqv.b($$1, $$2));
   }

   @Override
   protected hiz a(eaa $$0) {
      return got.b($$0);
   }

   @Override
   protected fcu c() {
      return k;
   }

   public static void a(fho $$0, gny $$1, int $$2, int $$3, gew $$4, hiz $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(1.0F, -1.0F, -1.0F);
      fhs $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static ghj a(gqv.a $$0) {
      ghl $$1 = new ghl();
      ghn $$2 = $$1.a();
      $$2.a("board", ghi.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), ghf.a);
      if ($$0 == gqv.a.a) {
         $$2.a("plank", ghi.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), ghf.a);
      }

      if ($$0 == gqv.a.a || $$0 == gqv.a.b) {
         ghn $$3 = $$2.a("normalChains", ghi.c(), ghf.a);
         $$3.a("chainL1", ghi.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), ghf.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainL2", ghi.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), ghf.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
         $$3.a("chainR1", ghi.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), ghf.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainR2", ghi.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), ghf.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      }

      if ($$0 == gqv.a.c) {
         $$2.a("vChains", ghi.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), ghf.a);
      }

      return ghj.a($$1, 64, 32);
   }

   public static enum a implements bag {
      a("wall"),
      b("ceiling"),
      c("ceiling_middle");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public static gqv.a a(dym $$0) {
         if ($$0.b() instanceof dlu) {
            return $$0.c(dzc.a) ? c : b;
         } else {
            return a;
         }
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   public static record b(eaa a, gqv.a b) {
   }
}
