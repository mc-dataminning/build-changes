import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hci() implements hcp {
   public static final MapCodec<hci> a = MapCodec.unit(new hci());

   @Override
   public float a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      return $$2 instanceof cox $$4 ? $$4.gE().a($$0, 0.0F) : 0.0F;
   }

   @Override
   public MapCodec<hci> a() {
      return a;
   }
}
