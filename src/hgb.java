import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hgb(hgb.a c) {
   public static final Codec<hgb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hgb.a.d.optionalFieldOf("hat", hgb.a.a).forGetter(hgb::a)).apply($$0, hgb::new)
   );
   public static final ato<hgb> b = new ato<>("villager", a);

   public hgb.a a() {
      return this.c;
   }

   public static enum a implements azu {
      a("none"),
      b("partial"),
      c("full");

      public static final Codec<hgb.a> d = azu.a(hgb.a::values);
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
