import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fvj extends fvn {
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
   private static final elm k = new elm(0.0, -0.32F, 0.073F);
   private final Map<dkn, fvj.a> l;

   public fvj(fva.a $$0) {
      super($$0);
      this.l = dkn.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fvj.a($$0.a(fmo.b($$1)))));
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
   public void a(dhx $$0, float $$1, ept $$2, fsz $$3, int $$4, int $$5) {
      dja $$6 = $$0.r();
      ddi $$7 = (ddi)$$6.b();
      dkn $$8 = ddi.a($$7);
      fvj.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(ept $$0, float $$1, dja $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(ept $$0, int $$1, int $$2, fkl $$3, epx $$4) {
      fvj.a $$5 = (fvj.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   ggj a(dkn $$0) {
      return fto.b($$0);
   }

   @Override
   elm d() {
      return k;
   }

   public static fmv e() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      $$1.a("board", fmu.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fmr.a);
      $$1.a("plank", fmu.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fmr.a);
      fmy $$2 = $$1.a("normalChains", fmu.c(), fmr.a);
      $$2.a("chainL1", fmu.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fmr.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fmu.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fmr.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fmu.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fmr.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fmu.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fmr.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fmu.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fmr.a);
      return fmv.a($$0, 64, 32);
   }

   public static final class a extends fkl {
      public final fmp a;
      public final fmp b;
      public final fmp c;
      public final fmp d;

      public a(fmp $$0) {
         super(fth::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dja $$0) {
         boolean $$1 = !($$0.b() instanceof cxi);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(djq.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(ept $$0, epx $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
