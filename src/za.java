import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface za {
   za.b<? extends za> a();

   static <B extends ByteBuf, T extends za> xq<B, T> a(xt<B, T> $$0, xr<B, T> $$1) {
      return xq.a($$0, $$1);
   }

   static <T extends za> za.b<T> a(String $$0) {
      return new za.b<>(new ajc($$0));
   }

   static <B extends us> xq<B, za> a(final za.a<B> $$0, List<za.c<? super B, ?>> $$1) {
      final Map<ajc, xq<? super B, ? extends za>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), za.c::b));
      return new xq<B, za>() {
         private xq<? super B, ? extends za> a(ajc $$0x) {
            xq<? super B, ? extends za> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends za> void a(B $$0x, za.b<T> $$1, za $$2x) {
            $$0.a($$1.a());
            xq<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, za $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public za a(B $$0x) {
            ajc $$1 = $$0.q();
            return (za)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends us> {
      xq<B, ? extends za> create(ajc var1);
   }

   public static record b<T extends za>(ajc a) {
   }

   public static record c<B extends us, T extends za>(za.b<T> a, xq<B, T> b) {
   }
}
