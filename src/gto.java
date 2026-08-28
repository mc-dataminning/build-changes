import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class gto extends gsx {
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
   private static final ffc k = new ffc(0.0, -0.32F, 0.073F);
   private final Map<gto.b, ghl> l;

   public gto(gte.a $$0) {
      super($$0);
      Stream<gto.b> $$1 = ech.a().flatMap($$0x -> Arrays.stream(gto.a.values()).map($$1x -> new gto.b($$0x, $$1x)));
      this.l = $$1.collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1x -> a($$0.f(), $$1x.a, $$1x.b)));
   }

   public static ghl a(gjp $$0, ech $$1, gto.a $$2) {
      return new ghl.a($$0.a(gjs.a($$1, $$2)), grc::g);
   }

   @Override
   protected float a() {
      return 1.0F;
   }

   @Override
   protected float b() {
      return 0.9F;
   }

   private static void a(fkd $$0, float $$1) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   protected void a(fkd $$0, float $$1, eat $$2) {
      a($$0, $$1);
   }

   @Override
   protected ghl a(eat $$0, ech $$1) {
      gto.a $$2 = gto.a.a($$0);
      return this.l.get(new gto.b($$1, $$2));
   }

   @Override
   protected hlx a(ech $$0) {
      return grl.b($$0);
   }

   @Override
   protected ffc c() {
      return k;
   }

   public static void a(fkd $$0, gqr $$1, int $$2, int $$3, ghl $$4, hlx $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(1.0F, -1.0F, -1.0F);
      fkh $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gjz a(gto.a $$0) {
      gkb $$1 = new gkb();
      gkd $$2 = $$1.a();
      $$2.a("board", gjy.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gjv.a);
      if ($$0 == gto.a.a) {
         $$2.a("plank", gjy.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gjv.a);
      }

      if ($$0 == gto.a.a || $$0 == gto.a.b) {
         gkd $$3 = $$2.a("normalChains", gjy.c(), gjv.a);
         $$3.a("chainL1", gjy.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gjv.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainL2", gjy.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gjv.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
         $$3.a("chainR1", gjy.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gjv.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainR2", gjy.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gjv.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      }

      if ($$0 == gto.a.c) {
         $$2.a("vChains", gjy.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gjv.a);
      }

      return gjz.a($$1, 64, 32);
   }

   public static enum a implements bak {
      a("wall"),
      b("ceiling"),
      c("ceiling_middle");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public static gto.a a(eat $$0) {
         if ($$0.b() instanceof dns) {
            return $$0.c(ebj.a) ? c : b;
         } else {
            return a;
         }
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   public static record b(ech a, gto.a b) {
   }
}
