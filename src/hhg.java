import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhg() implements hhq {
   public static final MapCodec<hhg> a = MapCodec.unit(new hhg());

   @Override
   public float a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3) {
      return cyc.c($$0);
   }

   @Override
   public MapCodec<hhg> a() {
      return a;
   }
}
