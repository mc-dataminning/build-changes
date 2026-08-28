import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hkf(hkg d) {
   public static final hkf a = new hkf(hkg.b);
   public static final Codec<hkf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hkg.a.optionalFieldOf("scaling", hkg.b).forGetter(hkf::a)).apply($$0, hkf::new)
   );
   public static final auc<hkf> c = new auc<>("gui", b);

   public hkg a() {
      return this.d;
   }
}
