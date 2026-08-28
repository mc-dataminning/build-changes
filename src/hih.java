import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hih(hih.a c) {
   public static final Codec<hih> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hih.a.d.optionalFieldOf("hat", hih.a.a).forGetter(hih::a)).apply($$0, hih::new)
   );
   public static final atz<hih> b = new atz<>("villager", a);

   public hih.a a() {
      return this.c;
   }

   public static enum a implements bag {
      a("none"),
      b("partial"),
      c("full");

      public static final Codec<hih.a> d = bag.a(hih.a::values);
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
