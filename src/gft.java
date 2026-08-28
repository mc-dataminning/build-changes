import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gft extends gfx {
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
   private static final evm k = new evm(0.0, -0.32F, 0.073F);
   private final Map<dtk, gft.a> l;

   public gft(gfk.a $$0) {
      super($$0);
      this.l = dtk.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gft.a($$0.a(fwu.b($$1)))));
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
   public void a(dqm $$0, float $$1, ezt $$2, gdj $$3, int $$4, int $$5) {
      drx $$6 = $$0.n();
      dlu $$7 = (dlu)$$6.b();
      dtk $$8 = dlu.a($$7);
      gft.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(ezt $$0, float $$1, drx $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(ezt $$0, int $$1, int $$2, fur $$3, ezx $$4) {
      gft.a $$5 = (gft.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gqy a(dtk $$0) {
      return gdy.b($$0);
   }

   @Override
   evm d() {
      return k;
   }

   public static fxb e() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      $$1.a("board", fxa.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fwx.a);
      $$1.a("plank", fxa.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fwx.a);
      fxe $$2 = $$1.a("normalChains", fxa.c(), fwx.a);
      $$2.a("chainL1", fxa.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fwx.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fxa.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fwx.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fxa.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fwx.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fxa.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fwx.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fxa.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fwx.a);
      return fxb.a($$0, 64, 32);
   }

   public static final class a extends fur {
      public final fwv a;
      public final fwv b;
      public final fwv c;
      public final fwv d;

      public a(fwv $$0) {
         super(gdr::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(drx $$0) {
         boolean $$1 = !($$0.b() instanceof dft);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dsn.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(ezt $$0, ezx $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
