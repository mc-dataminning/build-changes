import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ghn implements ghg<dqo> {
   public static final gtc a = new gtc(gqx.e, new akt("entity/conduit/base"));
   public static final gtc b = new gtc(gqx.e, new akt("entity/conduit/cage"));
   public static final gtc c = new gtc(gqx.e, new akt("entity/conduit/wind"));
   public static final gtc d = new gtc(gqx.e, new akt("entity/conduit/wind_vertical"));
   public static final gtc e = new gtc(gqx.e, new akt("entity/conduit/open_eye"));
   public static final gtc f = new gtc(gqx.e, new akt("entity/conduit/closed_eye"));
   private final fys g;
   private final fys h;
   private final fys i;
   private final fys j;
   private final ghf k;

   public ghn(ghh.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(fyr.E);
      this.h = $$0.a(fyr.G);
      this.i = $$0.a(fyr.F);
      this.j = $$0.a(fyr.D);
   }

   public static fyy b() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      $$1.a("eye", fyx.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new fyw(0.01F)), fyu.a);
      return fyy.a($$0, 16, 16);
   }

   public static fyy c() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      $$1.a("wind", fyx.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), fyu.a);
      return fyy.a($$0, 64, 32);
   }

   public static fyy d() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      $$1.a("shell", fyx.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), fyu.a);
      return fyy.a($$0, 32, 16);
   }

   public static fyy e() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      $$1.a("shell", fyx.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fyu.a);
      return fyy.a($$0, 32, 16);
   }

   public void a(dqo $$0, float $$1, fbc $$2, gfg $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.c()) {
         float $$7 = $$0.a(0.0F);
         fbg $$8 = a.a($$3, gfo::c);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = aym.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, gfo::e), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         fbg $$13 = ($$12 == 1 ? d : c).a($$3, gfo::e);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         ffu $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.d() ? e : f).a($$3, gfo::e), $$4, $$5);
         $$2.b();
      }
   }
}
