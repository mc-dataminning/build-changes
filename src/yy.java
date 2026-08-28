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

public interface yy {
   int a = 65536;
   za<ByteBuf, Boolean> b = new za<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   za<ByteBuf, Byte> c = new za<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   za<ByteBuf, Float> d = c.a(azq::a, azq::g);
   za<ByteBuf, Short> e = new za<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   za<ByteBuf, Integer> f = new za<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readUnsignedShort();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeShort($$1);
      }
   };
   za<ByteBuf, Integer> g = new za<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   za<ByteBuf, Integer> h = new za<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wt.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wt.a($$0, $$1);
      }
   };
   za<ByteBuf, OptionalInt> i = h.a($$0 -> $$0 == 0 ? OptionalInt.empty() : OptionalInt.of($$0 - 1), $$0 -> $$0.isPresent() ? $$0.getAsInt() + 1 : 0);
   za<ByteBuf, Long> j = new za<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return $$0.readLong();
      }

      public void a(ByteBuf $$0, Long $$1) {
         $$0.writeLong($$1);
      }
   };
   za<ByteBuf, Long> k = new za<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return wu.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         wu.a($$0, $$1);
      }
   };
   za<ByteBuf, Float> l = new za<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   za<ByteBuf, Double> m = new za<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   za<ByteBuf, byte[]> n = new za<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return vy.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         vy.a($$0, $$1);
      }
   };
   za<ByteBuf, long[]> o = new za<ByteBuf, long[]>() {
      public long[] a(ByteBuf $$0) {
         return vy.b($$0);
      }

      public void a(ByteBuf $$0, long[] $$1) {
         vy.a($$0, $$1);
      }
   };
   za<ByteBuf, String> p = b(32767);
   za<ByteBuf, va> q = a((Supplier<uj>)(() -> uj.a(2097152L)));
   za<ByteBuf, va> r = a(uj::a);
   za<ByteBuf, ua> s = b((Supplier<uj>)(() -> uj.a(2097152L)));
   za<ByteBuf, ua> t = b(uj::a);
   za<ByteBuf, Optional<ua>> u = new za<ByteBuf, Optional<ua>>() {
      public Optional<ua> a(ByteBuf $$0) {
         return Optional.ofNullable(vy.i($$0));
      }

      public void a(ByteBuf $$0, Optional<ua> $$1) {
         vy.a($$0, $$1.orElse(null));
      }
   };
   za<ByteBuf, Vector3f> v = new za<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return vy.e($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         vy.a($$0, $$1);
      }
   };
   za<ByteBuf, Quaternionf> w = new za<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return vy.f($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         vy.a($$0, $$1);
      }
   };
   za<ByteBuf, Integer> x = new za<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return vy.j($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         vy.b($$0, $$1);
      }
   };
   za<ByteBuf, PropertyMap> y = new za<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = yy.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = ws.a($$0, 64);
            String $$5 = ws.a($$0, 32767);
            String $$6 = vy.a($$0, (zb<? super ByteBuf, String>)($$0x -> ws.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         yy.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            ws.a($$0, $$2.name(), 64);
            ws.a($$0, $$2.value(), 32767);
            vy.a($$0, $$2.signature(), ($$0x, $$1x) -> ws.a($$0x, $$1x, 1024));
         }
      }
   };
   za<ByteBuf, GameProfile> z = new za<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = ka.g.decode($$0);
         String $$2 = ws.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)yy.y.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         ka.g.encode($$0, $$1.getId());
         ws.a($$0, $$1.getName(), 16);
         yy.y.encode($$0, $$1.getProperties());
      }
   };

   static za<ByteBuf, byte[]> a(final int $$0) {
      return new za<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return vy.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               vy.a($$0, $$1);
            }
         }
      };
   }

   static za<ByteBuf, String> b(final int $$0) {
      return new za<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return ws.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            ws.a($$0, $$1, $$0);
         }
      };
   }

   static za<ByteBuf, va> a(final Supplier<uj> $$0) {
      return new za<ByteBuf, va>() {
         public va a(ByteBuf $$0x) {
            va $$1 = vy.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, va $$1) {
            if ($$1 == uc.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               vy.a($$0, $$1);
            }
         }
      };
   }

   static za<ByteBuf, ua> b(Supplier<uj> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof ua) {
            return (ua)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> za<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, uj::a);
   }

   static <T> za<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> uj.a(2097152L));
   }

   static <T> za<ByteBuf, T> a(Codec<T> $$0, Supplier<uj> $$1) {
      return a($$1)
         .a(
            $$1x -> (T)$$0.parse(uo.a, $$1x).getOrThrow($$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> (va)$$0.encodeStart(uo.a, $$1x).getOrThrow($$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> za<wn, T> c(Codec<T> $$0) {
      return b($$0, uj::a);
   }

   static <T> za<wn, T> d(Codec<T> $$0) {
      return b($$0, () -> uj.a(2097152L));
   }

   static <T> za<wn, T> b(final Codec<T> $$0, Supplier<uj> $$1) {
      final za<ByteBuf, va> $$2 = a($$1);
      return new za<wn, T>() {
         public T a(wn $$0x) {
            va $$1 = $$2.decode($$0);
            ali<va> $$2 = $$0.H().a(uo.a);
            return (T)$$0.parse($$2, $$1).getOrThrow($$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(wn $$0x, T $$1) {
            ali<va> $$2 = $$0.H().a(uo.a);
            va $$3 = (va)$$0.encodeStart($$2, $$1).getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> za<B, Optional<V>> a(final za<B, V> $$0) {
      return new za<B, Optional<V>>() {
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
      int $$2 = wt.a($$0);
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
         wt.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> za<B, C> a(IntFunction<C> $$0, za<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> za<B, C> a(final IntFunction<C> $$0, final za<? super B, V> $$1, final int $$2) {
      return new za<B, C>() {
         public C a(B $$0x) {
            int $$1 = yy.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            yy.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> za.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> za.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> za.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> za<B, M> a(IntFunction<? extends M> $$0, za<? super B, K> $$1, za<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> za<B, M> a(
      final IntFunction<? extends M> $$0, final za<? super B, K> $$1, final za<? super B, V> $$2, final int $$3
   ) {
      return new za<B, M>() {
         public void a(B $$0x, M $$1x) {
            yy.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = yy.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> za<B, Either<L, R>> a(final za<? super B, L> $$0, final za<? super B, R> $$1) {
      return new za<B, Either<L, R>>() {
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

   static <T> za<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new za<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = wt.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            wt.a($$0, $$2);
         }
      };
   }

   static <T> za<ByteBuf, T> a(jl<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> za<wn, R> a(final alj<? extends jt<T>> $$0, final Function<jt<T>, jl<R>> $$1) {
      return new za<wn, R>() {
         private jl<R> b(wn $$0x) {
            return $$1.apply($$0.H().f($$0));
         }

         public R a(wn $$0x) {
            int $$1 = wt.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(wn $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            wt.a($$0, $$2);
         }
      };
   }

   static <T> za<wn, T> a(alj<? extends jt<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> za<wn, jg<T>> b(alj<? extends jt<T>> $$0) {
      return a($$0, jt::t);
   }

   static <T> za<wn, jg<T>> a(final alj<? extends jt<T>> $$0, final za<? super wn, T> $$1) {
      return new za<wn, jg<T>>() {
         private static final int c = 0;

         private jl<jg<T>> b(wn $$0x) {
            return $$0.H().f($$0).t();
         }

         public jg<T> a(wn $$0x) {
            int $$1 = wt.a($$0);
            return $$1 == 0 ? jg.a($$1.decode($$0)) : (jg)this.b($$0).b($$1 - 1);
         }

         public void a(wn $$0x, jg<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  wt.a($$0, $$2 + 1);
                  break;
               case b:
                  wt.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> za<wn, jk<T>> c(final alj<? extends jt<T>> $$0) {
      return new za<wn, jk<T>>() {
         private static final int b = -1;
         private final za<wn, jg<T>> c = yy.b($$0);

         public jk<T> a(wn $$0x) {
            int $$1 = wt.a($$0) - 1;
            if ($$1 == -1) {
               jt<T> $$2 = $$0.H().f($$0);
               return $$2.a(axv.a($$0, alk.b.decode($$0))).orElseThrow();
            } else {
               List<jg<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return jk.a($$3);
            }
         }

         public void a(wn $$0x, jk<T> $$1) {
            Optional<axv<T>> $$2 = $$1.e();
            if ($$2.isPresent()) {
               wt.a($$0, 0);
               alk.b.encode($$0, $$2.get().b());
            } else {
               wt.a($$0, $$1.b() + 1);

               for (jg<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
