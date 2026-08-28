import java.util.List;
import javax.annotation.Nullable;

public class gsz {
   public static final aku a = aku.b("textures/misc/enchanted_glint_entity.png");
   public static final aku b = aku.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final int i = -1;
   private final hbi j;
   private final hbk k = new hbk();

   public gsz(hbi $$0) {
      this.j = $$0;
   }

   private static void a(hgm $$0, int[] $$1, int $$2, int $$3, ffs $$4, ffw $$5) {
      azg $$6 = azg.a();
      long $$7 = 42L;

      for (jn $$8 : jn.values()) {
         $$6.b(42L);
         a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public static void a(cwl $$0, ffs $$1, glv $$2, int $$3, int $$4, int[] $$5, hgm $$6, gmf $$7, hbk.a $$8) {
      ffw $$10;
      if ($$8 == hbk.a.c) {
         ffs.a $$9 = $$1.c().c();
         if ($$0 == cwl.g) {
            f.a($$9.a(), 0.5F);
         } else if ($$0.b()) {
            f.a($$9.a(), 0.75F);
         }

         $$10 = a($$2, $$7, $$9);
      } else {
         $$10 = a($$2, $$7, true, $$8 != hbk.a.a);
      }

      a($$6, $$5, $$3, $$4, $$1, $$10);
   }

   public static ffw a(glv $$0, gmf $$1, boolean $$2) {
      return $$2 ? ffz.a($$0.getBuffer(gmf.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private static ffw a(glv $$0, gmf $$1, ffs.a $$2) {
      return ffz.a(new fft($$0.getBuffer(gmf.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static ffw a(glv $$0, gmf $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return flh.O() && $$1 == gmq.j()
            ? ffz.a($$0.getBuffer(gmf.k()), $$0.getBuffer($$1))
            : ffz.a($$0.getBuffer($$2 ? gmf.l() : gmf.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private static int a(int[] $$0, int $$1) {
      return $$1 >= $$0.length ? -1 : $$0[$$1];
   }

   private static void a(ffs $$0, ffw $$1, List<gnc> $$2, int[] $$3, int $$4, int $$5) {
      ffs.a $$6 = $$0.c();

      for (gnc $$7 : $$2) {
         float $$9;
         float $$10;
         float $$11;
         float $$12;
         if ($$7.c()) {
            int $$8 = a($$3, $$7.d());
            $$9 = (float)axj.a($$8) / 255.0F;
            $$10 = (float)axj.b($$8) / 255.0F;
            $$11 = (float)axj.c($$8) / 255.0F;
            $$12 = (float)axj.d($$8) / 255.0F;
         } else {
            $$9 = 1.0F;
            $$10 = 1.0F;
            $$11 = 1.0F;
            $$12 = 1.0F;
         }

         $$1.a($$6, $$7, $$10, $$11, $$12, $$9, $$4, $$5);
      }
   }

   public void a(cwn $$0, cwl $$1, int $$2, int $$3, ffs $$4, glv $$5, @Nullable dgg $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bvf $$0, cwn $$1, cwl $$2, boolean $$3, ffs $$4, glv $$5, @Nullable dgg $$6, int $$7, int $$8, int $$9) {
      this.j.a(this.k, $$1, $$2, $$3, $$6, $$0, $$9);
      this.k.a($$4, $$5, $$7, $$8);
   }
}
