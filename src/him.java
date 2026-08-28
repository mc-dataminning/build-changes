import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record him() implements hid {
   public static final MapCodec<him> a = MapCodec.unit(new him());

   @Override
   public boolean get(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      return $$2 == null ? false : $$2.fz() && $$2.fB() == $$0;
   }

   @Override
   public MapCodec<him> a() {
      return a;
   }
}
