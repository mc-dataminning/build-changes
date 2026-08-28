import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface zz {
   zz.b<? extends zz> a();

   static <B extends ByteBuf, T extends zz> yn<B, T> a(yq<B, T> $$0, yo<B, T> $$1) {
      return yn.a($$0, $$1);
   }

   static <T extends zz> zz.b<T> a(String $$0) {
      return new zz.b<>(aku.b($$0));
   }

   static <B extends vl> yn<B, zz> a(final zz.a<B> $$0, List<zz.c<? super B, ?>> $$1) {
      final Map<aku, yn<? super B, ? extends zz>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), zz.c::b));
      return new yn<B, zz>() {
         private yn<? super B, ? extends zz> a(aku $$0x) {
            yn<? super B, ? extends zz> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends zz> void a(B $$0x, zz.b<T> $$1, zz $$2x) {
            $$0.a($$1.a());
            yn<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, zz $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public zz a(B $$0x) {
            aku $$1 = $$0.q();
            return (zz)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends vl> {
      yn<B, ? extends zz> create(aku var1);
   }

   public static record b<T extends zz>(aku a) {
   }

   public static record c<B extends vl, T extends zz>(zz.b<T> a, yn<B, T> b) {
   }
}
