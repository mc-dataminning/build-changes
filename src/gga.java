import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gga extends gge {
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
   private static final evt k = new evt(0.0, -0.32F, 0.073F);
   private final Map<dtr, gga.a> l;

   public gga(gfr.a $$0) {
      super($$0);
      this.l = dtr.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gga.a($$0.a(fxb.b($$1)))));
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
   public void a(dqt $$0, float $$1, faa $$2, gdq $$3, int $$4, int $$5) {
      dse $$6 = $$0.n();
      dmb $$7 = (dmb)$$6.b();
      dtr $$8 = dmb.a($$7);
      gga.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(faa $$0, float $$1, dse $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(faa $$0, int $$1, int $$2, fuy $$3, fae $$4) {
      gga.a $$5 = (gga.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   grf a(dtr $$0) {
      return gef.b($$0);
   }

   @Override
   evt d() {
      return k;
   }

   public static fxi e() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      $$1.a("board", fxh.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fxe.a);
      $$1.a("plank", fxh.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fxe.a);
      fxl $$2 = $$1.a("normalChains", fxh.c(), fxe.a);
      $$2.a("chainL1", fxh.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxe.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fxh.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxe.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fxh.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxe.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fxh.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxe.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fxh.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fxe.a);
      return fxi.a($$0, 64, 32);
   }

   public static final class a extends fuy {
      public final fxc a;
      public final fxc b;
      public final fxc c;
      public final fxc d;

      public a(fxc $$0) {
         super(gdy::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dse $$0) {
         boolean $$1 = !($$0.b() instanceof dga);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dsu.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(faa $$0, fae $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
