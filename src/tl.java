import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record tl<EnvironmentType>(EnvironmentType b, alr c, int d, int e, boolean f, dui g, boolean h, int i, int j, boolean k) {
   public static final MapCodec<tl<jg<tm>>> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               tm.b.fieldOf("environment").forGetter(tl::a),
               alr.a.fieldOf("structure").forGetter(tl::b),
               azg.m.fieldOf("max_ticks").forGetter(tl::c),
               azg.l.optionalFieldOf("setup_ticks", 0).forGetter(tl::d),
               Codec.BOOL.optionalFieldOf("required", true).forGetter(tl::e),
               dui.f.optionalFieldOf("rotation", dui.a).forGetter(tl::f),
               Codec.BOOL.optionalFieldOf("manual_only", false).forGetter(tl::g),
               azg.m.optionalFieldOf("max_attempts", 1).forGetter(tl::h),
               azg.m.optionalFieldOf("required_successes", 1).forGetter(tl::i),
               Codec.BOOL.optionalFieldOf("sky_access", false).forGetter(tl::j)
            )
            .apply($$0, tl::new)
   );

   public tl(EnvironmentType $$0, alr $$1, int $$2, int $$3, boolean $$4, dui $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, false, 1, 1, false);
   }

   public tl(EnvironmentType $$0, alr $$1, int $$2, int $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, dui.a);
   }

   public <T> tl<T> a(Function<EnvironmentType, T> $$0) {
      return new tl<>($$0.apply(this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
   }

   public EnvironmentType a() {
      return this.b;
   }

   public alr b() {
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

   public dui f() {
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
