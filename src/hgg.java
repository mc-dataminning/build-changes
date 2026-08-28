import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record hgg(Optional<List<hgf>> c, Optional<Integer> d, Optional<Integer> e, int f, boolean g) {
   public static final Codec<hgg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hgf.b.listOf().optionalFieldOf("frames").forGetter(hgg::a),
               ayi.m.optionalFieldOf("width").forGetter(hgg::b),
               ayi.m.optionalFieldOf("height").forGetter(hgg::c),
               ayi.m.optionalFieldOf("frametime", 1).forGetter(hgg::d),
               Codec.BOOL.optionalFieldOf("interpolate", false).forGetter(hgg::e)
            )
            .apply($$0, hgg::new)
   );
   public static final atp<hgg> b = new atp<>("animation", a);

   public hgh a(int $$0, int $$1) {
      if (this.d.isPresent()) {
         return this.e.isPresent() ? new hgh(this.d.get(), this.e.get()) : new hgh(this.d.get(), $$1);
      } else if (this.e.isPresent()) {
         return new hgh($$0, this.e.get());
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hgh($$2, $$2);
      }
   }

   public Optional<List<hgf>> a() {
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
