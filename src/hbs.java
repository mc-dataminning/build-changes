import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hbs<T> implements hbl {
   private final hdw<T> a;
   private final hgs b;

   public hbs(hdw<T> $$0, hgs $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hbo $$0, cwp $$1, hbm $$2, cwn $$3, @Nullable gfz $$4, @Nullable bvh $$5, int $$6) {
      hbo.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(hbo.a.b);
      }

      $$7.a(this.a, this.a.b($$1), this.b);
   }

   public static record a(akv b, hdw.a c) implements hbl.b {
      public static final MapCodec<hbs.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(akv.a.fieldOf("base").forGetter(hbs.a::b), hdx.a.fieldOf("model").forGetter(hbs.a::c)).apply($$0, hbs.a::new)
      );

      @Override
      public void a(hhk.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hbl a(hbl.a $$0) {
         hgs $$1 = $$0.a(this.b);
         hdw<?> $$2 = this.c.a($$0.b());
         return (hbl)($$2 == null ? $$0.c() : new hbs<>($$2, $$1));
      }

      @Override
      public MapCodec<hbs.a> a() {
         return a;
      }
   }
}
