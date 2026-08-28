import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hdl() implements hds {
   public static final MapCodec<hdl> a = MapCodec.unit(new hdl());

   @Override
   public float a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3) {
      return $$2 instanceof cpr $$4 ? $$4.gH().a($$0, 0.0F) : 0.0F;
   }

   @Override
   public MapCodec<hdl> a() {
      return a;
   }
}
