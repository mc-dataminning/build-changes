import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gdb(String b, String c, boolean d) {
   public static final Codec<gdb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asu.v.fieldOf("region").forGetter(gdb::b),
               asu.v.fieldOf("name").forGetter(gdb::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gdb::d)
            )
            .apply($$0, gdb::new)
   );

   public ur a() {
      return ur.b(this.c + " (" + this.b + ")");
   }
}
