import java.util.EnumSet;
import java.util.Optional;

public class gqt implements gqk<dwd> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final ghd h;
   private final ghd i;
   private final ghd j;
   private final ghd k;
   private final ghd l;
   private final ghd m;
   private final ghd n;
   private static final float o = 0.125F;

   public gqt(gql.a $$0) {
      this($$0.f());
   }

   public gqt(ggz $$0) {
      ghd $$1 = $$0.a(ghc.ar);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      ghd $$2 = $$0.a(ghc.as);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static ghj b() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      ghh $$2 = new ghh(0.2F);
      ghh $$3 = new ghh(-0.1F);
      $$1.a(
         "neck",
         ghi.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         ghf.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      ghi $$4 = ghi.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, ghf.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, ghf.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return ghj.a($$0, 32, 32);
   }

   public static ghj c() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      ghi $$2 = ghi.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jo.c));
      $$1.a("back", $$2, ghf.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, ghf.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, ghf.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, ghf.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return ghj.a($$0, 16, 16);
   }

   private static hiz a(Optional<cxu> $$0) {
      if ($$0.isPresent()) {
         hiz $$1 = got.a(dwf.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return got.q;
   }

   public void a(dwd $$0, float $$1, fho $$2, gny $$3, int $$4, int $$5) {
      $$2.a();
      jo $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dwd.a $$7 = $$0.h;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().ae() - $$0.g) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dwd.a.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (azk.b($$10) + 0.5F) * azk.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = azk.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = azk.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      this.b($$2, $$3, $$4, $$5, $$0.s());
      $$2.b();
   }

   public void a(fho $$0, gny $$1, int $$2, int $$3, dwt $$4) {
      this.b($$0, $$1, $$2, $$3, $$4);
   }

   private void b(fho $$0, gny $$1, int $$2, int $$3, dwt $$4) {
      fhs $$5 = got.p.a($$1, goi::d);
      this.h.a($$0, $$5, $$2, $$3);
      this.m.a($$0, $$5, $$2, $$3);
      this.n.a($$0, $$5, $$2, $$3);
      this.a(this.i, $$0, $$1, $$2, $$3, a($$4.e()));
      this.a(this.j, $$0, $$1, $$2, $$3, a($$4.b()));
      this.a(this.k, $$0, $$1, $$2, $$3, a($$4.c()));
      this.a(this.l, $$0, $$1, $$2, $$3, a($$4.d()));
   }

   private void a(ghd $$0, fho $$1, gny $$2, int $$3, int $$4, hiz $$5) {
      $$0.a($$1, $$5.a($$2, goi::d), $$3, $$4);
   }
}
