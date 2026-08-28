import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hcr<T> implements hck {
   private final hev<T> a;
   private final hhr b;

   public hcr(hev<T> $$0, hhr $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hcn $$0, cxh $$1, hcl $$2, cxf $$3, @Nullable ggy $$4, @Nullable bvy $$5, int $$6) {
      hcn.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(hcn.a.b);
      }

      $$7.a(this.a, this.a.b($$1), this.b);
   }

   public static record a(aku b, hev.a c) implements hck.b {
      public static final MapCodec<hcr.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(aku.a.fieldOf("base").forGetter(hcr.a::b), hew.a.fieldOf("model").forGetter(hcr.a::c)).apply($$0, hcr.a::new)
      );

      @Override
      public void a(hij.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hck a(hck.a $$0) {
         hhr $$1 = $$0.a(this.b);
         hev<?> $$2 = this.c.a($$0.b());
         return (hck)($$2 == null ? $$0.c() : new hcr<>($$2, $$1));
      }

      @Override
      public MapCodec<hcr.a> a() {
         return a;
      }
   }
}
