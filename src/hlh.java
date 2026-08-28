import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hlh(hli d) {
   public static final hlh a = new hlh(hli.b);
   public static final Codec<hlh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hli.a.optionalFieldOf("scaling", hli.b).forGetter(hlh::a)).apply($$0, hlh::new)
   );
   public static final auc<hlh> c = new auc<>("gui", b);

   public hli a() {
      return this.d;
   }
}
