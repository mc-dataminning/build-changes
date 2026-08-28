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

public interface zf {
   int a = 65536;
   zh<ByteBuf, Boolean> b = new zh<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   zh<ByteBuf, Byte> c = new zh<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   zh<ByteBuf, Float> d = c.a(azm::a, azm::g);
   zh<ByteBuf, Short> e = new zh<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   zh<ByteBuf, Integer> f = new zh<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readUnsignedShort();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeShort($$1);
      }
   };
   zh<ByteBuf, Integer> g = new zh<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   zh<ByteBuf, Integer> h = new zh<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return xa.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         xa.a($$0, $$1);
      }
   };
   zh<ByteBuf, Long> i = new zh<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return $$0.readLong();
      }

      public void a(ByteBuf $$0, Long $$1) {
         $$0.writeLong($$1);
      }
   };
   zh<ByteBuf, Long> j = new zh<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return xb.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         xb.a($$0, $$1);
      }
   };
   zh<ByteBuf, Float> k = new zh<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   zh<ByteBuf, Double> l = new zh<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   zh<ByteBuf, byte[]> m = new zh<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return wg.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         wg.a($$0, $$1);
      }
   };
   zh<ByteBuf, String> n = b(32767);
   zh<ByteBuf, vi> o = a((Supplier<uu>)(() -> uu.a(2097152L)));
   zh<ByteBuf, vi> p = a(uu::a);
   zh<ByteBuf, ul> q = b((Supplier<uu>)(() -> uu.a(2097152L)));
   zh<ByteBuf, ul> r = b(uu::a);
   zh<ByteBuf, Optional<ul>> s = new zh<ByteBuf, Optional<ul>>() {
      public Optional<ul> a(ByteBuf $$0) {
         return Optional.ofNullable(wg.h($$0));
      }

      public void a(ByteBuf $$0, Optional<ul> $$1) {
         wg.a($$0, $$1.orElse(null));
      }
   };
   zh<ByteBuf, Vector3f> t = new zh<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return wg.d($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         wg.a($$0, $$1);
      }
   };
   zh<ByteBuf, Quaternionf> u = new zh<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return wg.e($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         wg.a($$0, $$1);
      }
   };
   zh<ByteBuf, Integer> v = new zh<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wg.i($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wg.b($$0, $$1);
      }
   };
   zh<ByteBuf, PropertyMap> w = new zh<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = zf.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = wz.a($$0, 64);
            String $$5 = wz.a($$0, 32767);
            String $$6 = wg.a($$0, (zi<? super ByteBuf, String>)($$0x -> wz.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         zf.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            wz.a($$0, $$2.name(), 64);
            wz.a($$0, $$2.value(), 32767);
            wg.a($$0, $$2.signature(), ($$0x, $$1x) -> wz.a($$0x, $$1x, 1024));
         }
      }
   };
   zh<ByteBuf, GameProfile> x = new zh<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = kk.g.decode($$0);
         String $$2 = wz.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)zf.w.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         kk.g.encode($$0, $$1.getId());
         wz.a($$0, $$1.getName(), 16);
         zf.w.encode($$0, $$1.getProperties());
      }
   };

   static zh<ByteBuf, byte[]> a(final int $$0) {
      return new zh<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return wg.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               wg.a($$0, $$1);
            }
         }
      };
   }

   static zh<ByteBuf, String> b(final int $$0) {
      return new zh<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return wz.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            wz.a($$0, $$1, $$0);
         }
      };
   }

   static zh<ByteBuf, vi> a(final Supplier<uu> $$0) {
      return new zh<ByteBuf, vi>() {
         public vi a(ByteBuf $$0x) {
            vi $$1 = wg.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, vi $$1) {
            if ($$1 == un.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               wg.a($$0, $$1);
            }
         }
      };
   }

   static zh<ByteBuf, ul> b(Supplier<uu> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof ul) {
            return (ul)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> zh<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, uu::a);
   }

   static <T> zh<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> uu.a(2097152L));
   }

   static <T> zh<ByteBuf, T> a(Codec<T> $$0, Supplier<uu> $$1) {
      return a($$1)
         .a(
            $$1x -> (T)$$0.parse(uz.a, $$1x).getOrThrow($$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> (vi)$$0.encodeStart(uz.a, $$1x).getOrThrow($$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> zh<wu, T> c(Codec<T> $$0) {
      return b($$0, uu::a);
   }

   static <T> zh<wu, T> d(Codec<T> $$0) {
      return b($$0, () -> uu.a(2097152L));
   }

   static <T> zh<wu, T> b(final Codec<T> $$0, Supplier<uu> $$1) {
      final zh<ByteBuf, vi> $$2 = a($$1);
      return new zh<wu, T>() {
         public T a(wu $$0x) {
            vi $$1 = $$2.decode($$0);
            alh<vi> $$2 = $$0.H().a(uz.a);
            return (T)$$0.parse($$2, $$1).getOrThrow($$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(wu $$0x, T $$1) {
            alh<vi> $$2 = $$0.H().a(uz.a);
            vi $$3 = (vi)$$0.encodeStart($$2, $$1).getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> zh<B, Optional<V>> a(final zh<B, V> $$0) {
      return new zh<B, Optional<V>>() {
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
      int $$2 = xa.a($$0);
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
         xa.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zh<B, C> a(IntFunction<C> $$0, zh<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zh<B, C> a(final IntFunction<C> $$0, final zh<? super B, V> $$1, final int $$2) {
      return new zh<B, C>() {
         public C a(B $$0x) {
            int $$1 = zf.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            zf.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zh.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> zh.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> zh.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zh<B, M> a(IntFunction<? extends M> $$0, zh<? super B, K> $$1, zh<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zh<B, M> a(
      final IntFunction<? extends M> $$0, final zh<? super B, K> $$1, final zh<? super B, V> $$2, final int $$3
   ) {
      return new zh<B, M>() {
         public void a(B $$0x, M $$1x) {
            zf.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = zf.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> zh<B, Either<L, R>> a(final zh<? super B, L> $$0, final zh<? super B, R> $$1) {
      return new zh<B, Either<L, R>>() {
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

   static <T> zh<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new zh<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = xa.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            xa.a($$0, $$2);
         }
      };
   }

   static <T> zh<ByteBuf, T> a(jv<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> zh<wu, R> a(final ali<? extends kd<T>> $$0, final Function<kd<T>, jv<R>> $$1) {
      return new zh<wu, R>() {
         private jv<R> b(wu $$0x) {
            return $$1.apply($$0.H().e($$0));
         }

         public R a(wu $$0x) {
            int $$1 = xa.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(wu $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            xa.a($$0, $$2);
         }
      };
   }

   static <T> zh<wu, T> a(ali<? extends kd<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> zh<wu, jq<T>> b(ali<? extends kd<T>> $$0) {
      return a($$0, kd::t);
   }

   static <T> zh<wu, jq<T>> a(final ali<? extends kd<T>> $$0, final zh<? super wu, T> $$1) {
      return new zh<wu, jq<T>>() {
         private static final int c = 0;

         private jv<jq<T>> b(wu $$0x) {
            return $$0.H().e($$0).t();
         }

         public jq<T> a(wu $$0x) {
            int $$1 = xa.a($$0);
            return $$1 == 0 ? jq.a($$1.decode($$0)) : (jq)this.b($$0).b($$1 - 1);
         }

         public void a(wu $$0x, jq<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  xa.a($$0, $$2 + 1);
                  break;
               case b:
                  xa.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> zh<wu, ju<T>> c(final ali<? extends kd<T>> $$0) {
      return new zh<wu, ju<T>>() {
         private static final int b = -1;
         private final zh<wu, jq<T>> c = zf.b($$0);

         public ju<T> a(wu $$0x) {
            int $$1 = xa.a($$0) - 1;
            if ($$1 == -1) {
               kd<T> $$2 = $$0.H().e($$0);
               return $$2.a(axs.a($$0, alj.b.decode($$0))).orElseThrow();
            } else {
               List<jq<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return ju.a($$3);
            }
         }

         public void a(wu $$0x, ju<T> $$1) {
            Optional<axs<T>> $$2 = $$1.e();
            if ($$2.isPresent()) {
               xa.a($$0, 0);
               alj.b.encode($$0, $$2.get().b());
            } else {
               xa.a($$0, $$1.b() + 1);

               for (jq<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
