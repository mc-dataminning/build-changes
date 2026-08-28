import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hgi(hgj d) {
   public static final hgi a = new hgi(hgj.b);
   public static final Codec<hgi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hgj.a.optionalFieldOf("scaling", hgj.b).forGetter(hgi::a)).apply($$0, hgi::new)
   );
   public static final atp<hgi> c = new atp<>("gui", b);

   public hgj a() {
      return this.d;
   }
}
