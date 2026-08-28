import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hmn(boolean e, boolean f) {
   public static final boolean a = false;
   public static final boolean b = false;
   public static final Codec<hmn> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("blur", false).forGetter(hmn::a), Codec.BOOL.optionalFieldOf("clamp", false).forGetter(hmn::b))
            .apply($$0, hmn::new)
   );
   public static final aun<hmn> d = new aun<>("texture", c);

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }
}
