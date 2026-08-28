import com.mojang.serialization.MapCodec;

public class lz extends lu<lz> implements lt {
   private final MapCodec<lz> a = MapCodec.unit(this::e);
   private final yt<wg, lz> b = yt.a(this);

   protected lz(boolean $$0) {
      super($$0);
   }

   public lz e() {
      return this;
   }

   @Override
   public MapCodec<lz> c() {
      return this.a;
   }

   @Override
   public yt<wg, lz> d() {
      return this.b;
   }
}
