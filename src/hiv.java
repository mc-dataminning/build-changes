import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hiv() implements hjc {
   public static final MapCodec<hiv> a = MapCodec.unit(new hiv());

   @Override
   public float a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3) {
      return $$2 instanceof crz $$4 ? $$4.gF().a($$0, 0.0F) : 0.0F;
   }

   @Override
   public MapCodec<hiv> a() {
      return a;
   }
}
