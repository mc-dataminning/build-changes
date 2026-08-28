import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgb() implements hfs {
   public static final MapCodec<hgb> a = MapCodec.unit(new hgb());

   @Override
   public boolean get(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      return $$2 == null ? false : $$2.fy() && $$2.fA() == $$0;
   }

   @Override
   public MapCodec<hgb> a() {
      return a;
   }
}
