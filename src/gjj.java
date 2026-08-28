import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gjj implements gjc<drq> {
   public static final gyq a = new gyq(gwj.d, alb.b("entity/conduit/base"));
   public static final gyq b = new gyq(gwj.d, alb.b("entity/conduit/cage"));
   public static final gyq c = new gyq(gwj.d, alb.b("entity/conduit/wind"));
   public static final gyq d = new gyq(gwj.d, alb.b("entity/conduit/wind_vertical"));
   public static final gyq e = new gyq(gwj.d, alb.b("entity/conduit/open_eye"));
   public static final gyq f = new gyq(gwj.d, alb.b("entity/conduit/closed_eye"));
   private final gab g;
   private final gab h;
   private final gab i;
   private final gab j;
   private final gjb k;

   public gjj(gjd.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(gaa.R);
      this.h = $$0.a(gaa.T);
      this.i = $$0.a(gaa.S);
      this.j = $$0.a(gaa.Q);
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("eye", gag.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new gaf(0.01F)), gad.a);
      return gah.a($$0, 16, 16);
   }

   public static gah c() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("wind", gag.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), gad.a);
      return gah.a($$0, 64, 32);
   }

   public static gah d() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("shell", gag.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), gad.a);
      return gah.a($$0, 32, 16);
   }

   public static gah e() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("shell", gag.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), gad.a);
      return gah.a($$0, 32, 16);
   }

   public void a(drq $$0, float $$1, fcu $$2, ggv $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.c()) {
         float $$7 = $$0.a(0.0F);
         fcy $$8 = a.a($$3, ghe::c);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = azc.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, ghe::f), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         fcy $$13 = ($$12 == 1 ? d : c).a($$3, ghe::f);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         fhk $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.d() ? e : f).a($$3, ghe::f), $$4, $$5);
         $$2.b();
      }
   }
}
