import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ggn extends ggr {
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
   private static final ewf k = new ewf(0.0, -0.32F, 0.073F);
   private final Map<dtx, ggn.a> l;

   public ggn(gge.a $$0) {
      super($$0);
      this.l = dtx.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new ggn.a($$0.a(fxn.b($$1)))));
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
   public void a(dra $$0, float $$1, fam $$2, ged $$3, int $$4, int $$5) {
      dsk $$6 = $$0.n();
      dmh $$7 = (dmh)$$6.b();
      dtx $$8 = dmh.a($$7);
      ggn.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(fam $$0, float $$1, dsk $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(fam $$0, int $$1, int $$2, fvk $$3, faq $$4) {
      ggn.a $$5 = (ggn.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   grs a(dtx $$0) {
      return ges.b($$0);
   }

   @Override
   ewf d() {
      return k;
   }

   public static fxu e() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      $$1.a("board", fxt.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fxq.a);
      $$1.a("plank", fxt.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fxq.a);
      fxx $$2 = $$1.a("normalChains", fxt.c(), fxq.a);
      $$2.a("chainL1", fxt.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxq.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fxt.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxq.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fxt.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxq.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fxt.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxq.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fxt.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fxq.a);
      return fxu.a($$0, 64, 32);
   }

   public static final class a extends fvk {
      public final fxo a;
      public final fxo b;
      public final fxo c;
      public final fxo d;

      public a(fxo $$0) {
         super(gel::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dsk $$0) {
         boolean $$1 = !($$0.b() instanceof dgg);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dta.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(fam $$0, faq $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
