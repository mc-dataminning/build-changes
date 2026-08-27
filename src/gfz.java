import com.mojang.serialization.Codec;
import java.util.Map;

public record gfz(Map<String, gfm> d) {
   public static final Codec<String> a = atq.b(1, 16);
   public static final Codec<gfz> b = Codec.unboundedMap(a, gfm.a).xmap(gfz::new, gfz::a);
   public static final apd<gfz> c = apd.a("language", b);

   public Map<String, gfm> a() {
      return this.d;
   }
}
