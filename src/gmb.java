import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gmb extends gmf {
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
   private static final ezy k = new ezy(0.0, -0.32F, 0.073F);
   private final Map<dxh, gmb.a> l;

   public gmb(gls.a $$0) {
      super($$0);
      this.l = dxh.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gmb.a($$0.a(gck.c($$1)))));
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
   public void a(duk $$0, float $$1, fer $$2, gjg $$3, int $$4, int $$5) {
      dvv $$6 = $$0.m();
      dpq $$7 = (dpq)$$6.b();
      dxh $$8 = dpq.a($$7);
      gmb.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(fer $$0, float $$1, dvv $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   hbn a(dxh $$0) {
      return gkb.b($$0);
   }

   @Override
   ezy d() {
      return k;
   }

   public static gcr e() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      $$1.a("board", gcq.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gcn.a);
      $$1.a("plank", gcq.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gcn.a);
      gcv $$2 = $$1.a("normalChains", gcq.c(), gcn.a);
      $$2.a("chainL1", gcq.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gcn.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", gcq.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gcn.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", gcq.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gcn.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", gcq.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gcn.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", gcq.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gcn.a);
      return gcr.a($$0, 64, 32);
   }

   public static final class a extends gae {
      public final gcl a;
      public final gcl b;
      public final gcl c;

      public a(gcl $$0) {
         super($$0, gjq::f);
         this.a = $$0.b("plank");
         this.c = $$0.b("normalChains");
         this.b = $$0.b("vChains");
      }

      public void a(dvv $$0) {
         boolean $$1 = !($$0.b() instanceof djp);
         this.a.k = $$1;
         this.b.k = false;
         this.c.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dwl.a);
            this.c.k = !$$2;
            this.b.k = $$2;
         }
      }
   }
}
