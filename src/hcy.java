import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcy(String b) implements hdb<String> {
   public static final hdb.a<hcy, String> a = hdb.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block_state_property").forGetter(hcy::b)).apply($$0, hcy::new)), Codec.STRING
   );

   @Nullable
   public String a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwn $$4) {
      cyr $$5 = $$0.a(kv.am);
      return $$5 == null ? null : $$5.b().get(this.b);
   }

   @Override
   public hdb.a<hcy, String> a() {
      return a;
   }
}
