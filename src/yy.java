import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface yy {
   yy.b<? extends yy> a();

   static <B extends ByteBuf, T extends yy> xo<B, T> a(xr<B, T> $$0, xp<B, T> $$1) {
      return xo.a($$0, $$1);
   }

   static <T extends yy> yy.b<T> a(String $$0) {
      return new yy.b<>(new aiy($$0));
   }

   static <B extends uq> xo<B, yy> a(final yy.a<B> $$0, List<yy.c<? super B, ?>> $$1) {
      final Map<aiy, xo<? super B, ? extends yy>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), yy.c::b));
      return new xo<B, yy>() {
         private xo<? super B, ? extends yy> a(aiy $$0x) {
            xo<? super B, ? extends yy> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends yy> void a(B $$0x, yy.b<T> $$1, yy $$2x) {
            $$0.a($$1.a());
            xo<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, yy $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public yy a(B $$0x) {
            aiy $$1 = $$0.s();
            return (yy)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends uq> {
      xo<B, ? extends yy> create(aiy var1);
   }

   public static record b<T extends yy>(aiy a) {
   }

   public static record c<B extends uq, T extends yy>(yy.b<T> a, xo<B, T> b) {
   }
}
