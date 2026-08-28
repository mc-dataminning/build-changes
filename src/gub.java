import java.util.List;
import javax.annotation.Nullable;

public class gub {
   public static final aku a = aku.b("textures/misc/enchanted_glint_entity.png");
   public static final aku b = aku.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final int i = -1;
   private final hcl j;
   private final hcn k = new hcn();

   public gub(hcl $$0) {
      this.j = $$0;
   }

   private static void a(hhr $$0, int[] $$1, int $$2, int $$3, fgr $$4, fgv $$5) {
      azh $$6 = azh.a();
      long $$7 = 42L;

      for (jn $$8 : jn.values()) {
         $$6.b(42L);
         a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public static void a(cxf $$0, fgr $$1, gmx $$2, int $$3, int $$4, int[] $$5, hhr $$6, gnh $$7, hcn.a $$8) {
      fgv $$10;
      if ($$8 == hcn.a.c) {
         fgr.a $$9 = $$1.c().c();
         if ($$0 == cxf.g) {
            f.a($$9.a(), 0.5F);
         } else if ($$0.b()) {
            f.a($$9.a(), 0.75F);
         }

         $$10 = a($$2, $$7, $$9);
      } else {
         $$10 = a($$2, $$7, true, $$8 != hcn.a.a);
      }

      a($$6, $$5, $$3, $$4, $$1, $$10);
   }

   public static fgv a(gmx $$0, gnh $$1, boolean $$2) {
      return $$2 ? fgy.a($$0.getBuffer(gnh.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private static fgv a(gmx $$0, gnh $$1, fgr.a $$2) {
      return fgy.a(new fgs($$0.getBuffer(gnh.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fgv a(gmx $$0, gnh $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fmg.O() && $$1 == gns.j()
            ? fgy.a($$0.getBuffer(gnh.k()), $$0.getBuffer($$1))
            : fgy.a($$0.getBuffer($$2 ? gnh.l() : gnh.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private static int a(int[] $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.length ? $$0[$$1] : -1;
   }

   private static void a(fgr $$0, fgv $$1, List<goe> $$2, int[] $$3, int $$4, int $$5) {
      fgr.a $$6 = $$0.c();

      for (goe $$7 : $$2) {
         float $$9;
         float $$10;
         float $$11;
         float $$12;
         if ($$7.c()) {
            int $$8 = a($$3, $$7.d());
            $$9 = (float)axk.a($$8) / 255.0F;
            $$10 = (float)axk.b($$8) / 255.0F;
            $$11 = (float)axk.c($$8) / 255.0F;
            $$12 = (float)axk.d($$8) / 255.0F;
         } else {
            $$9 = 1.0F;
            $$10 = 1.0F;
            $$11 = 1.0F;
            $$12 = 1.0F;
         }

         $$1.a($$6, $$7, $$10, $$11, $$12, $$9, $$4, $$5);
      }
   }

   public void a(cxh $$0, cxf $$1, int $$2, int $$3, fgr $$4, gmx $$5, @Nullable dgz $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bvy $$0, cxh $$1, cxf $$2, boolean $$3, fgr $$4, gmx $$5, @Nullable dgz $$6, int $$7, int $$8, int $$9) {
      this.j.a(this.k, $$1, $$2, $$3, $$6, $$0, $$9);
      this.k.a($$4, $$5, $$7, $$8);
   }
}
