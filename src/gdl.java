import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gdl implements gde<dnp> {
   public static final gor a = new gor(gmn.e, new akf("entity/conduit/base"));
   public static final gor b = new gor(gmn.e, new akf("entity/conduit/cage"));
   public static final gor c = new gor(gmn.e, new akf("entity/conduit/wind"));
   public static final gor d = new gor(gmn.e, new akf("entity/conduit/wind_vertical"));
   public static final gor e = new gor(gmn.e, new akf("entity/conduit/open_eye"));
   public static final gor f = new gor(gmn.e, new akf("entity/conduit/closed_eye"));
   private final fur g;
   private final fur h;
   private final fur i;
   private final fur j;
   private final gdd k;

   public gdl(gdf.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(fuq.D);
      this.h = $$0.a(fuq.F);
      this.i = $$0.a(fuq.E);
      this.j = $$0.a(fuq.C);
   }

   public static fux b() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      $$1.a("eye", fuw.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new fuv(0.01F)), fut.a);
      return fux.a($$0, 16, 16);
   }

   public static fux c() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      $$1.a("wind", fuw.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), fut.a);
      return fux.a($$0, 64, 32);
   }

   public static fux d() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      $$1.a("shell", fuw.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), fut.a);
      return fux.a($$0, 32, 16);
   }

   public static fux e() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      $$1.a("shell", fuw.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fut.a);
      return fux.a($$0, 32, 16);
   }

   public void a(dnp $$0, float $$1, exn $$2, gbe $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.c()) {
         float $$7 = $$0.a(0.0F);
         exr $$8 = a.a($$3, gbm::c);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = axw.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, gbm::e), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         exr $$13 = ($$12 == 1 ? d : c).a($$3, gbm::e);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         fcf $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.d() ? e : f).a($$3, gbm::e), $$4, $$5);
         $$2.b();
      }
   }
}
