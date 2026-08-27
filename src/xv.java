import com.mojang.serialization.MapCodec;

public class xv implements xw {
   public static final xx<xv> a = new xx<xv>() {
      private static final MapCodec<xv> a = wi.a.fieldOf("value").xmap(xv::new, $$0 -> $$0.b);
      private static final ye<vr, xv> b = ye.a(wi.d, $$0 -> $$0.b, xv::new);

      @Override
      public MapCodec<xv> a() {
         return a;
      }

      @Override
      public ye<vr, xv> b() {
         return b;
      }
   };
   final wg b;

   public xv(wg $$0) {
      this.b = $$0;
   }

   @Override
   public wu a(int $$0) {
      return this.b.f();
   }

   @Override
   public xx<xv> a() {
      return a;
   }
}
