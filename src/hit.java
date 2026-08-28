import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hit() implements hja {
   public static final MapCodec<hit> a = MapCodec.unit(new hit());

   @Override
   public float a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3) {
      return $$2 instanceof crx $$4 ? $$4.gF().a($$0, 0.0F) : 0.0F;
   }

   @Override
   public MapCodec<hit> a() {
      return a;
   }
}
