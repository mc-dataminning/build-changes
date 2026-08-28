import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public interface zk {
   int a = 65536;
   zm<ByteBuf, Boolean> b = new zm<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   zm<ByteBuf, Byte> c = new zm<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   zm<ByteBuf, Short> d = new zm<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   zm<ByteBuf, Integer> e = new zm<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readUnsignedShort();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeShort($$1);
      }
   };
   zm<ByteBuf, Integer> f = new zm<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   zm<ByteBuf, Integer> g = new zm<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return xf.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         xf.a($$0, $$1);
      }
   };
   zm<ByteBuf, Long> h = new zm<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return xg.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         xg.a($$0, $$1);
      }
   };
   zm<ByteBuf, Float> i = new zm<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   zm<ByteBuf, Double> j = new zm<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   zm<ByteBuf, byte[]> k = new zm<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return wl.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         wl.a($$0, $$1);
      }
   };
   zm<ByteBuf, String> l = b(32767);
   zm<ByteBuf, vo> m = a((Supplier<va>)(() -> va.a(2097152L)));
   zm<ByteBuf, vo> n = a(va::a);
   zm<ByteBuf, ur> o = b((Supplier<va>)(() -> va.a(2097152L)));
   zm<ByteBuf, ur> p = b(va::a);
   zm<ByteBuf, Optional<ur>> q = new zm<ByteBuf, Optional<ur>>() {
      public Optional<ur> a(ByteBuf $$0) {
         return Optional.ofNullable(wl.f($$0));
      }

      public void a(ByteBuf $$0, Optional<ur> $$1) {
         wl.a($$0, $$1.orElse(null));
      }
   };
   zm<ByteBuf, Vector3f> r = new zm<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return wl.c($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         wl.a($$0, $$1);
      }
   };
   zm<ByteBuf, Quaternionf> s = new zm<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return wl.d($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         wl.a($$0, $$1);
      }
   };
   zm<ByteBuf, PropertyMap> t = new zm<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = zk.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = xe.a($$0, 64);
            String $$5 = xe.a($$0, 32767);
            String $$6 = wl.a($$0, (zn<? super ByteBuf, String>)($$0x -> xe.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         zk.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            xe.a($$0, $$2.name(), 64);
            xe.a($$0, $$2.value(), 32767);
            wl.a($$0, $$2.signature(), ($$0x, $$1x) -> xe.a($$0x, $$1x, 1024));
         }
      }
   };
   zm<ByteBuf, GameProfile> u = new zm<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = kc.g.decode($$0);
         String $$2 = xe.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)zk.t.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         kc.g.encode($$0, $$1.getId());
         xe.a($$0, $$1.getName(), 16);
         zk.t.encode($$0, $$1.getProperties());
      }
   };

   static zm<ByteBuf, byte[]> a(final int $$0) {
      return new zm<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return wl.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               wl.a($$0, $$1);
            }
         }
      };
   }

   static zm<ByteBuf, String> b(final int $$0) {
      return new zm<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return xe.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            xe.a($$0, $$1, $$0);
         }
      };
   }

   static zm<ByteBuf, vo> a(final Supplier<va> $$0) {
      return new zm<ByteBuf, vo>() {
         public vo a(ByteBuf $$0x) {
            vo $$1 = wl.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, vo $$1) {
            if ($$1 == ut.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               wl.a($$0, $$1);
            }
         }
      };
   }

   static zm<ByteBuf, ur> b(Supplier<va> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof ur) {
            return (ur)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> zm<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, va::a);
   }

   static <T> zm<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> va.a(2097152L));
   }

   static <T> zm<ByteBuf, T> a(Codec<T> $$0, Supplier<va> $$1) {
      return a($$1)
         .a(
            $$1x -> (T)$$0.parse(vf.a, $$1x).getOrThrow($$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> (vo)$$0.encodeStart(vf.a, $$1x).getOrThrow($$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> zm<wz, T> c(Codec<T> $$0) {
      return b($$0, va::a);
   }

   static <T> zm<wz, T> d(Codec<T> $$0) {
      return b($$0, () -> va.a(2097152L));
   }

   static <T> zm<wz, T> b(final Codec<T> $$0, Supplier<va> $$1) {
      final zm<ByteBuf, vo> $$2 = a($$1);
      return new zm<wz, T>() {
         public T a(wz $$0x) {
            vo $$1 = $$2.decode($$0);
            alc<vo> $$2 = $$0.G().a(vf.a);
            return (T)$$0.parse($$2, $$1).getOrThrow($$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(wz $$0x, T $$1) {
            alc<vo> $$2 = $$0.G().a(vf.a);
            vo $$3 = (vo)$$0.encodeStart($$2, $$1).getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> zm<B, Optional<V>> a(final zm<B, V> $$0) {
      return new zm<B, Optional<V>>() {
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

   static int a(ByteBuf $$0, int $$1) {
      int $$2 = xf.a($$0);
      if ($$2 > $$1) {
         throw new DecoderException($$2 + " elements exceeded max size of: " + $$1);
      } else {
         return $$2;
      }
   }

   static void a(ByteBuf $$0, int $$1, int $$2) {
      if ($$1 > $$2) {
         throw new EncoderException($$1 + " elements exceeded max size of: " + $$2);
      } else {
         xf.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zm<B, C> a(IntFunction<C> $$0, zm<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zm<B, C> a(final IntFunction<C> $$0, final zm<? super B, V> $$1, final int $$2) {
      return new zm<B, C>() {
         public C a(B $$0x) {
            int $$1 = zk.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            zk.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zm.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> zm.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> zm.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zm<B, M> a(IntFunction<? extends M> $$0, zm<? super B, K> $$1, zm<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zm<B, M> a(
      final IntFunction<? extends M> $$0, final zm<? super B, K> $$1, final zm<? super B, V> $$2, final int $$3
   ) {
      return new zm<B, M>() {
         public void a(B $$0x, M $$1x) {
            zk.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = zk.a($$0, $$3);
            M $$2 = (M)$$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               K $$4 = $$1.decode($$0);
               V $$5 = $$2.decode($$0);
               $$2.put($$4, $$5);
            }

            return $$2;
         }
      };
   }

   static <B extends ByteBuf, L, R> zm<B, Either<L, R>> a(final zm<? super B, L> $$0, final zm<? super B, R> $$1) {
      return new zm<B, Either<L, R>>() {
         public Either<L, R> a(B $$0x) {
            return $$0.readBoolean() ? Either.left($$0.decode($$0)) : Either.right($$1.decode($$0));
         }

         public void a(B $$0x, Either<L, R> $$1x) {
            $$1.ifLeft($$2 -> {
               $$0.writeBoolean(true);
               $$0.encode($$0, (L)$$2);
            }).ifRight($$2 -> {
               $$0.writeBoolean(false);
               $$1.encode($$0, (R)$$2);
            });
         }
      };
   }

   static <T> zm<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new zm<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = xf.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            xf.a($$0, $$2);
         }
      };
   }

   static <T> zm<ByteBuf, T> a(jn<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> zm<wz, R> a(final ald<? extends jv<T>> $$0, final Function<jv<T>, jn<R>> $$1) {
      return new zm<wz, R>() {
         private jn<R> b(wz $$0x) {
            return $$1.apply($$0.G().d($$0));
         }

         public R a(wz $$0x) {
            int $$1 = xf.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(wz $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            xf.a($$0, $$2);
         }
      };
   }

   static <T> zm<wz, T> a(ald<? extends jv<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> zm<wz, ji<T>> b(ald<? extends jv<T>> $$0) {
      return a($$0, jv::t);
   }

   static <T> zm<wz, ji<T>> a(final ald<? extends jv<T>> $$0, final zm<? super wz, T> $$1) {
      return new zm<wz, ji<T>>() {
         private static final int c = 0;

         private jn<ji<T>> b(wz $$0x) {
            return $$0.G().d($$0).t();
         }

         public ji<T> a(wz $$0x) {
            int $$1 = xf.a($$0);
            return $$1 == 0 ? ji.a($$1.decode($$0)) : (ji)this.b($$0).b($$1 - 1);
         }

         public void a(wz $$0x, ji<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  xf.a($$0, $$2 + 1);
                  break;
               case b:
                  xf.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> zm<wz, jm<T>> c(final ald<? extends jv<T>> $$0) {
      return new zm<wz, jm<T>>() {
         private static final int b = -1;
         private final zm<wz, ji<T>> c = zk.b($$0);

         public jm<T> a(wz $$0x) {
            int $$1 = xf.a($$0) - 1;
            if ($$1 == -1) {
               jv<T> $$2 = $$0.G().d($$0);
               return $$2.b(axe.a($$0, ale.b.decode($$0))).orElseThrow();
            } else {
               List<ji<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return jm.a($$3);
            }
         }

         public void a(wz $$0x, jm<T> $$1) {
            Optional<axe<T>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               xf.a($$0, 0);
               ale.b.encode($$0, $$2.get().b());
            } else {
               xf.a($$0, $$1.b() + 1);

               for (ji<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
