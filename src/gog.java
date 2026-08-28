import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gog extends gok {
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
   private static final fby k = new fby(0.0, -0.32F, 0.073F);
   private final Map<dzh, gog.a> l;

   public gog(gnx.a $$0) {
      super($$0);
      this.l = dzh.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gog.a($$0.a(gen.c($$1)))));
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
   public void a(dwk $$0, float $$1, fgs $$2, gll $$3, int $$4, int $$5) {
      dxv $$6 = $$0.m();
      drp $$7 = (drp)$$6.b();
      dzh $$8 = drp.a($$7);
      gog.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(fgs $$0, float $$1, dxv $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   hdu a(dzh $$0) {
      return gmg.b($$0);
   }

   @Override
   fby d() {
      return k;
   }

   public static geu e() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      $$1.a("board", get.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), geq.a);
      $$1.a("plank", get.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), geq.a);
      gey $$2 = $$1.a("normalChains", get.c(), geq.a);
      $$2.a("chainL1", get.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), geq.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", get.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), geq.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", get.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), geq.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", get.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), geq.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", get.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), geq.a);
      return geu.a($$0, 64, 32);
   }

   public static final class a extends gch {
      public final geo a;
      public final geo b;
      public final geo c;

      public a(geo $$0) {
         super($$0, glv::g);
         this.a = $$0.b("plank");
         this.c = $$0.b("normalChains");
         this.b = $$0.b("vChains");
      }

      public void a(dxv $$0) {
         boolean $$1 = !($$0.b() instanceof dlm);
         this.a.k = $$1;
         this.b.k = false;
         this.c.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dyl.a);
            this.c.k = !$$2;
            this.b.k = $$2;
         }
      }
   }
}
