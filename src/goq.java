import java.util.EnumSet;
import java.util.Optional;

public class goq implements goi<duq> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final gfc h;
   private final gfc i;
   private final gfc j;
   private final gfc k;
   private final gfc l;
   private final gfc m;
   private final gfc n;
   private static final float o = 0.125F;

   public goq(goj.a $$0) {
      this($$0.f());
   }

   public goq(gey $$0) {
      gfc $$1 = $$0.a(gfb.an);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      gfc $$2 = $$0.a(gfb.ao);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static gfi b() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      gfg $$2 = new gfg(0.2F);
      gfg $$3 = new gfg(-0.1F);
      $$1.a(
         "neck",
         gfh.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         gfe.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      gfh $$4 = gfh.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, gfe.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, gfe.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return gfi.a($$0, 32, 32);
   }

   public static gfi c() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      gfh $$2 = gfh.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jn.c));
      $$1.a("back", $$2, gfe.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, gfe.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, gfe.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, gfe.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return gfi.a($$0, 16, 16);
   }

   private static hgs a(Optional<cwl> $$0) {
      if ($$0.isPresent()) {
         hgs $$1 = gms.a(dus.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gms.q;
   }

   public void a(duq $$0, float $$1, ffu $$2, glx $$3, int $$4, int $$5) {
      $$2.a();
      jn $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      duq.a $$7 = $$0.h;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().ad() - $$0.g) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == duq.a.a) {
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

   public void a(ffu $$0, glx $$1, int $$2, int $$3, dvg $$4) {
      this.b($$0, $$1, $$2, $$3, $$4);
   }

   private void b(ffu $$0, glx $$1, int $$2, int $$3, dvg $$4) {
      ffy $$5 = gms.p.a($$1, gmh::d);
      this.h.a($$0, $$5, $$2, $$3);
      this.m.a($$0, $$5, $$2, $$3);
      this.n.a($$0, $$5, $$2, $$3);
      this.a(this.i, $$0, $$1, $$2, $$3, a($$4.e()));
      this.a(this.j, $$0, $$1, $$2, $$3, a($$4.b()));
      this.a(this.k, $$0, $$1, $$2, $$3, a($$4.c()));
      this.a(this.l, $$0, $$1, $$2, $$3, a($$4.d()));
   }

   private void a(gfc $$0, ffu $$1, glx $$2, int $$3, int $$4, hgs $$5) {
      $$0.a($$1, $$5.a($$2, gmh::d), $$3, $$4);
   }
}
