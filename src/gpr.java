import java.util.EnumSet;
import java.util.Optional;

public class gpr implements gpj<dvj> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final ggc h;
   private final ggc i;
   private final ggc j;
   private final ggc k;
   private final ggc l;
   private final ggc m;
   private final ggc n;
   private static final float o = 0.125F;

   public gpr(gpk.a $$0) {
      this($$0.f());
   }

   public gpr(gfy $$0) {
      ggc $$1 = $$0.a(ggb.ap);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      ggc $$2 = $$0.a(ggb.aq);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static ggi b() {
      ggk $$0 = new ggk();
      ggm $$1 = $$0.a();
      ggg $$2 = new ggg(0.2F);
      ggg $$3 = new ggg(-0.1F);
      $$1.a(
         "neck",
         ggh.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         gge.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      ggh $$4 = ggh.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, gge.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, gge.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return ggi.a($$0, 32, 32);
   }

   public static ggi c() {
      ggk $$0 = new ggk();
      ggm $$1 = $$0.a();
      ggh $$2 = ggh.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jn.c));
      $$1.a("back", $$2, gge.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, gge.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, gge.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, gge.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return ggi.a($$0, 16, 16);
   }

   private static hhy a(Optional<cxd> $$0) {
      if ($$0.isPresent()) {
         hhy $$1 = gns.a(dvl.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gns.q;
   }

   public void a(dvj $$0, float $$1, fgr $$2, gmx $$3, int $$4, int $$5) {
      $$2.a();
      jn $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dvj.a $$7 = $$0.h;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().ae() - $$0.g) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dvj.a.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (ayz.b($$10) + 0.5F) * ayz.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = ayz.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = ayz.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      this.b($$2, $$3, $$4, $$5, $$0.s());
      $$2.b();
   }

   public void a(fgr $$0, gmx $$1, int $$2, int $$3, dvz $$4) {
      this.b($$0, $$1, $$2, $$3, $$4);
   }

   private void b(fgr $$0, gmx $$1, int $$2, int $$3, dvz $$4) {
      fgv $$5 = gns.p.a($$1, gnh::d);
      this.h.a($$0, $$5, $$2, $$3);
      this.m.a($$0, $$5, $$2, $$3);
      this.n.a($$0, $$5, $$2, $$3);
      this.a(this.i, $$0, $$1, $$2, $$3, a($$4.e()));
      this.a(this.j, $$0, $$1, $$2, $$3, a($$4.b()));
      this.a(this.k, $$0, $$1, $$2, $$3, a($$4.c()));
      this.a(this.l, $$0, $$1, $$2, $$3, a($$4.d()));
   }

   private void a(ggc $$0, fgr $$1, gmx $$2, int $$3, int $$4, hhy $$5) {
      $$0.a($$1, $$5.a($$2, gnh::d), $$3, $$4);
   }
}
