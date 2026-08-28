import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hgi(hgi.a c) {
   public static final Codec<hgi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hgi.a.d.optionalFieldOf("hat", hgi.a.a).forGetter(hgi::a)).apply($$0, hgi::new)
   );
   public static final atp<hgi> b = new atp<>("villager", a);

   public hgi.a a() {
      return this.c;
   }

   public static enum a implements azv {
      a("none"),
      b("partial"),
      c("full");

      public static final Codec<hgi.a> d = azv.a(hgi.a::values);
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
