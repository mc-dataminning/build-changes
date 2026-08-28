import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record hmd(Optional<List<hmc>> c, Optional<Integer> d, Optional<Integer> e, int f, boolean g) {
   public static final Codec<hmd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hmc.b.listOf().optionalFieldOf("frames").forGetter(hmd::a),
               azg.m.optionalFieldOf("width").forGetter(hmd::b),
               azg.m.optionalFieldOf("height").forGetter(hmd::c),
               azg.m.optionalFieldOf("frametime", 1).forGetter(hmd::d),
               Codec.BOOL.optionalFieldOf("interpolate", false).forGetter(hmd::e)
            )
            .apply($$0, hmd::new)
   );
   public static final aun<hmd> b = new aun<>("animation", a);

   public hme a(int $$0, int $$1) {
      if (this.d.isPresent()) {
         return this.e.isPresent() ? new hme(this.d.get(), this.e.get()) : new hme(this.d.get(), $$1);
      } else if (this.e.isPresent()) {
         return new hme($$0, this.e.get());
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hme($$2, $$2);
      }
   }

   public Optional<List<hmc>> a() {
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
