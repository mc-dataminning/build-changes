import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gkr extends gkv {
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
   private static final ezh k = new ezh(0.0, -0.32F, 0.073F);
   private final Map<dwq, gkr.a> l;

   public gkr(gki.a $$0) {
      super($$0);
      this.l = dwq.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gkr.a($$0.a(gba.c($$1)))));
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
   public void a(dts $$0, float $$1, fdt $$2, ghw $$3, int $$4, int $$5) {
      dvd $$6 = $$0.m();
      doy $$7 = (doy)$$6.b();
      dwq $$8 = doy.a($$7);
      gkr.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(fdt $$0, float $$1, dvd $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   hab a(dwq $$0) {
      return gir.b($$0);
   }

   @Override
   ezh d() {
      return k;
   }

   public static gbh e() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      $$1.a("board", gbg.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gbd.a);
      $$1.a("plank", gbg.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gbd.a);
      gbl $$2 = $$1.a("normalChains", gbg.c(), gbd.a);
      $$2.a("chainL1", gbg.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gbd.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", gbg.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gbd.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", gbg.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gbd.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", gbg.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gbd.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", gbg.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gbd.a);
      return gbh.a($$0, 64, 32);
   }

   public static final class a extends fyu {
      public final gbb a;
      public final gbb b;
      public final gbb c;

      public a(gbb $$0) {
         super($$0, gig::f);
         this.a = $$0.b("plank");
         this.c = $$0.b("normalChains");
         this.b = $$0.b("vChains");
      }

      public void a(dvd $$0) {
         boolean $$1 = !($$0.b() instanceof dix);
         this.a.k = $$1;
         this.b.k = false;
         this.c.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dvt.a);
            this.c.k = !$$2;
            this.b.k = $$2;
         }
      }
   }
}
