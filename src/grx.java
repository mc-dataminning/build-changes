import org.joml.Quaternionf;
import org.joml.Vector3f;

public class grx implements grp<dxa> {
   public static final gpc a = new gpc(hhy.d, "entity/conduit");
   public static final hkg b = a.a("base");
   public static final hkg c = a.a("cage");
   public static final hkg d = a.a("wind");
   public static final hkg e = a.a("wind_vertical");
   public static final hkg f = a.a("open_eye");
   public static final hkg g = a.a("closed_eye");
   private final gig h;
   private final gig i;
   private final gig j;
   private final gig k;
   private final gro l;

   public grx(grq.a $$0) {
      this.l = $$0.a();
      this.h = $$0.a(gif.ag);
      this.i = $$0.a(gif.ai);
      this.j = $$0.a(gif.ah);
      this.k = $$0.a(gif.af);
   }

   public static gim b() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      $$1.a("eye", gil.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new gik(0.01F)), gii.a);
      return gim.a($$0, 16, 16);
   }

   public static gim c() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      $$1.a("wind", gil.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), gii.a);
      return gim.a($$0, 64, 32);
   }

   public static gim d() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      $$1.a("shell", gil.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), gii.a);
      return gim.a($$0, 32, 16);
   }

   public static gim e() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      $$1.a("shell", gil.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), gii.a);
      return gim.a($$0, 32, 16);
   }

   public void a(dxa $$0, float $$1, fiq $$2, gpd $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.c()) {
         float $$7 = $$0.a(0.0F);
         fiu $$8 = b.a($$3, gpn::d);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.j.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = azk.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.k.a($$2, c.a($$3, gpn::g), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         fiu $$13 = ($$12 == 1 ? e : d).a($$3, gpn::g);
         this.i.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.i.a($$2, $$13, $$4, $$5);
         $$2.b();
         fnn $$14 = this.l.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.h.a($$2, ($$0.d() ? f : g).a($$3, gpn::g), $$4, $$5);
         $$2.b();
      }
   }
}
