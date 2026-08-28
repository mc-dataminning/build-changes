import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;

public class hhr implements hib<dwv> {
   private final gsh a;
   private final cyb b;

   public hhr(cyb $$0, gsh $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   @Nullable
   public dwv a(czd $$0) {
      return $$0.a(kj.am);
   }

   public void a(@Nullable dwv $$0, czb $$1, fjj $$2, gqa $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, dwv.a));
   }

   public static record a(cyb b) implements hib.a {
      public static final MapCodec<hhr.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyb.q.fieldOf("color").forGetter(hhr.a::b)).apply($$0, hhr.a::new));

      @Override
      public MapCodec<hhr.a> a() {
         return a;
      }

      @Override
      public hib<?> a(giy $$0) {
         return new hhr(this.b, new gsh($$0));
      }
   }
}
