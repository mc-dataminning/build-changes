import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcy() implements hcw {
   public static final MapCodec<hcy> a = MapCodec.unit(new hcy());

   @Override
   public boolean a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3, cxf $$4) {
      return $$0.n();
   }

   @Override
   public MapCodec<hcy> a() {
      return a;
   }
}
