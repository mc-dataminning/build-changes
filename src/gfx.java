import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gfx extends ggb {
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
   private static final evq k = new evq(0.0, -0.32F, 0.073F);
   private final Map<dto, gfx.a> l;

   public gfx(gfo.a $$0) {
      super($$0);
      this.l = dto.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gfx.a($$0.a(fwy.b($$1)))));
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
   public void a(dqq $$0, float $$1, ezx $$2, gdn $$3, int $$4, int $$5) {
      dsb $$6 = $$0.n();
      dly $$7 = (dly)$$6.b();
      dto $$8 = dly.a($$7);
      gfx.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(ezx $$0, float $$1, dsb $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(ezx $$0, int $$1, int $$2, fuv $$3, fab $$4) {
      gfx.a $$5 = (gfx.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   grc a(dto $$0) {
      return gec.b($$0);
   }

   @Override
   evq d() {
      return k;
   }

   public static fxf e() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      $$1.a("board", fxe.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fxb.a);
      $$1.a("plank", fxe.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fxb.a);
      fxi $$2 = $$1.a("normalChains", fxe.c(), fxb.a);
      $$2.a("chainL1", fxe.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxb.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fxe.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxb.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fxe.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxb.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fxe.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxb.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fxe.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fxb.a);
      return fxf.a($$0, 64, 32);
   }

   public static final class a extends fuv {
      public final fwz a;
      public final fwz b;
      public final fwz c;
      public final fwz d;

      public a(fwz $$0) {
         super(gdv::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dsb $$0) {
         boolean $$1 = !($$0.b() instanceof dfx);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dsr.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(ezx $$0, fab $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
