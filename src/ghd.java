import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ghd extends ghh {
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
   private static final eww k = new eww(0.0, -0.32F, 0.073F);
   private final Map<dun, ghd.a> l;

   public ghd(ggu.a $$0) {
      super($$0);
      this.l = dun.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new ghd.a($$0.a(fyd.b($$1)))));
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
   public void a(drq $$0, float $$1, fbc $$2, get $$3, int $$4, int $$5) {
      dta $$6 = $$0.n();
      dmx $$7 = (dmx)$$6.b();
      dun $$8 = dmx.a($$7);
      ghd.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(fbc $$0, float $$1, dta $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(fbc $$0, int $$1, int $$2, fwa $$3, fbg $$4) {
      ghd.a $$5 = (ghd.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gsj a(dun $$0) {
      return gfi.b($$0);
   }

   @Override
   eww d() {
      return k;
   }

   public static fyk e() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      $$1.a("board", fyj.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fyg.a);
      $$1.a("plank", fyj.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fyg.a);
      fyn $$2 = $$1.a("normalChains", fyj.c(), fyg.a);
      $$2.a("chainL1", fyj.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fyg.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fyj.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fyg.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fyj.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fyg.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fyj.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fyg.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fyj.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fyg.a);
      return fyk.a($$0, 64, 32);
   }

   public static final class a extends fwa {
      public final fye a;
      public final fye b;
      public final fye c;
      public final fye d;

      public a(fye $$0) {
         super(gfb::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dta $$0) {
         boolean $$1 = !($$0.b() instanceof dgv);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dtq.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(fbc $$0, fbg $$1, int $$2, int $$3, int $$4) {
         this.a.a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
