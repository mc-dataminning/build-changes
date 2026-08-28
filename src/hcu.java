import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcu() implements hcw {
   public static final MapCodec<hcu> a = MapCodec.unit(new hcu());

   @Override
   public boolean a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3, cxf $$4) {
      return cvv.g($$0);
   }

   @Override
   public MapCodec<hcu> a() {
      return a;
   }
}
