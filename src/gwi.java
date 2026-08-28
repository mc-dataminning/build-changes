import java.util.List;
import javax.annotation.Nullable;

public class gwi {
   public static final ale a = ale.b("textures/misc/enchanted_glint_entity.png");
   public static final ale b = ale.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final int i = -1;
   private final heq j;
   private final hes k = new hes();

   public gwi(heq $$0) {
      this.j = $$0;
   }

   private static void a(hjz $$0, int[] $$1, int $$2, int $$3, fiq $$4, fiu $$5) {
      azt $$6 = azt.a();
      long $$7 = 42L;

      for (ja $$8 : ja.values()) {
         $$6.b(42L);
         a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public static void a(cyq $$0, fiq $$1, gpd $$2, int $$3, int $$4, int[] $$5, hjz $$6, gpn $$7, hes.a $$8) {
      fiu $$10;
      if ($$8 == hes.a.c) {
         fiq.a $$9 = $$1.c().c();
         if ($$0 == cyq.g) {
            f.a($$9.a(), 0.5F);
         } else if ($$0.b()) {
            f.a($$9.a(), 0.75F);
         }

         $$10 = a($$2, $$7, $$9);
      } else {
         $$10 = a($$2, $$7, true, $$8 != hes.a.a);
      }

      a($$6, $$5, $$3, $$4, $$1, $$10);
   }

   public static fiu a(gpd $$0, gpn $$1, boolean $$2) {
      return $$2 ? fix.a($$0.getBuffer(gpn.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private static fiu a(gpd $$0, gpn $$1, fiq.a $$2) {
      return fix.a(new fir($$0.getBuffer(gpn.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fiu a(gpd $$0, gpn $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fof.O() && $$1 == gpy.j()
            ? fix.a($$0.getBuffer(gpn.k()), $$0.getBuffer($$1))
            : fix.a($$0.getBuffer($$2 ? gpn.l() : gpn.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private static int a(int[] $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.length ? $$0[$$1] : -1;
   }

   private static void a(fiq $$0, fiu $$1, List<gqk> $$2, int[] $$3, int $$4, int $$5) {
      fiq.a $$6 = $$0.c();

      for (gqk $$7 : $$2) {
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

   public void a(cys $$0, cyq $$1, int $$2, int $$3, fiq $$4, gpd $$5, @Nullable dip $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bwz $$0, cys $$1, cyq $$2, boolean $$3, fiq $$4, gpd $$5, @Nullable dip $$6, int $$7, int $$8, int $$9) {
      this.j.a(this.k, $$1, $$2, $$3, $$6, $$0, $$9);
      this.k.a($$4, $$5, $$7, $$8);
   }
}
