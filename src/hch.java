import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hch() implements hco {
   public static final MapCodec<hch> a = MapCodec.unit(new hch());

   @Override
   public float a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3) {
      return $$2 instanceof cov $$4 ? $$4.gE().a($$0, 0.0F) : 0.0F;
   }

   @Override
   public MapCodec<hch> a() {
      return a;
   }
}
