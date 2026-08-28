import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hig() implements hid {
   public static final MapCodec<hig> a = MapCodec.unit(new hig());

   @Override
   public boolean get(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      return $$4 == czw.g && gad.t();
   }

   @Override
   public MapCodec<hig> a() {
      return a;
   }
}
