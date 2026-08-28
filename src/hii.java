import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hii() implements hif {
   public static final MapCodec<hii> a = MapCodec.unit(new hii());

   @Override
   public boolean get(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      return $$4 == czy.g && gaf.t();
   }

   @Override
   public MapCodec<hii> a() {
      return a;
   }
}
