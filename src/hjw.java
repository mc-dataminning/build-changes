import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hjw implements hjq {
   private final gij a;
   private final hmx b;

   public hjw(gij $$0, hmx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(dai $$0, fld $$1, grn $$2, int $$3, int $$4, boolean $$5) {
      gup.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(ede b, Optional<alr> c) implements hju.a {
      public static final MapCodec<hjw.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ede.a.fieldOf("wood_type").forGetter(hjw.a::b), alr.a.optionalFieldOf("texture").forGetter(hjw.a::c)).apply($$0, hjw.a::new)
      );

      public a(ede $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hjw.a> a() {
         return a;
      }

      @Override
      public hju<?> a(gkn $$0) {
         gij $$1 = gup.a($$0, this.b, true);
         hmx $$2 = this.c.<hmx>map(gsh.q::a).orElseGet(() -> gsh.a(this.b));
         return new hjw($$1, $$2);
      }
   }
}
