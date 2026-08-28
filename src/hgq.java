import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgq() implements hgx {
   public static final MapCodec<hgq> a = MapCodec.unit(new hgq());

   @Override
   public float a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3) {
      return $$2 instanceof crc $$4 ? $$4.gF().a($$0, 0.0F) : 0.0F;
   }

   @Override
   public MapCodec<hgq> a() {
      return a;
   }
}
