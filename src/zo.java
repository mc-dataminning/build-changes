import com.mojang.serialization.MapCodec;

public class zo implements zl {
   public static final zm<zo> a = new zm<zo>() {
      private static final MapCodec<zo> a = ys.b.a.xmap(zo::new, $$0 -> $$0.e);
      private static final zt<xg, zo> b = zt.a(ys.b.c, $$0 -> $$0.e, zo::new);

      @Override
      public MapCodec<zo> a() {
         return a;
      }

      @Override
      public zt<xg, zo> b() {
         return b;
      }
   };
   public static final zo b = new zo(ys.a);
   public static final zo c = new zo(ys.a.a(n.m));
   public static final zo d = new zo(ys.a.a(n.o));
   final ys e;

   public zo(ys $$0) {
      this.e = $$0;
   }

   @Override
   public yj a(int $$0) {
      return xv.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public zm<zo> a() {
      return a;
   }
}
