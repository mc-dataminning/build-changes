import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hdf() implements hcw {
   public static final MapCodec<hdf> a = MapCodec.unit(new hdf());

   @Override
   public boolean a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3, cxf $$4) {
      return $$2 == null ? false : $$2.fB() && $$2.fD() == $$0;
   }

   @Override
   public MapCodec<hdf> a() {
      return a;
   }
}
