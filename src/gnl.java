import com.mojang.serialization.Codec;
import java.util.Map;

public record gnl(Map<String, gmy> d) {
   public static final Codec<String> a = awu.b(1, 16);
   public static final Codec<gnl> b = Codec.unboundedMap(a, gmy.a).xmap(gnl::new, gnl::a);
   public static final ase<gnl> c = ase.a("language", b);

   public Map<String, gmy> a() {
      return this.d;
   }
}
