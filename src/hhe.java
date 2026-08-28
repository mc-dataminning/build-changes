import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record hhe(Optional<List<hhd>> c, Optional<Integer> d, Optional<Integer> e, int f, boolean g) {
   public static final Codec<hhe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hhd.b.listOf().optionalFieldOf("frames").forGetter(hhe::a),
               ayi.m.optionalFieldOf("width").forGetter(hhe::b),
               ayi.m.optionalFieldOf("height").forGetter(hhe::c),
               ayi.m.optionalFieldOf("frametime", 1).forGetter(hhe::d),
               Codec.BOOL.optionalFieldOf("interpolate", false).forGetter(hhe::e)
            )
            .apply($$0, hhe::new)
   );
   public static final atp<hhe> b = new atp<>("animation", a);

   public hhf a(int $$0, int $$1) {
      if (this.d.isPresent()) {
         return this.e.isPresent() ? new hhf(this.d.get(), this.e.get()) : new hhf(this.d.get(), $$1);
      } else if (this.e.isPresent()) {
         return new hhf($$0, this.e.get());
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hhf($$2, $$2);
      }
   }

   public Optional<List<hhd>> a() {
      return this.c;
   }

   public Optional<Integer> b() {
      return this.d;
   }

   public Optional<Integer> c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }
}
