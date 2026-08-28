import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gkz implements gks<dsy> {
   public static final ham a = new ham(gyc.d, ali.b("entity/conduit/base"));
   public static final ham b = new ham(gyc.d, ali.b("entity/conduit/cage"));
   public static final ham c = new ham(gyc.d, ali.b("entity/conduit/wind"));
   public static final ham d = new ham(gyc.d, ali.b("entity/conduit/wind_vertical"));
   public static final ham e = new ham(gyc.d, ali.b("entity/conduit/open_eye"));
   public static final ham f = new ham(gyc.d, ali.b("entity/conduit/closed_eye"));
   private final gbm g;
   private final gbm h;
   private final gbm i;
   private final gbm j;
   private final gkr k;

   public gkz(gkt.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(gbl.R);
      this.h = $$0.a(gbl.T);
      this.i = $$0.a(gbl.S);
      this.j = $$0.a(gbl.Q);
   }

   public static gbs b() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      $$1.a("eye", gbr.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new gbq(0.01F)), gbo.a);
      return gbs.a($$0, 16, 16);
   }

   public static gbs c() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      $$1.a("wind", gbr.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), gbo.a);
      return gbs.a($$0, 64, 32);
   }

   public static gbs d() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      $$1.a("shell", gbr.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), gbo.a);
      return gbs.a($$0, 32, 16);
   }

   public static gbs e() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      $$1.a("shell", gbr.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), gbo.a);
      return gbs.a($$0, 32, 16);
   }

   public void a(dsy $$0, float $$1, feb $$2, gih $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.c()) {
         float $$7 = $$0.a(0.0F);
         fef $$8 = a.a($$3, gir::c);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = azk.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, gir::f), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         fef $$13 = ($$12 == 1 ? d : c).a($$3, gir::f);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         fir $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.d() ? e : f).a($$3, gir::f), $$4, $$5);
         $$2.b();
      }
   }
}
