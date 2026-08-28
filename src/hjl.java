import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record hjl(Optional<List<hjk>> c, Optional<Integer> d, Optional<Integer> e, int f, boolean g) {
   public static final Codec<hjl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hjk.b.listOf().optionalFieldOf("frames").forGetter(hjl::a),
               ays.m.optionalFieldOf("width").forGetter(hjl::b),
               ays.m.optionalFieldOf("height").forGetter(hjl::c),
               ays.m.optionalFieldOf("frametime", 1).forGetter(hjl::d),
               Codec.BOOL.optionalFieldOf("interpolate", false).forGetter(hjl::e)
            )
            .apply($$0, hjl::new)
   );
   public static final aua<hjl> b = new aua<>("animation", a);

   public hjm a(int $$0, int $$1) {
      if (this.d.isPresent()) {
         return this.e.isPresent() ? new hjm(this.d.get(), this.e.get()) : new hjm(this.d.get(), $$1);
      } else if (this.e.isPresent()) {
         return new hjm($$0, this.e.get());
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hjm($$2, $$2);
      }
   }

   public Optional<List<hjk>> a() {
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
