import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hlf(hlf.a c) {
   public static final Codec<hlf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hlf.a.d.optionalFieldOf("hat", hlf.a.a).forGetter(hlf::a)).apply($$0, hlf::new)
   );
   public static final auc<hlf> b = new auc<>("villager", a);

   public hlf.a a() {
      return this.c;
   }

   public static enum a implements bak {
      a("none"),
      b("partial"),
      c("full");

      public static final Codec<hlf.a> d = bak.a(hlf.a::values);
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
