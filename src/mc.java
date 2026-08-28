import com.mojang.serialization.MapCodec;

public class mc extends lx<mc> implements lw {
   private final MapCodec<mc> a = MapCodec.unit(this::e);
   private final yw<wj, mc> b = yw.a(this);

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
   public yw<wj, mc> d() {
      return this.b;
   }
}
