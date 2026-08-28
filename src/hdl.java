import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;

public class hdl implements hdv<dtp> {
   private final goe a;
   private final cvl b;

   public hdl(cvl $$0, goe $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   @Nullable
   public dtp a(cwo $$0) {
      return $$0.a(kv.ai);
   }

   public void a(@Nullable dtp $$0, cwm $$1, fft $$2, glx $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, dtp.a));
   }

   public static record a(cvl b) implements hdv.a {
      public static final MapCodec<hdl.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvl.q.fieldOf("color").forGetter(hdl.a::b)).apply($$0, hdl.a::new));

      @Override
      public MapCodec<hdl.a> a() {
         return a;
      }

      @Override
      public hdv<?> a(gey $$0) {
         return new hdl(this.b, new goe($$0));
      }
   }
}
