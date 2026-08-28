import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfu() implements hfs {
   public static final MapCodec<hfu> a = MapCodec.unit(new hfu());

   @Override
   public boolean get(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      return $$0.n();
   }

   @Override
   public MapCodec<hfu> a() {
      return a;
   }
}
