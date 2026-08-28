import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gkb extends gkf {
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
   private static final eys k = new eys(0.0, -0.32F, 0.073F);
   private final Map<dwb, gkb.a> l;

   public gkb(gjs.a $$0) {
      super($$0);
      this.l = dwb.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gkb.a($$0.a(gak.c($$1)))));
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
   public void a(dte $$0, float $$1, fde $$2, ghg $$3, int $$4, int $$5) {
      duo $$6 = $$0.m();
      dok $$7 = (dok)$$6.b();
      dwb $$8 = dok.a($$7);
      gkb.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(fde $$0, float $$1, duo $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   gzh a(dwb $$0) {
      return gib.b($$0);
   }

   @Override
   eys d() {
      return k;
   }

   public static gar e() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      $$1.a("board", gaq.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gan.a);
      $$1.a("plank", gaq.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gan.a);
      gav $$2 = $$1.a("normalChains", gaq.c(), gan.a);
      $$2.a("chainL1", gaq.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gan.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", gaq.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gan.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", gaq.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gan.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", gaq.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gan.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", gaq.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gan.a);
      return gar.a($$0, 64, 32);
   }

   public static final class a extends fyf {
      public final gal a;
      public final gal b;
      public final gal c;
      public final gal d;

      public a(gal $$0) {
         super(ghq::f);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(duo $$0) {
         boolean $$1 = !($$0.b() instanceof dii);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dve.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public gal a() {
         return this.a;
      }
   }
}
