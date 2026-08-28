import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hdf(String b) implements hdj<String> {
   public static final hdj.a<hdf, String> a = hdj.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block_state_property").forGetter(hdf::b)).apply($$0, hdf::new)), Codec.STRING
   );

   @Nullable
   public String a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3, cwo $$4) {
      cys $$5 = $$0.a(kv.am);
      return $$5 == null ? null : $$5.b().get(this.b);
   }

   @Override
   public hdj.a<hdf, String> a() {
      return a;
   }
}
