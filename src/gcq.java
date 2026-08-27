import java.util.EnumSet;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class gcq implements gci<dne> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final ftv h;
   private final ftv i;
   private final ftv j;
   private final ftv k;
   private final ftv l;
   private final ftv m;
   private final ftv n;
   private final gnv o = Objects.requireNonNull(gax.a(dnf.a));
   private static final float p = 0.125F;

   public gcq(gcj.a $$0) {
      ftv $$1 = $$0.a(ftu.K);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      ftv $$2 = $$0.a(ftu.L);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fub b() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      ftz $$2 = new ftz(0.2F);
      ftz $$3 = new ftz(-0.1F);
      $$1.a(
         "neck",
         fua.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         ftx.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fua $$4 = fua.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, ftx.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, ftx.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fub.a($$0, 32, 32);
   }

   public static fub c() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      fua $$2 = fua.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(ij.c));
      $$1.a("back", $$2, ftx.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, ftx.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, ftx.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, ftx.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fub.a($$0, 16, 16);
   }

   @Nullable
   private static gnv a(Optional<crn> $$0) {
      if ($$0.isPresent()) {
         gnv $$1 = gax.a(dnf.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gax.a(dnf.a(crv.qK));
   }

   public void a(dne $$0, float $$1, ewr $$2, gai $$3, int $$4, int $$5) {
      $$2.a();
      ij $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dne.a $$7 = $$0.i;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().Y() - $$0.h) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dne.a.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (axm.b($$10) + 0.5F) * axm.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = axm.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = axm.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      ewv $$15 = this.o.a($$3, gaq::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dns $$16 = $$0.l();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(ftv $$0, ewr $$1, gai $$2, int $$3, int $$4, @Nullable gnv $$5) {
      if ($$5 == null) {
         $$5 = a(Optional.empty());
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, gaq::c), $$3, $$4);
      }
   }
}
