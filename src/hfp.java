import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfp() implements hfs {
   public static final MapCodec<hfp> a = MapCodec.unit(new hfp());

   @Override
   public boolean get(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      return cxn.g($$0);
   }

   @Override
   public MapCodec<hfp> a() {
      return a;
   }
}
