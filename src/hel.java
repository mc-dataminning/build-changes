import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hel() implements hes {
   public static final MapCodec<hel> a = MapCodec.unit(new hel());

   @Override
   public float a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3) {
      return $$2 instanceof cqi $$4 ? $$4.gE().a($$0, 0.0F) : 0.0F;
   }

   @Override
   public MapCodec<hel> a() {
      return a;
   }
}
