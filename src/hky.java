import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hky(hky.a c) {
   public static final Codec<hky> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hky.a.d.optionalFieldOf("hat", hky.a.a).forGetter(hky::a)).apply($$0, hky::new)
   );
   public static final auc<hky> b = new auc<>("villager", a);

   public hky.a a() {
      return this.c;
   }

   public static enum a implements bak {
      a("none"),
      b("partial"),
      c("full");

      public static final Codec<hky.a> d = bak.a(hky.a::values);
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
