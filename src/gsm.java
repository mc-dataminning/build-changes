import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gsm implements gse<dxk> {
   public static final gpr a = new gpr(hio.d, "entity/conduit");
   public static final hkw b = a.a("base");
   public static final hkw c = a.a("cage");
   public static final hkw d = a.a("wind");
   public static final hkw e = a.a("wind_vertical");
   public static final hkw f = a.a("open_eye");
   public static final hkw g = a.a("closed_eye");
   private final giu h;
   private final giu i;
   private final giu j;
   private final giu k;
   private final gsd l;

   public gsm(gsf.a $$0) {
      this.l = $$0.a();
      this.h = $$0.a(git.ai);
      this.i = $$0.a(git.ak);
      this.j = $$0.a(git.aj);
      this.k = $$0.a(git.ah);
   }

   public static gja b() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      $$1.a("eye", giz.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new giy(0.01F)), giw.a);
      return gja.a($$0, 16, 16);
   }

   public static gja c() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      $$1.a("wind", giz.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), giw.a);
      return gja.a($$0, 64, 32);
   }

   public static gja d() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      $$1.a("shell", giz.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), giw.a);
      return gja.a($$0, 32, 16);
   }

   public static gja e() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      $$1.a("shell", giz.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), giw.a);
      return gja.a($$0, 32, 16);
   }

   public void a(dxk $$0, float $$1, fjc $$2, gps $$3, int $$4, int $$5, fei $$6) {
      float $$7 = (float)$$0.a + $$1;
      if (!$$0.c()) {
         float $$8 = $$0.a(0.0F);
         fjg $$9 = b.a($$3, gqc::d);
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
         this.k.a($$2, c.a($$3, gqc::g), $$4, $$5);
         $$2.b();
         int $$13 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$13 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$13 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         fjg $$14 = ($$13 == 1 ? e : d).a($$3, gqc::g);
         this.i.a($$2, $$14, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.i.a($$2, $$14, $$4, $$5);
         $$2.b();
         fnz $$15 = this.l.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$11 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$16 = -$$15.e();
         $$2.a(new Quaternionf().rotationYXZ($$16 * (float) (Math.PI / 180.0), $$15.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$17 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.h.a($$2, ($$0.d() ? f : g).a($$3, gqc::g), $$4, $$5);
         $$2.b();
      }
   }
}
