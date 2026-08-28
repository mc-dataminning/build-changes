import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record hgf(Optional<List<hge>> c, Optional<Integer> d, Optional<Integer> e, int f, boolean g) {
   public static final Codec<hgf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hge.b.listOf().optionalFieldOf("frames").forGetter(hgf::a),
               ayi.m.optionalFieldOf("width").forGetter(hgf::b),
               ayi.m.optionalFieldOf("height").forGetter(hgf::c),
               ayi.m.optionalFieldOf("frametime", 1).forGetter(hgf::d),
               Codec.BOOL.optionalFieldOf("interpolate", false).forGetter(hgf::e)
            )
            .apply($$0, hgf::new)
   );
   public static final atp<hgf> b = new atp<>("animation", a);

   public hgg a(int $$0, int $$1) {
      if (this.d.isPresent()) {
         return this.e.isPresent() ? new hgg(this.d.get(), this.e.get()) : new hgg(this.d.get(), $$1);
      } else if (this.e.isPresent()) {
         return new hgg($$0, this.e.get());
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hgg($$2, $$2);
      }
   }

   public Optional<List<hge>> a() {
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
