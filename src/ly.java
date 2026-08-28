import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ly(fba c, int d, int e) implements lr {
   public static final MapCodec<ly> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fba.a.fieldOf("target").forGetter(ly::b), ayi.i.fieldOf("color").forGetter(ly::c), ayi.m.fieldOf("duration").forGetter(ly::d))
            .apply($$0, ly::new)
   );
   public static final ym<vz, ly> b = ym.a(fba.b, ly::b, yk.g, ly::c, yk.h, ly::d, ly::new);

   @Override
   public ls<ly> a() {
      return lt.V;
   }

   public fba b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
