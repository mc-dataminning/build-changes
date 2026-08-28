import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hkn(hko d) {
   public static final hkn a = new hkn(hko.b);
   public static final Codec<hkn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hko.a.optionalFieldOf("scaling", hko.b).forGetter(hkn::a)).apply($$0, hkn::new)
   );
   public static final auc<hkn> c = new auc<>("gui", b);

   public hko a() {
      return this.d;
   }
}
