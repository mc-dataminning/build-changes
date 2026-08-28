import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zo<T extends wi, B extends ByteBuf> {
   final vw a;
   final zk b;
   private final List<zo.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private zi d;

   public zo(vw $$0, zk $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zj<? super T>> zo<T, B> a(zl<P> $$0, za<? super B, P> $$1) {
      this.c.add(new zo.a<>($$0, $$1));
      return this;
   }

   public <P extends zh<? super T>, D extends zg<? super T>> zo<T, B> a(zl<P> $$0, Function<Iterable<zj<? super T>>, P> $$1, D $$2) {
      za<ByteBuf, D> $$3 = za.a($$2);
      zl<D> $$4 = (zl<D>)$$2.a();
      this.c.add(new zo.a<>($$4, $$3));
      this.d = zi.a($$0, $$1, $$2);
      return this;
   }

   za<ByteBuf, zj<? super T>> a(Function<ByteBuf, B> $$0, List<zo.a<T, ?, B>> $$1) {
      zn<ByteBuf, T> $$2 = new zn<>(this.b);

      for (zo.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public wk<T> a(Function<ByteBuf, B> $$0) {
      return new zo.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public wk.a<T, B> a() {
      final List<zo.a<T, ?, B>> $$0 = List.copyOf(this.c);
      final zi $$1 = this.d;
      return new wk.a<T, B>() {
         @Override
         public wk<T> a(Function<ByteBuf, B> $$0x) {
            return new zo.b<>(zo.this.a, zo.this.b, zo.this.a($$0, $$0), $$1);
         }

         @Override
         public vw a() {
            return zo.this.a;
         }

         @Override
         public zk b() {
            return zo.this.b;
         }

         @Override
         public void a(wk.a.a $$0x) {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               zo.a<T, ?, B> $$2 = $$0.get($$1);
               $$0.accept($$2.a, $$1);
            }
         }
      };
   }

   private static <L extends wi, B extends ByteBuf> wk.a<L, B> a(vw $$0, zk $$1, Consumer<zo<L, B>> $$2) {
      zo<L, B> $$3 = new zo<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wo, B extends ByteBuf> wk.a<T, B> a(vw $$0, Consumer<zo<T, B>> $$1) {
      return a($$0, zk.a, $$1);
   }

   public static <T extends vs, B extends ByteBuf> wk.a<T, B> b(vw $$0, Consumer<zo<T, B>> $$1) {
      return a($$0, zk.b, $$1);
   }

   static record a<T extends wi, P extends zj<? super T>, B extends ByteBuf>(zl<P> a, za<? super B, P> b) {

      public void a(zn<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         za<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends wi>(vw a, zk b, za<ByteBuf, zj<? super L>> c, @Nullable zi d) implements wk<L> {
   }
}
