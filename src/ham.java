import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ham(String b, String c, boolean d) {
   public static final Codec<ham> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayv.A.fieldOf("region").forGetter(ham::b),
               ayv.A.fieldOf("name").forGetter(ham::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(ham::d)
            )
            .apply($$0, ham::new)
   );

   public xj a() {
      return xj.b(this.c + " (" + this.b + ")");
   }
}
