import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;

public class hhj implements hht<dwn> {
   private final grz a;
   private final cxw b;

   public hhj(cxw $$0, grz $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   @Nullable
   public dwn a(cyy $$0) {
      return $$0.a(kj.am);
   }

   public void a(@Nullable dwn $$0, cyw $$1, fjc $$2, gps $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, dwn.a));
   }

   public static record a(cxw b) implements hht.a {
      public static final MapCodec<hhj.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxw.q.fieldOf("color").forGetter(hhj.a::b)).apply($$0, hhj.a::new));

      @Override
      public MapCodec<hhj.a> a() {
         return a;
      }

      @Override
      public hht<?> a(giq $$0) {
         return new hhj(this.b, new grz($$0));
      }
   }
}
