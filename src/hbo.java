import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hbo<T> implements hbh {
   private final hdq<T> a;
   private final hgm b;

   public hbo(hdq<T> $$0, hgm $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hbk $$0, cwn $$1, hbi $$2, cwl $$3, @Nullable gfw $$4, @Nullable bvf $$5, int $$6) {
      hbk.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(hbk.a.b);
      }

      $$7.a(this.a, this.a.b($$1), this.b);
   }

   public static record a(aku b, hdq.a c) implements hbh.b {
      public static final MapCodec<hbo.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(aku.a.fieldOf("base").forGetter(hbo.a::b), hdr.a.fieldOf("model").forGetter(hbo.a::c)).apply($$0, hbo.a::new)
      );

      @Override
      public void a(hhe.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hbh a(hbh.a $$0) {
         hgm $$1 = $$0.a(this.b);
         hdq<?> $$2 = this.c.a($$0.b());
         return (hbh)($$2 == null ? $$0.c() : new hbo<>($$2, $$1));
      }

      @Override
      public MapCodec<hbo.a> a() {
         return a;
      }
   }
}
