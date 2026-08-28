import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hbt<T> implements hbm {
   private final hdx<T> a;
   private final hgt b;

   public hbt(hdx<T> $$0, hgt $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hbp $$0, cwq $$1, hbn $$2, cwo $$3, @Nullable gga $$4, @Nullable bvi $$5, int $$6) {
      hbp.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(hbp.a.b);
      }

      $$7.a(this.a, this.a.b($$1), this.b);
   }

   public static record a(akv b, hdx.a c) implements hbm.b {
      public static final MapCodec<hbt.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(akv.a.fieldOf("base").forGetter(hbt.a::b), hdy.a.fieldOf("model").forGetter(hbt.a::c)).apply($$0, hbt.a::new)
      );

      @Override
      public void a(hhl.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hbm a(hbm.a $$0) {
         hgt $$1 = $$0.a(this.b);
         hdx<?> $$2 = this.c.a($$0.b());
         return (hbm)($$2 == null ? $$0.c() : new hbt<>($$2, $$1));
      }

      @Override
      public MapCodec<hbt.a> a() {
         return a;
      }
   }
}
