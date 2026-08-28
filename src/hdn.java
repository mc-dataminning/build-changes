import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hdn implements hdo<czo> {
   private final dqt.a a;
   private final gdx b;

   public hdn(dqt.a $$0, gdx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Nullable
   public czo a(cwp $$0) {
      return $$0.a(kv.ag);
   }

   public void a(@Nullable czo $$0, cwn $$1, ffu $$2, glx $$3, int $$4, int $$5, boolean $$6) {
      gmh $$7 = gox.a(this.a, $$0);
      gox.a(null, 180.0F, 0.0F, $$2, $$3, $$4, this.b, $$7);
   }

   public static record a(dqt.a b) implements hdo.a {
      public static final MapCodec<hdn.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqt.a.b.fieldOf("kind").forGetter(hdn.a::b)).apply($$0, hdn.a::new));

      @Override
      public MapCodec<hdn.a> a() {
         return a;
      }

      @Nullable
      @Override
      public hdo<?> a(gey $$0) {
         gdx $$1 = gox.a($$0, this.b);
         return $$1 != null ? new hdn(this.b, $$1) : null;
      }
   }
}
