import java.util.EnumSet;
import java.util.Optional;

public class guy implements gup<dyw> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final glg h;
   private final glg i;
   private final glg j;
   private final glg k;
   private final glg l;
   private final glg m;
   private final glg n;
   private static final float o = 0.125F;

   public guy(guq.a $$0) {
      this($$0.f());
   }

   public guy(glc $$0) {
      glg $$1 = $$0.a(glf.av);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      glg $$2 = $$0.a(glf.aw);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static glm b() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      glk $$2 = new glk(0.2F);
      glk $$3 = new glk(-0.1F);
      $$1.a(
         "neck",
         gll.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         gli.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      gll $$4 = gll.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, gli.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, gli.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return glm.a($$0, 32, 32);
   }

   public static glm c() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      gll $$2 = gll.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jc.c));
      $$1.a("back", $$2, gli.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, gli.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, gli.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, gli.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return glm.a($$0, 16, 16);
   }

   private static hnj a(Optional<czw> $$0) {
      if ($$0.isPresent()) {
         hnj $$1 = gsw.a(dyy.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gsw.A;
   }

   public void a(dyw $$0, float $$1, flq $$2, gsc $$3, int $$4, int $$5, ffs $$6) {
      $$2.a();
      jc $$7 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$7.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dyw.a $$8 = $$0.h;
      if ($$8 != null && $$0.i() != null) {
         float $$9 = ((float)($$0.i().ae() - $$0.g) + $$1) / (float)$$8.c;
         if ($$9 >= 0.0F && $$9 <= 1.0F) {
            if ($$8 == dyw.a.a) {
               float $$10 = 0.015625F;
               float $$11 = $$9 * (float) (Math.PI * 2);
               float $$12 = -1.5F * (azq.b($$11) + 0.5F) * azq.a($$11 / 2.0F);
               $$2.a(a.b.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$13 = azq.a($$11);
               $$2.a(a.f.rotation($$13 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$14 = azq.a(-$$9 * 3.0F * (float) Math.PI) * 0.125F;
               float $$15 = 1.0F - $$9;
               $$2.a(a.d.rotation($$14 * $$15), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      this.b($$2, $$3, $$4, $$5, $$0.s());
      $$2.b();
   }

   public void a(flq $$0, gsc $$1, int $$2, int $$3, dzm $$4) {
      this.b($$0, $$1, $$2, $$3, $$4);
   }

   private void b(flq $$0, gsc $$1, int $$2, int $$3, dzm $$4) {
      flt $$5 = gsw.z.a($$1, gsn::d);
      this.h.a($$0, $$5, $$2, $$3);
      this.m.a($$0, $$5, $$2, $$3);
      this.n.a($$0, $$5, $$2, $$3);
      this.a(this.i, $$0, $$1, $$2, $$3, a($$4.e()));
      this.a(this.j, $$0, $$1, $$2, $$3, a($$4.b()));
      this.a(this.k, $$0, $$1, $$2, $$3, a($$4.c()));
      this.a(this.l, $$0, $$1, $$2, $$3, a($$4.d()));
   }

   private void a(glg $$0, flq $$1, gsc $$2, int $$3, int $$4, hnj $$5) {
      $$0.a($$1, $$5.a($$2, gsn::d), $$3, $$4);
   }
}
