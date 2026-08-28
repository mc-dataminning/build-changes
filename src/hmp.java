import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hmp(hmp.a c) {
   public static final Codec<hmp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hmp.a.d.optionalFieldOf("hat", hmp.a.a).forGetter(hmp::a)).apply($$0, hmp::new)
   );
   public static final aue<hmp> b = new aue<>("villager", a);

   public hmp.a a() {
      return this.c;
   }

   public static enum a implements bam {
      a("none"),
      b("partial"),
      c("full");

      public static final Codec<hmp.a> d = bam.a(hmp.a::values);
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
