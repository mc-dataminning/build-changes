import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record hkb(Optional<List<hka>> c, Optional<Integer> d, Optional<Integer> e, int f, boolean g) {
   public static final Codec<hkb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hka.b.listOf().optionalFieldOf("frames").forGetter(hkb::a),
               ayu.m.optionalFieldOf("width").forGetter(hkb::b),
               ayu.m.optionalFieldOf("height").forGetter(hkb::c),
               ayu.m.optionalFieldOf("frametime", 1).forGetter(hkb::d),
               Codec.BOOL.optionalFieldOf("interpolate", false).forGetter(hkb::e)
            )
            .apply($$0, hkb::new)
   );
   public static final auc<hkb> b = new auc<>("animation", a);

   public hkc a(int $$0, int $$1) {
      if (this.d.isPresent()) {
         return this.e.isPresent() ? new hkc(this.d.get(), this.e.get()) : new hkc(this.d.get(), $$1);
      } else if (this.e.isPresent()) {
         return new hkc($$0, this.e.get());
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hkc($$2, $$2);
      }
   }

   public Optional<List<hka>> a() {
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
