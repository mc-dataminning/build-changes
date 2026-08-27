import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gfs(String b, String c, boolean d) {
   public static final Codec<gfs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atv.v.fieldOf("region").forGetter(gfs::b),
               atv.v.fieldOf("name").forGetter(gfs::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gfs::d)
            )
            .apply($$0, gfs::new)
   );

   public vf a() {
      return vf.b(this.c + " (" + this.b + ")");
   }
}
