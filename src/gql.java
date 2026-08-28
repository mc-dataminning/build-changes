import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gql(gqm d) {
   public static final gql a = new gql(gqm.b);
   public static final Codec<gql> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(gqm.a.optionalFieldOf("scaling", gqm.b).forGetter(gql::a)).apply($$0, gql::new)
   );
   public static final atl<gql> c = atl.a("gui", b);

   public gqm a() {
      return this.d;
   }
}
