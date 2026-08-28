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

public interface yr {
   int a = 65536;
   yt<ByteBuf, Boolean> b = new yt<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   yt<ByteBuf, Byte> c = new yt<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   yt<ByteBuf, Float> d = c.a(azk::a, azk::g);
   yt<ByteBuf, Short> e = new yt<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   yt<ByteBuf, Integer> f = new yt<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readUnsignedShort();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeShort($$1);
      }
   };
   yt<ByteBuf, Integer> g = new yt<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   yt<ByteBuf, Integer> h = new yt<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wm.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wm.a($$0, $$1);
      }
   };
   yt<ByteBuf, OptionalInt> i = h.a($$0 -> $$0 == 0 ? OptionalInt.empty() : OptionalInt.of($$0 - 1), $$0 -> $$0.isPresent() ? $$0.getAsInt() + 1 : 0);
   yt<ByteBuf, Long> j = new yt<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return $$0.readLong();
      }

      public void a(ByteBuf $$0, Long $$1) {
         $$0.writeLong($$1);
      }
   };
   yt<ByteBuf, Long> k = new yt<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return wn.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         wn.a($$0, $$1);
      }
   };
   yt<ByteBuf, Float> l = new yt<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   yt<ByteBuf, Double> m = new yt<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   yt<ByteBuf, byte[]> n = new yt<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return vr.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         vr.a($$0, $$1);
      }
   };
   yt<ByteBuf, String> o = b(32767);
   yt<ByteBuf, ut> p = a((Supplier<uf>)(() -> uf.a(2097152L)));
   yt<ByteBuf, ut> q = a(uf::a);
   yt<ByteBuf, tw> r = b((Supplier<uf>)(() -> uf.a(2097152L)));
   yt<ByteBuf, tw> s = b(uf::a);
   yt<ByteBuf, Optional<tw>> t = new yt<ByteBuf, Optional<tw>>() {
      public Optional<tw> a(ByteBuf $$0) {
         return Optional.ofNullable(vr.h($$0));
      }

      public void a(ByteBuf $$0, Optional<tw> $$1) {
         vr.a($$0, $$1.orElse(null));
      }
   };
   yt<ByteBuf, Vector3f> u = new yt<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return vr.d($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         vr.a($$0, $$1);
      }
   };
   yt<ByteBuf, Quaternionf> v = new yt<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return vr.e($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         vr.a($$0, $$1);
      }
   };
   yt<ByteBuf, Integer> w = new yt<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return vr.i($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         vr.b($$0, $$1);
      }
   };
   yt<ByteBuf, PropertyMap> x = new yt<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = yr.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = wl.a($$0, 64);
            String $$5 = wl.a($$0, 32767);
            String $$6 = vr.a($$0, (yu<? super ByteBuf, String>)($$0x -> wl.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         yr.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            wl.a($$0, $$2.name(), 64);
            wl.a($$0, $$2.value(), 32767);
            vr.a($$0, $$2.signature(), ($$0x, $$1x) -> wl.a($$0x, $$1x, 1024));
         }
      }
   };
   yt<ByteBuf, GameProfile> y = new yt<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = km.g.decode($$0);
         String $$2 = wl.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)yr.x.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         km.g.encode($$0, $$1.getId());
         wl.a($$0, $$1.getName(), 16);
         yr.x.encode($$0, $$1.getProperties());
      }
   };

   static yt<ByteBuf, byte[]> a(final int $$0) {
      return new yt<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return vr.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               vr.a($$0, $$1);
            }
         }
      };
   }

   static yt<ByteBuf, String> b(final int $$0) {
      return new yt<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return wl.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            wl.a($$0, $$1, $$0);
         }
      };
   }

   static yt<ByteBuf, ut> a(final Supplier<uf> $$0) {
      return new yt<ByteBuf, ut>() {
         public ut a(ByteBuf $$0x) {
            ut $$1 = vr.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, ut $$1) {
            if ($$1 == ty.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               vr.a($$0, $$1);
            }
         }
      };
   }

   static yt<ByteBuf, tw> b(Supplier<uf> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof tw) {
            return (tw)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> yt<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, uf::a);
   }

   static <T> yt<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> uf.a(2097152L));
   }

   static <T> yt<ByteBuf, T> a(Codec<T> $$0, Supplier<uf> $$1) {
      return a($$1)
         .a(
            $$1x -> (T)$$0.parse(uk.a, $$1x).getOrThrow($$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> (ut)$$0.encodeStart(uk.a, $$1x).getOrThrow($$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> yt<wg, T> c(Codec<T> $$0) {
      return b($$0, uf::a);
   }

   static <T> yt<wg, T> d(Codec<T> $$0) {
      return b($$0, () -> uf.a(2097152L));
   }

   static <T> yt<wg, T> b(final Codec<T> $$0, Supplier<uf> $$1) {
      final yt<ByteBuf, ut> $$2 = a($$1);
      return new yt<wg, T>() {
         public T a(wg $$0x) {
            ut $$1 = $$2.decode($$0);
            alb<ut> $$2 = $$0.H().a(uk.a);
            return (T)$$0.parse($$2, $$1).getOrThrow($$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(wg $$0x, T $$1) {
            alb<ut> $$2 = $$0.H().a(uk.a);
            ut $$3 = (ut)$$0.encodeStart($$2, $$1).getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> yt<B, Optional<V>> a(final yt<B, V> $$0) {
      return new yt<B, Optional<V>>() {
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
      int $$2 = wm.a($$0);
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
         wm.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yt<B, C> a(IntFunction<C> $$0, yt<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yt<B, C> a(final IntFunction<C> $$0, final yt<? super B, V> $$1, final int $$2) {
      return new yt<B, C>() {
         public C a(B $$0x) {
            int $$1 = yr.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            yr.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yt.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> yt.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> yt.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> yt<B, M> a(IntFunction<? extends M> $$0, yt<? super B, K> $$1, yt<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> yt<B, M> a(
      final IntFunction<? extends M> $$0, final yt<? super B, K> $$1, final yt<? super B, V> $$2, final int $$3
   ) {
      return new yt<B, M>() {
         public void a(B $$0x, M $$1x) {
            yr.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = yr.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> yt<B, Either<L, R>> a(final yt<? super B, L> $$0, final yt<? super B, R> $$1) {
      return new yt<B, Either<L, R>>() {
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

   static <T> yt<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new yt<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = wm.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            wm.a($$0, $$2);
         }
      };
   }

   static <T> yt<ByteBuf, T> a(jx<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> yt<wg, R> a(final alc<? extends kf<T>> $$0, final Function<kf<T>, jx<R>> $$1) {
      return new yt<wg, R>() {
         private jx<R> b(wg $$0x) {
            return $$1.apply($$0.H().f($$0));
         }

         public R a(wg $$0x) {
            int $$1 = wm.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(wg $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            wm.a($$0, $$2);
         }
      };
   }

   static <T> yt<wg, T> a(alc<? extends kf<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> yt<wg, js<T>> b(alc<? extends kf<T>> $$0) {
      return a($$0, kf::t);
   }

   static <T> yt<wg, js<T>> a(final alc<? extends kf<T>> $$0, final yt<? super wg, T> $$1) {
      return new yt<wg, js<T>>() {
         private static final int c = 0;

         private jx<js<T>> b(wg $$0x) {
            return $$0.H().f($$0).t();
         }

         public js<T> a(wg $$0x) {
            int $$1 = wm.a($$0);
            return $$1 == 0 ? js.a($$1.decode($$0)) : (js)this.b($$0).b($$1 - 1);
         }

         public void a(wg $$0x, js<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  wm.a($$0, $$2 + 1);
                  break;
               case b:
                  wm.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> yt<wg, jw<T>> c(final alc<? extends kf<T>> $$0) {
      return new yt<wg, jw<T>>() {
         private static final int b = -1;
         private final yt<wg, js<T>> c = yr.b($$0);

         public jw<T> a(wg $$0x) {
            int $$1 = wm.a($$0) - 1;
            if ($$1 == -1) {
               kf<T> $$2 = $$0.H().f($$0);
               return $$2.a(axp.a($$0, ald.b.decode($$0))).orElseThrow();
            } else {
               List<js<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return jw.a($$3);
            }
         }

         public void a(wg $$0x, jw<T> $$1) {
            Optional<axp<T>> $$2 = $$1.e();
            if ($$2.isPresent()) {
               wm.a($$0, 0);
               ald.b.encode($$0, $$2.get().b());
            } else {
               wm.a($$0, $$1.b() + 1);

               for (js<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
