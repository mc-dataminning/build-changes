import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record hge(Optional<List<hgd>> c, Optional<Integer> d, Optional<Integer> e, int f, boolean g) {
   public static final Codec<hge> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hgd.b.listOf().optionalFieldOf("frames").forGetter(hge::a),
               ayi.m.optionalFieldOf("width").forGetter(hge::b),
               ayi.m.optionalFieldOf("height").forGetter(hge::c),
               ayi.m.optionalFieldOf("frametime", 1).forGetter(hge::d),
               Codec.BOOL.optionalFieldOf("interpolate", false).forGetter(hge::e)
            )
            .apply($$0, hge::new)
   );
   public static final atp<hge> b = new atp<>("animation", a);

   public hgf a(int $$0, int $$1) {
      if (this.d.isPresent()) {
         return this.e.isPresent() ? new hgf(this.d.get(), this.e.get()) : new hgf(this.d.get(), $$1);
      } else if (this.e.isPresent()) {
         return new hgf($$0, this.e.get());
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hgf($$2, $$2);
      }
   }

   public Optional<List<hgd>> a() {
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
