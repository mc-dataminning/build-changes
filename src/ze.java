import com.mojang.serialization.MapCodec;

public class ze implements zb {
   public static final zc<ze> a = new zc<ze>() {
      private static final MapCodec<ze> a = yi.b.a.xmap(ze::new, $$0 -> $$0.e);
      private static final zj<ww, ze> b = zj.a(yi.b.c, $$0 -> $$0.e, ze::new);

      @Override
      public MapCodec<ze> a() {
         return a;
      }

      @Override
      public zj<ww, ze> b() {
         return b;
      }
   };
   public static final ze b = new ze(yi.a);
   public static final ze c = new ze(yi.a.a(n.m));
   public static final ze d = new ze(yi.a.a(n.o));
   final yi e;

   public ze(yi $$0) {
      this.e = $$0;
   }

   @Override
   public xz a(int $$0) {
      return xl.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public zc<ze> a() {
      return a;
   }
}
