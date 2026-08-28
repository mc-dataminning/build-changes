import java.util.EnumSet;
import java.util.Optional;

public class gos implements gok<duq> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final gfd h;
   private final gfd i;
   private final gfd j;
   private final gfd k;
   private final gfd l;
   private final gfd m;
   private final gfd n;
   private static final float o = 0.125F;

   public gos(gol.a $$0) {
      this($$0.f());
   }

   public gos(gez $$0) {
      gfd $$1 = $$0.a(gfc.an);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      gfd $$2 = $$0.a(gfc.ao);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static gfj b() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      gfh $$2 = new gfh(0.2F);
      gfh $$3 = new gfh(-0.1F);
      $$1.a(
         "neck",
         gfi.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         gff.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      gfi $$4 = gfi.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, gff.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, gff.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return gfj.a($$0, 32, 32);
   }

   public static gfj c() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      gfi $$2 = gfi.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jn.c));
      $$1.a("back", $$2, gff.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, gff.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, gff.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, gff.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return gfj.a($$0, 16, 16);
   }

   private static hgz a(Optional<cwl> $$0) {
      if ($$0.isPresent()) {
         hgz $$1 = gmt.a(dus.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gmt.q;
   }

   public void a(duq $$0, float $$1, ffu $$2, gly $$3, int $$4, int $$5) {
      $$2.a();
      jn $$6 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$6.p()));
      $$2.a(-0.5, 0.0, -0.5);
      duq.a $$7 = $$0.h;
      if ($$7 != null && $$0.i() != null) {
         float $$8 = ((float)($$0.i().ad() - $$0.g) + $$1) / (float)$$7.c;
         if ($$8 >= 0.0F && $$8 <= 1.0F) {
            if ($$7 == duq.a.a) {
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

      this.b($$2, $$3, $$4, $$5, $$0.s());
      $$2.b();
   }

   public void a(ffu $$0, gly $$1, int $$2, int $$3, dvg $$4) {
      this.b($$0, $$1, $$2, $$3, $$4);
   }

   private void b(ffu $$0, gly $$1, int $$2, int $$3, dvg $$4) {
      ffy $$5 = gmt.p.a($$1, gmi::d);
      this.h.a($$0, $$5, $$2, $$3);
      this.m.a($$0, $$5, $$2, $$3);
      this.n.a($$0, $$5, $$2, $$3);
      this.a(this.i, $$0, $$1, $$2, $$3, a($$4.e()));
      this.a(this.j, $$0, $$1, $$2, $$3, a($$4.b()));
      this.a(this.k, $$0, $$1, $$2, $$3, a($$4.c()));
      this.a(this.l, $$0, $$1, $$2, $$3, a($$4.d()));
   }

   private void a(gfd $$0, ffu $$1, gly $$2, int $$3, int $$4, hgz $$5) {
      $$0.a($$1, $$5.a($$2, gmi::d), $$3, $$4);
   }
}
