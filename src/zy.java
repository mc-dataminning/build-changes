import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface zy {
   zy.b<? extends zy> a();

   static <B extends ByteBuf, T extends zy> ym<B, T> a(yp<B, T> $$0, yn<B, T> $$1) {
      return ym.a($$0, $$1);
   }

   static <T extends zy> zy.b<T> a(String $$0) {
      return new zy.b<>(aku.b($$0));
   }

   static <B extends vl> ym<B, zy> a(final zy.a<B> $$0, List<zy.c<? super B, ?>> $$1) {
      final Map<aku, ym<? super B, ? extends zy>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), zy.c::b));
      return new ym<B, zy>() {
         private ym<? super B, ? extends zy> a(aku $$0x) {
            ym<? super B, ? extends zy> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends zy> void a(B $$0x, zy.b<T> $$1, zy $$2x) {
            $$0.a($$1.a());
            ym<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, zy $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public zy a(B $$0x) {
            aku $$1 = $$0.q();
            return (zy)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends vl> {
      ym<B, ? extends zy> create(aku var1);
   }

   public static record b<T extends zy>(aku a) {
   }

   public static record c<B extends vl, T extends zy>(zy.b<T> a, ym<B, T> b) {
   }
}
