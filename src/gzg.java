import java.util.List;
import javax.annotation.Nullable;

public class gzg {
   public static final ali a = ali.b("textures/misc/enchanted_glint_entity.png");
   public static final ali b = ali.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final int i = -1;
   private final hhq j;
   private final hhs k = new hhs();

   public gzg(hhq $$0) {
      this.j = $$0;
   }

   public static void a(czw $$0, flo $$1, gsa $$2, int $$3, int $$4, int[] $$5, List<gtg> $$6, gsl $$7, hhs.a $$8) {
      flr $$10;
      if ($$8 == hhs.a.c) {
         flo.a $$9 = $$1.c().d();
         if ($$0 == czw.g) {
            f.a($$9.a(), 0.5F);
         } else if ($$0.b()) {
            f.a($$9.a(), 0.75F);
         }

         $$10 = a($$2, $$7, $$9);
      } else {
         $$10 = a($$2, $$7, true, $$8 != hhs.a.a);
      }

      a($$1, $$10, $$6, $$5, $$3, $$4);
   }

   public static flr a(gsa $$0, gsl $$1, boolean $$2) {
      return $$2 ? flu.a($$0.getBuffer(gsl.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private static flr a(gsa $$0, gsl $$1, flo.a $$2) {
      return flu.a(new flp($$0.getBuffer(gsl.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static flr a(gsa $$0, gsl $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return frd.O() && $$1 == gsu.j()
            ? flu.a($$0.getBuffer(gsl.l()), $$0.getBuffer($$1))
            : flu.a($$0.getBuffer($$2 ? gsl.m() : gsl.n()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private static int a(int[] $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.length ? $$0[$$1] : -1;
   }

   private static void a(flo $$0, flr $$1, List<gtg> $$2, int[] $$3, int $$4, int $$5) {
      flo.a $$6 = $$0.c();

      for (gtg $$7 : $$2) {
         float $$9;
         float $$10;
         float $$11;
         float $$12;
         if ($$7.a()) {
            int $$8 = a($$3, $$7.c());
            $$9 = (float)axy.a($$8) / 255.0F;
            $$10 = (float)axy.b($$8) / 255.0F;
            $$11 = (float)axy.c($$8) / 255.0F;
            $$12 = (float)axy.d($$8) / 255.0F;
         } else {
            $$9 = 1.0F;
            $$10 = 1.0F;
            $$11 = 1.0F;
            $$12 = 1.0F;
         }

         $$1.a($$6, $$7, $$10, $$11, $$12, $$9, $$4, $$5);
      }
   }

   public void a(czy $$0, czw $$1, int $$2, int $$3, flo $$4, gsa $$5, @Nullable djx $$6, int $$7) {
      this.a(null, $$0, $$1, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bxu $$0, czy $$1, czw $$2, flo $$3, gsa $$4, @Nullable djx $$5, int $$6, int $$7, int $$8) {
      this.j.a(this.k, $$1, $$2, $$5, $$0, $$8);
      this.k.a($$3, $$4, $$6, $$7);
   }
}
