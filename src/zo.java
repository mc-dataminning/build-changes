import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface zo {
   zo.b<? extends zo> a();

   static <B extends ByteBuf, T extends zo> ye<B, T> a(yh<B, T> $$0, yf<B, T> $$1) {
      return ye.a($$0, $$1);
   }

   static <T extends zo> zo.b<T> a(String $$0) {
      return new zo.b<>(new ajt($$0));
   }

   static <B extends vg> ye<B, zo> a(final zo.a<B> $$0, List<zo.c<? super B, ?>> $$1) {
      final Map<ajt, ye<? super B, ? extends zo>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), zo.c::b));
      return new ye<B, zo>() {
         private ye<? super B, ? extends zo> a(ajt $$0x) {
            ye<? super B, ? extends zo> $$1 = $$2.get($$0);
            return $$1 != null ? $$1 : $$0.create($$0);
         }

         private <T extends zo> void a(B $$0x, zo.b<T> $$1, zo $$2x) {
            $$0.a($$1.a());
            ye<B, T> $$3 = this.a($$1.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, zo $$1) {
            this.a($$0, $$1.a(), $$1);
         }

         public zo a(B $$0x) {
            ajt $$1 = $$0.q();
            return (zo)this.a($$1).decode($$0);
         }
      };
   }

   public interface a<B extends vg> {
      ye<B, ? extends zo> create(ajt var1);
   }

   public static record b<T extends zo>(ajt a) {
   }

   public static record c<B extends vg, T extends zo>(zo.b<T> a, ye<B, T> b) {
   }
}
