import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gcj extends gcn {
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
   private static final esa k = new esa(0.0, -0.32F, 0.073F);
   private final Map<dqm, gcj.a> l;

   public gcj(gca.a $$0) {
      super($$0);
      this.l = dqm.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gcj.a($$0.a(ftl.b($$1)))));
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
   public void a(dnp $$0, float $$1, ewi $$2, fzz $$3, int $$4, int $$5) {
      doz $$6 = $$0.n();
      dix $$7 = (dix)$$6.b();
      dqm $$8 = dix.a($$7);
      gcj.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(ewi $$0, float $$1, doz $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(ewi $$0, int $$1, int $$2, fri $$3, ewm $$4) {
      gcj.a $$5 = (gcj.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gnm a(dqm $$0) {
      return gao.b($$0);
   }

   @Override
   esa d() {
      return k;
   }

   public static fts e() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      $$1.a("board", ftr.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fto.a);
      $$1.a("plank", ftr.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fto.a);
      ftv $$2 = $$1.a("normalChains", ftr.c(), fto.a);
      $$2.a("chainL1", ftr.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fto.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", ftr.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fto.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", ftr.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fto.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", ftr.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fto.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", ftr.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fto.a);
      return fts.a($$0, 64, 32);
   }

   public static final class a extends fri {
      public final ftm a;
      public final ftm b;
      public final ftm c;
      public final ftm d;

      public a(ftm $$0) {
         super(gah::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(doz $$0) {
         boolean $$1 = !($$0.b() instanceof dcx);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dpp.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(ewi $$0, ewm $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
