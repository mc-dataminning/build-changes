import com.mojang.serialization.MapCodec;

public class zk implements zl {
   public static final zm<zk> a = new zm<zk>() {
      private static final MapCodec<zk> a = xx.a.fieldOf("value").xmap(zk::new, $$0 -> $$0.b);
      private static final zt<xg, zk> b = zt.a(xx.d, $$0 -> $$0.b, zk::new);

      @Override
      public MapCodec<zk> a() {
         return a;
      }

      @Override
      public zt<xg, zk> b() {
         return b;
      }
   };
   final xv b;

   public zk(xv $$0) {
      this.b = $$0;
   }

   @Override
   public yj a(int $$0) {
      return this.b.f();
   }

   @Override
   public zm<zk> a() {
      return a;
   }
}
