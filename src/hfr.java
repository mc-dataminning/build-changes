import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hfr(String b, String c, boolean d) {
   public static final Codec<hfr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.A.fieldOf("region").forGetter(hfr::b),
               ayi.A.fieldOf("name").forGetter(hfr::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hfr::d)
            )
            .apply($$0, hfr::new)
   );

   public wo a() {
      return wo.b(this.c + " (" + this.b + ")");
   }
}
