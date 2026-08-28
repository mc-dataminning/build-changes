import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hdd(String b) implements hdh<String> {
   public static final hdh.a<hdd, String> a = hdh.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block_state_property").forGetter(hdd::b)).apply($$0, hdd::new)), Codec.STRING
   );

   @Nullable
   public String a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwm $$4) {
      cyq $$5 = $$0.a(kv.am);
      return $$5 == null ? null : $$5.b().get(this.b);
   }

   @Override
   public hdh.a<hdd, String> a() {
      return a;
   }
}
