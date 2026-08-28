import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcl(boolean b) implements hco {
   public static final MapCodec<hcl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("normalize", true).forGetter(hcl::b)).apply($$0, hcl::new)
   );

   @Override
   public float a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3) {
      float $$4 = (float)$$0.o();
      float $$5 = (float)$$0.p();
      return this.b ? ayy.a($$4 / $$5, 0.0F, 1.0F) : ayy.a($$4, 0.0F, $$5);
   }

   @Override
   public MapCodec<hcl> a() {
      return a;
   }
}
