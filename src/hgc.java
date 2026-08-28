import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgc() implements hfs {
   public static final MapCodec<hgc> a = MapCodec.unit(new hgc());

   @Override
   public boolean get(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      fos $$5 = fos.Q();
      bwd $$6 = $$5.ao();
      return $$6 != null ? $$2 == $$6 : $$2 == $$5.t;
   }

   @Override
   public MapCodec<hgc> a() {
      return a;
   }
}
