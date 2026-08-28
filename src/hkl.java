import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hkl(boolean e, boolean f) {
   public static final boolean a = false;
   public static final boolean b = false;
   public static final Codec<hkl> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("blur", false).forGetter(hkl::a), Codec.BOOL.optionalFieldOf("clamp", false).forGetter(hkl::b))
            .apply($$0, hkl::new)
   );
   public static final auc<hkl> d = new auc<>("texture", c);

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }
}
