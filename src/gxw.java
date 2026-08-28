import java.util.List;
import javax.annotation.Nullable;

public class gxw {
   public static final alg a = alg.b("textures/misc/enchanted_glint_entity.png");
   public static final alg b = alg.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final int i = -1;
   private final hgg j;
   private final hgi k = new hgi();

   public gxw(hgg $$0) {
      this.j = $$0;
   }

   public static void a(czl $$0, fkd $$1, gqr $$2, int $$3, int $$4, int[] $$5, List<grx> $$6, grc $$7, hgi.a $$8) {
      fkh $$10;
      if ($$8 == hgi.a.c) {
         fkd.a $$9 = $$1.c().d();
         if ($$0 == czl.g) {
            f.a($$9.a(), 0.5F);
         } else if ($$0.b()) {
            f.a($$9.a(), 0.75F);
         }

         $$10 = a($$2, $$7, $$9);
      } else {
         $$10 = a($$2, $$7, true, $$8 != hgi.a.a);
      }

      a($$1, $$10, $$6, $$5, $$3, $$4);
   }

   public static fkh a(gqr $$0, grc $$1, boolean $$2) {
      return $$2 ? fkk.a($$0.getBuffer(grc.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private static fkh a(gqr $$0, grc $$1, fkd.a $$2) {
      return fkk.a(new fke($$0.getBuffer(grc.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fkh a(gqr $$0, grc $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fpt.O() && $$1 == grl.j()
            ? fkk.a($$0.getBuffer(grc.k()), $$0.getBuffer($$1))
            : fkk.a($$0.getBuffer($$2 ? grc.l() : grc.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private static int a(int[] $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.length ? $$0[$$1] : -1;
   }

   private static void a(fkd $$0, fkh $$1, List<grx> $$2, int[] $$3, int $$4, int $$5) {
      fkd.a $$6 = $$0.c();

      for (grx $$7 : $$2) {
         float $$9;
         float $$10;
         float $$11;
         float $$12;
         if ($$7.a()) {
            int $$8 = a($$3, $$7.c());
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

   public void a(czn $$0, czl $$1, int $$2, int $$3, fkd $$4, gqr $$5, @Nullable djm $$6, int $$7) {
      this.a(null, $$0, $$1, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bxj $$0, czn $$1, czl $$2, fkd $$3, gqr $$4, @Nullable djm $$5, int $$6, int $$7, int $$8) {
      this.j.a(this.k, $$1, $$2, $$5, $$0, $$8);
      this.k.a($$3, $$4, $$6, $$7);
   }
}
