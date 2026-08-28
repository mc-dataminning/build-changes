import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcv(int b) implements hdc<String> {
   public static final hdc.a<hcv, String> a = hdc.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayh.l.optionalFieldOf("index", 0).forGetter(hcv::b)).apply($$0, hcv::new)), Codec.STRING
   );

   @Nullable
   public String a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      cyx $$5 = $$0.a(kv.p);
      return $$5 != null ? $$5.c(this.b) : null;
   }

   @Override
   public hdc.a<hcv, String> a() {
      return a;
   }
}
