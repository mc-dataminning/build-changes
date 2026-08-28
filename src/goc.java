import org.joml.Quaternionf;
import org.joml.Vector3f;

public class goc implements gnv<dvi> {
   public static final hdt a = new hdt(hbj.d, alz.b("entity/conduit/base"));
   public static final hdt b = new hdt(hbj.d, alz.b("entity/conduit/cage"));
   public static final hdt c = new hdt(hbj.d, alz.b("entity/conduit/wind"));
   public static final hdt d = new hdt(hbj.d, alz.b("entity/conduit/wind_vertical"));
   public static final hdt e = new hdt(hbj.d, alz.b("entity/conduit/open_eye"));
   public static final hdt f = new hdt(hbj.d, alz.b("entity/conduit/closed_eye"));
   private final gen g;
   private final gen h;
   private final gen i;
   private final gen j;
   private final gnu k;

   public goc(gnw.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(gem.Z);
      this.h = $$0.a(gem.ab);
      this.i = $$0.a(gem.aa);
      this.j = $$0.a(gem.Y);
   }

   public static get b() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      $$1.a("eye", ges.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new ger(0.01F)), gep.a);
      return get.a($$0, 16, 16);
   }

   public static get c() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      $$1.a("wind", ges.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), gep.a);
      return get.a($$0, 64, 32);
   }

   public static get d() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      $$1.a("shell", ges.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), gep.a);
      return get.a($$0, 32, 16);
   }

   public static get e() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      $$1.a("shell", ges.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), gep.a);
      return get.a($$0, 32, 16);
   }

   public void a(dvi $$0, float $$1, fgr $$2, glk $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.c()) {
         float $$7 = $$0.a(0.0F);
         fgv $$8 = a.a($$3, glu::d);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = bae.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, glu::g), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         fgv $$13 = ($$12 == 1 ? d : c).a($$3, glu::g);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         flo $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.d() ? e : f).a($$3, glu::g), $$4, $$5);
         $$2.b();
      }
   }
}
