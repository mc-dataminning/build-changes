import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record hif(Optional<List<hie>> c, Optional<Integer> d, Optional<Integer> e, int f, boolean g) {
   public static final Codec<hif> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hie.b.listOf().optionalFieldOf("frames").forGetter(hif::a),
               ays.m.optionalFieldOf("width").forGetter(hif::b),
               ays.m.optionalFieldOf("height").forGetter(hif::c),
               ays.m.optionalFieldOf("frametime", 1).forGetter(hif::d),
               Codec.BOOL.optionalFieldOf("interpolate", false).forGetter(hif::e)
            )
            .apply($$0, hif::new)
   );
   public static final atz<hif> b = new atz<>("animation", a);

   public hig a(int $$0, int $$1) {
      if (this.d.isPresent()) {
         return this.e.isPresent() ? new hig(this.d.get(), this.e.get()) : new hig(this.d.get(), $$1);
      } else if (this.e.isPresent()) {
         return new hig($$0, this.e.get());
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hig($$2, $$2);
      }
   }

   public Optional<List<hie>> a() {
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
