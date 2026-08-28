import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gny implements gnr<dvc> {
   public static final hdp a = new hdp(hbf.d, alp.b("entity/conduit/base"));
   public static final hdp b = new hdp(hbf.d, alp.b("entity/conduit/cage"));
   public static final hdp c = new hdp(hbf.d, alp.b("entity/conduit/wind"));
   public static final hdp d = new hdp(hbf.d, alp.b("entity/conduit/wind_vertical"));
   public static final hdp e = new hdp(hbf.d, alp.b("entity/conduit/open_eye"));
   public static final hdp f = new hdp(hbf.d, alp.b("entity/conduit/closed_eye"));
   private final gej g;
   private final gej h;
   private final gej i;
   private final gej j;
   private final gnq k;

   public gny(gns.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(gei.ac);
      this.h = $$0.a(gei.ae);
      this.i = $$0.a(gei.ad);
      this.j = $$0.a(gei.ab);
   }

   public static gep b() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      $$1.a("eye", geo.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new gen(0.01F)), gel.a);
      return gep.a($$0, 16, 16);
   }

   public static gep c() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      $$1.a("wind", geo.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), gel.a);
      return gep.a($$0, 64, 32);
   }

   public static gep d() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      $$1.a("shell", geo.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), gel.a);
      return gep.a($$0, 32, 16);
   }

   public static gep e() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      $$1.a("shell", geo.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), gel.a);
      return gep.a($$0, 32, 16);
   }

   public void a(dvc $$0, float $$1, fgl $$2, glg $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.c()) {
         float $$7 = $$0.a(0.0F);
         fgp $$8 = a.a($$3, glq::d);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = azu.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, glq::g), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         fgp $$13 = ($$12 == 1 ? d : c).a($$3, glq::g);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         fli $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.d() ? e : f).a($$3, glq::g), $$4, $$5);
         $$2.b();
      }
   }
}
