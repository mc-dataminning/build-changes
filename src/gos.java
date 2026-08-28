import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class gos extends gow {
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
   private final Map<gos.b, gcv> l;

   public gos(goj.a $$0) {
      super($$0);
      Stream<gos.b> $$1 = dyj.a().flatMap($$0x -> Arrays.stream(gos.a.values()).map($$1x -> new gos.b($$0x, $$1x)));
      this.l = $$1.collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1x -> new gcv.a($$0.a(gfb.a($$1x.a, $$1x.b)), gmh::g)));
   }

   @Override
   public float b() {
      return 1.0F;
   }

   @Override
   public float c() {
      return 0.9F;
   }

   @Override
   public void a(dvm $$0, float $$1, ffu $$2, glx $$3, int $$4, int $$5) {
      dwx $$6 = $$0.m();
      dqr $$7 = (dqr)$$6.b();
      dyj $$8 = dqr.a($$7);
      gos.a $$9 = gos.a.a($$6);
      gcv $$10 = this.l.get(new gos.b($$8, $$9));
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10);
   }

   @Override
   void a(ffu $$0, float $$1, dwx $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   hgs a(dyj $$0) {
      return gms.b($$0);
   }

   @Override
   fba d() {
      return k;
   }

   public static gfi a(gos.a $$0) {
      gfk $$1 = new gfk();
      gfm $$2 = $$1.a();
      $$2.a("board", gfh.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gfe.a);
      if ($$0 == gos.a.a) {
         $$2.a("plank", gfh.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gfe.a);
      }

      if ($$0 == gos.a.a || $$0 == gos.a.b) {
         gfm $$3 = $$2.a("normalChains", gfh.c(), gfe.a);
         $$3.a("chainL1", gfh.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gfe.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainL2", gfh.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gfe.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
         $$3.a("chainR1", gfh.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gfe.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainR2", gfh.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gfe.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      }

      if ($$0 == gos.a.c) {
         $$2.a("vChains", gfh.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gfe.a);
      }

      return gfi.a($$1, 64, 32);
   }

   public static enum a implements azv {
      a("wall"),
      b("ceiling"),
      c("ceiling_middle");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public static gos.a a(dwx $$0) {
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

   public static record b(dyj a, gos.a b) {
   }
}
