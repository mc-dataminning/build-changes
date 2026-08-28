import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hgg(hgg.a c) {
   public static final Codec<hgg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hgg.a.d.optionalFieldOf("hat", hgg.a.a).forGetter(hgg::a)).apply($$0, hgg::new)
   );
   public static final atp<hgg> b = new atp<>("villager", a);

   public hgg.a a() {
      return this.c;
   }

   public static enum a implements azv {
      a("none"),
      b("partial"),
      c("full");

      public static final Codec<hgg.a> d = azv.a(hgg.a::values);
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
