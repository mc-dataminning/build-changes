import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hbr<T> implements hbk {
   private final hdv<T> a;
   private final hgr b;

   public hbr(hdv<T> $$0, hgr $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hbn $$0, cwo $$1, hbl $$2, cwm $$3, @Nullable gfy $$4, @Nullable bvg $$5, int $$6) {
      hbn.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(hbn.a.b);
      }

      $$7.a(this.a, this.a.b($$1), this.b);
   }

   public static record a(akv b, hdv.a c) implements hbk.b {
      public static final MapCodec<hbr.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(akv.a.fieldOf("base").forGetter(hbr.a::b), hdw.a.fieldOf("model").forGetter(hbr.a::c)).apply($$0, hbr.a::new)
      );

      @Override
      public void a(hhj.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hbk a(hbk.a $$0) {
         hgr $$1 = $$0.a(this.b);
         hdv<?> $$2 = this.c.a($$0.b());
         return (hbk)($$2 == null ? $$0.c() : new hbr<>($$2, $$1));
      }

      @Override
      public MapCodec<hbr.a> a() {
         return a;
      }
   }
}
