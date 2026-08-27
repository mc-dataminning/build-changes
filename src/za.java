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

public interface za {
   int a = 65536;
   zc<ByteBuf, Boolean> b = new zc<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   zc<ByteBuf, Byte> c = new zc<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   zc<ByteBuf, Short> d = new zc<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   zc<ByteBuf, Character> e = new zc<ByteBuf, Character>() {
      public Character a(ByteBuf $$0) {
         return $$0.readChar();
      }

      public void a(ByteBuf $$0, Character $$1) {
         $$0.writeChar($$1);
      }
   };
   zc<ByteBuf, Integer> f = new zc<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   zc<ByteBuf, Integer> g = new zc<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wv.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wv.a($$0, $$1);
      }
   };
   zc<ByteBuf, Long> h = new zc<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return ww.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         ww.a($$0, $$1);
      }
   };
   zc<ByteBuf, Float> i = new zc<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   zc<ByteBuf, Double> j = new zc<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   zc<ByteBuf, byte[]> k = new zc<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return we.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         we.a($$0, $$1);
      }
   };
   zc<ByteBuf, String> l = b(32767);
   zc<ByteBuf, vh> m = a((Supplier<ut>)(() -> ut.a(2097152L)));
   zc<ByteBuf, vh> n = a(ut::a);
   zc<ByteBuf, uk> o = b((Supplier<ut>)(() -> ut.a(2097152L)));
   zc<ByteBuf, uk> p = b(ut::a);
   zc<ByteBuf, Optional<uk>> q = new zc<ByteBuf, Optional<uk>>() {
      public Optional<uk> a(ByteBuf $$0) {
         return Optional.ofNullable(we.f($$0));
      }

      public void a(ByteBuf $$0, Optional<uk> $$1) {
         we.a($$0, $$1.orElse(null));
      }
   };
   zc<ByteBuf, Vector3f> r = new zc<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return we.c($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         we.a($$0, $$1);
      }
   };
   zc<ByteBuf, Quaternionf> s = new zc<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return we.d($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         we.a($$0, $$1);
      }
   };
   zc<ByteBuf, PropertyMap> t = new zc<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = za.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = wu.a($$0, 64);
            String $$5 = wu.a($$0, 32767);
            String $$6 = we.a($$0, (zd<? super ByteBuf, String>)($$0x -> wu.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         za.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            wu.a($$0, $$2.name(), 64);
            wu.a($$0, $$2.value(), 32767);
            we.a($$0, $$2.signature(), ($$0x, $$1x) -> wu.a($$0x, $$1x, 1024));
         }
      }
   };
   zc<ByteBuf, GameProfile> u = new zc<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = ju.g.decode($$0);
         String $$2 = wu.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)za.t.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         ju.g.encode($$0, $$1.getId());
         wu.a($$0, $$1.getName(), 16);
         za.t.encode($$0, $$1.getProperties());
      }
   };

   static zc<ByteBuf, byte[]> a(final int $$0) {
      return new zc<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return we.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               we.a($$0, $$1);
            }
         }
      };
   }

   static zc<ByteBuf, String> b(final int $$0) {
      return new zc<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return wu.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            wu.a($$0, $$1, $$0);
         }
      };
   }

   static zc<ByteBuf, vh> a(final Supplier<ut> $$0) {
      return new zc<ByteBuf, vh>() {
         public vh a(ByteBuf $$0x) {
            vh $$1 = we.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, vh $$1) {
            if ($$1 == um.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               we.a($$0, $$1);
            }
         }
      };
   }

   static zc<ByteBuf, uk> b(Supplier<ut> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof uk) {
            return (uk)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> zc<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, ut::a);
   }

   static <T> zc<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> ut.a(2097152L));
   }

   static <T> zc<ByteBuf, T> a(Codec<T> $$0, Supplier<ut> $$1) {
      return a($$1)
         .a(
            $$1x -> ad.a($$0.parse(uy.a, $$1x), $$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> ad.a($$0.encodeStart(uy.a, $$1x), $$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> zc<wp, T> c(Codec<T> $$0) {
      return b($$0, ut::a);
   }

   static <T> zc<wp, T> d(Codec<T> $$0) {
      return b($$0, () -> ut.a(2097152L));
   }

   static <T> zc<wp, T> b(final Codec<T> $$0, Supplier<ut> $$1) {
      final zc<ByteBuf, vh> $$2 = a($$1);
      return new zc<wp, T>() {
         public T a(wp $$0x) {
            vh $$1 = $$2.decode($$0);
            akr<vh> $$2 = $$0.G().a(uy.a);
            return ad.a($$0.parse($$2, $$1), $$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(wp $$0x, T $$1) {
            akr<vh> $$2 = $$0.G().a(uy.a);
            vh $$3 = ad.a($$0.encodeStart($$2, $$1), $$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> zc<B, Optional<V>> a(final zc<B, V> $$0) {
      return new zc<B, Optional<V>>() {
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
      int $$2 = wv.a($$0);
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
         wv.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zc<B, C> a(IntFunction<C> $$0, zc<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zc<B, C> a(final IntFunction<C> $$0, final zc<? super B, V> $$1, final int $$2) {
      return new zc<B, C>() {
         public C a(B $$0x) {
            int $$1 = za.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            za.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zc.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> zc.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> zc.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zc<B, M> a(IntFunction<? extends M> $$0, zc<? super B, K> $$1, zc<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zc<B, M> a(
      final IntFunction<? extends M> $$0, final zc<? super B, K> $$1, final zc<? super B, V> $$2, final int $$3
   ) {
      return new zc<B, M>() {
         public void a(B $$0x, M $$1x) {
            za.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = za.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> zc<B, Either<L, R>> a(final zc<? super B, L> $$0, final zc<? super B, R> $$1) {
      return new zc<B, Either<L, R>>() {
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

   static <T> zc<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new zc<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = wv.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            wv.a($$0, $$2);
         }
      };
   }

   static <T> zc<ByteBuf, T> a(jf<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> zc<wp, R> a(final aks<? extends jn<T>> $$0, final Function<jn<T>, jf<R>> $$1) {
      return new zc<wp, R>() {
         private jf<R> b(wp $$0x) {
            return $$1.apply($$0.G().d($$0));
         }

         public R a(wp $$0x) {
            int $$1 = wv.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(wp $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            wv.a($$0, $$2);
         }
      };
   }

   static <T> zc<wp, T> a(aks<? extends jn<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> zc<wp, ja<T>> b(aks<? extends jn<T>> $$0) {
      return a($$0, jn::t);
   }

   static <T> zc<wp, ja<T>> a(final aks<? extends jn<T>> $$0, final zc<? super wp, T> $$1) {
      return new zc<wp, ja<T>>() {
         private static final int c = 0;

         private jf<ja<T>> b(wp $$0x) {
            return $$0.G().d($$0).t();
         }

         public ja<T> a(wp $$0x) {
            int $$1 = wv.a($$0);
            return $$1 == 0 ? ja.a($$1.decode($$0)) : (ja)this.b($$0).b($$1 - 1);
         }

         public void a(wp $$0x, ja<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  wv.a($$0, $$2 + 1);
                  break;
               case b:
                  wv.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> zc<wp, je<T>> c(final aks<? extends jn<T>> $$0) {
      return new zc<wp, je<T>>() {
         private static final int b = -1;
         private final zc<wp, ja<T>> c = za.b($$0);

         public je<T> a(wp $$0x) {
            int $$1 = wv.a($$0) - 1;
            if ($$1 == -1) {
               jn<T> $$2 = $$0.G().d($$0);
               return $$2.b(awt.a($$0, akt.b.decode($$0))).orElseThrow();
            } else {
               List<ja<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return je.a($$3);
            }
         }

         public void a(wp $$0x, je<T> $$1) {
            Optional<awt<T>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               wv.a($$0, 0);
               akt.b.encode($$0, $$2.get().b());
            } else {
               wv.a($$0, $$1.b() + 1);

               for (ja<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
