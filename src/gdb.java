import com.mojang.serialization.Codec;
import java.util.Map;

public record gdb(Map<String, gco> d) {
   public static final Codec<String> a = asq.b(1, 16);
   public static final Codec<gdb> b = Codec.unboundedMap(a, gco.a).xmap(gdb::new, gdb::a);
   public static final aoe<gdb> c = aoe.a("language", b);

   public Map<String, gco> a() {
      return this.d;
   }
}
