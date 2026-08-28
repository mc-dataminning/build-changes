import java.util.List;
import javax.annotation.Nullable;

public class gvd {
   public static final ald a = ald.b("textures/misc/enchanted_glint_entity.png");
   public static final ald b = ald.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final int i = -1;
   private final hdl j;
   private final hdn k = new hdn();

   public gvd(hdl $$0) {
      this.j = $$0;
   }

   private static void a(his $$0, int[] $$1, int $$2, int $$3, fho $$4, fhs $$5) {
      azs $$6 = azs.a();
      long $$7 = 42L;

      for (jo $$8 : jo.values()) {
         $$6.b(42L);
         a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public static void a(cxw $$0, fho $$1, gny $$2, int $$3, int $$4, int[] $$5, his $$6, goi $$7, hdn.a $$8) {
      fhs $$10;
      if ($$8 == hdn.a.c) {
         fho.a $$9 = $$1.c().c();
         if ($$0 == cxw.g) {
            f.a($$9.a(), 0.5F);
         } else if ($$0.b()) {
            f.a($$9.a(), 0.75F);
         }

         $$10 = a($$2, $$7, $$9);
      } else {
         $$10 = a($$2, $$7, true, $$8 != hdn.a.a);
      }

      a($$6, $$5, $$3, $$4, $$1, $$10);
   }

   public static fhs a(gny $$0, goi $$1, boolean $$2) {
      return $$2 ? fhv.a($$0.getBuffer(goi.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private static fhs a(gny $$0, goi $$1, fho.a $$2) {
      return fhv.a(new fhp($$0.getBuffer(goi.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fhs a(gny $$0, goi $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fnd.O() && $$1 == got.j()
            ? fhv.a($$0.getBuffer(goi.k()), $$0.getBuffer($$1))
            : fhv.a($$0.getBuffer($$2 ? goi.l() : goi.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private static int a(int[] $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.length ? $$0[$$1] : -1;
   }

   private static void a(fho $$0, fhs $$1, List<gpf> $$2, int[] $$3, int $$4, int $$5) {
      fho.a $$6 = $$0.c();

      for (gpf $$7 : $$2) {
         float $$9;
         float $$10;
         float $$11;
         float $$12;
         if ($$7.c()) {
            int $$8 = a($$3, $$7.d());
            $$9 = (float)axu.a($$8) / 255.0F;
            $$10 = (float)axu.b($$8) / 255.0F;
            $$11 = (float)axu.c($$8) / 255.0F;
            $$12 = (float)axu.d($$8) / 255.0F;
         } else {
            $$9 = 1.0F;
            $$10 = 1.0F;
            $$11 = 1.0F;
            $$12 = 1.0F;
         }

         $$1.a($$6, $$7, $$10, $$11, $$12, $$9, $$4, $$5);
      }
   }

   public void a(cxy $$0, cxw $$1, int $$2, int $$3, fho $$4, gny $$5, @Nullable dhp $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bwr $$0, cxy $$1, cxw $$2, boolean $$3, fho $$4, gny $$5, @Nullable dhp $$6, int $$7, int $$8, int $$9) {
      this.j.a(this.k, $$1, $$2, $$3, $$6, $$0, $$9);
      this.k.a($$4, $$5, $$7, $$8);
   }
}
