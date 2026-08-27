import com.mojang.serialization.MapCodec;

public class xz implements xw {
   public static final xx<xz> a = new xx<xz>() {
      private static final MapCodec<xz> a = xd.b.a.xmap(xz::new, $$0 -> $$0.e);
      private static final ye<vr, xz> b = ye.a(xd.b.c, $$0 -> $$0.e, xz::new);

      @Override
      public MapCodec<xz> a() {
         return a;
      }

      @Override
      public ye<vr, xz> b() {
         return b;
      }
   };
   public static final xz b = new xz(xd.a);
   public static final xz c = new xz(xd.a.a(n.m));
   public static final xz d = new xz(xd.a.a(n.o));
   final xd e;

   public xz(xd $$0) {
      this.e = $$0;
   }

   @Override
   public wu a(int $$0) {
      return wg.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public xx<xz> a() {
      return a;
   }
}
