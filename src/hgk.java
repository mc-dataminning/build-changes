import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hgk(hgl d) {
   public static final hgk a = new hgk(hgl.b);
   public static final Codec<hgk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hgl.a.optionalFieldOf("scaling", hgl.b).forGetter(hgk::a)).apply($$0, hgk::new)
   );
   public static final atp<hgk> c = new atp<>("gui", b);

   public hgl a() {
      return this.d;
   }
}
