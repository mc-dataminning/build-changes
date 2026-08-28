import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgz(int c) implements hhf<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hhf.a<hgz, String> b = hhf.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.l.optionalFieldOf("index", 0).forGetter(hgz::c)).apply($$0, hgz::new)), a
   );

   @Nullable
   public String a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      dbh $$5 = $$0.a(kj.p);
      return $$5 != null ? $$5.c(this.c) : null;
   }

   @Override
   public hhf.a<hgz, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}
