import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class gtj extends gss {
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
   private static final fex k = new fex(0.0, -0.32F, 0.073F);
   private final Map<gtj.b, ghg> l;

   public gtj(gsz.a $$0) {
      super($$0);
      Stream<gtj.b> $$1 = ecc.a().flatMap($$0x -> Arrays.stream(gtj.a.values()).map($$1x -> new gtj.b($$0x, $$1x)));
      this.l = $$1.collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1x -> a($$0.f(), $$1x.a, $$1x.b)));
   }

   public static ghg a(gjk $$0, ecc $$1, gtj.a $$2) {
      return new ghg.a($$0.a(gjn.a($$1, $$2)), gqx::g);
   }

   @Override
   protected float a() {
      return 1.0F;
   }

   @Override
   protected float b() {
      return 0.9F;
   }

   private static void a(fjy $$0, float $$1) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   protected void a(fjy $$0, float $$1, eao $$2) {
      a($$0, $$1);
   }

   @Override
   protected ghg a(eao $$0, ecc $$1) {
      gtj.a $$2 = gtj.a.a($$0);
      return this.l.get(new gtj.b($$1, $$2));
   }

   @Override
   protected hlq a(ecc $$0) {
      return grg.b($$0);
   }

   @Override
   protected fex c() {
      return k;
   }

   public static void a(fjy $$0, gqm $$1, int $$2, int $$3, ghg $$4, hlq $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(1.0F, -1.0F, -1.0F);
      fkc $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gju a(gtj.a $$0) {
      gjw $$1 = new gjw();
      gjy $$2 = $$1.a();
      $$2.a("board", gjt.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gjq.a);
      if ($$0 == gtj.a.a) {
         $$2.a("plank", gjt.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gjq.a);
      }

      if ($$0 == gtj.a.a || $$0 == gtj.a.b) {
         gjy $$3 = $$2.a("normalChains", gjt.c(), gjq.a);
         $$3.a("chainL1", gjt.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gjq.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainL2", gjt.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gjq.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
         $$3.a("chainR1", gjt.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gjq.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainR2", gjt.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gjq.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      }

      if ($$0 == gtj.a.c) {
         $$2.a("vChains", gjt.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gjq.a);
      }

      return gju.a($$1, 64, 32);
   }

   public static enum a implements bak {
      a("wall"),
      b("ceiling"),
      c("ceiling_middle");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public static gtj.a a(eao $$0) {
         if ($$0.b() instanceof dnn) {
            return $$0.c(ebe.a) ? c : b;
         } else {
            return a;
         }
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   public static record b(ecc a, gtj.a b) {
   }
}
