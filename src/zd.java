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

public interface zd {
   int a = 65536;
   zf<ByteBuf, Boolean> b = new zf<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   zf<ByteBuf, Byte> c = new zf<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   zf<ByteBuf, Float> d = c.a(azj::a, azj::g);
   zf<ByteBuf, Short> e = new zf<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   zf<ByteBuf, Integer> f = new zf<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readUnsignedShort();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeShort($$1);
      }
   };
   zf<ByteBuf, Integer> g = new zf<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   zf<ByteBuf, Integer> h = new zf<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wy.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wy.a($$0, $$1);
      }
   };
   zf<ByteBuf, Long> i = new zf<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return wz.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         wz.a($$0, $$1);
      }
   };
   zf<ByteBuf, Float> j = new zf<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   zf<ByteBuf, Double> k = new zf<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   zf<ByteBuf, byte[]> l = new zf<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return we.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         we.a($$0, $$1);
      }
   };
   zf<ByteBuf, String> m = b(32767);
   zf<ByteBuf, vg> n = a((Supplier<us>)(() -> us.a(2097152L)));
   zf<ByteBuf, vg> o = a(us::a);
   zf<ByteBuf, uj> p = b((Supplier<us>)(() -> us.a(2097152L)));
   zf<ByteBuf, uj> q = b(us::a);
   zf<ByteBuf, Optional<uj>> r = new zf<ByteBuf, Optional<uj>>() {
      public Optional<uj> a(ByteBuf $$0) {
         return Optional.ofNullable(we.g($$0));
      }

      public void a(ByteBuf $$0, Optional<uj> $$1) {
         we.a($$0, $$1.orElse(null));
      }
   };
   zf<ByteBuf, Vector3f> s = new zf<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return we.c($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         we.a($$0, $$1);
      }
   };
   zf<ByteBuf, Quaternionf> t = new zf<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return we.d($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         we.a($$0, $$1);
      }
   };
   zf<ByteBuf, Integer> u = new zf<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return we.h($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         we.b($$0, $$1);
      }
   };
   zf<ByteBuf, PropertyMap> v = new zf<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = zd.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = wx.a($$0, 64);
            String $$5 = wx.a($$0, 32767);
            String $$6 = we.a($$0, (zg<? super ByteBuf, String>)($$0x -> wx.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         zd.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            wx.a($$0, $$2.name(), 64);
            wx.a($$0, $$2.value(), 32767);
            we.a($$0, $$2.signature(), ($$0x, $$1x) -> wx.a($$0x, $$1x, 1024));
         }
      }
   };
   zf<ByteBuf, GameProfile> w = new zf<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = kj.g.decode($$0);
         String $$2 = wx.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)zd.v.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         kj.g.encode($$0, $$1.getId());
         wx.a($$0, $$1.getName(), 16);
         zd.v.encode($$0, $$1.getProperties());
      }
   };

   static zf<ByteBuf, byte[]> a(final int $$0) {
      return new zf<ByteBuf, byte[]>() {
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

   static zf<ByteBuf, String> b(final int $$0) {
      return new zf<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return wx.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            wx.a($$0, $$1, $$0);
         }
      };
   }

   static zf<ByteBuf, vg> a(final Supplier<us> $$0) {
      return new zf<ByteBuf, vg>() {
         public vg a(ByteBuf $$0x) {
            vg $$1 = we.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, vg $$1) {
            if ($$1 == ul.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               we.a($$0, $$1);
            }
         }
      };
   }

   static zf<ByteBuf, uj> b(Supplier<us> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof uj) {
            return (uj)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> zf<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, us::a);
   }

   static <T> zf<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> us.a(2097152L));
   }

   static <T> zf<ByteBuf, T> a(Codec<T> $$0, Supplier<us> $$1) {
      return a($$1)
         .a(
            $$1x -> (T)$$0.parse(ux.a, $$1x).getOrThrow($$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> (vg)$$0.encodeStart(ux.a, $$1x).getOrThrow($$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> zf<ws, T> c(Codec<T> $$0) {
      return b($$0, us::a);
   }

   static <T> zf<ws, T> d(Codec<T> $$0) {
      return b($$0, () -> us.a(2097152L));
   }

   static <T> zf<ws, T> b(final Codec<T> $$0, Supplier<us> $$1) {
      final zf<ByteBuf, vg> $$2 = a($$1);
      return new zf<ws, T>() {
         public T a(ws $$0x) {
            vg $$1 = $$2.decode($$0);
            alf<vg> $$2 = $$0.H().a(ux.a);
            return (T)$$0.parse($$2, $$1).getOrThrow($$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(ws $$0x, T $$1) {
            alf<vg> $$2 = $$0.H().a(ux.a);
            vg $$3 = (vg)$$0.encodeStart($$2, $$1).getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> zf<B, Optional<V>> a(final zf<B, V> $$0) {
      return new zf<B, Optional<V>>() {
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
      int $$2 = wy.a($$0);
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
         wy.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zf<B, C> a(IntFunction<C> $$0, zf<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zf<B, C> a(final IntFunction<C> $$0, final zf<? super B, V> $$1, final int $$2) {
      return new zf<B, C>() {
         public C a(B $$0x) {
            int $$1 = zd.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            zd.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zf.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> zf.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> zf.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zf<B, M> a(IntFunction<? extends M> $$0, zf<? super B, K> $$1, zf<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zf<B, M> a(
      final IntFunction<? extends M> $$0, final zf<? super B, K> $$1, final zf<? super B, V> $$2, final int $$3
   ) {
      return new zf<B, M>() {
         public void a(B $$0x, M $$1x) {
            zd.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = zd.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> zf<B, Either<L, R>> a(final zf<? super B, L> $$0, final zf<? super B, R> $$1) {
      return new zf<B, Either<L, R>>() {
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

   static <T> zf<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new zf<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = wy.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            wy.a($$0, $$2);
         }
      };
   }

   static <T> zf<ByteBuf, T> a(ju<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> zf<ws, R> a(final alg<? extends kc<T>> $$0, final Function<kc<T>, ju<R>> $$1) {
      return new zf<ws, R>() {
         private ju<R> b(ws $$0x) {
            return $$1.apply($$0.H().e($$0));
         }

         public R a(ws $$0x) {
            int $$1 = wy.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(ws $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            wy.a($$0, $$2);
         }
      };
   }

   static <T> zf<ws, T> a(alg<? extends kc<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> zf<ws, jp<T>> b(alg<? extends kc<T>> $$0) {
      return a($$0, kc::t);
   }

   static <T> zf<ws, jp<T>> a(final alg<? extends kc<T>> $$0, final zf<? super ws, T> $$1) {
      return new zf<ws, jp<T>>() {
         private static final int c = 0;

         private ju<jp<T>> b(ws $$0x) {
            return $$0.H().e($$0).t();
         }

         public jp<T> a(ws $$0x) {
            int $$1 = wy.a($$0);
            return $$1 == 0 ? jp.a($$1.decode($$0)) : (jp)this.b($$0).b($$1 - 1);
         }

         public void a(ws $$0x, jp<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  wy.a($$0, $$2 + 1);
                  break;
               case b:
                  wy.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> zf<ws, jt<T>> c(final alg<? extends kc<T>> $$0) {
      return new zf<ws, jt<T>>() {
         private static final int b = -1;
         private final zf<ws, jp<T>> c = zd.b($$0);

         public jt<T> a(ws $$0x) {
            int $$1 = wy.a($$0) - 1;
            if ($$1 == -1) {
               kc<T> $$2 = $$0.H().e($$0);
               return $$2.a(axp.a($$0, alh.b.decode($$0))).orElseThrow();
            } else {
               List<jp<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return jt.a($$3);
            }
         }

         public void a(ws $$0x, jt<T> $$1) {
            Optional<axp<T>> $$2 = $$1.e();
            if ($$2.isPresent()) {
               wy.a($$0, 0);
               alh.b.encode($$0, $$2.get().b());
            } else {
               wy.a($$0, $$1.b() + 1);

               for (jp<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
