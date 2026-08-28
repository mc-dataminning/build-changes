import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;

public class hjk implements hju<dye> {
   private final gtv a;
   private final czi b;

   public hjk(czi $$0, gtv $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   @Nullable
   public dye a(dak $$0) {
      return $$0.a(kl.am);
   }

   public void a(@Nullable dye $$0, dai $$1, fld $$2, grn $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, dye.a));
   }

   public static record a(czi b) implements hju.a {
      public static final MapCodec<hjk.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czi.q.fieldOf("color").forGetter(hjk.a::b)).apply($$0, hjk.a::new));

      @Override
      public MapCodec<hjk.a> a() {
         return a;
      }

      @Override
      public hju<?> a(gkn $$0) {
         return new hjk(this.b, new gtv($$0));
      }
   }
}
