import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gtl implements gtd<dye> {
   public static final gqq a = new gqq(hjp.c, "entity/conduit");
   public static final hlx b = a.a("base");
   public static final hlx c = a.a("cage");
   public static final hlx d = a.a("wind");
   public static final hlx e = a.a("wind_vertical");
   public static final hlx f = a.a("open_eye");
   public static final hlx g = a.a("closed_eye");
   private final gjt h;
   private final gjt i;
   private final gjt j;
   private final gjt k;
   private final gtc l;

   public gtl(gte.a $$0) {
      this.l = $$0.a();
      this.h = $$0.a(gjs.ak);
      this.i = $$0.a(gjs.am);
      this.j = $$0.a(gjs.al);
      this.k = $$0.a(gjs.aj);
   }

   public static gjz b() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      $$1.a("eye", gjy.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new gjx(0.01F)), gjv.a);
      return gjz.a($$0, 16, 16);
   }

   public static gjz c() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      $$1.a("wind", gjy.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), gjv.a);
      return gjz.a($$0, 64, 32);
   }

   public static gjz d() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      $$1.a("shell", gjy.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), gjv.a);
      return gjz.a($$0, 32, 16);
   }

   public static gjz e() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      $$1.a("shell", gjy.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), gjv.a);
      return gjz.a($$0, 32, 16);
   }

   public void a(dye $$0, float $$1, fkd $$2, gqr $$3, int $$4, int $$5, ffc $$6) {
      float $$7 = (float)$$0.a + $$1;
      if (!$$0.c()) {
         float $$8 = $$0.a(0.0F);
         fkh $$9 = b.a($$3, grc::d);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$8 * (float) (Math.PI / 180.0)));
         this.j.a($$2, $$9, $$4, $$5);
         $$2.b();
      } else {
         float $$10 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$11 = azm.a($$7 * 0.1F) / 2.0F + 0.5F;
         $$11 = $$11 * $$11 + $$11;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$11 * 0.2F, 0.5F);
         Vector3f $$12 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$10 * (float) (Math.PI / 180.0), $$12));
         this.k.a($$2, c.a($$3, grc::g), $$4, $$5);
         $$2.b();
         int $$13 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$13 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$13 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         fkh $$14 = ($$13 == 1 ? e : d).a($$3, grc::g);
         this.i.a($$2, $$14, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.i.a($$2, $$14, $$4, $$5);
         $$2.b();
         fpb $$15 = this.l.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$11 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$16 = -$$15.e();
         $$2.a(new Quaternionf().rotationYXZ($$16 * (float) (Math.PI / 180.0), $$15.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$17 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.h.a($$2, ($$0.d() ? f : g).a($$3, grc::g), $$4, $$5);
         $$2.b();
      }
   }
}
