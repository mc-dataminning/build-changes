import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gfw extends gga {
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
   private static final evp k = new evp(0.0, -0.32F, 0.073F);
   private final Map<dtn, gfw.a> l;

   public gfw(gfn.a $$0) {
      super($$0);
      this.l = dtn.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gfw.a($$0.a(fwx.b($$1)))));
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
   public void a(dqp $$0, float $$1, ezw $$2, gdm $$3, int $$4, int $$5) {
      dsa $$6 = $$0.n();
      dlx $$7 = (dlx)$$6.b();
      dtn $$8 = dlx.a($$7);
      gfw.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(ezw $$0, float $$1, dsa $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(ezw $$0, int $$1, int $$2, fuu $$3, faa $$4) {
      gfw.a $$5 = (gfw.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   grb a(dtn $$0) {
      return geb.b($$0);
   }

   @Override
   evp d() {
      return k;
   }

   public static fxe e() {
      fxg $$0 = new fxg();
      fxh $$1 = $$0.a();
      $$1.a("board", fxd.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fxa.a);
      $$1.a("plank", fxd.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fxa.a);
      fxh $$2 = $$1.a("normalChains", fxd.c(), fxa.a);
      $$2.a("chainL1", fxd.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxa.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fxd.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxa.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fxd.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxa.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fxd.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fxa.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fxd.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fxa.a);
      return fxe.a($$0, 64, 32);
   }

   public static final class a extends fuu {
      public final fwy a;
      public final fwy b;
      public final fwy c;
      public final fwy d;

      public a(fwy $$0) {
         super(gdu::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dsa $$0) {
         boolean $$1 = !($$0.b() instanceof dfw);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dsq.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(ezw $$0, faa $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
