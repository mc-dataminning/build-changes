import java.util.EnumSet;
import java.util.Optional;

public class guw implements gun<dyu> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final gle h;
   private final gle i;
   private final gle j;
   private final gle k;
   private final gle l;
   private final gle m;
   private final gle n;
   private static final float o = 0.125F;

   public guw(guo.a $$0) {
      this($$0.f());
   }

   public guw(gla $$0) {
      gle $$1 = $$0.a(gld.av);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      gle $$2 = $$0.a(gld.aw);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static glk b() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      gli $$2 = new gli(0.2F);
      gli $$3 = new gli(-0.1F);
      $$1.a(
         "neck",
         glj.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         glg.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      glj $$4 = glj.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, glg.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, glg.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return glk.a($$0, 32, 32);
   }

   public static glk c() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      glj $$2 = glj.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jb.c));
      $$1.a("back", $$2, glg.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, glg.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, glg.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, glg.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return glk.a($$0, 16, 16);
   }

   private static hnh a(Optional<czu> $$0) {
      if ($$0.isPresent()) {
         hnh $$1 = gsu.a(dyw.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gsu.A;
   }

   public void a(dyu $$0, float $$1, flo $$2, gsa $$3, int $$4, int $$5, ffq $$6) {
      $$2.a();
      jb $$7 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$7.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dyu.a $$8 = $$0.h;
      if ($$8 != null && $$0.i() != null) {
         float $$9 = ((float)($$0.i().ae() - $$0.g) + $$1) / (float)$$8.c;
         if ($$9 >= 0.0F && $$9 <= 1.0F) {
            if ($$8 == dyu.a.a) {
               float $$10 = 0.015625F;
               float $$11 = $$9 * (float) (Math.PI * 2);
               float $$12 = -1.5F * (azo.b($$11) + 0.5F) * azo.a($$11 / 2.0F);
               $$2.a(a.b.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$13 = azo.a($$11);
               $$2.a(a.f.rotation($$13 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$14 = azo.a(-$$9 * 3.0F * (float) Math.PI) * 0.125F;
               float $$15 = 1.0F - $$9;
               $$2.a(a.d.rotation($$14 * $$15), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      this.b($$2, $$3, $$4, $$5, $$0.s());
      $$2.b();
   }

   public void a(flo $$0, gsa $$1, int $$2, int $$3, dzk $$4) {
      this.b($$0, $$1, $$2, $$3, $$4);
   }

   private void b(flo $$0, gsa $$1, int $$2, int $$3, dzk $$4) {
      flr $$5 = gsu.z.a($$1, gsl::d);
      this.h.a($$0, $$5, $$2, $$3);
      this.m.a($$0, $$5, $$2, $$3);
      this.n.a($$0, $$5, $$2, $$3);
      this.a(this.i, $$0, $$1, $$2, $$3, a($$4.e()));
      this.a(this.j, $$0, $$1, $$2, $$3, a($$4.b()));
      this.a(this.k, $$0, $$1, $$2, $$3, a($$4.c()));
      this.a(this.l, $$0, $$1, $$2, $$3, a($$4.d()));
   }

   private void a(gle $$0, flo $$1, gsa $$2, int $$3, int $$4, hnh $$5) {
      $$0.a($$1, $$5.a($$2, gsl::d), $$3, $$4);
   }
}
