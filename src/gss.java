import com.mojang.serialization.Codec;
import java.util.Map;

public record gss(Map<String, gsf> d) {
   public static final Codec<String> a = axu.b(1, 16);
   public static final Codec<gss> b = Codec.unboundedMap(a, gsf.a).xmap(gss::new, gss::a);
   public static final atd<gss> c = atd.a("language", b);

   public Map<String, gsf> a() {
      return this.d;
   }
}
