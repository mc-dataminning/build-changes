import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hfm<T> implements hff {
   private final hht<T> a;
   private final hkp b;

   public hfm(hht<T> $$0, hkp $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hfi $$0, cyy $$1, hfg $$2, cyw $$3, @Nullable gjr $$4, @Nullable bxc $$5, int $$6) {
      hfi.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(hfi.a.b);
      }

      $$7.a(this.a, this.a.b($$1), this.b);
   }

   public static record a(alg b, hht.a c) implements hff.b {
      public static final MapCodec<hfm.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alg.a.fieldOf("base").forGetter(hfm.a::b), hhu.a.fieldOf("model").forGetter(hfm.a::c)).apply($$0, hfm.a::new)
      );

      @Override
      public void a(hlh.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hff a(hff.a $$0) {
         hkp $$1 = $$0.a(this.b);
         hht<?> $$2 = this.c.a($$0.b());
         return (hff)($$2 == null ? $$0.c() : new hfm<>($$2, $$1));
      }

      @Override
      public MapCodec<hfm.a> a() {
         return a;
      }
   }
}
