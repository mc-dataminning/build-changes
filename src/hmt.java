import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hmt(hmu d) {
   public static final hmt a = new hmt(hmu.b);
   public static final Codec<hmt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hmu.a.optionalFieldOf("scaling", hmu.b).forGetter(hmt::a)).apply($$0, hmt::new)
   );
   public static final aug<hmt> c = new aug<>("gui", b);

   public hmu a() {
      return this.d;
   }
}
