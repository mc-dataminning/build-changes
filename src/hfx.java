import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hfx(ki<?> b, boolean c) implements hfs {
   public static final MapCodec<hfx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.am.q().fieldOf("component").forGetter(hfx::b), Codec.BOOL.optionalFieldOf("ignore_default", false).forGetter(hfx::c))
            .apply($$0, hfx::new)
   );

   @Override
   public boolean get(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      return this.c ? $$0.d(this.b) : $$0.c(this.b);
   }

   @Override
   public MapCodec<hfx> a() {
      return a;
   }
}
