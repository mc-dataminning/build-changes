import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class gva extends guj {
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
   private static final ffs k = new ffs(0.0, -0.32F, 0.073F);
   private final Map<gva.b, giy> l;

   public gva(guq.a $$0) {
      super($$0);
      Stream<gva.b> $$1 = ecu.a().flatMap($$0x -> Arrays.stream(gva.a.values()).map($$1x -> new gva.b($$0x, $$1x)));
      this.l = $$1.collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1x -> a($$0.f(), $$1x.a, $$1x.b)));
   }

   public static giy a(glc $$0, ecu $$1, gva.a $$2) {
      return new giy.a($$0.a(glf.a($$1, $$2)), gsn::g);
   }

   @Override
   protected float a() {
      return 1.0F;
   }

   @Override
   protected float b() {
      return 0.9F;
   }

   private static void a(flq $$0, float $$1) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   protected void a(flq $$0, float $$1, ebg $$2) {
      a($$0, $$1);
   }

   @Override
   protected giy a(ebg $$0, ecu $$1) {
      gva.a $$2 = gva.a.a($$0);
      return this.l.get(new gva.b($$1, $$2));
   }

   @Override
   protected hnj a(ecu $$0) {
      return gsw.b($$0);
   }

   @Override
   protected ffs c() {
      return k;
   }

   public static void a(flq $$0, gsc $$1, int $$2, int $$3, giy $$4, hnj $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(1.0F, -1.0F, -1.0F);
      flt $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static glm a(gva.a $$0) {
      glo $$1 = new glo();
      glq $$2 = $$1.a();
      $$2.a("board", gll.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gli.a);
      if ($$0 == gva.a.a) {
         $$2.a("plank", gll.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gli.a);
      }

      if ($$0 == gva.a.a || $$0 == gva.a.b) {
         glq $$3 = $$2.a("normalChains", gll.c(), gli.a);
         $$3.a("chainL1", gll.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gli.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainL2", gll.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gli.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
         $$3.a("chainR1", gll.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gli.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainR2", gll.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gli.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      }

      if ($$0 == gva.a.c) {
         $$2.a("vChains", gll.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gli.a);
      }

      return glm.a($$1, 64, 32);
   }

   public static enum a implements bao {
      a("wall"),
      b("ceiling"),
      c("ceiling_middle");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public static gva.a a(ebg $$0) {
         if ($$0.b() instanceof dof) {
            return $$0.c(ebw.a) ? c : b;
         } else {
            return a;
         }
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   public static record b(ecu a, gva.a b) {
   }
}
