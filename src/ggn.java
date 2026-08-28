import java.util.EnumSet;
import java.util.Optional;

public class ggn implements ggf<dqg> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fxq h;
   private final fxq i;
   private final fxq j;
   private final fxq k;
   private final fxq l;
   private final fxq m;
   private final fxq n;
   private static final float o = 0.125F;

   public ggn(ggg.a $$0) {
      fxq $$1 = $$0.a(fxp.K);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fxq $$2 = $$0.a(fxp.L);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fxw b() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      fxu $$2 = new fxu(0.2F);
      fxu $$3 = new fxu(-0.1F);
      $$1.a(
         "neck",
         fxv.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fxs.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fxv $$4 = fxv.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fxs.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fxs.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fxw.a($$0, 32, 32);
   }

   public static fxw c() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      fxv $$2 = fxv.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jf.c));
      $$1.a("back", $$2, fxs.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fxs.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fxs.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fxs.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fxw.a($$0, 16, 16);
   }

   private static gru a(Optional<cty> $$0) {
      if ($$0.isPresent()) {
         gru $$1 = geu.a(dqi.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return geu.q;
   }

   public void a(dqg $$0, float $$1, fao $$2, gef $$3, int $$4, int $$5) {
      $$2.a();
      jf $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dqg.a $$7 = $$0.h;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().Z() - $$0.g) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dqg.a.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (ayg.b($$10) + 0.5F) * ayg.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = ayg.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = ayg.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      fas $$15 = geu.p.a($$3, gen::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dqv $$16 = $$0.l();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(fxq $$0, fao $$1, gef $$2, int $$3, int $$4, gru $$5) {
      $$0.a($$1, $$5.a($$2, gen::c), $$3, $$4);
   }
}
