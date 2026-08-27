import com.mojang.serialization.MapCodec;

public class yn implements yk {
   public static final yl<yn> a = new yl<yn>() {
      private static final MapCodec<yn> a = xr.b.a.xmap(yn::new, $$0 -> $$0.e);
      private static final ys<wf, yn> b = ys.a(xr.b.c, $$0 -> $$0.e, yn::new);

      @Override
      public MapCodec<yn> a() {
         return a;
      }

      @Override
      public ys<wf, yn> b() {
         return b;
      }
   };
   public static final yn b = new yn(xr.a);
   public static final yn c = new yn(xr.a.a(n.m));
   public static final yn d = new yn(xr.a.a(n.o));
   final xr e;

   public yn(xr $$0) {
      this.e = $$0;
   }

   @Override
   public xi a(int $$0) {
      return wu.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public yl<yn> a() {
      return a;
   }
}
