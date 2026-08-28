import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record grs(String b, String c, boolean d) {
   public static final Codec<grs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axw.y.fieldOf("region").forGetter(grs::b),
               axw.y.fieldOf("name").forGetter(grs::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(grs::d)
            )
            .apply($$0, grs::new)
   );

   public wz a() {
      return wz.b(this.c + " (" + this.b + ")");
   }
}
