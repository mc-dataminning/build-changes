import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gjm extends gjq {
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
   private static final eye k = new eye(0.0, -0.32F, 0.073F);
   private final Map<dvn, gjm.a> l;

   public gjm(gjd.a $$0) {
      super($$0);
      this.l = dvn.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gjm.a($$0.a(gaa.c($$1)))));
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
   public void a(dsq $$0, float $$1, fcu $$2, ggv $$3, int $$4, int $$5) {
      dua $$6 = $$0.m();
      dnw $$7 = (dnw)$$6.b();
      dvn $$8 = dnw.a($$7);
      gjm.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(fcu $$0, float $$1, dua $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   gyq a(dvn $$0) {
      return ghm.b($$0);
   }

   @Override
   eye d() {
      return k;
   }

   public static gah e() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("board", gag.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gad.a);
      $$1.a("plank", gag.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gad.a);
      gal $$2 = $$1.a("normalChains", gag.c(), gad.a);
      $$2.a("chainL1", gag.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gad.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", gag.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gad.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", gag.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gad.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", gag.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gad.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", gag.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gad.a);
      return gah.a($$0, 64, 32);
   }

   public static final class a extends fxv {
      public final gab a;
      public final gab b;
      public final gab c;
      public final gab d;

      public a(gab $$0) {
         super(ghe::f);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dua $$0) {
         boolean $$1 = !($$0.b() instanceof dhu);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(duq.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public gab a() {
         return this.a;
      }
   }
}
