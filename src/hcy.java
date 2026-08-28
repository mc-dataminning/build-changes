import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcy(String b) implements hdc<String> {
   public static final hdc.a<hcy, String> a = hdc.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block_state_property").forGetter(hcy::b)).apply($$0, hcy::new)), Codec.STRING
   );

   @Nullable
   public String a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      cyp $$5 = $$0.a(kv.am);
      return $$5 == null ? null : $$5.b().get(this.b);
   }

   @Override
   public hdc.a<hcy, String> a() {
      return a;
   }
}
