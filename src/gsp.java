import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class gsp extends gry {
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
   private static final fei k = new fei(0.0, -0.32F, 0.073F);
   private final Map<gsp.b, ggm> l;

   public gsp(gsf.a $$0) {
      super($$0);
      Stream<gsp.b> $$1 = ebn.a().flatMap($$0x -> Arrays.stream(gsp.a.values()).map($$1x -> new gsp.b($$0x, $$1x)));
      this.l = $$1.collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1x -> a($$0.f(), $$1x.a, $$1x.b)));
   }

   public static ggm a(giq $$0, ebn $$1, gsp.a $$2) {
      return new ggm.a($$0.a(git.a($$1, $$2)), gqc::g);
   }

   @Override
   protected float a() {
      return 1.0F;
   }

   @Override
   protected float b() {
      return 0.9F;
   }

   private static void a(fjc $$0, float $$1) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   protected void a(fjc $$0, float $$1, dzz $$2) {
      a($$0, $$1);
   }

   @Override
   protected ggm a(dzz $$0, ebn $$1) {
      gsp.a $$2 = gsp.a.a($$0);
      return this.l.get(new gsp.b($$1, $$2));
   }

   @Override
   protected hkw a(ebn $$0) {
      return gqn.b($$0);
   }

   @Override
   protected fei c() {
      return k;
   }

   public static void a(fjc $$0, gps $$1, int $$2, int $$3, ggm $$4, hkw $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(1.0F, -1.0F, -1.0F);
      fjg $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gja a(gsp.a $$0) {
      gjc $$1 = new gjc();
      gje $$2 = $$1.a();
      $$2.a("board", giz.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), giw.a);
      if ($$0 == gsp.a.a) {
         $$2.a("plank", giz.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), giw.a);
      }

      if ($$0 == gsp.a.a || $$0 == gsp.a.b) {
         gje $$3 = $$2.a("normalChains", giz.c(), giw.a);
         $$3.a("chainL1", giz.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), giw.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainL2", giz.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), giw.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
         $$3.a("chainR1", giz.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), giw.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainR2", giz.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), giw.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      }

      if ($$0 == gsp.a.c) {
         $$2.a("vChains", giz.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), giw.a);
      }

      return gja.a($$1, 64, 32);
   }

   public static enum a implements bak {
      a("wall"),
      b("ceiling"),
      c("ceiling_middle");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public static gsp.a a(dzz $$0) {
         if ($$0.b() instanceof dna) {
            return $$0.c(eap.a) ? c : b;
         } else {
            return a;
         }
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   public static record b(ebn a, gsp.a b) {
   }
}
