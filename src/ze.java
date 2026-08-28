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

public interface ze {
   int a = 65536;
   zg<ByteBuf, Boolean> b = new zg<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   zg<ByteBuf, Byte> c = new zg<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   zg<ByteBuf, Float> d = c.a(azk::a, azk::g);
   zg<ByteBuf, Short> e = new zg<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   zg<ByteBuf, Integer> f = new zg<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readUnsignedShort();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeShort($$1);
      }
   };
   zg<ByteBuf, Integer> g = new zg<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   zg<ByteBuf, Integer> h = new zg<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wz.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wz.a($$0, $$1);
      }
   };
   zg<ByteBuf, Long> i = new zg<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return xa.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         xa.a($$0, $$1);
      }
   };
   zg<ByteBuf, Float> j = new zg<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   zg<ByteBuf, Double> k = new zg<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   zg<ByteBuf, byte[]> l = new zg<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return wf.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         wf.a($$0, $$1);
      }
   };
   zg<ByteBuf, String> m = b(32767);
   zg<ByteBuf, vh> n = a((Supplier<ut>)(() -> ut.a(2097152L)));
   zg<ByteBuf, vh> o = a(ut::a);
   zg<ByteBuf, uk> p = b((Supplier<ut>)(() -> ut.a(2097152L)));
   zg<ByteBuf, uk> q = b(ut::a);
   zg<ByteBuf, Optional<uk>> r = new zg<ByteBuf, Optional<uk>>() {
      public Optional<uk> a(ByteBuf $$0) {
         return Optional.ofNullable(wf.h($$0));
      }

      public void a(ByteBuf $$0, Optional<uk> $$1) {
         wf.a($$0, $$1.orElse(null));
      }
   };
   zg<ByteBuf, Vector3f> s = new zg<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return wf.d($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         wf.a($$0, $$1);
      }
   };
   zg<ByteBuf, Quaternionf> t = new zg<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return wf.e($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         wf.a($$0, $$1);
      }
   };
   zg<ByteBuf, Integer> u = new zg<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wf.i($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wf.b($$0, $$1);
      }
   };
   zg<ByteBuf, PropertyMap> v = new zg<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = ze.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = wy.a($$0, 64);
            String $$5 = wy.a($$0, 32767);
            String $$6 = wf.a($$0, (zh<? super ByteBuf, String>)($$0x -> wy.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         ze.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            wy.a($$0, $$2.name(), 64);
            wy.a($$0, $$2.value(), 32767);
            wf.a($$0, $$2.signature(), ($$0x, $$1x) -> wy.a($$0x, $$1x, 1024));
         }
      }
   };
   zg<ByteBuf, GameProfile> w = new zg<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = kk.g.decode($$0);
         String $$2 = wy.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)ze.v.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         kk.g.encode($$0, $$1.getId());
         wy.a($$0, $$1.getName(), 16);
         ze.v.encode($$0, $$1.getProperties());
      }
   };

   static zg<ByteBuf, byte[]> a(final int $$0) {
      return new zg<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return wf.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               wf.a($$0, $$1);
            }
         }
      };
   }

   static zg<ByteBuf, String> b(final int $$0) {
      return new zg<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return wy.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            wy.a($$0, $$1, $$0);
         }
      };
   }

   static zg<ByteBuf, vh> a(final Supplier<ut> $$0) {
      return new zg<ByteBuf, vh>() {
         public vh a(ByteBuf $$0x) {
            vh $$1 = wf.a($$0, $$0.get());
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
               wf.a($$0, $$1);
            }
         }
      };
   }

   static zg<ByteBuf, uk> b(Supplier<ut> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof uk) {
            return (uk)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> zg<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, ut::a);
   }

   static <T> zg<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> ut.a(2097152L));
   }

   static <T> zg<ByteBuf, T> a(Codec<T> $$0, Supplier<ut> $$1) {
      return a($$1)
         .a(
            $$1x -> (T)$$0.parse(uy.a, $$1x).getOrThrow($$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> (vh)$$0.encodeStart(uy.a, $$1x).getOrThrow($$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> zg<wt, T> c(Codec<T> $$0) {
      return b($$0, ut::a);
   }

   static <T> zg<wt, T> d(Codec<T> $$0) {
      return b($$0, () -> ut.a(2097152L));
   }

   static <T> zg<wt, T> b(final Codec<T> $$0, Supplier<ut> $$1) {
      final zg<ByteBuf, vh> $$2 = a($$1);
      return new zg<wt, T>() {
         public T a(wt $$0x) {
            vh $$1 = $$2.decode($$0);
            alg<vh> $$2 = $$0.H().a(uy.a);
            return (T)$$0.parse($$2, $$1).getOrThrow($$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(wt $$0x, T $$1) {
            alg<vh> $$2 = $$0.H().a(uy.a);
            vh $$3 = (vh)$$0.encodeStart($$2, $$1).getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> zg<B, Optional<V>> a(final zg<B, V> $$0) {
      return new zg<B, Optional<V>>() {
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
      int $$2 = wz.a($$0);
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
         wz.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zg<B, C> a(IntFunction<C> $$0, zg<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zg<B, C> a(final IntFunction<C> $$0, final zg<? super B, V> $$1, final int $$2) {
      return new zg<B, C>() {
         public C a(B $$0x) {
            int $$1 = ze.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            ze.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zg.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> zg.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> zg.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zg<B, M> a(IntFunction<? extends M> $$0, zg<? super B, K> $$1, zg<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zg<B, M> a(
      final IntFunction<? extends M> $$0, final zg<? super B, K> $$1, final zg<? super B, V> $$2, final int $$3
   ) {
      return new zg<B, M>() {
         public void a(B $$0x, M $$1x) {
            ze.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = ze.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> zg<B, Either<L, R>> a(final zg<? super B, L> $$0, final zg<? super B, R> $$1) {
      return new zg<B, Either<L, R>>() {
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

   static <T> zg<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new zg<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = wz.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            wz.a($$0, $$2);
         }
      };
   }

   static <T> zg<ByteBuf, T> a(jv<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> zg<wt, R> a(final alh<? extends kd<T>> $$0, final Function<kd<T>, jv<R>> $$1) {
      return new zg<wt, R>() {
         private jv<R> b(wt $$0x) {
            return $$1.apply($$0.H().e($$0));
         }

         public R a(wt $$0x) {
            int $$1 = wz.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(wt $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            wz.a($$0, $$2);
         }
      };
   }

   static <T> zg<wt, T> a(alh<? extends kd<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> zg<wt, jq<T>> b(alh<? extends kd<T>> $$0) {
      return a($$0, kd::t);
   }

   static <T> zg<wt, jq<T>> a(final alh<? extends kd<T>> $$0, final zg<? super wt, T> $$1) {
      return new zg<wt, jq<T>>() {
         private static final int c = 0;

         private jv<jq<T>> b(wt $$0x) {
            return $$0.H().e($$0).t();
         }

         public jq<T> a(wt $$0x) {
            int $$1 = wz.a($$0);
            return $$1 == 0 ? jq.a($$1.decode($$0)) : (jq)this.b($$0).b($$1 - 1);
         }

         public void a(wt $$0x, jq<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  wz.a($$0, $$2 + 1);
                  break;
               case b:
                  wz.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> zg<wt, ju<T>> c(final alh<? extends kd<T>> $$0) {
      return new zg<wt, ju<T>>() {
         private static final int b = -1;
         private final zg<wt, jq<T>> c = ze.b($$0);

         public ju<T> a(wt $$0x) {
            int $$1 = wz.a($$0) - 1;
            if ($$1 == -1) {
               kd<T> $$2 = $$0.H().e($$0);
               return $$2.a(axq.a($$0, ali.b.decode($$0))).orElseThrow();
            } else {
               List<jq<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return ju.a($$3);
            }
         }

         public void a(wt $$0x, ju<T> $$1) {
            Optional<axq<T>> $$2 = $$1.e();
            if ($$2.isPresent()) {
               wz.a($$0, 0);
               ali.b.encode($$0, $$2.get().b());
            } else {
               wz.a($$0, $$1.b() + 1);

               for (jq<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
