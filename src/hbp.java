import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hbp<T> implements hbi {
   private final hdo<T> a;
   private final hgl b;

   public hbp(hdo<T> $$0, hgl $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hbl $$0, cwp $$1, hbj $$2, cwn $$3, @Nullable gfy $$4, @Nullable bvg $$5, int $$6) {
      hbl.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(hbl.a.b);
      }

      $$7.a(this.a, this.a.b($$1), this.b);
   }

   public static record a(aku b, hdo.a c) implements hbi.b {
      public static final MapCodec<hbp.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(aku.a.fieldOf("base").forGetter(hbp.a::b), hdp.a.fieldOf("model").forGetter(hbp.a::c)).apply($$0, hbp.a::new)
      );

      @Override
      public void a(hhd.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hbi a(hbi.a $$0) {
         hgl $$1 = $$0.a(this.b);
         hdo<?> $$2 = this.c.a($$0.b());
         return (hbi)($$2 == null ? $$0.c() : new hbp<>($$2, $$1));
      }

      @Override
      public MapCodec<hbp.a> a() {
         return a;
      }
   }
}
