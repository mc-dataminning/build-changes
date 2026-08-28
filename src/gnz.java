import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gnz extends god {
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
   private static final fbs k = new fbs(0.0, -0.32F, 0.073F);
   private final Map<dyz, gnz.a> l;

   public gnz(gnq.a $$0) {
      super($$0);
      this.l = dyz.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gnz.a($$0.a(geg.c($$1)))));
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
   public void a(dwc $$0, float $$1, fgl $$2, gle $$3, int $$4, int $$5) {
      dxn $$6 = $$0.m();
      drh $$7 = (drh)$$6.b();
      dyz $$8 = drh.a($$7);
      gnz.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(fgl $$0, float $$1, dxn $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   hdn a(dyz $$0) {
      return glz.b($$0);
   }

   @Override
   fbs d() {
      return k;
   }

   public static gen e() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      $$1.a("board", gem.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gej.a);
      $$1.a("plank", gem.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gej.a);
      ger $$2 = $$1.a("normalChains", gem.c(), gej.a);
      $$2.a("chainL1", gem.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gej.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", gem.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gej.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", gem.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gej.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", gem.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gej.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", gem.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gej.a);
      return gen.a($$0, 64, 32);
   }

   public static final class a extends gca {
      public final geh a;
      public final geh b;
      public final geh c;

      public a(geh $$0) {
         super($$0, glo::f);
         this.a = $$0.b("plank");
         this.c = $$0.b("normalChains");
         this.b = $$0.b("vChains");
      }

      public void a(dxn $$0) {
         boolean $$1 = !($$0.b() instanceof dle);
         this.a.k = $$1;
         this.b.k = false;
         this.c.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dyd.a);
            this.c.k = !$$2;
            this.b.k = $$2;
         }
      }
   }
}
