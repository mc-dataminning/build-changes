import java.util.EnumSet;
import java.util.Optional;

public class guj implements gua<dzg> {
   private static final String a = "neck";
   private static final String b = "front";
   private static final String c = "back";
   private static final String d = "left";
   private static final String e = "right";
   private static final String f = "top";
   private static final String g = "bottom";
   private final gkr h;
   private final gkr i;
   private final gkr j;
   private final gkr k;
   private final gkr l;
   private final gkr m;
   private final gkr n;
   private static final float o = 0.125F;

   public guj(gub.a $$0) {
      this($$0.f());
   }

   public guj(gkn $$0) {
      gkr $$1 = $$0.a(gkq.av);
      this.h = $$1.b("neck");
      this.m = $$1.b("top");
      this.n = $$1.b("bottom");
      gkr $$2 = $$0.a(gkq.aw);
      this.i = $$2.b("front");
      this.j = $$2.b("back");
      this.k = $$2.b("left");
      this.l = $$2.b("right");
   }

   public static gkx b() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      gkv $$2 = new gkv(0.2F);
      gkv $$3 = new gkv(-0.1F);
      $$1.a(
         "neck",
         gkw.c().a(0, 0).a(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, $$3).a(0, 5).a(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, $$2),
         gkt.a(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      gkw $$4 = gkw.c().a(-14, 13).a(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      $$1.a("top", $$4, gkt.a(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      $$1.a("bottom", $$4, gkt.a(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return gkx.a($$0, 32, 32);
   }

   public static gkx c() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      gkw $$2 = gkw.c().a(1, 0).a(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(jc.c));
      $$1.a("back", $$2, gkt.a(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      $$1.a("left", $$2, gkt.a(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      $$1.a("right", $$2, gkt.a(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      $$1.a("front", $$2, gkt.a(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return gkx.a($$0, 16, 16);
   }

   private static hmx a(Optional<dag> $$0) {
      if ($$0.isPresent()) {
         hmx $$1 = gsh.a(dzi.a($$0.get()));
         if ($$1 != null) {
            return $$1;
         }
      }

      return gsh.A;
   }

   public void a(dzg $$0, float $$1, fld $$2, grn $$3, int $$4, int $$5, fgc $$6) {
      $$2.a();
      jc $$7 = $$0.k();
      $$2.a(0.5, 0.0, 0.5);
      $$2.a(a.d.rotationDegrees(180.0F - $$7.p()));
      $$2.a(-0.5, 0.0, -0.5);
      dzg.a $$8 = $$0.h;
      if ($$8 != null && $$0.i() != null) {
         float $$9 = ((float)($$0.i().ae() - $$0.g) + $$1) / (float)$$8.c;
         if ($$9 >= 0.0F && $$9 <= 1.0F) {
            if ($$8 == dzg.a.a) {
               float $$10 = 0.015625F;
               float $$11 = $$9 * (float) (Math.PI * 2);
               float $$12 = -1.5F * (azz.b($$11) + 0.5F) * azz.a($$11 / 2.0F);
               $$2.a(a.b.rotation($$12 * 0.015625F), 0.5F, 0.0F, 0.5F);
               float $$13 = azz.a($$11);
               $$2.a(a.f.rotation($$13 * 0.015625F), 0.5F, 0.0F, 0.5F);
            } else {
               float $$14 = azz.a(-$$9 * 3.0F * (float) Math.PI) * 0.125F;
               float $$15 = 1.0F - $$9;
               $$2.a(a.d.rotation($$14 * $$15), 0.5F, 0.0F, 0.5F);
            }
         }
      }

      this.b($$2, $$3, $$4, $$5, $$0.s());
      $$2.b();
   }

   public void a(fld $$0, grn $$1, int $$2, int $$3, dzw $$4) {
      this.b($$0, $$1, $$2, $$3, $$4);
   }

   private void b(fld $$0, grn $$1, int $$2, int $$3, dzw $$4) {
      flg $$5 = gsh.z.a($$1, gry::d);
      this.h.a($$0, $$5, $$2, $$3);
      this.m.a($$0, $$5, $$2, $$3);
      this.n.a($$0, $$5, $$2, $$3);
      this.a(this.i, $$0, $$1, $$2, $$3, a($$4.e()));
      this.a(this.j, $$0, $$1, $$2, $$3, a($$4.b()));
      this.a(this.k, $$0, $$1, $$2, $$3, a($$4.c()));
      this.a(this.l, $$0, $$1, $$2, $$3, a($$4.d()));
   }

   private void a(gkr $$0, fld $$1, grn $$2, int $$3, int $$4, hmx $$5) {
      $$0.a($$1, $$5.a($$2, gry::d), $$3, $$4);
   }
}
