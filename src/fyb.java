import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Nullable;

public class fyb implements fxt<djn> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final fpj h;
   private final fpj i;
   private final fpj j;
   private final fpj k;
   private final fpj l;
   private final fpj m;
   private final fpj n;
   private final gje o = Objects.requireNonNull(fwi.c(djo.a));
   private static final float p = 0.125F;

   public fyb(fxu.a $$0) {
      fpj $$1 = $$0.a(fpi.G);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      fpj $$2 = $$0.a(fpi.H);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static fpp b() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      fpn $$2 = new fpn(0.2F);
      fpn $$3 = new fpn(-0.1F);
      $$1.a(
         "neck",
         fpo.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         fpl.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      fpo $$4 = fpo.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, fpl.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, fpl.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return fpp.a($$0, 32, 32);
   }

   public static fpp c() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      fpo $$2 = fpo.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(ie.c));
      $$1.a("back", $$2, fpl.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, fpl.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, fpl.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, fpl.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return fpp.a($$0, 16, 16);
   }

   @Nullable
   private static gje a(coy $$0) {
      gje $$1 = fwi.c(djo.a($$0));
      if ($$1 == null) {
         $$1 = fwi.c(djo.a(cpg.qK));
      }

      return $$1;
   }

   public void a(djn $$0, float $$1, esh $$2, fvt $$3, int $$4, int $$5) {
      $$2.a();
      ie $$6 = $$0.l();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      djn.b $$7 = $$0.i;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().X() - $$0.h) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == djn.b.a) {
               float $$9 = 0.015625F;
               float $$10 = $$8 * (float) (Math.PI * 2);
               float $$11 = -1.5F * (awi.b($$10) + 0.5F) * awi.a($$10 / 2.0F);
               $$2.a(a.b.rotation($$11 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$12 = awi.a($$10);
               $$2.a(a.f.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$13 = awi.a(-$$8 * 3.0F * (float) Math.PI) * 0.125F;
               float $$14 = 1.0F - $$8;
               $$2.a(a.d.rotation($$13 * $$14), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      esl $$15 = this.o.a($$3, fwb::c);
      this.h.a($$2, $$15, $$4, $$5);
      this.m.a($$2, $$15, $$4, $$5);
      this.n.a($$2, $$15, $$4, $$5);
      djn.a $$16 = $$0.m();
      this.a(this.i, $$2, $$3, $$4, $$5, a($$16.e()));
      this.a(this.j, $$2, $$3, $$4, $$5, a($$16.b()));
      this.a(this.k, $$2, $$3, $$4, $$5, a($$16.c()));
      this.a(this.l, $$2, $$3, $$4, $$5, a($$16.d()));
      $$2.b();
   }

   private void a(fpj $$0, esh $$1, fvt $$2, int $$3, int $$4, @Nullable gje $$5) {
      if ($$5 == null) {
         $$5 = a(cpg.qK);
      }

      if ($$5 != null) {
         $$0.a($$1, $$5.a($$2, fwb::c), $$3, $$4);
      }
   }
}
