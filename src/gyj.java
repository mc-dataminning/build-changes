import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gyj(String b, String c, boolean d) {
   public static final Codec<gyj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aym.z.fieldOf("region").forGetter(gyj::b),
               aym.z.fieldOf("name").forGetter(gyj::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gyj::d)
            )
            .apply($$0, gyj::new)
   );

   public xd a() {
      return xd.b(this.c + " (" + this.b + ")");
   }
}
