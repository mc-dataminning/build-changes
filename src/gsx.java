import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class gsx extends gsg {
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
   private static final feq k = new feq(0.0, -0.32F, 0.073F);
   private final Map<gsx.b, ggu> l;

   public gsx(gsn.a $$0) {
      super($$0);
      Stream<gsx.b> $$1 = ebv.a().flatMap($$0x -> Arrays.stream(gsx.a.values()).map($$1x -> new gsx.b($$0x, $$1x)));
      this.l = $$1.collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1x -> a($$0.f(), $$1x.a, $$1x.b)));
   }

   public static ggu a(giy $$0, ebv $$1, gsx.a $$2) {
      return new ggu.a($$0.a(gjb.a($$1, $$2)), gqk::g);
   }

   @Override
   protected float a() {
      return 1.0F;
   }

   @Override
   protected float b() {
      return 0.9F;
   }

   private static void a(fjj $$0, float $$1) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   protected void a(fjj $$0, float $$1, eah $$2) {
      a($$0, $$1);
   }

   @Override
   protected ggu a(eah $$0, ebv $$1) {
      gsx.a $$2 = gsx.a.a($$0);
      return this.l.get(new gsx.b($$1, $$2));
   }

   @Override
   protected hle a(ebv $$0) {
      return gqv.b($$0);
   }

   @Override
   protected feq c() {
      return k;
   }

   public static void a(fjj $$0, gqa $$1, int $$2, int $$3, ggu $$4, hle $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(1.0F, -1.0F, -1.0F);
      fjn $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gji a(gsx.a $$0) {
      gjk $$1 = new gjk();
      gjm $$2 = $$1.a();
      $$2.a("board", gjh.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gje.a);
      if ($$0 == gsx.a.a) {
         $$2.a("plank", gjh.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gje.a);
      }

      if ($$0 == gsx.a.a || $$0 == gsx.a.b) {
         gjm $$3 = $$2.a("normalChains", gjh.c(), gje.a);
         $$3.a("chainL1", gjh.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gje.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainL2", gjh.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gje.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
         $$3.a("chainR1", gjh.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gje.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainR2", gjh.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gje.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      }

      if ($$0 == gsx.a.c) {
         $$2.a("vChains", gjh.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gje.a);
      }

      return gji.a($$1, 64, 32);
   }

   public static enum a implements bak {
      a("wall"),
      b("ceiling"),
      c("ceiling_middle");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public static gsx.a a(eah $$0) {
         if ($$0.b() instanceof dng) {
            return $$0.c(eax.a) ? c : b;
         } else {
            return a;
         }
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   public static record b(ebv a, gsx.a b) {
   }
}
