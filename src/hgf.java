import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgf() implements hgp {
   public static final MapCodec<hgf> a = MapCodec.unit(new hgf());

   @Override
   public float a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3) {
      return cxn.c($$0);
   }

   @Override
   public MapCodec<hgf> a() {
      return a;
   }
}
