import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hff() implements hfc {
   public static final MapCodec<hff> a = MapCodec.unit(new hff());

   @Override
   public boolean get(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      return $$4 == cyq.g && fxi.t();
   }

   @Override
   public MapCodec<hff> a() {
      return a;
   }
}
