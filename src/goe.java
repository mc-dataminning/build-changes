import java.util.EnumSet;
import java.util.Optional;

public class goe implements gnw<dvo> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final geo h;
   private final geo i;
   private final geo j;
   private final geo k;
   private final geo l;
   private final geo m;
   private final geo n;
   private static final float o = 0.125F;

   public goe(gnx.a $$0) {
      geo $$1 = $$0.a(gen.ak);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      geo $$2 = $$0.a(gen.al);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static geu b() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      ges $$2 = new ges(0.2F);
      ges $$3 = new ges(-0.1F);
      $$1.a(
         "neck",
         get.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         geq.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      get $$4 = get.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, geq.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, geq.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return geu.a($$0, 32, 32);
   }

   public static geu c() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      get $$2 = get.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jm.c));
      $$1.a("back", $$2, geq.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, geq.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, geq.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, geq.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return geu.a($$0, 16, 16);
   }

   private static hdu a(Optional<cxl> $$0) {
      if ($$0.isPresent()) {
         hdu $$1 = gmg.a(dvq.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gmg.q;
   }

   public void a(dvo $$0, float $$1, fgs $$2, gll $$3, int $$4, int $$5) {
      $$2.a();
      jm $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dvo.a $$7 = $$0.h;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().ac() - $$0.g) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dvo.a.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (bae.b($$10) + 0.5F) * bae.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = bae.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = bae.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      fgw $$15 = gmg.p.a($$3, glv::d);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dwe $$16 = $$0.t();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(geo $$0, fgs $$1, gll $$2, int $$3, int $$4, hdu $$5) {
      $$0.a($$1, $$5.a($$2, glv::d), $$3, $$4);
   }
}
