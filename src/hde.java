import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hde(String b) implements hdi<String> {
   public static final hdi.a<hde, String> a = hdi.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block_state_property").forGetter(hde::b)).apply($$0, hde::new)), Codec.STRING
   );

   @Nullable
   public String a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3, cwn $$4) {
      cyr $$5 = $$0.a(kv.am);
      return $$5 == null ? null : $$5.b().get(this.b);
   }

   @Override
   public hdi.a<hde, String> a() {
      return a;
   }
}
