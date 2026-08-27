import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ggh(String b, String c, boolean d) {
   public static final Codec<ggh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atx.v.fieldOf("region").forGetter(ggh::b),
               atx.v.fieldOf("name").forGetter(ggh::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(ggh::d)
            )
            .apply($$0, ggh::new)
   );

   public vg a() {
      return vg.b(this.c + " (" + this.b + ")");
   }
}
