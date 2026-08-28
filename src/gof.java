import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gof extends goj {
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
   private final Map<dzg, gof.a> l;

   public gof(gnw.a $$0) {
      super($$0);
      this.l = dzg.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gof.a($$0.a(gem.c($$1)))));
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
   public void a(dwj $$0, float $$1, fgr $$2, glk $$3, int $$4, int $$5) {
      dxu $$6 = $$0.m();
      dro $$7 = (dro)$$6.b();
      dzg $$8 = dro.a($$7);
      gof.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(fgr $$0, float $$1, dxu $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   hdt a(dzg $$0) {
      return gmf.b($$0);
   }

   @Override
   fbx d() {
      return k;
   }

   public static get e() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      $$1.a("board", ges.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gep.a);
      $$1.a("plank", ges.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gep.a);
      gex $$2 = $$1.a("normalChains", ges.c(), gep.a);
      $$2.a("chainL1", ges.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gep.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", ges.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gep.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", ges.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gep.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", ges.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gep.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", ges.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gep.a);
      return get.a($$0, 64, 32);
   }

   public static final class a extends gcg {
      public final gen a;
      public final gen b;
      public final gen c;

      public a(gen $$0) {
         super($$0, glu::g);
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
