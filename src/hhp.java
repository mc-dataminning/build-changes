import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhp() implements hht {
   public static final MapCodec<hhp> a = MapCodec.unit(new hhp());

   @Override
   public boolean get(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      return $$0.r();
   }

   @Override
   public MapCodec<hhp> a() {
      return a;
   }
}
