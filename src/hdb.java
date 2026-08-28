import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hdb(hdc d) {
   public static final hdb a = new hdb(hdc.b);
   public static final Codec<hdb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hdc.a.optionalFieldOf("scaling", hdc.b).forGetter(hdb::a)).apply($$0, hdb::new)
   );
   public static final auu<hdb> c = auu.a("gui", b);

   public hdc a() {
      return this.d;
   }
}
