import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class gsa extends grj {
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
   private static final fdw k = new fdw(0.0, -0.32F, 0.073F);
   private final Map<gsa.b, gfz> l;

   public gsa(grq.a $$0) {
      super($$0);
      Stream<gsa.b> $$1 = ebc.a().flatMap($$0x -> Arrays.stream(gsa.a.values()).map($$1x -> new gsa.b($$0x, $$1x)));
      this.l = $$1.collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1x -> a($$0.f(), $$1x.a, $$1x.b)));
   }

   public static gfz a(gic $$0, ebc $$1, gsa.a $$2) {
      return new gfz.a($$0.a(gif.a($$1, $$2)), gpn::g);
   }

   @Override
   protected float a() {
      return 1.0F;
   }

   @Override
   protected float b() {
      return 0.9F;
   }

   private static void a(fiq $$0, float $$1) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   protected void a(fiq $$0, float $$1, dzo $$2) {
      a($$0, $$1);
   }

   @Override
   protected gfz a(dzo $$0, ebc $$1) {
      gsa.a $$2 = gsa.a.a($$0);
      return this.l.get(new gsa.b($$1, $$2));
   }

   @Override
   protected hkg a(ebc $$0) {
      return gpy.b($$0);
   }

   @Override
   protected fdw c() {
      return k;
   }

   public static void a(fiq $$0, gpd $$1, int $$2, int $$3, gfz $$4, hkg $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(1.0F, -1.0F, -1.0F);
      fiu $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gim a(gsa.a $$0) {
      gio $$1 = new gio();
      giq $$2 = $$1.a();
      $$2.a("board", gil.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gii.a);
      if ($$0 == gsa.a.a) {
         $$2.a("plank", gil.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gii.a);
      }

      if ($$0 == gsa.a.a || $$0 == gsa.a.b) {
         giq $$3 = $$2.a("normalChains", gil.c(), gii.a);
         $$3.a("chainL1", gil.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gii.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainL2", gil.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gii.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
         $$3.a("chainR1", gil.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gii.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainR2", gil.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gii.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      }

      if ($$0 == gsa.a.c) {
         $$2.a("vChains", gil.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gii.a);
      }

      return gim.a($$1, 64, 32);
   }

   public static enum a implements bai {
      a("wall"),
      b("ceiling"),
      c("ceiling_middle");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public static gsa.a a(dzo $$0) {
         if ($$0.b() instanceof dmu) {
            return $$0.c(eae.a) ? c : b;
         } else {
            return a;
         }
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   public static record b(ebc a, gsa.a b) {
   }
}
