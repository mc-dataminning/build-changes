import com.mojang.serialization.Codec;
import java.util.Map;

public record gqt(Map<String, gqg> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<gqt> b = Codec.unboundedMap(a, gqg.a).xmap(gqt::new, gqt::a);
   public static final atp<gqt> c = atp.a("language", b);

   public Map<String, gqg> a() {
      return this.d;
   }
}
