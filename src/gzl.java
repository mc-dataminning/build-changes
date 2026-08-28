import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gzl(String b, String c, boolean d) {
   public static final Codec<gzl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayt.A.fieldOf("region").forGetter(gzl::b),
               ayt.A.fieldOf("name").forGetter(gzl::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gzl::d)
            )
            .apply($$0, gzl::new)
   );

   public xi a() {
      return xi.b(this.c + " (" + this.b + ")");
   }
}
