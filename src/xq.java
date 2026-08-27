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

public interface xq {
   xs<ByteBuf, Boolean> a = new xs<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   xs<ByteBuf, Byte> b = new xs<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   xs<ByteBuf, Short> c = new xs<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   xs<ByteBuf, Integer> d = new xs<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return vl.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         vl.a($$0, $$1);
      }
   };
   xs<ByteBuf, Long> e = new xs<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return vm.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         vm.a($$0, $$1);
      }
   };
   xs<ByteBuf, Float> f = new xs<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   xs<ByteBuf, Double> g = new xs<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   xs<ByteBuf, byte[]> h = new xs<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return uu.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         uu.a($$0, $$1);
      }
   };
   xs<ByteBuf, String> i = b(32767);
   xs<ByteBuf, tx> j = a(tj::a);
   xs<ByteBuf, ta> k = a(tj::a).a($$0 -> {
      if ($$0 instanceof ta) {
         return (ta)$$0;
      } else {
         throw new DecoderException("Not a compound tag: " + $$0);
      }
   }, $$0 -> (tx)$$0);
   xs<ByteBuf, Optional<ta>> l = new xs<ByteBuf, Optional<ta>>() {
      public Optional<ta> a(ByteBuf $$0) {
         return Optional.ofNullable(uu.f($$0));
      }

      public void a(ByteBuf $$0, Optional<ta> $$1) {
         uu.a($$0, $$1.orElse(null));
      }
   };
   xs<ByteBuf, Vector3f> m = new xs<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return uu.c($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         uu.a($$0, $$1);
      }
   };
   xs<ByteBuf, Quaternionf> n = new xs<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return uu.d($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         uu.a($$0, $$1);
      }
   };

   static xs<ByteBuf, byte[]> a(final int $$0) {
      return new xs<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return uu.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               uu.a($$0, $$1);
            }
         }
      };
   }

   static xs<ByteBuf, String> b(final int $$0) {
      return new xs<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return vk.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            vk.a($$0, $$1, $$0);
         }
      };
   }

   static xs<ByteBuf, tx> a(final Supplier<tj> $$0) {
      return new xs<ByteBuf, tx>() {
         public tx a(ByteBuf $$0x) {
            tx $$1 = uu.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, tx $$1) {
            if ($$1 == tc.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               uu.a($$0, $$1);
            }
         }
      };
   }

   static <T> xs<ByteBuf, T> a(Codec<T> $$0) {
      return j.a(
         $$1 -> ac.a($$0.parse(to.a, $$1), $$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1)),
         $$1 -> ac.a($$0.encodeStart(to.a, $$1), $$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1))
      );
   }

   static <T> xs<vf, T> b(final Codec<T> $$0) {
      return new xs<vf, T>() {
         public T a(vf $$0x) {
            tx $$1 = xq.j.decode($$0);
            ajf<tx> $$2 = $$0.J().a(to.a);
            return ac.a($$0.parse($$2, $$1), $$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(vf $$0x, T $$1) {
            ajf<tx> $$2 = $$0.J().a(to.a);
            tx $$3 = ac.a($$0.encodeStart($$2, $$1), $$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            xq.j.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> xs<B, Optional<V>> a(final xs<B, V> $$0) {
      return new xs<B, Optional<V>>() {
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

   static <B extends ByteBuf, V, C extends Collection<V>> xs<B, C> a(final IntFunction<C> $$0, final xs<? super B, V> $$1) {
      return new xs<B, C>() {
         public C a(B $$0x) {
            int $$1 = vl.a($$0);
            C $$2 = $$0.apply($$1);

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            vl.a($$0, $$1.size());

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> xs.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> xs.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> xs<B, M> a(final IntFunction<? extends M> $$0, final xs<? super B, K> $$1, final xs<? super B, V> $$2) {
      return new xs<B, M>() {
         public void a(B $$0x, M $$1x) {
            vl.a($$0, $$1.size());
            $$1.forEach(($$3, $$4) -> {
               $$1.encode($$0, (K)$$3);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = vl.a($$0);
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

   static <T> xs<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new xs<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = vl.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            vl.a($$0, $$2);
         }
      };
   }

   static <T> xs<ByteBuf, T> a(iq<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> xs<vf, R> a(final ajg<? extends iy<T>> $$0, final Function<iy<T>, iq<R>> $$1) {
      return new xs<vf, R>() {
         private iq<R> b(vf $$0x) {
            return $$1.apply($$0.J().d($$0));
         }

         public R a(vf $$0x) {
            int $$1 = vl.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(vf $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            vl.a($$0, $$2);
         }
      };
   }

   static <T> xs<vf, T> a(ajg<? extends iy<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> xs<vf, il<T>> b(ajg<? extends iy<T>> $$0) {
      return a($$0, iy::t);
   }

   static <T> xs<vf, il<T>> a(final ajg<? extends iy<T>> $$0, final xs<? super vf, T> $$1) {
      return new xs<vf, il<T>>() {
         private static final int c = 0;

         private iq<il<T>> b(vf $$0x) {
            return $$0.J().d($$0).t();
         }

         public il<T> a(vf $$0x) {
            int $$1 = vl.a($$0);
            return $$1 == 0 ? il.a($$1.decode($$0)) : (il)this.b($$0).b($$1 - 1);
         }

         public void a(vf $$0x, il<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  vl.a($$0, $$2 + 1);
                  break;
               case b:
                  vl.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }
}
