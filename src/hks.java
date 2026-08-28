import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hks(String b, String c, boolean d) {
   public static final Codec<hks> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.A.fieldOf("region").forGetter(hks::b),
               ayu.A.fieldOf("name").forGetter(hks::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hks::d)
            )
            .apply($$0, hks::new)
   );

   public wy a() {
      return wy.b(this.c + " (" + this.b + ")");
   }
}
