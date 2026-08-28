import com.mojang.serialization.Codec;
import java.util.Map;

public record hge(Map<String, hfr> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hge> b = Codec.unboundedMap(a, hfr.a).xmap(hge::new, hge::a);
   public static final atp<hge> c = atp.a("language", b);

   public Map<String, hfr> a() {
      return this.d;
   }
}
