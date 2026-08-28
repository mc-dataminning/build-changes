import java.util.List;
import javax.annotation.Nullable;

public class gyt {
   public static final alr a = alr.b("textures/misc/enchanted_glint_armor.png");
   public static final alr b = alr.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final int i = -1;
   private final hhg j;
   private final hhi k = new hhi();

   public gyt(hhg $$0) {
      this.j = $$0;
   }

   public static void a(dai $$0, fld $$1, grn $$2, int $$3, int $$4, int[] $$5, List<gst> $$6, gry $$7, hhi.a $$8) {
      flg $$10;
      if ($$8 == hhi.a.c) {
         fld.a $$9 = $$1.c().d();
         if ($$0 == dai.g) {
            f.a($$9.a(), 0.5F);
         } else if ($$0.b()) {
            f.a($$9.a(), 0.75F);
         }

         $$10 = a($$2, $$7, $$9);
      } else {
         $$10 = a($$2, $$7, true, $$8 != hhi.a.a);
      }

      a($$1, $$10, $$6, $$5, $$3, $$4);
   }

   public static flg a(grn $$0, gry $$1, boolean $$2) {
      return $$2 ? flh.a($$0.getBuffer(gry.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private static flg a(grn $$0, gry $$1, fld.a $$2) {
      return flh.a(new fle($$0.getBuffer(gry.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static flg a(grn $$0, gry $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fqq.O() && $$1 == gsh.j()
            ? flh.a($$0.getBuffer(gry.l()), $$0.getBuffer($$1))
            : flh.a($$0.getBuffer($$2 ? gry.m() : gry.n()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private static int a(int[] $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.length ? $$0[$$1] : -1;
   }

   private static void a(fld $$0, flg $$1, List<gst> $$2, int[] $$3, int $$4, int $$5) {
      fld.a $$6 = $$0.c();

      for (gst $$7 : $$2) {
         float $$9;
         float $$10;
         float $$11;
         float $$12;
         if ($$7.a()) {
            int $$8 = a($$3, $$7.c());
            $$9 = (float)ayh.a($$8) / 255.0F;
            $$10 = (float)ayh.b($$8) / 255.0F;
            $$11 = (float)ayh.c($$8) / 255.0F;
            $$12 = (float)ayh.d($$8) / 255.0F;
         } else {
            $$9 = 1.0F;
            $$10 = 1.0F;
            $$11 = 1.0F;
            $$12 = 1.0F;
         }

         $$1.a($$6, $$7, $$10, $$11, $$12, $$9, $$4, $$5);
      }
   }

   public void a(dak $$0, dai $$1, int $$2, int $$3, fld $$4, grn $$5, @Nullable dkj $$6, int $$7) {
      this.a(null, $$0, $$1, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable byf $$0, dak $$1, dai $$2, fld $$3, grn $$4, @Nullable dkj $$5, int $$6, int $$7, int $$8) {
      this.j.a(this.k, $$1, $$2, $$5, $$0, $$8);
      this.k.a($$3, $$4, $$6, $$7);
   }
}
