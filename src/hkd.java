import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hkd(hkd.a c) {
   public static final Codec<hkd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hkd.a.d.optionalFieldOf("hat", hkd.a.a).forGetter(hkd::a)).apply($$0, hkd::new)
   );
   public static final auc<hkd> b = new auc<>("villager", a);

   public hkd.a a() {
      return this.c;
   }

   public static enum a implements bak {
      a("none"),
      b("partial"),
      c("full");

      public static final Codec<hkd.a> d = bak.a(hkd.a::values);
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
