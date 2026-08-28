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

public interface zh {
   int a = 65536;
   zj<ByteBuf, Boolean> b = new zj<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   zj<ByteBuf, Byte> c = new zj<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   zj<ByteBuf, Float> d = c.a(azn::a, azn::g);
   zj<ByteBuf, Short> e = new zj<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   zj<ByteBuf, Integer> f = new zj<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readUnsignedShort();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeShort($$1);
      }
   };
   zj<ByteBuf, Integer> g = new zj<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   zj<ByteBuf, Integer> h = new zj<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return xc.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         xc.a($$0, $$1);
      }
   };
   zj<ByteBuf, Long> i = new zj<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return xd.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         xd.a($$0, $$1);
      }
   };
   zj<ByteBuf, Float> j = new zj<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   zj<ByteBuf, Double> k = new zj<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   zj<ByteBuf, byte[]> l = new zj<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return wi.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         wi.a($$0, $$1);
      }
   };
   zj<ByteBuf, String> m = b(32767);
   zj<ByteBuf, vk> n = a((Supplier<uw>)(() -> uw.a(2097152L)));
   zj<ByteBuf, vk> o = a(uw::a);
   zj<ByteBuf, un> p = b((Supplier<uw>)(() -> uw.a(2097152L)));
   zj<ByteBuf, un> q = b(uw::a);
   zj<ByteBuf, Optional<un>> r = new zj<ByteBuf, Optional<un>>() {
      public Optional<un> a(ByteBuf $$0) {
         return Optional.ofNullable(wi.h($$0));
      }

      public void a(ByteBuf $$0, Optional<un> $$1) {
         wi.a($$0, $$1.orElse(null));
      }
   };
   zj<ByteBuf, Vector3f> s = new zj<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return wi.d($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         wi.a($$0, $$1);
      }
   };
   zj<ByteBuf, Quaternionf> t = new zj<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return wi.e($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         wi.a($$0, $$1);
      }
   };
   zj<ByteBuf, Integer> u = new zj<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wi.i($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wi.b($$0, $$1);
      }
   };
   zj<ByteBuf, PropertyMap> v = new zj<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = zh.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = xb.a($$0, 64);
            String $$5 = xb.a($$0, 32767);
            String $$6 = wi.a($$0, (zk<? super ByteBuf, String>)($$0x -> xb.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         zh.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            xb.a($$0, $$2.name(), 64);
            xb.a($$0, $$2.value(), 32767);
            wi.a($$0, $$2.signature(), ($$0x, $$1x) -> xb.a($$0x, $$1x, 1024));
         }
      }
   };
   zj<ByteBuf, GameProfile> w = new zj<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = kk.g.decode($$0);
         String $$2 = xb.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)zh.v.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         kk.g.encode($$0, $$1.getId());
         xb.a($$0, $$1.getName(), 16);
         zh.v.encode($$0, $$1.getProperties());
      }
   };

   static zj<ByteBuf, byte[]> a(final int $$0) {
      return new zj<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return wi.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               wi.a($$0, $$1);
            }
         }
      };
   }

   static zj<ByteBuf, String> b(final int $$0) {
      return new zj<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return xb.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            xb.a($$0, $$1, $$0);
         }
      };
   }

   static zj<ByteBuf, vk> a(final Supplier<uw> $$0) {
      return new zj<ByteBuf, vk>() {
         public vk a(ByteBuf $$0x) {
            vk $$1 = wi.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, vk $$1) {
            if ($$1 == up.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               wi.a($$0, $$1);
            }
         }
      };
   }

   static zj<ByteBuf, un> b(Supplier<uw> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof un) {
            return (un)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> zj<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, uw::a);
   }

   static <T> zj<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> uw.a(2097152L));
   }

   static <T> zj<ByteBuf, T> a(Codec<T> $$0, Supplier<uw> $$1) {
      return a($$1)
         .a(
            $$1x -> (T)$$0.parse(vb.a, $$1x).getOrThrow($$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> (vk)$$0.encodeStart(vb.a, $$1x).getOrThrow($$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> zj<ww, T> c(Codec<T> $$0) {
      return b($$0, uw::a);
   }

   static <T> zj<ww, T> d(Codec<T> $$0) {
      return b($$0, () -> uw.a(2097152L));
   }

   static <T> zj<ww, T> b(final Codec<T> $$0, Supplier<uw> $$1) {
      final zj<ByteBuf, vk> $$2 = a($$1);
      return new zj<ww, T>() {
         public T a(ww $$0x) {
            vk $$1 = $$2.decode($$0);
            alj<vk> $$2 = $$0.H().a(vb.a);
            return (T)$$0.parse($$2, $$1).getOrThrow($$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(ww $$0x, T $$1) {
            alj<vk> $$2 = $$0.H().a(vb.a);
            vk $$3 = (vk)$$0.encodeStart($$2, $$1).getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> zj<B, Optional<V>> a(final zj<B, V> $$0) {
      return new zj<B, Optional<V>>() {
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
      int $$2 = xc.a($$0);
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
         xc.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zj<B, C> a(IntFunction<C> $$0, zj<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zj<B, C> a(final IntFunction<C> $$0, final zj<? super B, V> $$1, final int $$2) {
      return new zj<B, C>() {
         public C a(B $$0x) {
            int $$1 = zh.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            zh.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zj.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> zj.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> zj.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zj<B, M> a(IntFunction<? extends M> $$0, zj<? super B, K> $$1, zj<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zj<B, M> a(
      final IntFunction<? extends M> $$0, final zj<? super B, K> $$1, final zj<? super B, V> $$2, final int $$3
   ) {
      return new zj<B, M>() {
         public void a(B $$0x, M $$1x) {
            zh.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = zh.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> zj<B, Either<L, R>> a(final zj<? super B, L> $$0, final zj<? super B, R> $$1) {
      return new zj<B, Either<L, R>>() {
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

   static <T> zj<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new zj<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = xc.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            xc.a($$0, $$2);
         }
      };
   }

   static <T> zj<ByteBuf, T> a(jv<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> zj<ww, R> a(final alk<? extends kd<T>> $$0, final Function<kd<T>, jv<R>> $$1) {
      return new zj<ww, R>() {
         private jv<R> b(ww $$0x) {
            return $$1.apply($$0.H().e($$0));
         }

         public R a(ww $$0x) {
            int $$1 = xc.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(ww $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            xc.a($$0, $$2);
         }
      };
   }

   static <T> zj<ww, T> a(alk<? extends kd<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> zj<ww, jq<T>> b(alk<? extends kd<T>> $$0) {
      return a($$0, kd::t);
   }

   static <T> zj<ww, jq<T>> a(final alk<? extends kd<T>> $$0, final zj<? super ww, T> $$1) {
      return new zj<ww, jq<T>>() {
         private static final int c = 0;

         private jv<jq<T>> b(ww $$0x) {
            return $$0.H().e($$0).t();
         }

         public jq<T> a(ww $$0x) {
            int $$1 = xc.a($$0);
            return $$1 == 0 ? jq.a($$1.decode($$0)) : (jq)this.b($$0).b($$1 - 1);
         }

         public void a(ww $$0x, jq<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  xc.a($$0, $$2 + 1);
                  break;
               case b:
                  xc.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> zj<ww, ju<T>> c(final alk<? extends kd<T>> $$0) {
      return new zj<ww, ju<T>>() {
         private static final int b = -1;
         private final zj<ww, jq<T>> c = zh.b($$0);

         public ju<T> a(ww $$0x) {
            int $$1 = xc.a($$0) - 1;
            if ($$1 == -1) {
               kd<T> $$2 = $$0.H().e($$0);
               return $$2.a(axt.a($$0, all.b.decode($$0))).orElseThrow();
            } else {
               List<jq<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return ju.a($$3);
            }
         }

         public void a(ww $$0x, ju<T> $$1) {
            Optional<axt<T>> $$2 = $$1.e();
            if ($$2.isPresent()) {
               xc.a($$0, 0);
               all.b.encode($$0, $$2.get().b());
            } else {
               xc.a($$0, $$1.b() + 1);

               for (jq<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
