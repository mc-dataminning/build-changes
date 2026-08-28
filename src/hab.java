import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hab(String b, String c, boolean d) {
   public static final Codec<hab> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.A.fieldOf("region").forGetter(hab::b),
               ayw.A.fieldOf("name").forGetter(hab::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hab::d)
            )
            .apply($$0, hab::new)
   );

   public xl a() {
      return xl.b(this.c + " (" + this.b + ")");
   }
}
