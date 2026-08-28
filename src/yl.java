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
import java.util.OptionalInt;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public interface yl {
   int a = 65536;
   yn<ByteBuf, Boolean> b = new yn<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   yn<ByteBuf, Byte> c = new yn<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   yn<ByteBuf, Float> d = c.a(ayz::a, ayz::g);
   yn<ByteBuf, Short> e = new yn<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   yn<ByteBuf, Integer> f = new yn<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readUnsignedShort();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeShort($$1);
      }
   };
   yn<ByteBuf, Integer> g = new yn<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   yn<ByteBuf, Integer> h = new yn<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wg.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wg.a($$0, $$1);
      }
   };
   yn<ByteBuf, OptionalInt> i = h.a($$0 -> $$0 == 0 ? OptionalInt.empty() : OptionalInt.of($$0 - 1), $$0 -> $$0.isPresent() ? $$0.getAsInt() + 1 : 0);
   yn<ByteBuf, Long> j = new yn<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return $$0.readLong();
      }

      public void a(ByteBuf $$0, Long $$1) {
         $$0.writeLong($$1);
      }
   };
   yn<ByteBuf, Long> k = new yn<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return wh.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         wh.a($$0, $$1);
      }
   };
   yn<ByteBuf, Float> l = new yn<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   yn<ByteBuf, Double> m = new yn<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   yn<ByteBuf, byte[]> n = new yn<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return vl.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         vl.a($$0, $$1);
      }
   };
   yn<ByteBuf, String> o = b(32767);
   yn<ByteBuf, un> p = a((Supplier<tz>)(() -> tz.a(2097152L)));
   yn<ByteBuf, un> q = a(tz::a);
   yn<ByteBuf, tq> r = b((Supplier<tz>)(() -> tz.a(2097152L)));
   yn<ByteBuf, tq> s = b(tz::a);
   yn<ByteBuf, Optional<tq>> t = new yn<ByteBuf, Optional<tq>>() {
      public Optional<tq> a(ByteBuf $$0) {
         return Optional.ofNullable(vl.h($$0));
      }

      public void a(ByteBuf $$0, Optional<tq> $$1) {
         vl.a($$0, $$1.orElse(null));
      }
   };
   yn<ByteBuf, Vector3f> u = new yn<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return vl.d($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         vl.a($$0, $$1);
      }
   };
   yn<ByteBuf, Quaternionf> v = new yn<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return vl.e($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         vl.a($$0, $$1);
      }
   };
   yn<ByteBuf, Integer> w = new yn<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return vl.i($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         vl.b($$0, $$1);
      }
   };
   yn<ByteBuf, PropertyMap> x = new yn<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = yl.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = wf.a($$0, 64);
            String $$5 = wf.a($$0, 32767);
            String $$6 = vl.a($$0, (yo<? super ByteBuf, String>)($$0x -> wf.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         yl.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            wf.a($$0, $$2.name(), 64);
            wf.a($$0, $$2.value(), 32767);
            vl.a($$0, $$2.signature(), ($$0x, $$1x) -> wf.a($$0x, $$1x, 1024));
         }
      }
   };
   yn<ByteBuf, GameProfile> y = new yn<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = kl.g.decode($$0);
         String $$2 = wf.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)yl.x.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         kl.g.encode($$0, $$1.getId());
         wf.a($$0, $$1.getName(), 16);
         yl.x.encode($$0, $$1.getProperties());
      }
   };

   static yn<ByteBuf, byte[]> a(final int $$0) {
      return new yn<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return vl.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               vl.a($$0, $$1);
            }
         }
      };
   }

   static yn<ByteBuf, String> b(final int $$0) {
      return new yn<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return wf.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            wf.a($$0, $$1, $$0);
         }
      };
   }

   static yn<ByteBuf, un> a(final Supplier<tz> $$0) {
      return new yn<ByteBuf, un>() {
         public un a(ByteBuf $$0x) {
            un $$1 = vl.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, un $$1) {
            if ($$1 == ts.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               vl.a($$0, $$1);
            }
         }
      };
   }

   static yn<ByteBuf, tq> b(Supplier<tz> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof tq) {
            return (tq)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> yn<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, tz::a);
   }

   static <T> yn<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> tz.a(2097152L));
   }

   static <T> yn<ByteBuf, T> a(Codec<T> $$0, Supplier<tz> $$1) {
      return a($$1)
         .a(
            $$1x -> (T)$$0.parse(ue.a, $$1x).getOrThrow($$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> (un)$$0.encodeStart(ue.a, $$1x).getOrThrow($$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> yn<wa, T> c(Codec<T> $$0) {
      return b($$0, tz::a);
   }

   static <T> yn<wa, T> d(Codec<T> $$0) {
      return b($$0, () -> tz.a(2097152L));
   }

   static <T> yn<wa, T> b(final Codec<T> $$0, Supplier<tz> $$1) {
      final yn<ByteBuf, un> $$2 = a($$1);
      return new yn<wa, T>() {
         public T a(wa $$0x) {
            un $$1 = $$2.decode($$0);
            akt<un> $$2 = $$0.H().a(ue.a);
            return (T)$$0.parse($$2, $$1).getOrThrow($$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(wa $$0x, T $$1) {
            akt<un> $$2 = $$0.H().a(ue.a);
            un $$3 = (un)$$0.encodeStart($$2, $$1).getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> yn<B, Optional<V>> a(final yn<B, V> $$0) {
      return new yn<B, Optional<V>>() {
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
      int $$2 = wg.a($$0);
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
         wg.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yn<B, C> a(IntFunction<C> $$0, yn<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yn<B, C> a(final IntFunction<C> $$0, final yn<? super B, V> $$1, final int $$2) {
      return new yn<B, C>() {
         public C a(B $$0x) {
            int $$1 = yl.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            yl.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yn.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> yn.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> yn.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> yn<B, M> a(IntFunction<? extends M> $$0, yn<? super B, K> $$1, yn<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> yn<B, M> a(
      final IntFunction<? extends M> $$0, final yn<? super B, K> $$1, final yn<? super B, V> $$2, final int $$3
   ) {
      return new yn<B, M>() {
         public void a(B $$0x, M $$1x) {
            yl.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = yl.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> yn<B, Either<L, R>> a(final yn<? super B, L> $$0, final yn<? super B, R> $$1) {
      return new yn<B, Either<L, R>>() {
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

   static <T> yn<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new yn<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = wg.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            wg.a($$0, $$2);
         }
      };
   }

   static <T> yn<ByteBuf, T> a(jw<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> yn<wa, R> a(final aku<? extends ke<T>> $$0, final Function<ke<T>, jw<R>> $$1) {
      return new yn<wa, R>() {
         private jw<R> b(wa $$0x) {
            return $$1.apply($$0.H().e($$0));
         }

         public R a(wa $$0x) {
            int $$1 = wg.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(wa $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            wg.a($$0, $$2);
         }
      };
   }

   static <T> yn<wa, T> a(aku<? extends ke<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> yn<wa, jr<T>> b(aku<? extends ke<T>> $$0) {
      return a($$0, ke::t);
   }

   static <T> yn<wa, jr<T>> a(final aku<? extends ke<T>> $$0, final yn<? super wa, T> $$1) {
      return new yn<wa, jr<T>>() {
         private static final int c = 0;

         private jw<jr<T>> b(wa $$0x) {
            return $$0.H().e($$0).t();
         }

         public jr<T> a(wa $$0x) {
            int $$1 = wg.a($$0);
            return $$1 == 0 ? jr.a($$1.decode($$0)) : (jr)this.b($$0).b($$1 - 1);
         }

         public void a(wa $$0x, jr<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  wg.a($$0, $$2 + 1);
                  break;
               case b:
                  wg.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> yn<wa, jv<T>> c(final aku<? extends ke<T>> $$0) {
      return new yn<wa, jv<T>>() {
         private static final int b = -1;
         private final yn<wa, jr<T>> c = yl.b($$0);

         public jv<T> a(wa $$0x) {
            int $$1 = wg.a($$0) - 1;
            if ($$1 == -1) {
               ke<T> $$2 = $$0.H().e($$0);
               return $$2.a(axf.a($$0, akv.b.decode($$0))).orElseThrow();
            } else {
               List<jr<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return jv.a($$3);
            }
         }

         public void a(wa $$0x, jv<T> $$1) {
            Optional<axf<T>> $$2 = $$1.e();
            if ($$2.isPresent()) {
               wg.a($$0, 0);
               akv.b.encode($$0, $$2.get().b());
            } else {
               wg.a($$0, $$1.b() + 1);

               for (jr<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
