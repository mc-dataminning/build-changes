import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hew<T> implements hep {
   private final hhd<T> a;
   private final hjz b;

   public hew(hhd<T> $$0, hjz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hes $$0, cys $$1, heq $$2, cyq $$3, @Nullable gjd $$4, @Nullable bwz $$5, int $$6) {
      hes.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(hes.a.b);
      }

      $$7.a(this.a, this.a.b($$1), this.b);
   }

   public static record a(ale b, hhd.a c) implements hep.b {
      public static final MapCodec<hew.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ale.a.fieldOf("base").forGetter(hew.a::b), hhe.a.fieldOf("model").forGetter(hew.a::c)).apply($$0, hew.a::new)
      );

      @Override
      public void a(hkr.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hep a(hep.a $$0) {
         hjz $$1 = $$0.a(this.b);
         hhd<?> $$2 = this.c.a($$0.b());
         return (hep)($$2 == null ? $$0.c() : new hew<>($$2, $$1));
      }

      @Override
      public MapCodec<hew.a> a() {
         return a;
      }
   }
}
