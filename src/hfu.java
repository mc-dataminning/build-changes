import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hfu<T> implements hfn {
   private final hib<T> a;
   private final hkx b;

   public hfu(hib<T> $$0, hkx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hfq $$0, czd $$1, hfo $$2, czb $$3, @Nullable gjz $$4, @Nullable bxe $$5, int $$6) {
      hfq.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(hfq.a.b);
      }

      $$7.a(this.a, this.a.b($$1), this.b);
   }

   public static record a(alg b, hib.a c) implements hfn.b {
      public static final MapCodec<hfu.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alg.a.fieldOf("base").forGetter(hfu.a::b), hic.a.fieldOf("model").forGetter(hfu.a::c)).apply($$0, hfu.a::new)
      );

      @Override
      public void a(hlp.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hfn a(hfn.a $$0) {
         hkx $$1 = $$0.a(this.b);
         hib<?> $$2 = this.c.a($$0.b());
         return (hfn)($$2 == null ? $$0.c() : new hfu<>($$2, $$1));
      }

      @Override
      public MapCodec<hfu.a> a() {
         return a;
      }
   }
}
