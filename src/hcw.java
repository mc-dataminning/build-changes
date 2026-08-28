import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcw(int b) implements hdb<String> {
   public static final hdb.a<hcw, String> a = hdb.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(hcw::b)).apply($$0, hcw::new)), Codec.STRING
   );

   @Nullable
   public String a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwn $$4) {
      cyz $$5 = $$0.a(kv.p);
      return $$5 != null ? $$5.c(this.b) : null;
   }

   @Override
   public hdb.a<hcw, String> a() {
      return a;
   }
}
