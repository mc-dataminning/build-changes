import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ti<EnvironmentType>(EnvironmentType b, ald c, int d, int e, boolean f, drm g, boolean h, int i, int j, boolean k) {
   public static final MapCodec<ti<js<tj>>> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               tj.b.fieldOf("batch").forGetter(ti::a),
               ald.a.fieldOf("structure").forGetter(ti::b),
               ays.m.fieldOf("max_ticks").forGetter(ti::c),
               ays.l.optionalFieldOf("setup_ticks", 0).forGetter(ti::d),
               Codec.BOOL.optionalFieldOf("required", true).forGetter(ti::e),
               drm.f.optionalFieldOf("rotation", drm.a).forGetter(ti::f),
               Codec.BOOL.optionalFieldOf("manual_only", false).forGetter(ti::g),
               ays.m.optionalFieldOf("max_attempts", 1).forGetter(ti::h),
               ays.m.optionalFieldOf("required_successes", 1).forGetter(ti::i),
               Codec.BOOL.optionalFieldOf("sky_accesss", false).forGetter(ti::j)
            )
            .apply($$0, ti::new)
   );

   public ti(EnvironmentType $$0, ald $$1, int $$2, int $$3, boolean $$4, drm $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, false, 1, 1, false);
   }

   public ti(EnvironmentType $$0, ald $$1, int $$2, int $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, drm.a);
   }

   public <T> ti<T> a(Function<EnvironmentType, T> $$0) {
      return new ti<>($$0.apply(this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
   }

   public EnvironmentType a() {
      return this.b;
   }

   public ald b() {
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

   public drm f() {
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
