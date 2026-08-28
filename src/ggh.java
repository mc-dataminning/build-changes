import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ggh extends ggl {
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
   private static final evz k = new evz(0.0, -0.32F, 0.073F);
   private final Map<dtu, ggh.a> l;

   public ggh(gfy.a $$0) {
      super($$0);
      this.l = dtu.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new ggh.a($$0.a(fxh.b($$1)))));
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
   public void a(dqx $$0, float $$1, fag $$2, gdx $$3, int $$4, int $$5) {
      dsh $$6 = $$0.n();
      dmf $$7 = (dmf)$$6.b();
      dtu $$8 = dmf.a($$7);
      ggh.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(fag $$0, float $$1, dsh $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(fag $$0, int $$1, int $$2, fve $$3, fak $$4) {
      ggh.a $$5 = (ggh.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   grm a(dtu $$0) {
      return gem.b($$0);
   }

   @Override
   evz d() {
      return k;
   }

   public static fxo e() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      $$1.a("board", fxn.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fxk.a);
      $$1.a("plank", fxn.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fxk.a);
      fxr $$2 = $$1.a("normalChains", fxn.c(), fxk.a);
      $$2.a("chainL1", fxn.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxk.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fxn.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxk.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fxn.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxk.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fxn.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxk.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fxn.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fxk.a);
      return fxo.a($$0, 64, 32);
   }

   public static final class a extends fve {
      public final fxi a;
      public final fxi b;
      public final fxi c;
      public final fxi d;

      public a(fxi $$0) {
         super(gef::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dsh $$0) {
         boolean $$1 = !($$0.b() instanceof dge);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dsx.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(fag $$0, fak $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
