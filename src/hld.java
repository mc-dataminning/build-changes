import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record hld(Optional<List<hlc>> c, Optional<Integer> d, Optional<Integer> e, int f, boolean g) {
   public static final Codec<hld> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hlc.b.listOf().optionalFieldOf("frames").forGetter(hld::a),
               ayu.m.optionalFieldOf("width").forGetter(hld::b),
               ayu.m.optionalFieldOf("height").forGetter(hld::c),
               ayu.m.optionalFieldOf("frametime", 1).forGetter(hld::d),
               Codec.BOOL.optionalFieldOf("interpolate", false).forGetter(hld::e)
            )
            .apply($$0, hld::new)
   );
   public static final auc<hld> b = new auc<>("animation", a);

   public hle a(int $$0, int $$1) {
      if (this.d.isPresent()) {
         return this.e.isPresent() ? new hle(this.d.get(), this.e.get()) : new hle(this.d.get(), $$1);
      } else if (this.e.isPresent()) {
         return new hle($$0, this.e.get());
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hle($$2, $$2);
      }
   }

   public Optional<List<hlc>> a() {
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
