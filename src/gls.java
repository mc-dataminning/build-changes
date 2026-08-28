import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gls extends glw {
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
   private static final ezr k = new ezr(0.0, -0.32F, 0.073F);
   private final Map<dxa, gls.a> l;

   public gls(glj.a $$0) {
      super($$0);
      this.l = dxa.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gls.a($$0.a(gcb.c($$1)))));
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
   public void a(dud $$0, float $$1, fek $$2, gix $$3, int $$4, int $$5) {
      dvo $$6 = $$0.m();
      dpj $$7 = (dpj)$$6.b();
      dxa $$8 = dpj.a($$7);
      gls.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(fek $$0, float $$1, dvo $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   hbc a(dxa $$0) {
      return gjs.b($$0);
   }

   @Override
   ezr d() {
      return k;
   }

   public static gci e() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      $$1.a("board", gch.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gce.a);
      $$1.a("plank", gch.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gce.a);
      gcm $$2 = $$1.a("normalChains", gch.c(), gce.a);
      $$2.a("chainL1", gch.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gce.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", gch.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gce.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", gch.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gce.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", gch.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gce.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", gch.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gce.a);
      return gci.a($$0, 64, 32);
   }

   public static final class a extends fzv {
      public final gcc a;
      public final gcc b;
      public final gcc c;

      public a(gcc $$0) {
         super($$0, gjh::f);
         this.a = $$0.b("plank");
         this.c = $$0.b("normalChains");
         this.b = $$0.b("vChains");
      }

      public void a(dvo $$0) {
         boolean $$1 = !($$0.b() instanceof dji);
         this.a.k = $$1;
         this.b.k = false;
         this.c.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dwe.a);
            this.c.k = !$$2;
            this.b.k = $$2;
         }
      }
   }
}
