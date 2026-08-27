import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fxv extends fxz {
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
   private static final ens k = new ens(0.0, -0.32F, 0.073F);
   private final Map<dms, fxv.a> l;

   public fxv(fxm.a $$0) {
      super($$0);
      this.l = dms.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fxv.a($$0.a(fpb.b($$1)))));
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
   public void a(dkc $$0, float $$1, esa $$2, fvl $$3, int $$4, int $$5) {
      dlf $$6 = $$0.r();
      dfn $$7 = (dfn)$$6.b();
      dms $$8 = dfn.a($$7);
      fxv.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(esa $$0, float $$1, dlf $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(esa $$0, int $$1, int $$2, fmx $$3, ese $$4) {
      fxv.a $$5 = (fxv.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   giw a(dms $$0) {
      return fwa.b($$0);
   }

   @Override
   ens d() {
      return k;
   }

   public static fpi e() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("board", fph.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fpe.a);
      $$1.a("plank", fph.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fpe.a);
      fpl $$2 = $$1.a("normalChains", fph.c(), fpe.a);
      $$2.a("chainL1", fph.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fpe.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fph.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fpe.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fph.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fpe.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fph.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fpe.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fph.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fpe.a);
      return fpi.a($$0, 64, 32);
   }

   public static final class a extends fmx {
      public final fpc a;
      public final fpc b;
      public final fpc c;
      public final fpc d;

      public a(fpc $$0) {
         super(fvt::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dlf $$0) {
         boolean $$1 = !($$0.b() instanceof czn);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dlv.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(esa $$0, ese $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
