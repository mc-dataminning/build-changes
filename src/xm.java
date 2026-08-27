import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public interface xm {
   xo<ByteBuf, Boolean> a = new xo<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   xo<ByteBuf, Byte> b = new xo<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   xo<ByteBuf, Short> c = new xo<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   xo<ByteBuf, Integer> d = new xo<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return vh.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         vh.a($$0, $$1);
      }
   };
   xo<ByteBuf, Long> e = new xo<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return vi.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         vi.a($$0, $$1);
      }
   };
   xo<ByteBuf, Float> f = new xo<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   xo<ByteBuf, Double> g = new xo<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   xo<ByteBuf, String> h = a(32767);
   xo<ByteBuf, tt> i = a(tf::a);
   xo<ByteBuf, sw> j = a(tf::a).a($$0 -> {
      if ($$0 instanceof sw) {
         return (sw)$$0;
      } else {
         throw new DecoderException("Not a compound tag: " + $$0);
      }
   }, $$0 -> (tt)$$0);
   xo<ByteBuf, Optional<sw>> k = new xo<ByteBuf, Optional<sw>>() {
      public Optional<sw> a(ByteBuf $$0) {
         return Optional.ofNullable(uq.e($$0));
      }

      public void a(ByteBuf $$0, Optional<sw> $$1) {
         uq.a($$0, $$1.orElse(null));
      }
   };
   xo<ByteBuf, Vector3f> l = new xo<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return uq.b($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         uq.a($$0, $$1);
      }
   };
   xo<ByteBuf, Quaternionf> m = new xo<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return uq.c($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         uq.a($$0, $$1);
      }
   };

   static xo<ByteBuf, String> a(final int $$0) {
      return new xo<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return vg.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            vg.a($$0, $$1, $$0);
         }
      };
   }

   static xo<ByteBuf, tt> a(final Supplier<tf> $$0) {
      return new xo<ByteBuf, tt>() {
         public tt a(ByteBuf $$0x) {
            tt $$1 = uq.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, tt $$1) {
            if ($$1 == sy.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               uq.a($$0, $$1);
            }
         }
      };
   }

   static <T> xo<ByteBuf, T> a(Codec<T> $$0) {
      return i.a(
         $$1 -> ac.a($$0.parse(tk.a, $$1), $$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1)),
         $$1 -> ac.a($$0.encodeStart(tk.a, $$1), $$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1))
      );
   }

   static <B extends ByteBuf, V> xo<B, Optional<V>> a(final xo<B, V> $$0) {
      return new xo<B, Optional<V>>() {
         public Optional<V> a(B $$0x) {
            return $$0.readBoolean() ? Optional.of($$0.decode($$0)) : Optional.empty();
         }

         public void a(B $$0x, Optional<V> $$1) {
            if ($$1.isPresent()) {
               $$0.writeBoolean(true);
               $$0.encode($$0, $$1.get());
            } else {
               $$0.writeBoolean(false);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> xo<B, C> a(final IntFunction<C> $$0, final xo<? super B, V> $$1) {
      return new xo<B, C>() {
         public C a(B $$0x) {
            int $$1 = vh.a($$0);
            C $$2 = $$0.apply($$1);

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            vh.a($$0, $$1.size());

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> xo.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> xo.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> xo<B, M> a(final IntFunction<? extends M> $$0, final xo<? super B, K> $$1, final xo<? super B, V> $$2) {
      return new xo<B, M>() {
         public void a(B $$0x, M $$1x) {
            vh.a($$0, $$1.size());
            $$1.forEach(($$3, $$4) -> {
               $$1.encode($$0, (K)$$3);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = vh.a($$0);
            M $$2 = (M)$$0.apply($$1);

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               K $$4 = $$1.decode($$0);
               V $$5 = $$2.decode($$0);
               $$2.put($$4, $$5);
            }

            return $$2;
         }
      };
   }

   static <T> xo<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new xo<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = vh.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            vh.a($$0, $$2);
         }
      };
   }

   static <T> xo<ByteBuf, T> a(io<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> xo<vb, R> a(final aix<? extends iv<T>> $$0, final Function<iv<T>, io<R>> $$1) {
      return new xo<vb, R>() {
         private io<R> b(vb $$0x) {
            return $$1.apply($$0.L().d($$0));
         }

         public R a(vb $$0x) {
            int $$1 = vh.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(vb $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            vh.a($$0, $$2);
         }
      };
   }

   static <T> xo<vb, T> a(aix<? extends iv<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> xo<vb, ij<T>> b(aix<? extends iv<T>> $$0) {
      return a($$0, iv::t);
   }

   static <T> xo<vb, ij<T>> a(final aix<? extends iv<T>> $$0, final xo<? super vb, T> $$1) {
      return new xo<vb, ij<T>>() {
         private static final int c = 0;

         private io<ij<T>> b(vb $$0x) {
            return $$0.L().d($$0).t();
         }

         public ij<T> a(vb $$0x) {
            int $$1 = vh.a($$0);
            return $$1 == 0 ? ij.a($$1.decode($$0)) : (ij)this.b($$0).b($$1 - 1);
         }

         public void a(vb $$0x, ij<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  vh.a($$0, $$2 + 1);
                  break;
               case b:
                  vh.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }
}
