import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fyy implements fyq<dkb> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fqf h;
   private final fqf i;
   private final fqf j;
   private final fqf k;
   private final fqf l;
   private final fqf m;
   private final fqf n;
   private final gkc o = Objects.requireNonNull(fxf.c(dkc.a));
   private static final float p = 0.125F;

   public fyy(fyr.a $$0) {
      fqf $$1 = $$0.a(fqe.G);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fqf $$2 = $$0.a(fqe.H);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fql b() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      fqj $$2 = new fqj(0.2F);
      fqj $$3 = new fqj(-0.1F);
      $$1.a(
         "neck",
         fqk.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fqh.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fqk $$4 = fqk.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fqh.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fqh.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fql.a($$0, 32, 32);
   }

   public static fql c() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      fqk $$2 = fqk.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(ih.c));
      $$1.a("back", $$2, fqh.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fqh.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fqh.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fqh.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fql.a($$0, 16, 16);
   }

   @Nullable
   private static gkc a(cpl $$0) {
      gkc $$1 = fxf.c(dkc.a($$0));
      if ($$1 == null) {
         $$1 = fxf.c(dkc.a(cpt.qK));
      }

      return $$1;
   }

   public void a(dkb $$0, float $$1, etd $$2, fwq $$3, int $$4, int $$5) {
      $$2.a();
      ih $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dkb.b $$7 = $$0.i;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().X() - $$0.h) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dkb.b.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (awm.b($$10) + 0.5F) * awm.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = awm.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = awm.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      eth $$15 = this.o.a($$3, fwy::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dkb.a $$16 = $$0.l();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(fqf $$0, etd $$1, fwq $$2, int $$3, int $$4, @Nullable gkc $$5) {
      if ($$5 == null) {
         $$5 = a(cpt.qK);
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, fwy::c), $$3, $$4);
      }
   }
}
