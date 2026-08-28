import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hml(String b, String c, boolean d) {
   public static final Codec<hml> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayy.A.fieldOf("region").forGetter(hml::b),
               ayy.A.fieldOf("name").forGetter(hml::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hml::d)
            )
            .apply($$0, hml::new)
   );

   public xc a() {
      return xc.b(this.c + " (" + this.b + ")");
   }
}
