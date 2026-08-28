import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hga(String b, String c, boolean d) {
   public static final Codec<hga> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.A.fieldOf("region").forGetter(hga::b),
               ayi.A.fieldOf("name").forGetter(hga::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hga::d)
            )
            .apply($$0, hga::new)
   );

   public wp a() {
      return wp.b(this.c + " (" + this.b + ")");
   }
}
