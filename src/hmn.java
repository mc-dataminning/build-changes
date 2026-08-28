import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record hmn(Optional<List<hmm>> c, Optional<Integer> d, Optional<Integer> e, int f, boolean g) {
   public static final Codec<hmn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hmm.b.listOf().optionalFieldOf("frames").forGetter(hmn::a),
               ayw.m.optionalFieldOf("width").forGetter(hmn::b),
               ayw.m.optionalFieldOf("height").forGetter(hmn::c),
               ayw.m.optionalFieldOf("frametime", 1).forGetter(hmn::d),
               Codec.BOOL.optionalFieldOf("interpolate", false).forGetter(hmn::e)
            )
            .apply($$0, hmn::new)
   );
   public static final aue<hmn> b = new aue<>("animation", a);

   public hmo a(int $$0, int $$1) {
      if (this.d.isPresent()) {
         return this.e.isPresent() ? new hmo(this.d.get(), this.e.get()) : new hmo(this.d.get(), $$1);
      } else if (this.e.isPresent()) {
         return new hmo($$0, this.e.get());
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hmo($$2, $$2);
      }
   }

   public Optional<List<hmm>> a() {
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
