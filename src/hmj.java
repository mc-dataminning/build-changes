import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hmj(String b, String c, boolean d) {
   public static final Codec<hmj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.A.fieldOf("region").forGetter(hmj::b),
               ayw.A.fieldOf("name").forGetter(hmj::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hmj::d)
            )
            .apply($$0, hmj::new)
   );

   public xa a() {
      return xa.b(this.c + " (" + this.b + ")");
   }
}
