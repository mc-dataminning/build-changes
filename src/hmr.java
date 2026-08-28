import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hmr(hmr.a c) {
   public static final Codec<hmr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hmr.a.d.optionalFieldOf("hat", hmr.a.a).forGetter(hmr::a)).apply($$0, hmr::new)
   );
   public static final aug<hmr> b = new aug<>("villager", a);

   public hmr.a a() {
      return this.c;
   }

   public static enum a implements bao {
      a("none"),
      b("partial"),
      c("full");

      public static final Codec<hmr.a> d = bao.a(hmr.a::values);
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
