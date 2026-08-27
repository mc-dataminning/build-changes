import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fvn implements fvf<dhk> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fmv h;
   private final fmv i;
   private final fmv j;
   private final fmv k;
   private final fmv l;
   private final fmv m;
   private final fmv n;
   private final ggo o = Objects.requireNonNull(ftu.c(dhl.a));
   private static final float p = 0.125F;

   public fvn(fvg.a $$0) {
      fmv $$1 = $$0.a(fmu.H);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fmv $$2 = $$0.a(fmu.I);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fnb b() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      fmz $$2 = new fmz(0.2F);
      fmz $$3 = new fmz(-0.1F);
      $$1.a(
         "neck",
         fna.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fmx.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fna $$4 = fna.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fmx.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fmx.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fnb.a($$0, 32, 32);
   }

   public static fnb c() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      fna $$2 = fna.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(ic.c));
      $$1.a("back", $$2, fmx.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fmx.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fmx.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fmx.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fnb.a($$0, 16, 16);
   }

   @Nullable
   private static ggo a(cms $$0) {
      ggo $$1 = ftu.c(dhl.a($$0));
      if ($$1 == null) {
         $$1 = ftu.c(dhl.a(cna.qI));
      }

      return $$1;
   }

   public void a(dhk $$0, float $$1, epz $$2, ftf $$3, int $$4, int $$5) {
      $$2.a();
      ic $$6 = $$0.l();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dhk.b $$7 = $$0.i;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().X() - $$0.h) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dhk.b.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (aun.b($$10) + 0.5F) * aun.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = aun.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = aun.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      eqd $$15 = this.o.a($$3, ftn::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dhk.a $$16 = $$0.m();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(fmv $$0, epz $$1, ftf $$2, int $$3, int $$4, @Nullable ggo $$5) {
      if ($$5 == null) {
         $$5 = a(cna.qI);
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, ftn::c), $$3, $$4);
      }
   }
}
