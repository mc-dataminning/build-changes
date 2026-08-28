import com.mojang.serialization.Codec;
import java.util.Map;

public record hgn(Map<String, hgc> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hgn> b = Codec.unboundedMap(a, hgc.a).xmap(hgn::new, hgn::a);
   public static final atp<hgn> c = new atp<>("language", b);

   public Map<String, hgc> a() {
      return this.d;
   }
}
