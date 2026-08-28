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

public interface yz {
   int a = 65536;
   zb<ByteBuf, Boolean> b = new zb<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   zb<ByteBuf, Byte> c = new zb<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   zb<ByteBuf, Short> d = new zb<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   zb<ByteBuf, Integer> e = new zb<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readUnsignedShort();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeShort($$1);
      }
   };
   zb<ByteBuf, Integer> f = new zb<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   zb<ByteBuf, Integer> g = new zb<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wu.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wu.a($$0, $$1);
      }
   };
   zb<ByteBuf, Long> h = new zb<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return wv.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         wv.a($$0, $$1);
      }
   };
   zb<ByteBuf, Float> i = new zb<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   zb<ByteBuf, Double> j = new zb<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   zb<ByteBuf, byte[]> k = new zb<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return wa.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         wa.a($$0, $$1);
      }
   };
   zb<ByteBuf, String> l = b(32767);
   zb<ByteBuf, vc> m = a((Supplier<uo>)(() -> uo.a(2097152L)));
   zb<ByteBuf, vc> n = a(uo::a);
   zb<ByteBuf, uf> o = b((Supplier<uo>)(() -> uo.a(2097152L)));
   zb<ByteBuf, uf> p = b(uo::a);
   zb<ByteBuf, Optional<uf>> q = new zb<ByteBuf, Optional<uf>>() {
      public Optional<uf> a(ByteBuf $$0) {
         return Optional.ofNullable(wa.g($$0));
      }

      public void a(ByteBuf $$0, Optional<uf> $$1) {
         wa.a($$0, $$1.orElse(null));
      }
   };
   zb<ByteBuf, Vector3f> r = new zb<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return wa.c($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         wa.a($$0, $$1);
      }
   };
   zb<ByteBuf, Quaternionf> s = new zb<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return wa.d($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         wa.a($$0, $$1);
      }
   };
   zb<ByteBuf, Integer> t = new zb<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wa.h($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wa.b($$0, $$1);
      }
   };
   zb<ByteBuf, PropertyMap> u = new zb<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = yz.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = wt.a($$0, 64);
            String $$5 = wt.a($$0, 32767);
            String $$6 = wa.a($$0, (zc<? super ByteBuf, String>)($$0x -> wt.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         yz.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            wt.a($$0, $$2.name(), 64);
            wt.a($$0, $$2.value(), 32767);
            wa.a($$0, $$2.signature(), ($$0x, $$1x) -> wt.a($$0x, $$1x, 1024));
         }
      }
   };
   zb<ByteBuf, GameProfile> v = new zb<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = kh.g.decode($$0);
         String $$2 = wt.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)yz.u.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         kh.g.encode($$0, $$1.getId());
         wt.a($$0, $$1.getName(), 16);
         yz.u.encode($$0, $$1.getProperties());
      }
   };

   static zb<ByteBuf, byte[]> a(final int $$0) {
      return new zb<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return wa.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               wa.a($$0, $$1);
            }
         }
      };
   }

   static zb<ByteBuf, String> b(final int $$0) {
      return new zb<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return wt.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            wt.a($$0, $$1, $$0);
         }
      };
   }

   static zb<ByteBuf, vc> a(final Supplier<uo> $$0) {
      return new zb<ByteBuf, vc>() {
         public vc a(ByteBuf $$0x) {
            vc $$1 = wa.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, vc $$1) {
            if ($$1 == uh.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               wa.a($$0, $$1);
            }
         }
      };
   }

   static zb<ByteBuf, uf> b(Supplier<uo> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof uf) {
            return (uf)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> zb<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, uo::a);
   }

   static <T> zb<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> uo.a(2097152L));
   }

   static <T> zb<ByteBuf, T> a(Codec<T> $$0, Supplier<uo> $$1) {
      return a($$1)
         .a(
            $$1x -> (T)$$0.parse(ut.a, $$1x).getOrThrow($$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> (vc)$$0.encodeStart(ut.a, $$1x).getOrThrow($$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> zb<wo, T> c(Codec<T> $$0) {
      return b($$0, uo::a);
   }

   static <T> zb<wo, T> d(Codec<T> $$0) {
      return b($$0, () -> uo.a(2097152L));
   }

   static <T> zb<wo, T> b(final Codec<T> $$0, Supplier<uo> $$1) {
      final zb<ByteBuf, vc> $$2 = a($$1);
      return new zb<wo, T>() {
         public T a(wo $$0x) {
            vc $$1 = $$2.decode($$0);
            ala<vc> $$2 = $$0.H().a(ut.a);
            return (T)$$0.parse($$2, $$1).getOrThrow($$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(wo $$0x, T $$1) {
            ala<vc> $$2 = $$0.H().a(ut.a);
            vc $$3 = (vc)$$0.encodeStart($$2, $$1).getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> zb<B, Optional<V>> a(final zb<B, V> $$0) {
      return new zb<B, Optional<V>>() {
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
      int $$2 = wu.a($$0);
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
         wu.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zb<B, C> a(IntFunction<C> $$0, zb<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zb<B, C> a(final IntFunction<C> $$0, final zb<? super B, V> $$1, final int $$2) {
      return new zb<B, C>() {
         public C a(B $$0x) {
            int $$1 = yz.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            yz.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zb.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> zb.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> zb.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zb<B, M> a(IntFunction<? extends M> $$0, zb<? super B, K> $$1, zb<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zb<B, M> a(
      final IntFunction<? extends M> $$0, final zb<? super B, K> $$1, final zb<? super B, V> $$2, final int $$3
   ) {
      return new zb<B, M>() {
         public void a(B $$0x, M $$1x) {
            yz.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = yz.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> zb<B, Either<L, R>> a(final zb<? super B, L> $$0, final zb<? super B, R> $$1) {
      return new zb<B, Either<L, R>>() {
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

   static <T> zb<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new zb<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = wu.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            wu.a($$0, $$2);
         }
      };
   }

   static <T> zb<ByteBuf, T> a(js<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> zb<wo, R> a(final alb<? extends ka<T>> $$0, final Function<ka<T>, js<R>> $$1) {
      return new zb<wo, R>() {
         private js<R> b(wo $$0x) {
            return $$1.apply($$0.H().d($$0));
         }

         public R a(wo $$0x) {
            int $$1 = wu.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(wo $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            wu.a($$0, $$2);
         }
      };
   }

   static <T> zb<wo, T> a(alb<? extends ka<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> zb<wo, jn<T>> b(alb<? extends ka<T>> $$0) {
      return a($$0, ka::t);
   }

   static <T> zb<wo, jn<T>> a(final alb<? extends ka<T>> $$0, final zb<? super wo, T> $$1) {
      return new zb<wo, jn<T>>() {
         private static final int c = 0;

         private js<jn<T>> b(wo $$0x) {
            return $$0.H().d($$0).t();
         }

         public jn<T> a(wo $$0x) {
            int $$1 = wu.a($$0);
            return $$1 == 0 ? jn.a($$1.decode($$0)) : (jn)this.b($$0).b($$1 - 1);
         }

         public void a(wo $$0x, jn<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  wu.a($$0, $$2 + 1);
                  break;
               case b:
                  wu.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> zb<wo, jr<T>> c(final alb<? extends ka<T>> $$0) {
      return new zb<wo, jr<T>>() {
         private static final int b = -1;
         private final zb<wo, jn<T>> c = yz.b($$0);

         public jr<T> a(wo $$0x) {
            int $$1 = wu.a($$0) - 1;
            if ($$1 == -1) {
               ka<T> $$2 = $$0.H().d($$0);
               return $$2.a(axj.a($$0, alc.b.decode($$0))).orElseThrow();
            } else {
               List<jn<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return jr.a($$3);
            }
         }

         public void a(wo $$0x, jr<T> $$1) {
            Optional<axj<T>> $$2 = $$1.e();
            if ($$2.isPresent()) {
               wu.a($$0, 0);
               alc.b.encode($$0, $$2.get().b());
            } else {
               wu.a($$0, $$1.b() + 1);

               for (jn<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
