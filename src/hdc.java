import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hdc(int b) implements hdi<String> {
   public static final hdi.a<hdc, String> a = hdi.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(hdc::b)).apply($$0, hdc::new)), Codec.STRING
   );

   @Nullable
   public String a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3, cwn $$4) {
      cyz $$5 = $$0.a(kv.p);
      return $$5 != null ? $$5.c(this.b) : null;
   }

   @Override
   public hdi.a<hdc, String> a() {
      return a;
   }
}
