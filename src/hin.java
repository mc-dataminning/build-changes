import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hin() implements hid {
   public static final MapCodec<hin> a = MapCodec.unit(new hin());

   @Override
   public boolean get(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      frd $$5 = frd.Q();
      bwt $$6 = $$5.ao();
      return $$6 != null ? $$2 == $$6 : $$2 == $$5.t;
   }

   @Override
   public MapCodec<hin> a() {
      return a;
   }
}
