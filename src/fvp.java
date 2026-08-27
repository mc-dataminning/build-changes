import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fvp extends fvt {
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
   private static final els k = new els(0.0, -0.32F, 0.073F);
   private final Map<dkt, fvp.a> l;

   public fvp(fvg.a $$0) {
      super($$0);
      this.l = dkt.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fvp.a($$0.a(fmu.b($$1)))));
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
   public void a(did $$0, float $$1, epz $$2, ftf $$3, int $$4, int $$5) {
      djg $$6 = $$0.r();
      ddo $$7 = (ddo)$$6.b();
      dkt $$8 = ddo.a($$7);
      fvp.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(epz $$0, float $$1, djg $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(epz $$0, int $$1, int $$2, fkr $$3, eqd $$4) {
      fvp.a $$5 = (fvp.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   ggo a(dkt $$0) {
      return ftu.b($$0);
   }

   @Override
   els d() {
      return k;
   }

   public static fnb e() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      $$1.a("board", fna.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fmx.a);
      $$1.a("plank", fna.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fmx.a);
      fne $$2 = $$1.a("normalChains", fna.c(), fmx.a);
      $$2.a("chainL1", fna.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fmx.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fna.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fmx.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fna.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fmx.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fna.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fmx.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fna.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fmx.a);
      return fnb.a($$0, 64, 32);
   }

   public static final class a extends fkr {
      public final fmv a;
      public final fmv b;
      public final fmv c;
      public final fmv d;

      public a(fmv $$0) {
         super(ftn::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(djg $$0) {
         boolean $$1 = !($$0.b() instanceof cxo);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(djw.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(epz $$0, eqd $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
