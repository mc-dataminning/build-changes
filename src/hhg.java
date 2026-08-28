import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hhg(hhg.a c) {
   public static final Codec<hhg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hhg.a.d.optionalFieldOf("hat", hhg.a.a).forGetter(hhg::a)).apply($$0, hhg::new)
   );
   public static final atp<hhg> b = new atp<>("villager", a);

   public hhg.a a() {
      return this.c;
   }

   public static enum a implements azv {
      a("none"),
      b("partial"),
      c("full");

      public static final Codec<hhg.a> d = azv.a(hhg.a::values);
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
