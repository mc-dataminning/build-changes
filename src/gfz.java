import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gfz extends ggd {
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
   private static final evs k = new evs(0.0, -0.32F, 0.073F);
   private final Map<dtq, gfz.a> l;

   public gfz(gfq.a $$0) {
      super($$0);
      this.l = dtq.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gfz.a($$0.a(fxa.b($$1)))));
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
   public void a(dqs $$0, float $$1, ezz $$2, gdp $$3, int $$4, int $$5) {
      dsd $$6 = $$0.n();
      dma $$7 = (dma)$$6.b();
      dtq $$8 = dma.a($$7);
      gfz.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(ezz $$0, float $$1, dsd $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(ezz $$0, int $$1, int $$2, fux $$3, fad $$4) {
      gfz.a $$5 = (gfz.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gre a(dtq $$0) {
      return gee.b($$0);
   }

   @Override
   evs d() {
      return k;
   }

   public static fxh e() {
      fxj $$0 = new fxj();
      fxk $$1 = $$0.a();
      $$1.a("board", fxg.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fxd.a);
      $$1.a("plank", fxg.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fxd.a);
      fxk $$2 = $$1.a("normalChains", fxg.c(), fxd.a);
      $$2.a("chainL1", fxg.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxd.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fxg.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxd.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fxg.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxd.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fxg.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxd.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fxg.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fxd.a);
      return fxh.a($$0, 64, 32);
   }

   public static final class a extends fux {
      public final fxb a;
      public final fxb b;
      public final fxb c;
      public final fxb d;

      public a(fxb $$0) {
         super(gdx::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dsd $$0) {
         boolean $$1 = !($$0.b() instanceof dfz);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dst.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(ezz $$0, fad $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
