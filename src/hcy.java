import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hcy(hcz d) {
   public static final hcy a = new hcy(hcz.b);
   public static final Codec<hcy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hcz.a.optionalFieldOf("scaling", hcz.b).forGetter(hcy::a)).apply($$0, hcy::new)
   );
   public static final auk<hcy> c = auk.a("gui", b);

   public hcz a() {
      return this.d;
   }
}
