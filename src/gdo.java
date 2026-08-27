import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gdo extends gds {
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
   private static final etf k = new etf(0.0, -0.32F, 0.073F);
   private final Map<drl, gdo.a> l;

   public gdo(gdf.a $$0) {
      super($$0);
      this.l = drl.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gdo.a($$0.a(fuq.b($$1)))));
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
   public void a(don $$0, float $$1, exn $$2, gbe $$3, int $$4, int $$5) {
      dpy $$6 = $$0.n();
      djv $$7 = (djv)$$6.b();
      drl $$8 = djv.a($$7);
      gdo.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(exn $$0, float $$1, dpy $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(exn $$0, int $$1, int $$2, fsn $$3, exr $$4) {
      gdo.a $$5 = (gdo.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gor a(drl $$0) {
      return gbt.b($$0);
   }

   @Override
   etf d() {
      return k;
   }

   public static fux e() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      $$1.a("board", fuw.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fut.a);
      $$1.a("plank", fuw.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fut.a);
      fva $$2 = $$1.a("normalChains", fuw.c(), fut.a);
      $$2.a("chainL1", fuw.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fut.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fuw.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fut.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fuw.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fut.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fuw.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fut.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fuw.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fut.a);
      return fux.a($$0, 64, 32);
   }

   public static final class a extends fsn {
      public final fur a;
      public final fur b;
      public final fur c;
      public final fur d;

      public a(fur $$0) {
         super(gbm::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dpy $$0) {
         boolean $$1 = !($$0.b() instanceof ddu);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dqo.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(exn $$0, exr $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
