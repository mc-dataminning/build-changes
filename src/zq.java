import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface zq {
   zq.b<? extends zq> a();

   static <B extends ByteBuf, T extends zq> yg<B, T> a(yj<B, T> $$0, yh<B, T> $$1) {
      return yg.a($$0, $$1);
   }

   static <T extends zq> zq.b<T> a(String $$0) {
      return new zq.b<>(new ajv($$0));
   }

   static <B extends vi> yg<B, zq> a(final zq.a<B> $$0, List<zq.c<? super B, ?>> $$1) {
      final Map<ajv, yg<? super B, ? extends zq>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), zq.c::b));
      return new yg<B, zq>() {
         private yg<? super B, ? extends zq> a(ajv $$0x) {
            yg<? super B, ? extends zq> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends zq> void a(B $$0x, zq.b<T> $$1, zq $$2x) {
            $$0.a($$1.a());
            yg<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, zq $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public zq a(B $$0x) {
            ajv $$1 = $$0.q();
            return (zq)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends vi> {
      yg<B, ? extends zq> create(ajv var1);
   }

   public static record b<T extends zq>(ajv a) {
   }

   public static record c<B extends vi, T extends zq>(zq.b<T> a, yg<B, T> b) {
   }
}
