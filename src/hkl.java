import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hkl(hkl.a c) {
   public static final Codec<hkl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hkl.a.d.optionalFieldOf("hat", hkl.a.a).forGetter(hkl::a)).apply($$0, hkl::new)
   );
   public static final auc<hkl> b = new auc<>("villager", a);

   public hkl.a a() {
      return this.c;
   }

   public static enum a implements bak {
      a("none"),
      b("partial"),
      c("full");

      public static final Codec<hkl.a> d = bak.a(hkl.a::values);
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
