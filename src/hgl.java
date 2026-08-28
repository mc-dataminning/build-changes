import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgl(int b) implements hgp {
   public static final MapCodec<hgl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.l.optionalFieldOf("index", 0).forGetter(hgl::b)).apply($$0, hgl::new));

   @Override
   public float a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3) {
      dbh $$4 = $$0.a(kj.p);
      if ($$4 != null) {
         Float $$5 = $$4.a(this.b);
         if ($$5 != null) {
            return $$5;
         }
      }

      return 0.0F;
   }

   @Override
   public MapCodec<hgl> a() {
      return a;
   }
}
