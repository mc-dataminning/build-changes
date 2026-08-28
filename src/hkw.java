import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record hkw(Optional<List<hkv>> c, Optional<Integer> d, Optional<Integer> e, int f, boolean g) {
   public static final Codec<hkw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hkv.b.listOf().optionalFieldOf("frames").forGetter(hkw::a),
               ayu.m.optionalFieldOf("width").forGetter(hkw::b),
               ayu.m.optionalFieldOf("height").forGetter(hkw::c),
               ayu.m.optionalFieldOf("frametime", 1).forGetter(hkw::d),
               Codec.BOOL.optionalFieldOf("interpolate", false).forGetter(hkw::e)
            )
            .apply($$0, hkw::new)
   );
   public static final auc<hkw> b = new auc<>("animation", a);

   public hkx a(int $$0, int $$1) {
      if (this.d.isPresent()) {
         return this.e.isPresent() ? new hkx(this.d.get(), this.e.get()) : new hkx(this.d.get(), $$1);
      } else if (this.e.isPresent()) {
         return new hkx($$0, this.e.get());
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hkx($$2, $$2);
      }
   }

   public Optional<List<hkv>> a() {
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
