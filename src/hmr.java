import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hmr(hms d) {
   public static final hmr a = new hmr(hms.b);
   public static final Codec<hmr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hms.a.optionalFieldOf("scaling", hms.b).forGetter(hmr::a)).apply($$0, hmr::new)
   );
   public static final aue<hmr> c = new aue<>("gui", b);

   public hms a() {
      return this.d;
   }
}
