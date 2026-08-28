import java.util.List;
import javax.annotation.Nullable;

public class gwx {
   public static final alg a = alg.b("textures/misc/enchanted_glint_entity.png");
   public static final alg b = alg.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final int i = -1;
   private final hfg j;
   private final hfi k = new hfi();

   public gwx(hfg $$0) {
      this.j = $$0;
   }

   private static void a(hkp $$0, int[] $$1, int $$2, int $$3, fjc $$4, fjg $$5) {
      azv $$6 = azv.a();
      long $$7 = 42L;

      for (ja $$8 : ja.values()) {
         $$6.b(42L);
         a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public static void a(cyw $$0, fjc $$1, gps $$2, int $$3, int $$4, int[] $$5, hkp $$6, gqc $$7, hfi.a $$8) {
      fjg $$10;
      if ($$8 == hfi.a.c) {
         fjc.a $$9 = $$1.c().c();
         if ($$0 == cyw.g) {
            f.a($$9.a(), 0.5F);
         } else if ($$0.b()) {
            f.a($$9.a(), 0.75F);
         }

         $$10 = a($$2, $$7, $$9);
      } else {
         $$10 = a($$2, $$7, true, $$8 != hfi.a.a);
      }

      a($$6, $$5, $$3, $$4, $$1, $$10);
   }

   public static fjg a(gps $$0, gqc $$1, boolean $$2) {
      return $$2 ? fjj.a($$0.getBuffer(gqc.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private static fjg a(gps $$0, gqc $$1, fjc.a $$2) {
      return fjj.a(new fjd($$0.getBuffer(gqc.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fjg a(gps $$0, gqc $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fos.O() && $$1 == gqn.j()
            ? fjj.a($$0.getBuffer(gqc.k()), $$0.getBuffer($$1))
            : fjj.a($$0.getBuffer($$2 ? gqc.l() : gqc.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private static int a(int[] $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.length ? $$0[$$1] : -1;
   }

   private static void a(fjc $$0, fjg $$1, List<gqz> $$2, int[] $$3, int $$4, int $$5) {
      fjc.a $$6 = $$0.c();

      for (gqz $$7 : $$2) {
         float $$9;
         float $$10;
         float $$11;
         float $$12;
         if ($$7.c()) {
            int $$8 = a($$3, $$7.d());
            $$9 = (float)axw.a($$8) / 255.0F;
            $$10 = (float)axw.b($$8) / 255.0F;
            $$11 = (float)axw.c($$8) / 255.0F;
            $$12 = (float)axw.d($$8) / 255.0F;
         } else {
            $$9 = 1.0F;
            $$10 = 1.0F;
            $$11 = 1.0F;
            $$12 = 1.0F;
         }

         $$1.a($$6, $$7, $$10, $$11, $$12, $$9, $$4, $$5);
      }
   }

   public void a(cyy $$0, cyw $$1, int $$2, int $$3, fjc $$4, gps $$5, @Nullable div $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bxc $$0, cyy $$1, cyw $$2, boolean $$3, fjc $$4, gps $$5, @Nullable div $$6, int $$7, int $$8, int $$9) {
      this.j.a(this.k, $$1, $$2, $$3, $$6, $$0, $$9);
      this.k.a($$4, $$5, $$7, $$8);
   }
}
