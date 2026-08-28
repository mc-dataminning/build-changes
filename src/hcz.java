import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcz() implements hcw {
   public static final MapCodec<hcz> a = MapCodec.unit(new hcz());

   @Override
   public boolean a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3, cxf $$4) {
      return $$4 == cxf.g && fvi.t();
   }

   @Override
   public MapCodec<hcz> a() {
      return a;
   }
}
