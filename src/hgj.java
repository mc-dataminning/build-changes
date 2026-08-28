import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hgj(hgk d) {
   public static final hgj a = new hgj(hgk.b);
   public static final Codec<hgj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hgk.a.optionalFieldOf("scaling", hgk.b).forGetter(hgj::a)).apply($$0, hgj::new)
   );
   public static final atp<hgj> c = new atp<>("gui", b);

   public hgk a() {
      return this.d;
   }
}
