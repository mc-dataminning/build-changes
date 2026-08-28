import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record tj<EnvironmentType>(EnvironmentType b, ale c, int d, int e, boolean f, dsm g, boolean h, int i, int j, boolean k) {
   public static final MapCodec<tj<je<tk>>> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               tk.b.fieldOf("environment").forGetter(tj::a),
               ale.a.fieldOf("structure").forGetter(tj::b),
               ays.m.fieldOf("max_ticks").forGetter(tj::c),
               ays.l.optionalFieldOf("setup_ticks", 0).forGetter(tj::d),
               Codec.BOOL.optionalFieldOf("required", true).forGetter(tj::e),
               dsm.f.optionalFieldOf("rotation", dsm.a).forGetter(tj::f),
               Codec.BOOL.optionalFieldOf("manual_only", false).forGetter(tj::g),
               ays.m.optionalFieldOf("max_attempts", 1).forGetter(tj::h),
               ays.m.optionalFieldOf("required_successes", 1).forGetter(tj::i),
               Codec.BOOL.optionalFieldOf("sky_access", false).forGetter(tj::j)
            )
            .apply($$0, tj::new)
   );

   public tj(EnvironmentType $$0, ale $$1, int $$2, int $$3, boolean $$4, dsm $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, false, 1, 1, false);
   }

   public tj(EnvironmentType $$0, ale $$1, int $$2, int $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, dsm.a);
   }

   public <T> tj<T> a(Function<EnvironmentType, T> $$0) {
      return new tj<>($$0.apply(this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
   }

   public EnvironmentType a() {
      return this.b;
   }

   public ale b() {
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

   public dsm f() {
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
