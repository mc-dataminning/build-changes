import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record hmp(Optional<List<hmo>> c, Optional<Integer> d, Optional<Integer> e, int f, boolean g) {
   public static final Codec<hmp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hmo.b.listOf().optionalFieldOf("frames").forGetter(hmp::a),
               ayy.m.optionalFieldOf("width").forGetter(hmp::b),
               ayy.m.optionalFieldOf("height").forGetter(hmp::c),
               ayy.m.optionalFieldOf("frametime", 1).forGetter(hmp::d),
               Codec.BOOL.optionalFieldOf("interpolate", false).forGetter(hmp::e)
            )
            .apply($$0, hmp::new)
   );
   public static final aug<hmp> b = new aug<>("animation", a);

   public hmq a(int $$0, int $$1) {
      if (this.d.isPresent()) {
         return this.e.isPresent() ? new hmq(this.d.get(), this.e.get()) : new hmq(this.d.get(), $$1);
      } else if (this.e.isPresent()) {
         return new hmq($$0, this.e.get());
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hmq($$2, $$2);
      }
   }

   public Optional<List<hmo>> a() {
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
