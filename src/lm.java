import com.mojang.serialization.MapCodec;

public class lm extends lh<lm> implements lg {
   private final MapCodec<lm> a = MapCodec.unit(this::e);
   private final zn<xa, lm> b = zn.a(this);

   protected lm(boolean $$0) {
      super($$0);
   }

   public lm e() {
      return this;
   }

   @Override
   public MapCodec<lm> c() {
      return this.a;
   }

   @Override
   public zn<xa, lm> d() {
      return this.b;
   }
}
