import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hdr<T> implements hdk {
   private final hfw<T> a;
   private final his b;

   public hdr(hfw<T> $$0, his $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hdn $$0, cxy $$1, hdl $$2, cxw $$3, @Nullable ghz $$4, @Nullable bwr $$5, int $$6) {
      hdn.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(hdn.a.b);
      }

      $$7.a(this.a, this.a.b($$1), this.b);
   }

   public static record a(ald b, hfw.a c) implements hdk.b {
      public static final MapCodec<hdr.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ald.a.fieldOf("base").forGetter(hdr.a::b), hfx.a.fieldOf("model").forGetter(hdr.a::c)).apply($$0, hdr.a::new)
      );

      @Override
      public void a(hjk.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hdk a(hdk.a $$0) {
         his $$1 = $$0.a(this.b);
         hfw<?> $$2 = this.c.a($$0.b());
         return (hdk)($$2 == null ? $$0.c() : new hdr<>($$2, $$1));
      }

      @Override
      public MapCodec<hdr.a> a() {
         return a;
      }
   }
}
