import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hic() implements hht {
   public static final MapCodec<hic> a = MapCodec.unit(new hic());

   @Override
   public boolean get(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      return $$2 == null ? false : $$2.fz() && $$2.fB() == $$0;
   }

   @Override
   public MapCodec<hic> a() {
      return a;
   }
}
