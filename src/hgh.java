import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hgh(hgh.a c) {
   public static final Codec<hgh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hgh.a.d.optionalFieldOf("hat", hgh.a.a).forGetter(hgh::a)).apply($$0, hgh::new)
   );
   public static final atp<hgh> b = new atp<>("villager", a);

   public hgh.a a() {
      return this.c;
   }

   public static enum a implements azv {
      a("none"),
      b("partial"),
      c("full");

      public static final Codec<hgh.a> d = azv.a(hgh.a::values);
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
