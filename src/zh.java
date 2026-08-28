import com.mojang.serialization.MapCodec;

public class zh implements ze {
   public static final zf<zh> a = new zf<zh>() {
      private static final MapCodec<zh> a = yl.b.a.xmap(zh::new, $$0 -> $$0.e);
      private static final zm<wz, zh> b = zm.a(yl.b.c, $$0 -> $$0.e, zh::new);

      @Override
      public MapCodec<zh> a() {
         return a;
      }

      @Override
      public zm<wz, zh> b() {
         return b;
      }
   };
   public static final zh b = new zh(yl.a);
   public static final zh c = new zh(yl.a.a(n.m));
   public static final zh d = new zh(yl.a.a(n.o));
   final yl e;

   public zh(yl $$0) {
      this.e = $$0;
   }

   @Override
   public yc a(int $$0) {
      return xo.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public zf<zh> a() {
      return a;
   }
}
