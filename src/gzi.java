import java.util.List;
import javax.annotation.Nullable;

public class gzi {
   public static final alk a = alk.b("textures/misc/enchanted_glint_armor.png");
   public static final alk b = alk.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final int i = -1;
   private final hhs j;
   private final hhu k = new hhu();

   public gzi(hhs $$0) {
      this.j = $$0;
   }

   public static void a(czy $$0, flq $$1, gsc $$2, int $$3, int $$4, int[] $$5, List<gti> $$6, gsn $$7, hhu.a $$8) {
      flt $$10;
      if ($$8 == hhu.a.c) {
         flq.a $$9 = $$1.c().d();
         if ($$0 == czy.g) {
            f.a($$9.a(), 0.5F);
         } else if ($$0.b()) {
            f.a($$9.a(), 0.75F);
         }

         $$10 = a($$2, $$7, $$9);
      } else {
         $$10 = a($$2, $$7, true, $$8 != hhu.a.a);
      }

      a($$1, $$10, $$6, $$5, $$3, $$4);
   }

   public static flt a(gsc $$0, gsn $$1, boolean $$2) {
      return $$2 ? flw.a($$0.getBuffer(gsn.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private static flt a(gsc $$0, gsn $$1, flq.a $$2) {
      return flw.a(new flr($$0.getBuffer(gsn.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static flt a(gsc $$0, gsn $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return frf.O() && $$1 == gsw.j()
            ? flw.a($$0.getBuffer(gsn.l()), $$0.getBuffer($$1))
            : flw.a($$0.getBuffer($$2 ? gsn.m() : gsn.n()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private static int a(int[] $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.length ? $$0[$$1] : -1;
   }

   private static void a(flq $$0, flt $$1, List<gti> $$2, int[] $$3, int $$4, int $$5) {
      flq.a $$6 = $$0.c();

      for (gti $$7 : $$2) {
         float $$9;
         float $$10;
         float $$11;
         float $$12;
         if ($$7.a()) {
            int $$8 = a($$3, $$7.c());
            $$9 = (float)aya.a($$8) / 255.0F;
            $$10 = (float)aya.b($$8) / 255.0F;
            $$11 = (float)aya.c($$8) / 255.0F;
            $$12 = (float)aya.d($$8) / 255.0F;
         } else {
            $$9 = 1.0F;
            $$10 = 1.0F;
            $$11 = 1.0F;
            $$12 = 1.0F;
         }

         $$1.a($$6, $$7, $$10, $$11, $$12, $$9, $$4, $$5);
      }
   }

   public void a(daa $$0, czy $$1, int $$2, int $$3, flq $$4, gsc $$5, @Nullable djz $$6, int $$7) {
      this.a(null, $$0, $$1, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bxw $$0, daa $$1, czy $$2, flq $$3, gsc $$4, @Nullable djz $$5, int $$6, int $$7, int $$8) {
      this.j.a(this.k, $$1, $$2, $$5, $$0, $$8);
      this.k.a($$3, $$4, $$6, $$7);
   }
}
