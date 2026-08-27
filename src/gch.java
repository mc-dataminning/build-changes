import java.util.EnumSet;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class gch implements gbz<dmv> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final ftm h;
   private final ftm i;
   private final ftm j;
   private final ftm k;
   private final ftm l;
   private final ftm m;
   private final ftm n;
   private final gnm o = Objects.requireNonNull(gao.c(dmw.a));
   private static final float p = 0.125F;

   public gch(gca.a $$0) {
      ftm $$1 = $$0.a(ftl.K);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      ftm $$2 = $$0.a(ftl.L);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fts b() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      ftq $$2 = new ftq(0.2F);
      ftq $$3 = new ftq(-0.1F);
      $$1.a(
         "neck",
         ftr.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fto.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      ftr $$4 = ftr.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fto.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fto.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fts.a($$0, 32, 32);
   }

   public static fts c() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      ftr $$2 = ftr.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(ih.c));
      $$1.a("back", $$2, fto.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fto.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fto.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fto.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fts.a($$0, 16, 16);
   }

   @Nullable
   private static gnm a(Optional<cre> $$0) {
      if ($$0.isPresent()) {
         gnm $$1 = gao.c(dmw.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gao.c(dmw.a(crm.qK));
   }

   public void a(dmv $$0, float $$1, ewi $$2, fzz $$3, int $$4, int $$5) {
      $$2.a();
      ih $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dmv.a $$7 = $$0.i;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().Y() - $$0.h) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == dmv.a.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (axk.b($$10) + 0.5F) * axk.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = axk.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = axk.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      ewm $$15 = this.o.a($$3, gah::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      dnj $$16 = $$0.l();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(ftm $$0, ewi $$1, fzz $$2, int $$3, int $$4, @Nullable gnm $$5) {
      if ($$5 == null) {
         $$5 = a(Optional.empty());
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, gah::c), $$3, $$4);
      }
   }
}
