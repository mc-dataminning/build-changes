import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hib() implements hif {
   public static final MapCodec<hib> a = MapCodec.unit(new hib());

   @Override
   public boolean get(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      return $$0.r();
   }

   @Override
   public MapCodec<hib> a() {
      return a;
   }
}
