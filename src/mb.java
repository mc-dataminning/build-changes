import com.mojang.serialization.MapCodec;

public class mb extends lw<mb> implements lv {
   private final MapCodec<mb> a = MapCodec.unit(this::e);
   private final yu<wh, mb> b = yu.a(this);

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
   public yu<wh, mb> d() {
      return this.b;
   }
}
