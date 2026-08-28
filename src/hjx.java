import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hjx(String b, String c, boolean d) {
   public static final Codec<hjx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.A.fieldOf("region").forGetter(hjx::b),
               ayu.A.fieldOf("name").forGetter(hjx::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hjx::d)
            )
            .apply($$0, hjx::new)
   );

   public wy a() {
      return wy.b(this.c + " (" + this.b + ")");
   }
}
