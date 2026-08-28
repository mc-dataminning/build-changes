import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hgd(hge d) {
   public static final hgd a = new hgd(hge.b);
   public static final Codec<hgd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hge.a.optionalFieldOf("scaling", hge.b).forGetter(hgd::a)).apply($$0, hgd::new)
   );
   public static final ato<hgd> c = new ato<>("gui", b);

   public hge a() {
      return this.d;
   }
}
