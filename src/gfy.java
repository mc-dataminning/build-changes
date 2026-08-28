import java.util.EnumSet;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class gfy implements gfq<dpz> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fxc h;
   private final fxc i;
   private final fxc j;
   private final fxc k;
   private final fxc l;
   private final fxc m;
   private final fxc n;
   private final grf o = Objects.requireNonNull(gef.a(dqa.a));
   private static final float p = 0.125F;

   public gfy(gfr.a $$0) {
      fxc $$1 = $$0.a(fxb.K);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fxc $$2 = $$0.a(fxb.L);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fxi b() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      fxg $$2 = new fxg(0.2F);
      fxg $$3 = new fxg(-0.1F);
      $$1.a(
         "neck",
         fxh.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fxe.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fxh $$4 = fxh.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fxe.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fxe.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fxi.a($$0, 32, 32);
   }

   public static fxi c() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      fxh $$2 = fxh.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(je.c));
      $$1.a("back", $$2, fxe.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fxe.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fxe.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fxe.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fxi.a($$0, 16, 16);
   }

   @Nullable
   private static grf a(Optional<cum> $$0) {
      if ($$0.isPresent()) {
         grf $$1 = gef.a(dqa.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gef.a(dqa.a(cuu.qL));
   }

   public void a(dpz $$0, float $$1, faa $$2, gdq $$3, int $$4, int $$5) {
      $$2.a();
      je $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dpz.a $$7 = $$0.h;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().Z() - $$0.g) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dpz.a.a) {
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

      fae $$15 = this.o.a($$3, gdy::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dqn $$16 = $$0.l();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(fxc $$0, faa $$1, gdq $$2, int $$3, int $$4, @Nullable grf $$5) {
      if ($$5 == null) {
         $$5 = a(Optional.empty());
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, gdy::c), $$3, $$4);
      }
   }
}
