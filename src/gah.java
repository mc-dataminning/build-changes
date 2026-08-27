import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gah(String b, String c, boolean d) {
   public static final Codec<gah> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arj.v.fieldOf("region").forGetter(gah::b),
               arj.v.fieldOf("name").forGetter(gah::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gah::d)
            )
            .apply($$0, gah::new)
   );

   public tl a() {
      return tl.b(this.c + " (" + this.b + ")");
   }
}
