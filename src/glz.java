import java.util.EnumSet;
import java.util.Optional;

public class glz implements glr<dto> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final gcl h;
   private final gcl i;
   private final gcl j;
   private final gcl k;
   private final gcl l;
   private final gcl m;
   private final gcl n;
   private static final float o = 0.125F;

   public glz(gls.a $$0) {
      gcl $$1 = $$0.a(gck.aj);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      gcl $$2 = $$0.a(gck.ak);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static gcr b() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      gcp $$2 = new gcp(0.2F);
      gcp $$3 = new gcp(-0.1F);
      $$1.a(
         "neck",
         gcq.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         gcn.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      gcq $$4 = gcq.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, gcn.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, gcn.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return gcr.a($$0, 32, 32);
   }

   public static gcr c() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      gcq $$2 = gcq.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jm.c));
      $$1.a("back", $$2, gcn.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, gcn.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, gcn.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, gcn.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return gcr.a($$0, 16, 16);
   }

   private static hbn a(Optional<cwi> $$0) {
      if ($$0.isPresent()) {
         hbn $$1 = gkb.a(dtq.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gkb.q;
   }

   public void a(dto $$0, float $$1, fer $$2, gjg $$3, int $$4, int $$5) {
      $$2.a();
      jm $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dto.a $$7 = $$0.h;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().ab() - $$0.g) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dto.a.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (azm.b($$10) + 0.5F) * azm.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = azm.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = azm.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      fev $$15 = gkb.p.a($$3, gjq::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      due $$16 = $$0.t();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(gcl $$0, fer $$1, gjg $$2, int $$3, int $$4, hbn $$5) {
      $$0.a($$1, $$5.a($$2, gjq::c), $$3, $$4);
   }
}
