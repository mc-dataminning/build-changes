import com.mojang.serialization.Codec;
import java.util.Map;

public record gqu(Map<String, gqh> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<gqu> b = Codec.unboundedMap(a, gqh.a).xmap(gqu::new, gqu::a);
   public static final atp<gqu> c = atp.a("language", b);

   public Map<String, gqh> a() {
      return this.d;
   }
}
