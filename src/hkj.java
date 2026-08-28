import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record hkj(Optional<List<hki>> c, Optional<Integer> d, Optional<Integer> e, int f, boolean g) {
   public static final Codec<hkj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hki.b.listOf().optionalFieldOf("frames").forGetter(hkj::a),
               ayu.m.optionalFieldOf("width").forGetter(hkj::b),
               ayu.m.optionalFieldOf("height").forGetter(hkj::c),
               ayu.m.optionalFieldOf("frametime", 1).forGetter(hkj::d),
               Codec.BOOL.optionalFieldOf("interpolate", false).forGetter(hkj::e)
            )
            .apply($$0, hkj::new)
   );
   public static final auc<hkj> b = new auc<>("animation", a);

   public hkk a(int $$0, int $$1) {
      if (this.d.isPresent()) {
         return this.e.isPresent() ? new hkk(this.d.get(), this.e.get()) : new hkk(this.d.get(), $$1);
      } else if (this.e.isPresent()) {
         return new hkk($$0, this.e.get());
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hkk($$2, $$2);
      }
   }

   public Optional<List<hki>> a() {
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
