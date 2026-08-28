import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zu<T extends wo, B extends ByteBuf> {
   final wd a;
   final zq b;
   private final List<zu.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private zo d;

   public zu(wd $$0, zq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zp<? super T>> zu<T, B> a(zr<P> $$0, zg<? super B, P> $$1) {
      this.c.add(new zu.a<>($$0, $$1));
      return this;
   }

   public <P extends zn<? super T>, D extends zm<? super T>> zu<T, B> a(zr<P> $$0, Function<Iterable<zp<? super T>>, P> $$1, D $$2) {
      zg<ByteBuf, D> $$3 = zg.a($$2);
      zr<D> $$4 = (zr<D>)$$2.a();
      this.c.add(new zu.a<>($$4, $$3));
      this.d = zo.a($$0, $$1, $$2);
      return this;
   }

   zg<ByteBuf, zp<? super T>> a(Function<ByteBuf, B> $$0, List<zu.a<T, ?, B>> $$1) {
      zt<ByteBuf, T> $$2 = new zt<>(this.b);

      for (zu.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public wq<T> a(Function<ByteBuf, B> $$0) {
      return new zu.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public wq.a<T, B> a() {
      final List<zu.a<T, ?, B>> $$0 = List.copyOf(this.c);
      final zo $$1 = this.d;
      return new wq.a<T, B>() {
         @Override
         public wq<T> a(Function<ByteBuf, B> $$0x) {
            return new zu.b<>(zu.this.a, zu.this.b, zu.this.a($$0, $$0), $$1);
         }

         @Override
         public wd a() {
            return zu.this.a;
         }

         @Override
         public zq b() {
            return zu.this.b;
         }

         @Override
         public void a(wq.a.a $$0x) {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               zu.a<T, ?, B> $$2 = $$0.get($$1);
               $$0.accept($$2.a, $$1);
            }
         }
      };
   }

   private static <L extends wo, B extends ByteBuf> wq.a<L, B> a(wd $$0, zq $$1, Consumer<zu<L, B>> $$2) {
      zu<L, B> $$3 = new zu<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wu, B extends ByteBuf> wq.a<T, B> a(wd $$0, Consumer<zu<T, B>> $$1) {
      return a($$0, zq.a, $$1);
   }

   public static <T extends vz, B extends ByteBuf> wq.a<T, B> b(wd $$0, Consumer<zu<T, B>> $$1) {
      return a($$0, zq.b, $$1);
   }

   static record a<T extends wo, P extends zp<? super T>, B extends ByteBuf>(zr<P> a, zg<? super B, P> b) {

      public void a(zt<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         zg<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends wo>(wd a, zq b, zg<ByteBuf, zp<? super L>> c, @Nullable zo d) implements wq<L> {
   }
}
