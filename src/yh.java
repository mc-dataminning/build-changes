import com.mojang.serialization.MapCodec;

public class yh implements ye {
   public static final yf<yh> a = new yf<yh>() {
      private static final MapCodec<yh> a = xl.b.a.xmap(yh::new, $$0 -> $$0.e);
      private static final ym<vz, yh> b = ym.a(xl.b.c, $$0 -> $$0.e, yh::new);

      @Override
      public MapCodec<yh> a() {
         return a;
      }

      @Override
      public ym<vz, yh> b() {
         return b;
      }
   };
   public static final yh b = new yh(xl.a);
   public static final yh c = new yh(xl.a.a(n.m));
   public static final yh d = new yh(xl.a.a(n.o));
   final xl e;

   public yh(xl $$0) {
      this.e = $$0;
   }

   @Override
   public xc a(int $$0) {
      return wo.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public yf<yh> a() {
      return a;
   }
}
