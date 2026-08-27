import com.mojang.serialization.Codec;
import java.util.Map;

public record gos(Map<String, gof> d) {
   public static final Codec<String> a = axh.b(1, 16);
   public static final Codec<gos> b = Codec.unboundedMap(a, gof.a).xmap(gos::new, gos::a);
   public static final asr<gos> c = asr.a("language", b);

   public Map<String, gof> a() {
      return this.d;
   }
}
