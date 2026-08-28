import org.joml.Quaternionf;

public class gji extends gjn<chn> {
   private static final akk a = new akk("textures/entity/end_crystal/end_crystal.png");
   private static final gen f = gen.e(a);
   private static final float g = (float)Math.sin(Math.PI / 4);
   private static final String h = "glass";
   private static final String i = "base";
   private final fxq j;
   private final fxq k;
   private final fxq l;

   public gji(gjo.a $$0) {
      super($$0);
      this.d = 0.5F;
      fxq $$1 = $$0.a(fxp.aa);
      this.k = $$1.b("glass");
      this.j = $$1.b("cube");
      this.l = $$1.b("base");
   }

   public static fxw a() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      $$1.a("glass", fxv.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxs.a);
      $$1.a("cube", fxv.c().a(32, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxs.a);
      $$1.a("base", fxv.c().a(0, 16).a(-6.0F, 0.0F, -6.0F, 12.0F, 4.0F, 12.0F), fxs.a);
      return fxw.a($$0, 64, 32);
   }

   public void a(chn $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      $$3.a();
      float $$6 = a($$0, $$2);
      float $$7 = ((float)$$0.b + $$2) * 3.0F;
      fas $$8 = $$4.getBuffer(f);
      $$3.a();
      $$3.b(2.0F, 2.0F, 2.0F);
      $$3.a(0.0F, -0.5F, 0.0F);
      int $$9 = gph.d;
      if ($$0.s()) {
         this.l.a($$3, $$8, $$5, $$9);
      }

      $$3.a(a.d.rotationDegrees($$7));
      $$3.a(0.0F, 1.5F + $$6 / 2.0F, 0.0F);
      $$3.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), g, 0.0F, g));
      this.k.a($$3, $$8, $$5, $$9);
      float $$10 = 0.875F;
      $$3.b(0.875F, 0.875F, 0.875F);
      $$3.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), g, 0.0F, g));
      $$3.a(a.d.rotationDegrees($$7));
      this.k.a($$3, $$8, $$5, $$9);
      $$3.b(0.875F, 0.875F, 0.875F);
      $$3.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), g, 0.0F, g));
      $$3.a(a.d.rotationDegrees($$7));
      this.j.a($$3, $$8, $$5, $$9);
      $$3.b();
      $$3.b();
      ja $$11 = $$0.p();
      if ($$11 != null) {
         float $$12 = (float)$$11.u() + 0.5F;
         float $$13 = (float)$$11.v() + 0.5F;
         float $$14 = (float)$$11.w() + 0.5F;
         float $$15 = (float)((double)$$12 - $$0.dw());
         float $$16 = (float)((double)$$13 - $$0.dy());
         float $$17 = (float)((double)$$14 - $$0.dC());
         $$3.a($$15, $$16, $$17);
         gjj.a(-$$15, -$$16 + $$6, -$$17, $$2, $$0.b, $$3, $$4, $$5);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public static float a(chn $$0, float $$1) {
      float $$2 = (float)$$0.b + $$1;
      float $$3 = ayg.a($$2 * 0.2F) / 2.0F + 0.5F;
      $$3 = ($$3 * $$3 + $$3) * 0.4F;
      return $$3 - 1.4F;
   }

   public akk a(chn $$0) {
      return a;
   }

   public boolean a(chn $$0, ghj $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.p() != null;
   }
}
