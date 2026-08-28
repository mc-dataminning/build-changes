import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;

public class hfm implements hfw<dvb> {
   private final gqf a;
   private final cwv b;

   public hfm(cwv $$0, gqf $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   @Nullable
   public dvb a(cxy $$0) {
      return $$0.a(kx.ak);
   }

   public void a(@Nullable dvb $$0, cxw $$1, fho $$2, gny $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, dvb.a));
   }

   public static record a(cwv b) implements hfw.a {
      public static final MapCodec<hfm.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwv.q.fieldOf("color").forGetter(hfm.a::b)).apply($$0, hfm.a::new));

      @Override
      public MapCodec<hfm.a> a() {
         return a;
      }

      @Override
      public hfw<?> a(ggz $$0) {
         return new hfm(this.b, new gqf($$0));
      }
   }
}
