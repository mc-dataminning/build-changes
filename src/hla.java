import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hla(hlb d) {
   public static final hla a = new hla(hlb.b);
   public static final Codec<hla> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hlb.a.optionalFieldOf("scaling", hlb.b).forGetter(hla::a)).apply($$0, hla::new)
   );
   public static final auc<hla> c = new auc<>("gui", b);

   public hlb a() {
      return this.d;
   }
}
