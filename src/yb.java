import com.mojang.serialization.MapCodec;

public class yb implements xy {
   public static final xz<yb> a = new xz<yb>() {
      private static final MapCodec<yb> a = xf.b.a.xmap(yb::new, $$0 -> $$0.e);
      private static final yg<vt, yb> b = yg.a(xf.b.c, $$0 -> $$0.e, yb::new);

      @Override
      public MapCodec<yb> a() {
         return a;
      }

      @Override
      public yg<vt, yb> b() {
         return b;
      }
   };
   public static final yb b = new yb(xf.a);
   public static final yb c = new yb(xf.a.a(n.m));
   public static final yb d = new yb(xf.a.a(n.o));
   final xf e;

   public yb(xf $$0) {
      this.e = $$0;
   }

   @Override
   public ww a(int $$0) {
      return wi.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public xz<yb> a() {
      return a;
   }
}
