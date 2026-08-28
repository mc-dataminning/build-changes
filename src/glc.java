import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class glc extends glg {
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
   private static final ezn k = new ezn(0.0, -0.32F, 0.073F);
   private final Map<dww, glc.a> l;

   public glc(gkt.a $$0) {
      super($$0);
      this.l = dww.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new glc.a($$0.a(gbl.c($$1)))));
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
   public void a(dty $$0, float $$1, feb $$2, gih $$3, int $$4, int $$5) {
      dvj $$6 = $$0.m();
      dpe $$7 = (dpe)$$6.b();
      dww $$8 = dpe.a($$7);
      glc.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(feb $$0, float $$1, dvj $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   ham a(dww $$0) {
      return gjc.b($$0);
   }

   @Override
   ezn d() {
      return k;
   }

   public static gbs e() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      $$1.a("board", gbr.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gbo.a);
      $$1.a("plank", gbr.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gbo.a);
      gbw $$2 = $$1.a("normalChains", gbr.c(), gbo.a);
      $$2.a("chainL1", gbr.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gbo.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", gbr.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gbo.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", gbr.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gbo.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", gbr.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gbo.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", gbr.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gbo.a);
      return gbs.a($$0, 64, 32);
   }

   public static final class a extends fzf {
      public final gbm a;
      public final gbm b;
      public final gbm c;

      public a(gbm $$0) {
         super($$0, gir::f);
         this.a = $$0.b("plank");
         this.c = $$0.b("normalChains");
         this.b = $$0.b("vChains");
      }

      public void a(dvj $$0) {
         boolean $$1 = !($$0.b() instanceof djd);
         this.a.k = $$1;
         this.b.k = false;
         this.c.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dvz.a);
            this.c.k = !$$2;
            this.b.k = $$2;
         }
      }
   }
}
