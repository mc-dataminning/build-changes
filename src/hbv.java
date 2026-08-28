import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbv() implements hbt {
   public static final MapCodec<hbv> a = MapCodec.unit(new hbv());

   @Override
   public boolean a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      return $$0.n();
   }

   @Override
   public MapCodec<hbv> a() {
      return a;
   }
}
