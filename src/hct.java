import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hct() implements hcw {
   public static final MapCodec<hct> a = MapCodec.unit(new hct());

   @Override
   public boolean a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3, cxf $$4) {
      return $$0.r();
   }

   @Override
   public MapCodec<hct> a() {
      return a;
   }
}
