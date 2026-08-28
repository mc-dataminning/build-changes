import com.mojang.serialization.MapCodec;

public class mc extends lx<mc> implements lw {
   private final MapCodec<mc> a = MapCodec.unit(this::e);
   private final yy<wl, mc> b = yy.a(this);

   protected mc(boolean $$0) {
      super($$0);
   }

   public mc e() {
      return this;
   }

   @Override
   public MapCodec<mc> c() {
      return this.a;
   }

   @Override
   public yy<wl, mc> d() {
      return this.b;
   }
}
