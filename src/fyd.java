import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fyd extends fyh {
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
   private static final enz k = new enz(0.0, -0.32F, 0.073F);
   private final Map<dmw, fyd.a> l;

   public fyd(fxu.a $$0) {
      super($$0);
      this.l = dmw.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fyd.a($$0.a(fpi.b($$1)))));
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
   public void a(dkg $$0, float $$1, esh $$2, fvt $$3, int $$4, int $$5) {
      dlj $$6 = $$0.r();
      dfr $$7 = (dfr)$$6.b();
      dmw $$8 = dfr.a($$7);
      fyd.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(esh $$0, float $$1, dlj $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(esh $$0, int $$1, int $$2, fne $$3, esl $$4) {
      fyd.a $$5 = (fyd.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gje a(dmw $$0) {
      return fwi.b($$0);
   }

   @Override
   enz d() {
      return k;
   }

   public static fpp e() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      $$1.a("board", fpo.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fpl.a);
      $$1.a("plank", fpo.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fpl.a);
      fps $$2 = $$1.a("normalChains", fpo.c(), fpl.a);
      $$2.a("chainL1", fpo.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fpl.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fpo.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fpl.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fpo.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fpl.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fpo.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fpl.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fpo.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fpl.a);
      return fpp.a($$0, 64, 32);
   }

   public static final class a extends fne {
      public final fpj a;
      public final fpj b;
      public final fpj c;
      public final fpj d;

      public a(fpj $$0) {
         super(fwb::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dlj $$0) {
         boolean $$1 = !($$0.b() instanceof czr);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dlz.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(esh $$0, esl $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
