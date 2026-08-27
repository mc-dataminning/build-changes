import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gpc(String b, String c, boolean d) {
   public static final Codec<gpc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axn.w.fieldOf("region").forGetter(gpc::b),
               axn.w.fieldOf("name").forGetter(gpc::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gpc::d)
            )
            .apply($$0, gpc::new)
   );

   public wx a() {
      return wx.b(this.c + " (" + this.b + ")");
   }
}
