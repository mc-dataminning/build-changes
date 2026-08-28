import com.google.common.base.Suppliers;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Function5;
import com.mojang.datafixers.util.Function6;
import io.netty.buffer.ByteBuf;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public interface zc<B, V> extends zd<B, V>, ze<B, V> {
   static <B, V> zc<B, V> a(final ze<B, V> $$0, final zd<B, V> $$1) {
      return new zc<B, V>() {
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

   static <B, V> zc<B, V> a(final zf<B, V> $$0, final zd<B, V> $$1) {
      return new zc<B, V>() {
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

   static <B, V> zc<B, V> a(final V $$0) {
      return new zc<B, V>() {
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

   default <O> zc<B, O> a(zc.a<B, V, O> $$0) {
      return $$0.apply(this);
   }

   default <O> zc<B, O> a(final Function<? super V, ? extends O> $$0, final Function<? super O, ? extends V> $$1) {
      return new zc<B, O>() {
         @Override
         public O decode(B $$0x) {
            return (O)$$0.apply(zc.this.decode($$0));
         }

         @Override
         public void encode(B $$0x, O $$1x) {
            zc.this.encode($$0, (V)$$1.apply($$1));
         }
      };
   }

   default <O extends ByteBuf> zc<O, V> b(final Function<O, ? extends B> $$0) {
      return new zc<O, V>() {
         public V a(O $$0x) {
            B $$1 = (B)$$0.apply($$0);
            return zc.this.decode($$1);
         }

         public void a(O $$0x, V $$1) {
            B $$2 = (B)$$0.apply($$0);
            zc.this.encode($$2, $$1);
         }
      };
   }

   default <U> zc<B, U> b(final Function<? super U, ? extends V> $$0, final Function<? super V, ? extends zc<? super B, ? extends U>> $$1) {
      return new zc<B, U>() {
         @Override
         public U decode(B $$0x) {
            V $$1 = zc.this.decode($$0);
            zc<? super B, ? extends U> $$2 = (zc<? super B, ? extends U>)$$1.apply($$1);
            return (U)$$2.decode($$0);
         }

         @Override
         public void encode(B $$0x, U $$1x) {
            V $$2 = (V)$$0.apply($$1);
            zc<B, U> $$3 = (zc<B, U>)$$1.apply($$2);
            zc.this.encode($$0, $$2);
            $$3.encode($$0, $$1);
         }
      };
   }

   static <B, C, T1> zc<B, C> a(final zc<? super B, T1> $$0, final Function<C, T1> $$1, final Function<T1, C> $$2) {
      return new zc<B, C>() {
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

   static <B, C, T1, T2> zc<B, C> a(
      final zc<? super B, T1> $$0, final Function<C, T1> $$1, final zc<? super B, T2> $$2, final Function<C, T2> $$3, final BiFunction<T1, T2, C> $$4
   ) {
      return new zc<B, C>() {
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

   static <B, C, T1, T2, T3> zc<B, C> a(
      final zc<? super B, T1> $$0,
      final Function<C, T1> $$1,
      final zc<? super B, T2> $$2,
      final Function<C, T2> $$3,
      final zc<? super B, T3> $$4,
      final Function<C, T3> $$5,
      final Function3<T1, T2, T3, C> $$6
   ) {
      return new zc<B, C>() {
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

   static <B, C, T1, T2, T3, T4> zc<B, C> a(
      final zc<? super B, T1> $$0,
      final Function<C, T1> $$1,
      final zc<? super B, T2> $$2,
      final Function<C, T2> $$3,
      final zc<? super B, T3> $$4,
      final Function<C, T3> $$5,
      final zc<? super B, T4> $$6,
      final Function<C, T4> $$7,
      final Function4<T1, T2, T3, T4, C> $$8
   ) {
      return new zc<B, C>() {
         @Override
         public C decode(B $$0x) {
            T1 $$1 = $$0.decode($$0);
            T2 $$2 = $$2.decode($$0);
            T3 $$3 = $$4.decode($$0);
            T4 $$4 = $$6.decode($$0);
            return (C)$$8.apply($$1, $$2, $$3, $$4);
         }

         @Override
         public void encode(B $$0x, C $$1x) {
            $$0.encode($$0, $$1.apply($$1));
            $$2.encode($$0, $$3.apply($$1));
            $$4.encode($$0, $$5.apply($$1));
            $$6.encode($$0, $$7.apply($$1));
         }
      };
   }

   static <B, C, T1, T2, T3, T4, T5> zc<B, C> a(
      final zc<? super B, T1> $$0,
      final Function<C, T1> $$1,
      final zc<? super B, T2> $$2,
      final Function<C, T2> $$3,
      final zc<? super B, T3> $$4,
      final Function<C, T3> $$5,
      final zc<? super B, T4> $$6,
      final Function<C, T4> $$7,
      final zc<? super B, T5> $$8,
      final Function<C, T5> $$9,
      final Function5<T1, T2, T3, T4, T5, C> $$10
   ) {
      return new zc<B, C>() {
         @Override
         public C decode(B $$0x) {
            T1 $$1 = $$0.decode($$0);
            T2 $$2 = $$2.decode($$0);
            T3 $$3 = $$4.decode($$0);
            T4 $$4 = $$6.decode($$0);
            T5 $$5 = $$8.decode($$0);
            return (C)$$10.apply($$1, $$2, $$3, $$4, $$5);
         }

         @Override
         public void encode(B $$0x, C $$1x) {
            $$0.encode($$0, $$1.apply($$1));
            $$2.encode($$0, $$3.apply($$1));
            $$4.encode($$0, $$5.apply($$1));
            $$6.encode($$0, $$7.apply($$1));
            $$8.encode($$0, $$9.apply($$1));
         }
      };
   }

   static <B, C, T1, T2, T3, T4, T5, T6> zc<B, C> a(
      final zc<? super B, T1> $$0,
      final Function<C, T1> $$1,
      final zc<? super B, T2> $$2,
      final Function<C, T2> $$3,
      final zc<? super B, T3> $$4,
      final Function<C, T3> $$5,
      final zc<? super B, T4> $$6,
      final Function<C, T4> $$7,
      final zc<? super B, T5> $$8,
      final Function<C, T5> $$9,
      final zc<? super B, T6> $$10,
      final Function<C, T6> $$11,
      final Function6<T1, T2, T3, T4, T5, T6, C> $$12
   ) {
      return new zc<B, C>() {
         @Override
         public C decode(B $$0x) {
            T1 $$1 = $$0.decode($$0);
            T2 $$2 = $$2.decode($$0);
            T3 $$3 = $$4.decode($$0);
            T4 $$4 = $$6.decode($$0);
            T5 $$5 = $$8.decode($$0);
            T6 $$6 = $$10.decode($$0);
            return (C)$$12.apply($$1, $$2, $$3, $$4, $$5, $$6);
         }

         @Override
         public void encode(B $$0x, C $$1x) {
            $$0.encode($$0, $$1.apply($$1));
            $$2.encode($$0, $$3.apply($$1));
            $$4.encode($$0, $$5.apply($$1));
            $$6.encode($$0, $$7.apply($$1));
            $$8.encode($$0, $$9.apply($$1));
            $$10.encode($$0, $$11.apply($$1));
         }
      };
   }

   static <B, T> zc<B, T> a(final UnaryOperator<zc<B, T>> $$0) {
      return new zc<B, T>() {
         private final Supplier<zc<B, T>> b = Suppliers.memoize(() -> $$0.apply(this));

         @Override
         public T decode(B $$0x) {
            return this.b.get().decode($$0);
         }

         @Override
         public void encode(B $$0x, T $$1) {
            this.b.get().encode($$0, $$1);
         }
      };
   }

   default <S extends B> zc<S, V> a() {
      return this;
   }

   @FunctionalInterface
   public interface a<B, S, T> {
      zc<B, T> apply(zc<B, S> var1);
   }
}
