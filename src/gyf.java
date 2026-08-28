import com.mojang.serialization.Codec;
import java.util.Map;

public record gyf(Map<String, gxs> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<gyf> b = Codec.unboundedMap(a, gxs.a).xmap(gyf::new, gyf::a);
   public static final ats<gyf> c = ats.a("language", b);

   public Map<String, gxs> a() {
      return this.d;
   }
}
