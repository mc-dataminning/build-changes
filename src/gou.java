import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class gou extends goe {
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
   private static final fba k = new fba(0.0, -0.32F, 0.073F);
   private final Map<gou.b, gcw> l;

   public gou(gol.a $$0) {
      super($$0);
      Stream<gou.b> $$1 = dyj.a().flatMap($$0x -> Arrays.stream(gou.a.values()).map($$1x -> new gou.b($$0x, $$1x)));
      this.l = $$1.collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1x -> a($$0.f(), $$1x.a, $$1x.b)));
   }

   public static gcw a(gez $$0, dyj $$1, gou.a $$2) {
      return new gcw.a($$0.a(gfc.a($$1, $$2)), gmi::g);
   }

   @Override
   protected float a() {
      return 1.0F;
   }

   @Override
   protected float b() {
      return 0.9F;
   }

   private static void a(ffu $$0, float $$1) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   protected void a(ffu $$0, float $$1, dwx $$2) {
      a($$0, $$1);
   }

   @Override
   protected gcw a(dwx $$0, dyj $$1) {
      gou.a $$2 = gou.a.a($$0);
      return this.l.get(new gou.b($$1, $$2));
   }

   @Override
   protected hgz a(dyj $$0) {
      return gmt.b($$0);
   }

   @Override
   protected fba c() {
      return k;
   }

   public static void a(ffu $$0, gly $$1, int $$2, int $$3, gcw $$4, hgz $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(1.0F, -1.0F, -1.0F);
      ffy $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gfj a(gou.a $$0) {
      gfl $$1 = new gfl();
      gfn $$2 = $$1.a();
      $$2.a("board", gfi.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gff.a);
      if ($$0 == gou.a.a) {
         $$2.a("plank", gfi.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gff.a);
      }

      if ($$0 == gou.a.a || $$0 == gou.a.b) {
         gfn $$3 = $$2.a("normalChains", gfi.c(), gff.a);
         $$3.a("chainL1", gfi.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gff.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainL2", gfi.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gff.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
         $$3.a("chainR1", gfi.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gff.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainR2", gfi.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gff.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      }

      if ($$0 == gou.a.c) {
         $$2.a("vChains", gfi.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gff.a);
      }

      return gfj.a($$1, 64, 32);
   }

   public static enum a implements azv {
      a("wall"),
      b("ceiling"),
      c("ceiling_middle");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public static gou.a a(dwx $$0) {
         if ($$0.b() instanceof dkm) {
            return $$0.c(dxn.b) ? c : b;
         } else {
            return a;
         }
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   public static record b(dyj a, gou.a b) {
   }
}
