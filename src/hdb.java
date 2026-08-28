import com.mojang.serialization.Codec;
import java.util.Map;

public record hdb(Map<String, hco> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hdb> b = Codec.unboundedMap(a, hco.a).xmap(hdb::new, hdb::a);
   public static final auk<hdb> c = auk.a("language", b);

   public Map<String, hco> a() {
      return this.d;
   }
}
