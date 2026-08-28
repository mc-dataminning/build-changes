import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hmf(hmf.a c) {
   public static final Codec<hmf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hmf.a.d.optionalFieldOf("hat", hmf.a.a).forGetter(hmf::a)).apply($$0, hmf::new)
   );
   public static final aun<hmf> b = new aun<>("villager", a);

   public hmf.a a() {
      return this.c;
   }

   public static enum a implements bax {
      a("none"),
      b("partial"),
      c("full");

      public static final Codec<hmf.a> d = bax.a(hmf.a::values);
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
