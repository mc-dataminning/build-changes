import com.mojang.serialization.MapCodec;

public class yr implements yo {
   public static final yp<yr> a = new yp<yr>() {
      private static final MapCodec<yr> a = xv.b.a.xmap(yr::new, $$0 -> $$0.e);
      private static final yw<wj, yr> b = yw.a(xv.b.c, $$0 -> $$0.e, yr::new);

      @Override
      public MapCodec<yr> a() {
         return a;
      }

      @Override
      public yw<wj, yr> b() {
         return b;
      }
   };
   public static final yr b = new yr(xv.a);
   public static final yr c = new yr(xv.a.a(n.m));
   public static final yr d = new yr(xv.a.a(n.o));
   final xv e;

   public yr(xv $$0) {
      this.e = $$0;
   }

   @Override
   public xm a(int $$0) {
      return wy.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public yp<yr> a() {
      return a;
   }
}
