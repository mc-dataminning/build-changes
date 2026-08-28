import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hln(boolean e, boolean f) {
   public static final boolean a = false;
   public static final boolean b = false;
   public static final Codec<hln> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("blur", false).forGetter(hln::a), Codec.BOOL.optionalFieldOf("clamp", false).forGetter(hln::b))
            .apply($$0, hln::new)
   );
   public static final auc<hln> d = new auc<>("texture", c);

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }
}
