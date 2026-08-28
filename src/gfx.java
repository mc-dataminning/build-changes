import java.util.EnumSet;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class gfx implements gfp<dpy> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fxb h;
   private final fxb i;
   private final fxb j;
   private final fxb k;
   private final fxb l;
   private final fxb m;
   private final fxb n;
   private final gre o = Objects.requireNonNull(gee.a(dpz.a));
   private static final float p = 0.125F;

   public gfx(gfq.a $$0) {
      fxb $$1 = $$0.a(fxa.K);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fxb $$2 = $$0.a(fxa.L);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fxh b() {
      fxj $$0 = new fxj();
      fxk $$1 = $$0.a();
      fxf $$2 = new fxf(0.2F);
      fxf $$3 = new fxf(-0.1F);
      $$1.a(
         "neck",
         fxg.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fxd.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fxg $$4 = fxg.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fxd.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fxd.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fxh.a($$0, 32, 32);
   }

   public static fxh c() {
      fxj $$0 = new fxj();
      fxk $$1 = $$0.a();
      fxg $$2 = fxg.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(je.c));
      $$1.a("back", $$2, fxd.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fxd.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fxd.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fxd.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fxh.a($$0, 16, 16);
   }

   @Nullable
   private static gre a(Optional<cul> $$0) {
      if ($$0.isPresent()) {
         gre $$1 = gee.a(dpz.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gee.a(dpz.a(cut.qL));
   }

   public void a(dpy $$0, float $$1, ezz $$2, gdp $$3, int $$4, int $$5) {
      $$2.a();
      je $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dpy.a $$7 = $$0.h;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().Z() - $$0.g) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dpy.a.a) {
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

      fad $$15 = this.o.a($$3, gdx::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dqm $$16 = $$0.l();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(fxb $$0, ezz $$1, gdp $$2, int $$3, int $$4, @Nullable gre $$5) {
      if ($$5 == null) {
         $$5 = a(Optional.empty());
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, gdx::c), $$3, $$4);
      }
   }
}
