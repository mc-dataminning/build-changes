import org.joml.Quaternionf;

public class gjg extends gjl<chm> {
   private static final akk a = new akk("textures/entity/end_crystal/end_crystal.png");
   private static final gel f = gel.e(a);
   private static final float g = (float)Math.sin(Math.PI / 4);
   private static final String h = "glass";
   private static final String i = "base";
   private final fxo j;
   private final fxo k;
   private final fxo l;

   public gjg(gjm.a $$0) {
      super($$0);
      this.d = 0.5F;
      fxo $$1 = $$0.a(fxn.aa);
      this.k = $$1.b("glass");
      this.j = $$1.b("cube");
      this.l = $$1.b("base");
   }

   public static fxu a() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      $$1.a("glass", fxt.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxq.a);
      $$1.a("cube", fxt.c().a(32, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxq.a);
      $$1.a("base", fxt.c().a(0, 16).a(-6.0F, 0.0F, -6.0F, 12.0F, 4.0F, 12.0F), fxq.a);
      return fxu.a($$0, 64, 32);
   }

   public void a(chm $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5) {
      $$3.a();
      float $$6 = a($$0, $$2);
      float $$7 = ((float)$$0.b + $$2) * 3.0F;
      faq $$8 = $$4.getBuffer(f);
      $$3.a();
      $$3.b(2.0F, 2.0F, 2.0F);
      $$3.a(0.0F, -0.5F, 0.0F);
      int $$9 = gpf.d;
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
         float $$15 = (float)((double)$$12 - $$0.dv());
         float $$16 = (float)((double)$$13 - $$0.dx());
         float $$17 = (float)((double)$$14 - $$0.dB());
         $$3.a($$15, $$16, $$17);
         gjh.a(-$$15, -$$16 + $$6, -$$17, $$2, $$0.b, $$3, $$4, $$5);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public static float a(chm $$0, float $$1) {
      float $$2 = (float)$$0.b + $$1;
      float $$3 = ayg.a($$2 * 0.2F) / 2.0F + 0.5F;
      $$3 = ($$3 * $$3 + $$3) * 0.4F;
      return $$3 - 1.4F;
   }

   public akk a(chm $$0) {
      return a;
   }

   public boolean a(chm $$0, ghh $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.p() != null;
   }
}
