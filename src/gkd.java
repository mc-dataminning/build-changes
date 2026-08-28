import org.joml.Quaternionf;

public class gkd extends gki<chz> {
   private static final akr a = akr.b("textures/entity/end_crystal/end_crystal.png");
   private static final gfh g = gfh.e(a);
   private static final float h = (float)Math.sin(Math.PI / 4);
   private static final String i = "glass";
   private static final String j = "base";
   private final fyk k;
   private final fyk l;
   private final fyk m;

   public gkd(gkj.a $$0) {
      super($$0);
      this.e = 0.5F;
      fyk $$1 = $$0.a(fyj.ab);
      this.l = $$1.b("glass");
      this.k = $$1.b("cube");
      this.m = $$1.b("base");
   }

   public static fyq a() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      $$1.a("glass", fyp.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fym.a);
      $$1.a("cube", fyp.c().a(32, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fym.a);
      $$1.a("base", fyp.c().a(0, 16).a(-6.0F, 0.0F, -6.0F, 12.0F, 4.0F, 12.0F), fym.a);
      return fyq.a($$0, 64, 32);
   }

   public void a(chz $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      $$3.a();
      float $$6 = a($$0, $$2);
      float $$7 = ((float)$$0.b + $$2) * 3.0F;
      fbm $$8 = $$4.getBuffer(g);
      $$3.a();
      $$3.b(2.0F, 2.0F, 2.0F);
      $$3.a(0.0F, -0.5F, 0.0F);
      int $$9 = gqc.d;
      if ($$0.s()) {
         this.m.a($$3, $$8, $$5, $$9);
      }

      $$3.a(a.d.rotationDegrees($$7));
      $$3.a(0.0F, 1.5F + $$6 / 2.0F, 0.0F);
      $$3.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), h, 0.0F, h));
      this.l.a($$3, $$8, $$5, $$9);
      float $$10 = 0.875F;
      $$3.b(0.875F, 0.875F, 0.875F);
      $$3.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), h, 0.0F, h));
      $$3.a(a.d.rotationDegrees($$7));
      this.l.a($$3, $$8, $$5, $$9);
      $$3.b(0.875F, 0.875F, 0.875F);
      $$3.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), h, 0.0F, h));
      $$3.a(a.d.rotationDegrees($$7));
      this.k.a($$3, $$8, $$5, $$9);
      $$3.b();
      $$3.b();
      jd $$11 = $$0.p();
      if ($$11 != null) {
         float $$12 = (float)$$11.u() + 0.5F;
         float $$13 = (float)$$11.v() + 0.5F;
         float $$14 = (float)$$11.w() + 0.5F;
         float $$15 = (float)((double)$$12 - $$0.dt());
         float $$16 = (float)((double)$$13 - $$0.dv());
         float $$17 = (float)((double)$$14 - $$0.dz());
         $$3.a($$15, $$16, $$17);
         gke.a(-$$15, -$$16 + $$6, -$$17, $$2, $$0.b, $$3, $$4, $$5);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public static float a(chz $$0, float $$1) {
      float $$2 = (float)$$0.b + $$1;
      float $$3 = ayo.a($$2 * 0.2F) / 2.0F + 0.5F;
      $$3 = ($$3 * $$3 + $$3) * 0.4F;
      return $$3 - 1.4F;
   }

   public akr a(chz $$0) {
      return a;
   }

   public boolean a(chz $$0, gie $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.p() != null;
   }
}
