import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface zc {
   zc.b<? extends zc> a();

   static <B extends ByteBuf, T extends zc> xs<B, T> a(xv<B, T> $$0, xt<B, T> $$1) {
      return xs.a($$0, $$1);
   }

   static <T extends zc> zc.b<T> a(String $$0) {
      return new zc.b<>(new ajh($$0));
   }

   static <B extends uu> xs<B, zc> a(final zc.a<B> $$0, List<zc.c<? super B, ?>> $$1) {
      final Map<ajh, xs<? super B, ? extends zc>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), zc.c::b));
      return new xs<B, zc>() {
         private xs<? super B, ? extends zc> a(ajh $$0x) {
            xs<? super B, ? extends zc> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends zc> void a(B $$0x, zc.b<T> $$1, zc $$2x) {
            $$0.a($$1.a());
            xs<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, zc $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public zc a(B $$0x) {
            ajh $$1 = $$0.q();
            return (zc)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends uu> {
      xs<B, ? extends zc> create(ajh var1);
   }

   public static record b<T extends zc>(ajh a) {
   }

   public static record c<B extends uu, T extends zc>(zc.b<T> a, xs<B, T> b) {
   }
}
