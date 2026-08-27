import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gax(gay d) {
   public static final gax a = new gax(gay.b);
   public static final Codec<gax> b = RecordCodecBuilder.create($$0 -> $$0.group(arh.a(gay.a, "scaling", gay.b).forGetter(gax::a)).apply($$0, gax::new));
   public static final amw<gax> c = amw.a("gui", b);

   public gay a() {
      return this.d;
   }
}
