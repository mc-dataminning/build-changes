import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hga() implements hfs {
   public static final MapCodec<hga> a = MapCodec.unit(new hga());

   @Override
   public boolean get(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      if ($$2 instanceof gop $$5 && $$5.gi().f() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hga> a() {
      return a;
   }
}
