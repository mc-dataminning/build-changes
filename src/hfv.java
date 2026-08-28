import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfv() implements hfs {
   public static final MapCodec<hfv> a = MapCodec.unit(new hfv());

   @Override
   public boolean get(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      return $$4 == cyw.g && fxu.t();
   }

   @Override
   public MapCodec<hfv> a() {
      return a;
   }
}
