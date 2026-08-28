import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record tk<EnvironmentType>(EnvironmentType b, alg c, int d, int e, boolean f, dsz g, boolean h, int i, int j, boolean k) {
   public static final MapCodec<tk<je<tl>>> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               tl.b.fieldOf("environment").forGetter(tk::a),
               alg.a.fieldOf("structure").forGetter(tk::b),
               ayu.m.fieldOf("max_ticks").forGetter(tk::c),
               ayu.l.optionalFieldOf("setup_ticks", 0).forGetter(tk::d),
               Codec.BOOL.optionalFieldOf("required", true).forGetter(tk::e),
               dsz.f.optionalFieldOf("rotation", dsz.a).forGetter(tk::f),
               Codec.BOOL.optionalFieldOf("manual_only", false).forGetter(tk::g),
               ayu.m.optionalFieldOf("max_attempts", 1).forGetter(tk::h),
               ayu.m.optionalFieldOf("required_successes", 1).forGetter(tk::i),
               Codec.BOOL.optionalFieldOf("sky_access", false).forGetter(tk::j)
            )
            .apply($$0, tk::new)
   );

   public tk(EnvironmentType $$0, alg $$1, int $$2, int $$3, boolean $$4, dsz $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, false, 1, 1, false);
   }

   public tk(EnvironmentType $$0, alg $$1, int $$2, int $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, dsz.a);
   }

   public <T> tk<T> a(Function<EnvironmentType, T> $$0) {
      return new tk<>($$0.apply(this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
   }

   public EnvironmentType a() {
      return this.b;
   }

   public alg b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public dsz f() {
      return this.g;
   }

   public boolean g() {
      return this.h;
   }

   public int h() {
      return this.i;
   }

   public int i() {
      return this.j;
   }

   public boolean j() {
      return this.k;
   }
}
