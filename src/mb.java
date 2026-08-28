import com.mojang.serialization.MapCodec;

public class mb extends lw<mb> implements lv {
   private final MapCodec<mb> a = MapCodec.unit(this::e);
   private final yw<wj, mb> b = yw.a(this);

   protected mb(boolean $$0) {
      super($$0);
   }

   public mb e() {
      return this;
   }

   @Override
   public MapCodec<mb> c() {
      return this.a;
   }

   @Override
   public yw<wj, mb> d() {
      return this.b;
   }
}
