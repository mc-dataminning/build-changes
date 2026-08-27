import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class geu extends gey {
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
   private static final euk k = new euk(0.0, -0.32F, 0.073F);
   private final Map<dso, geu.a> l;

   public geu(gel.a $$0) {
      super($$0);
      this.l = dso.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new geu.a($$0.a(fvv.b($$1)))));
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
   public void a(dpq $$0, float $$1, eys $$2, gck $$3, int $$4, int $$5) {
      drb $$6 = $$0.n();
      dky $$7 = (dky)$$6.b();
      dso $$8 = dky.a($$7);
      geu.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(eys $$0, float $$1, drb $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(eys $$0, int $$1, int $$2, fts $$3, eyw $$4) {
      geu.a $$5 = (geu.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gpz a(dso $$0) {
      return gcz.b($$0);
   }

   @Override
   euk d() {
      return k;
   }

   public static fwc e() {
      fwe $$0 = new fwe();
      fwf $$1 = $$0.a();
      $$1.a("board", fwb.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fvy.a);
      $$1.a("plank", fwb.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fvy.a);
      fwf $$2 = $$1.a("normalChains", fwb.c(), fvy.a);
      $$2.a("chainL1", fwb.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fvy.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fwb.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fvy.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fwb.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fvy.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fwb.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fvy.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fwb.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fvy.a);
      return fwc.a($$0, 64, 32);
   }

   public static final class a extends fts {
      public final fvw a;
      public final fvw b;
      public final fvw c;
      public final fvw d;

      public a(fvw $$0) {
         super(gcs::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(drb $$0) {
         boolean $$1 = !($$0.b() instanceof dex);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(drr.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(eys $$0, eyw $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
