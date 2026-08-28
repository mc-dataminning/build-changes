import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbr() implements hbt {
   public static final MapCodec<hbr> a = MapCodec.unit(new hbr());

   @Override
   public boolean a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      return cva.g($$0);
   }

   @Override
   public MapCodec<hbr> a() {
      return a;
   }
}
