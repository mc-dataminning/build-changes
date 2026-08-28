import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hgo(boolean e, boolean f) {
   public static final boolean a = false;
   public static final boolean b = false;
   public static final Codec<hgo> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("blur", false).forGetter(hgo::a), Codec.BOOL.optionalFieldOf("clamp", false).forGetter(hgo::b))
            .apply($$0, hgo::new)
   );
   public static final atp<hgo> d = new atp<>("texture", c);

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }
}
