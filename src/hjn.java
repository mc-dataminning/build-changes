import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hjn(hjn.a c) {
   public static final Codec<hjn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hjn.a.d.optionalFieldOf("hat", hjn.a.a).forGetter(hjn::a)).apply($$0, hjn::new)
   );
   public static final aua<hjn> b = new aua<>("villager", a);

   public hjn.a a() {
      return this.c;
   }

   public static enum a implements bai {
      a("none"),
      b("partial"),
      c("full");

      public static final Codec<hjn.a> d = bai.a(hjn.a::values);
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
