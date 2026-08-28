import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class yw<B extends ByteBuf, V, T> implements yx<B, V> {
   private static final int a = -1;
   private final Function<V, ? extends T> b;
   private final List<yw.b<B, V, T>> c;
   private final Object2IntMap<T> d;

   yw(Function<V, ? extends T> $$0, List<yw.b<B, V, T>> $$1, Object2IntMap<T> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public V a(B $$0) {
      int $$1 = wq.a($$0);
      if ($$1 >= 0 && $$1 < this.c.size()) {
         yw.b<B, V, T> $$2 = this.c.get($$1);

         try {
            return (V)$$2.a.decode($$0);
         } catch (Exception var5) {
            throw new DecoderException("Failed to decode packet '" + $$2.b + "'", var5);
         }
      } else {
         throw new DecoderException("Received unknown packet id " + $$1);
      }
   }

   public void a(B $$0, V $$1) {
      T $$2 = (T)this.b.apply($$1);
      int $$3 = this.d.getOrDefault($$2, -1);
      if ($$3 == -1) {
         throw new EncoderException("Sending unknown packet '" + $$2 + "'");
      } else {
         wq.a($$0, $$3);
         yw.b<B, V, T> $$4 = this.c.get($$3);

         try {
            yx<? super B, V> $$5 = (yx<? super B, V>)$$4.a;
            $$5.encode($$0, $$1);
         } catch (Exception var7) {
            throw new EncoderException("Failed to encode packet '" + $$2 + "'", var7);
         }
      }
   }

   public static <B extends ByteBuf, V, T> yw.a<B, V, T> a(Function<V, ? extends T> $$0) {
      return new yw.a<>($$0);
   }

   public static class a<B extends ByteBuf, V, T> {
      private final List<yw.b<B, V, T>> a = new ArrayList<>();
      private final Function<V, ? extends T> b;

      a(Function<V, ? extends T> $$0) {
         this.b = $$0;
      }

      public yw.a<B, V, T> a(T $$0, yx<? super B, ? extends V> $$1) {
         this.a.add(new yw.b<>($$1, $$0));
         return this;
      }

      public yw<B, V, T> a() {
         Object2IntOpenHashMap<T> $$0 = new Object2IntOpenHashMap();
         $$0.defaultReturnValue(-2);

         for (yw.b<B, V, T> $$1 : this.a) {
            int $$2 = $$0.size();
            int $$3 = $$0.putIfAbsent($$1.b, $$2);
            if ($$3 != -2) {
               throw new IllegalStateException("Duplicate registration for type " + $$1.b);
            }
         }

         return new yw<>(this.b, List.copyOf(this.a), $$0);
      }
   }

   static record b<B, V, T>(yx<? super B, ? extends V> a, T b) {
   }
}
