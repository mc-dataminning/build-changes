import com.mojang.datafixers.util.Function3;
import io.netty.buffer.ByteBuf;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface xo<B, V> extends xp<B, V>, xq<B, V> {
   static <B, V> xo<B, V> a(final xq<B, V> $$0, final xp<B, V> $$1) {
      return new xo<B, V>() {
         @Override
         public V decode(B $$0x) {
            return $$1.decode($$0);
         }

         @Override
         public void encode(B $$0x, V $$1x) {
            $$0.encode($$0, $$1);
         }
      };
   }

   static <B, V> xo<B, V> a(final xr<B, V> $$0, final xp<B, V> $$1) {
      return new xo<B, V>() {
         @Override
         public V decode(B $$0x) {
            return $$1.decode($$0);
         }

         @Override
         public void encode(B $$0x, V $$1x) {
            $$0.encode($$1, $$0);
         }
      };
   }

   static <B, V> xo<B, V> a(final V $$0) {
      return new xo<B, V>() {
         @Override
         public V decode(B $$0x) {
            return $$0;
         }

         @Override
         public void encode(B $$0x, V $$1) {
            if (!$$1.equals($$0)) {
               throw new IllegalStateException("Can't encode '" + $$1 + "', expected '" + $$0 + "'");
            }
         }
      };
   }

   default <O> xo<B, O> a(xo.a<B, V, O> $$0) {
      return $$0.apply(this);
   }

   default <O> xo<B, O> a(final Function<? super V, ? extends O> $$0, final Function<? super O, ? extends V> $$1) {
      return new xo<B, O>() {
         @Override
         public O decode(B $$0x) {
            return (O)$$0.apply(xo.this.decode($$0));
         }

         @Override
         public void encode(B $$0x, O $$1x) {
            xo.this.encode($$0, (V)$$1.apply($$1));
         }
      };
   }

   default <O extends ByteBuf> xo<O, V> b(final Function<O, ? extends B> $$0) {
      return new xo<O, V>() {
         public V a(O $$0x) {
            B $$1 = (B)$$0.apply($$0);
            return xo.this.decode($$1);
         }

         public void a(O $$0x, V $$1) {
            B $$2 = (B)$$0.apply($$0);
            xo.this.encode($$2, $$1);
         }
      };
   }

   default <U> xo<B, U> b(final Function<? super U, ? extends V> $$0, final Function<? super V, ? extends xo<? super B, ? extends U>> $$1) {
      return new xo<B, U>() {
         @Override
         public U decode(B $$0x) {
            V $$1 = xo.this.decode($$0);
            xo<? super B, ? extends U> $$2 = (xo<? super B, ? extends U>)$$1.apply($$1);
            return (U)$$2.decode($$0);
         }

         @Override
         public void encode(B $$0x, U $$1x) {
            V $$2 = (V)$$0.apply($$1);
            xo<B, U> $$3 = (xo<B, U>)$$1.apply($$2);
            xo.this.encode($$0, $$2);
            $$3.encode($$0, $$1);
         }
      };
   }

   static <B, C, T1> xo<B, C> a(final xo<? super B, T1> $$0, final Function<C, T1> $$1, final Function<T1, C> $$2) {
      return new xo<B, C>() {
         @Override
         public C decode(B $$0x) {
            T1 $$1 = $$0.decode($$0);
            return $$2.apply($$1);
         }

         @Override
         public void encode(B $$0x, C $$1x) {
            $$0.encode($$0, $$1.apply($$1));
         }
      };
   }

   static <B, C, T1, T2> xo<B, C> a(
      final xo<? super B, T1> $$0, final Function<C, T1> $$1, final xo<? super B, T2> $$2, final Function<C, T2> $$3, final BiFunction<T1, T2, C> $$4
   ) {
      return new xo<B, C>() {
         @Override
         public C decode(B $$0x) {
            T1 $$1 = $$0.decode($$0);
            T2 $$2 = $$2.decode($$0);
            return $$4.apply($$1, $$2);
         }

         @Override
         public void encode(B $$0x, C $$1x) {
            $$0.encode($$0, $$1.apply($$1));
            $$2.encode($$0, $$3.apply($$1));
         }
      };
   }

   static <B, C, T1, T2, T3> xo<B, C> a(
      final xo<? super B, T1> $$0,
      final Function<C, T1> $$1,
      final xo<? super B, T2> $$2,
      final Function<C, T2> $$3,
      final xo<? super B, T3> $$4,
      final Function<C, T3> $$5,
      final Function3<T1, T2, T3, C> $$6
   ) {
      return new xo<B, C>() {
         @Override
         public C decode(B $$0x) {
            T1 $$1 = $$0.decode($$0);
            T2 $$2 = $$2.decode($$0);
            T3 $$3 = $$4.decode($$0);
            return (C)$$6.apply($$1, $$2, $$3);
         }

         @Override
         public void encode(B $$0x, C $$1x) {
            $$0.encode($$0, $$1.apply($$1));
            $$2.encode($$0, $$3.apply($$1));
            $$4.encode($$0, $$5.apply($$1));
         }
      };
   }

   default <S extends B> xo<S, V> a() {
      return this;
   }

   @FunctionalInterface
   public interface a<B, S, T> {
      xo<B, T> apply(xo<B, S> var1);
   }
}
