import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgl(kt.a<?> b) implements hgn {
   public static final MapCodec<hgl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kt.a("predicate").forGetter(hgl::b)).apply($$0, hgl::new));

   @Override
   public boolean get(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      return this.b.b().a($$0);
   }

   @Override
   public MapCodec<hgl> a() {
      return a;
   }
}
