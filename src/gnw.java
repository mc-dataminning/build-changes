import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gnw implements gnp<dvb> {
   public static final hdn a = new hdn(hbd.d, alz.b("entity/conduit/base"));
   public static final hdn b = new hdn(hbd.d, alz.b("entity/conduit/cage"));
   public static final hdn c = new hdn(hbd.d, alz.b("entity/conduit/wind"));
   public static final hdn d = new hdn(hbd.d, alz.b("entity/conduit/wind_vertical"));
   public static final hdn e = new hdn(hbd.d, alz.b("entity/conduit/open_eye"));
   public static final hdn f = new hdn(hbd.d, alz.b("entity/conduit/closed_eye"));
   private final geh g;
   private final geh h;
   private final geh i;
   private final geh j;
   private final gno k;

   public gnw(gnq.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(geg.Z);
      this.h = $$0.a(geg.ab);
      this.i = $$0.a(geg.aa);
      this.j = $$0.a(geg.Y);
   }

   public static gen b() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      $$1.a("eye", gem.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new gel(0.01F)), gej.a);
      return gen.a($$0, 16, 16);
   }

   public static gen c() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      $$1.a("wind", gem.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), gej.a);
      return gen.a($$0, 64, 32);
   }

   public static gen d() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      $$1.a("shell", gem.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), gej.a);
      return gen.a($$0, 32, 16);
   }

   public static gen e() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      $$1.a("shell", gem.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), gej.a);
      return gen.a($$0, 32, 16);
   }

   public void a(dvb $$0, float $$1, fgl $$2, gle $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.c()) {
         float $$7 = $$0.a(0.0F);
         fgp $$8 = a.a($$3, glo::c);
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
         this.j.a($$2, b.a($$3, glo::f), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         fgp $$13 = ($$12 == 1 ? d : c).a($$3, glo::f);
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
         this.g.a($$2, ($$0.d() ? e : f).a($$3, glo::f), $$4, $$5);
         $$2.b();
      }
   }
}
