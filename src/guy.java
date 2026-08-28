import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class guy extends guh {
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
   private static final ffq k = new ffq(0.0, -0.32F, 0.073F);
   private final Map<guy.b, giw> l;

   public guy(guo.a $$0) {
      super($$0);
      Stream<guy.b> $$1 = ecs.a().flatMap($$0x -> Arrays.stream(guy.a.values()).map($$1x -> new guy.b($$0x, $$1x)));
      this.l = $$1.collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1x -> a($$0.f(), $$1x.a, $$1x.b)));
   }

   public static giw a(gla $$0, ecs $$1, guy.a $$2) {
      return new giw.a($$0.a(gld.a($$1, $$2)), gsl::g);
   }

   @Override
   protected float a() {
      return 1.0F;
   }

   @Override
   protected float b() {
      return 0.9F;
   }

   private static void a(flo $$0, float $$1) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   protected void a(flo $$0, float $$1, ebe $$2) {
      a($$0, $$1);
   }

   @Override
   protected giw a(ebe $$0, ecs $$1) {
      guy.a $$2 = guy.a.a($$0);
      return this.l.get(new guy.b($$1, $$2));
   }

   @Override
   protected hnh a(ecs $$0) {
      return gsu.b($$0);
   }

   @Override
   protected ffq c() {
      return k;
   }

   public static void a(flo $$0, gsa $$1, int $$2, int $$3, giw $$4, hnh $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(1.0F, -1.0F, -1.0F);
      flr $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static glk a(guy.a $$0) {
      glm $$1 = new glm();
      glo $$2 = $$1.a();
      $$2.a("board", glj.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), glg.a);
      if ($$0 == guy.a.a) {
         $$2.a("plank", glj.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), glg.a);
      }

      if ($$0 == guy.a.a || $$0 == guy.a.b) {
         glo $$3 = $$2.a("normalChains", glj.c(), glg.a);
         $$3.a("chainL1", glj.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), glg.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainL2", glj.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), glg.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
         $$3.a("chainR1", glj.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), glg.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainR2", glj.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), glg.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      }

      if ($$0 == guy.a.c) {
         $$2.a("vChains", glj.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), glg.a);
      }

      return glk.a($$1, 64, 32);
   }

   public static enum a implements bam {
      a("wall"),
      b("ceiling"),
      c("ceiling_middle");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public static guy.a a(ebe $$0) {
         if ($$0.b() instanceof dod) {
            return $$0.c(ebu.a) ? c : b;
         } else {
            return a;
         }
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   public static record b(ecs a, guy.a b) {
   }
}
