import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gkg extends gkk {
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
   private static final eyw k = new eyw(0.0, -0.32F, 0.073F);
   private final Map<dwf, gkg.a> l;

   public gkg(gjx.a $$0) {
      super($$0);
      this.l = dwf.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gkg.a($$0.a(gap.c($$1)))));
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
   public void a(dth $$0, float $$1, fdi $$2, ghl $$3, int $$4, int $$5) {
      dus $$6 = $$0.m();
      don $$7 = (don)$$6.b();
      dwf $$8 = don.a($$7);
      gkg.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(fdi $$0, float $$1, dus $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   gzm a(dwf $$0) {
      return gig.b($$0);
   }

   @Override
   eyw d() {
      return k;
   }

   public static gaw e() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      $$1.a("board", gav.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gas.a);
      $$1.a("plank", gav.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gas.a);
      gba $$2 = $$1.a("normalChains", gav.c(), gas.a);
      $$2.a("chainL1", gav.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gas.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", gav.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gas.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", gav.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gas.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", gav.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gas.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", gav.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gas.a);
      return gaw.a($$0, 64, 32);
   }

   public static final class a extends fyj {
      public final gaq a;
      public final gaq b;
      public final gaq c;

      public a(gaq $$0) {
         super($$0, ghv::f);
         this.a = $$0.b("plank");
         this.c = $$0.b("normalChains");
         this.b = $$0.b("vChains");
      }

      public void a(dus $$0) {
         boolean $$1 = !($$0.b() instanceof dil);
         this.a.k = $$1;
         this.b.k = false;
         this.c.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dvi.a);
            this.c.k = !$$2;
            this.b.k = $$2;
         }
      }
   }
}
