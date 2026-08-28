import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record hfz(Optional<List<hfy>> c, Optional<Integer> d, Optional<Integer> e, int f, boolean g) {
   public static final Codec<hfz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hfy.b.listOf().optionalFieldOf("frames").forGetter(hfz::a),
               ayh.m.optionalFieldOf("width").forGetter(hfz::b),
               ayh.m.optionalFieldOf("height").forGetter(hfz::c),
               ayh.m.optionalFieldOf("frametime", 1).forGetter(hfz::d),
               Codec.BOOL.optionalFieldOf("interpolate", false).forGetter(hfz::e)
            )
            .apply($$0, hfz::new)
   );
   public static final ato<hfz> b = new ato<>("animation", a);

   public hga a(int $$0, int $$1) {
      if (this.d.isPresent()) {
         return this.e.isPresent() ? new hga(this.d.get(), this.e.get()) : new hga(this.d.get(), $$1);
      } else if (this.e.isPresent()) {
         return new hga($$0, this.e.get());
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hga($$2, $$2);
      }
   }

   public Optional<List<hfy>> a() {
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
