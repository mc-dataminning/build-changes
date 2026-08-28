import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class goe extends goi {
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
   private static final fbx k = new fbx(0.0, -0.32F, 0.073F);
   private final Map<dzg, goe.a> l;

   public goe(gnv.a $$0) {
      super($$0);
      this.l = dzg.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new goe.a($$0.a(gel.c($$1)))));
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
   public void a(dwj $$0, float $$1, fgq $$2, glj $$3, int $$4, int $$5) {
      dxu $$6 = $$0.m();
      dro $$7 = (dro)$$6.b();
      dzg $$8 = dro.a($$7);
      goe.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(fgq $$0, float $$1, dxu $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   hds a(dzg $$0) {
      return gme.b($$0);
   }

   @Override
   fbx d() {
      return k;
   }

   public static ges e() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      $$1.a("board", ger.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), geo.a);
      $$1.a("plank", ger.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), geo.a);
      gew $$2 = $$1.a("normalChains", ger.c(), geo.a);
      $$2.a("chainL1", ger.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), geo.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", ger.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), geo.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", ger.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), geo.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", ger.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), geo.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", ger.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), geo.a);
      return ges.a($$0, 64, 32);
   }

   public static final class a extends gcf {
      public final gem a;
      public final gem b;
      public final gem c;

      public a(gem $$0) {
         super($$0, glt::f);
         this.a = $$0.b("plank");
         this.c = $$0.b("normalChains");
         this.b = $$0.b("vChains");
      }

      public void a(dxu $$0) {
         boolean $$1 = !($$0.b() instanceof dll);
         this.a.k = $$1;
         this.b.k = false;
         this.c.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dyk.a);
            this.c.k = !$$2;
            this.b.k = $$2;
         }
      }
   }
}
