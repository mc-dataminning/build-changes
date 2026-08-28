import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class gob extends gof {
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
   private static final fbr k = new fbr(0.0, -0.32F, 0.073F);
   private final Map<gob.b, gcc> l;

   public gob(gns.a $$0) {
      super($$0);
      Stream<gob.b> $$1 = dza.a().flatMap($$0x -> Arrays.stream(gob.a.values()).map($$1x -> new gob.b($$0x, $$1x)));
      this.l = $$1.collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1x -> new gcc.a($$0.a(gei.a($$1x.a, $$1x.b)), glq::g)));
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
   public void a(dwd $$0, float $$1, fgl $$2, glg $$3, int $$4, int $$5) {
      dxo $$6 = $$0.m();
      dri $$7 = (dri)$$6.b();
      dza $$8 = dri.a($$7);
      gob.a $$9 = gob.a.a($$6);
      gcc $$10 = this.l.get(new gob.b($$8, $$9));
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10);
   }

   @Override
   void a(fgl $$0, float $$1, dxo $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   hdp a(dza $$0) {
      return gmb.b($$0);
   }

   @Override
   fbr d() {
      return k;
   }

   public static gep a(gob.a $$0) {
      ger $$1 = new ger();
      get $$2 = $$1.a();
      $$2.a("board", geo.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gel.a);
      switch ($$0) {
         case a:
            $$2.a("plank", geo.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gel.a);
            break;
         case b:
            get $$3 = $$2.a("normalChains", geo.c(), gel.a);
            $$3.a("chainL1", geo.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gel.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
            $$3.a("chainL2", geo.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gel.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
            $$3.a("chainR1", geo.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gel.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
            $$3.a("chainR2", geo.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gel.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
            break;
         case c:
            $$2.a("vChains", geo.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gel.a);
      }

      return gep.a($$1, 64, 32);
   }

   public static enum a implements baq {
      a("wall"),
      b("ceiling"),
      c("ceiling_middle");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public static gob.a a(dxo $$0) {
         if ($$0.b() instanceof dld) {
            return $$0.c(dye.b) ? c : b;
         } else {
            return a;
         }
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   public static record b(dza a, gob.a b) {
   }
}
