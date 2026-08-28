import com.mojang.serialization.MapCodec;

public class zb implements yy {
   public static final yz<zb> a = new yz<zb>() {
      private static final MapCodec<zb> a = yf.b.a.xmap(zb::new, $$0 -> $$0.e);
      private static final zg<wt, zb> b = zg.a(yf.b.c, $$0 -> $$0.e, zb::new);

      @Override
      public MapCodec<zb> a() {
         return a;
      }

      @Override
      public zg<wt, zb> b() {
         return b;
      }
   };
   public static final zb b = new zb(yf.a);
   public static final zb c = new zb(yf.a.a(n.m));
   public static final zb d = new zb(yf.a.a(n.o));
   final yf e;

   public zb(yf $$0) {
      this.e = $$0;
   }

   @Override
   public xw a(int $$0) {
      return xi.b(Integer.toString($$0)).c(this.e);
   }

   @Override
   public yz<zb> a() {
      return a;
   }
}
