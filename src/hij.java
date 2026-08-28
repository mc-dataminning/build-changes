import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hij() implements hiq {
   public static final MapCodec<hij> a = MapCodec.unit(new hij());

   @Override
   public float a(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3) {
      return $$2 instanceof csi $$4 ? $$4.gF().a($$0, 0.0F) : 0.0F;
   }

   @Override
   public MapCodec<hij> a() {
      return a;
   }
}
