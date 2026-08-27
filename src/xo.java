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

public interface xo {
   xq<ByteBuf, Boolean> a = new xq<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   xq<ByteBuf, Byte> b = new xq<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   xq<ByteBuf, Short> c = new xq<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   xq<ByteBuf, Integer> d = new xq<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return vj.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         vj.a($$0, $$1);
      }
   };
   xq<ByteBuf, Long> e = new xq<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return vk.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         vk.a($$0, $$1);
      }
   };
   xq<ByteBuf, Float> f = new xq<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   xq<ByteBuf, Double> g = new xq<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   xq<ByteBuf, byte[]> h = new xq<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return us.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         us.a($$0, $$1);
      }
   };
   xq<ByteBuf, String> i = b(32767);
   xq<ByteBuf, tv> j = a(th::a);
   xq<ByteBuf, sy> k = a(th::a).a($$0 -> {
      if ($$0 instanceof sy) {
         return (sy)$$0;
      } else {
         throw new DecoderException("Not a compound tag: " + $$0);
      }
   }, $$0 -> (tv)$$0);
   xq<ByteBuf, Optional<sy>> l = new xq<ByteBuf, Optional<sy>>() {
      public Optional<sy> a(ByteBuf $$0) {
         return Optional.ofNullable(us.f($$0));
      }

      public void a(ByteBuf $$0, Optional<sy> $$1) {
         us.a($$0, $$1.orElse(null));
      }
   };
   xq<ByteBuf, Vector3f> m = new xq<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return us.c($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         us.a($$0, $$1);
      }
   };
   xq<ByteBuf, Quaternionf> n = new xq<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return us.d($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         us.a($$0, $$1);
      }
   };

   static xq<ByteBuf, byte[]> a(final int $$0) {
      return new xq<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return us.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               us.a($$0, $$1);
            }
         }
      };
   }

   static xq<ByteBuf, String> b(final int $$0) {
      return new xq<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return vi.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            vi.a($$0, $$1, $$0);
         }
      };
   }

   static xq<ByteBuf, tv> a(final Supplier<th> $$0) {
      return new xq<ByteBuf, tv>() {
         public tv a(ByteBuf $$0x) {
            tv $$1 = us.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, tv $$1) {
            if ($$1 == ta.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               us.a($$0, $$1);
            }
         }
      };
   }

   static <T> xq<ByteBuf, T> a(Codec<T> $$0) {
      return j.a(
         $$1 -> ac.a($$0.parse(tm.a, $$1), $$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1)),
         $$1 -> ac.a($$0.encodeStart(tm.a, $$1), $$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1))
      );
   }

   static <T> xq<vd, T> b(final Codec<T> $$0) {
      return new xq<vd, T>() {
         public T a(vd $$0x) {
            tv $$1 = xo.j.decode($$0);
            aja<tv> $$2 = aja.a(tm.a, $$0.J());
            return ac.a($$0.parse($$2, $$1), $$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(vd $$0x, T $$1) {
            aja<tv> $$2 = aja.a(tm.a, $$0.J());
            tv $$3 = ac.a($$0.encodeStart($$2, $$1), $$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            xo.j.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> xq<B, Optional<V>> a(final xq<B, V> $$0) {
      return new xq<B, Optional<V>>() {
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

   static <B extends ByteBuf, V, C extends Collection<V>> xq<B, C> a(final IntFunction<C> $$0, final xq<? super B, V> $$1) {
      return new xq<B, C>() {
         public C a(B $$0x) {
            int $$1 = vj.a($$0);
            C $$2 = $$0.apply($$1);

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            vj.a($$0, $$1.size());

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> xq.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> xq.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> xq<B, M> a(final IntFunction<? extends M> $$0, final xq<? super B, K> $$1, final xq<? super B, V> $$2) {
      return new xq<B, M>() {
         public void a(B $$0x, M $$1x) {
            vj.a($$0, $$1.size());
            $$1.forEach(($$3, $$4) -> {
               $$1.encode($$0, (K)$$3);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = vj.a($$0);
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

   static <T> xq<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new xq<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = vj.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            vj.a($$0, $$2);
         }
      };
   }

   static <T> xq<ByteBuf, T> a(iq<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> xq<vd, R> a(final ajb<? extends ix<T>> $$0, final Function<ix<T>, iq<R>> $$1) {
      return new xq<vd, R>() {
         private iq<R> b(vd $$0x) {
            return $$1.apply($$0.J().d($$0));
         }

         public R a(vd $$0x) {
            int $$1 = vj.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(vd $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            vj.a($$0, $$2);
         }
      };
   }

   static <T> xq<vd, T> a(ajb<? extends ix<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> xq<vd, il<T>> b(ajb<? extends ix<T>> $$0) {
      return a($$0, ix::t);
   }

   static <T> xq<vd, il<T>> a(final ajb<? extends ix<T>> $$0, final xq<? super vd, T> $$1) {
      return new xq<vd, il<T>>() {
         private static final int c = 0;

         private iq<il<T>> b(vd $$0x) {
            return $$0.J().d($$0).t();
         }

         public il<T> a(vd $$0x) {
            int $$1 = vj.a($$0);
            return $$1 == 0 ? il.a($$1.decode($$0)) : (il)this.b($$0).b($$1 - 1);
         }

         public void a(vd $$0x, il<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  vj.a($$0, $$2 + 1);
                  break;
               case b:
                  vj.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }
}
