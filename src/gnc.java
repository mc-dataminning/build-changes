import com.mojang.serialization.Codec;
import java.util.Map;

public record gnc(Map<String, gmp> d) {
   public static final Codec<String> a = aws.b(1, 16);
   public static final Codec<gnc> b = Codec.unboundedMap(a, gmp.a).xmap(gnc::new, gnc::a);
   public static final asc<gnc> c = asc.a("language", b);

   public Map<String, gmp> a() {
      return this.d;
   }
}
