import com.mojang.serialization.MapCodec;

public class lr extends lm<lr> implements ll {
   private final MapCodec<lr> a = MapCodec.unit(this::e);
   private final zb<wo, lr> b = zb.a(this);

   protected lr(boolean $$0) {
      super($$0);
   }

   public lr e() {
      return this;
   }

   @Override
   public MapCodec<lr> c() {
      return this.a;
   }

   @Override
   public zb<wo, lr> d() {
      return this.b;
   }
}
