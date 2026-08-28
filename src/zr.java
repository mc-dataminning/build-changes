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

public interface zr {
   int a = 65536;
   zt<ByteBuf, Boolean> b = new zt<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   zt<ByteBuf, Byte> c = new zt<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   zt<ByteBuf, Float> d = c.a(bae::a, bae::g);
   zt<ByteBuf, Short> e = new zt<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   zt<ByteBuf, Integer> f = new zt<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readUnsignedShort();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeShort($$1);
      }
   };
   zt<ByteBuf, Integer> g = new zt<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   zt<ByteBuf, Integer> h = new zt<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return xm.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         xm.a($$0, $$1);
      }
   };
   zt<ByteBuf, OptionalInt> i = h.a($$0 -> $$0 == 0 ? OptionalInt.empty() : OptionalInt.of($$0 - 1), $$0 -> $$0.isPresent() ? $$0.getAsInt() + 1 : 0);
   zt<ByteBuf, Long> j = new zt<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return $$0.readLong();
      }

      public void a(ByteBuf $$0, Long $$1) {
         $$0.writeLong($$1);
      }
   };
   zt<ByteBuf, Long> k = new zt<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return xn.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         xn.a($$0, $$1);
      }
   };
   zt<ByteBuf, Float> l = new zt<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   zt<ByteBuf, Double> m = new zt<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   zt<ByteBuf, byte[]> n = new zt<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return ws.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         ws.a($$0, $$1);
      }
   };
   zt<ByteBuf, String> o = b(32767);
   zt<ByteBuf, vu> p = a((Supplier<vg>)(() -> vg.a(2097152L)));
   zt<ByteBuf, vu> q = a(vg::a);
   zt<ByteBuf, ux> r = b((Supplier<vg>)(() -> vg.a(2097152L)));
   zt<ByteBuf, ux> s = b(vg::a);
   zt<ByteBuf, Optional<ux>> t = new zt<ByteBuf, Optional<ux>>() {
      public Optional<ux> a(ByteBuf $$0) {
         return Optional.ofNullable(ws.h($$0));
      }

      public void a(ByteBuf $$0, Optional<ux> $$1) {
         ws.a($$0, $$1.orElse(null));
      }
   };
   zt<ByteBuf, Vector3f> u = new zt<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return ws.d($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         ws.a($$0, $$1);
      }
   };
   zt<ByteBuf, Quaternionf> v = new zt<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return ws.e($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         ws.a($$0, $$1);
      }
   };
   zt<ByteBuf, Integer> w = new zt<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return ws.i($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         ws.b($$0, $$1);
      }
   };
   zt<ByteBuf, PropertyMap> x = new zt<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = zr.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = xl.a($$0, 64);
            String $$5 = xl.a($$0, 32767);
            String $$6 = ws.a($$0, (zu<? super ByteBuf, String>)($$0x -> xl.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         zr.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            xl.a($$0, $$2.name(), 64);
            xl.a($$0, $$2.value(), 32767);
            ws.a($$0, $$2.signature(), ($$0x, $$1x) -> xl.a($$0x, $$1x, 1024));
         }
      }
   };
   zt<ByteBuf, GameProfile> y = new zt<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = kk.g.decode($$0);
         String $$2 = xl.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)zr.x.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         kk.g.encode($$0, $$1.getId());
         xl.a($$0, $$1.getName(), 16);
         zr.x.encode($$0, $$1.getProperties());
      }
   };

   static zt<ByteBuf, byte[]> a(final int $$0) {
      return new zt<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return ws.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               ws.a($$0, $$1);
            }
         }
      };
   }

   static zt<ByteBuf, String> b(final int $$0) {
      return new zt<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return xl.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            xl.a($$0, $$1, $$0);
         }
      };
   }

   static zt<ByteBuf, vu> a(final Supplier<vg> $$0) {
      return new zt<ByteBuf, vu>() {
         public vu a(ByteBuf $$0x) {
            vu $$1 = ws.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, vu $$1) {
            if ($$1 == uz.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               ws.a($$0, $$1);
            }
         }
      };
   }

   static zt<ByteBuf, ux> b(Supplier<vg> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof ux) {
            return (ux)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> zt<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, vg::a);
   }

   static <T> zt<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> vg.a(2097152L));
   }

   static <T> zt<ByteBuf, T> a(Codec<T> $$0, Supplier<vg> $$1) {
      return a($$1)
         .a(
            $$1x -> (T)$$0.parse(vl.a, $$1x).getOrThrow($$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> (vu)$$0.encodeStart(vl.a, $$1x).getOrThrow($$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> zt<xg, T> c(Codec<T> $$0) {
      return b($$0, vg::a);
   }

   static <T> zt<xg, T> d(Codec<T> $$0) {
      return b($$0, () -> vg.a(2097152L));
   }

   static <T> zt<xg, T> b(final Codec<T> $$0, Supplier<vg> $$1) {
      final zt<ByteBuf, vu> $$2 = a($$1);
      return new zt<xg, T>() {
         public T a(xg $$0x) {
            vu $$1 = $$2.decode($$0);
            alx<vu> $$2 = $$0.H().a(vl.a);
            return (T)$$0.parse($$2, $$1).getOrThrow($$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(xg $$0x, T $$1) {
            alx<vu> $$2 = $$0.H().a(vl.a);
            vu $$3 = (vu)$$0.encodeStart($$2, $$1).getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> zt<B, Optional<V>> a(final zt<B, V> $$0) {
      return new zt<B, Optional<V>>() {
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
      int $$2 = xm.a($$0);
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
         xm.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zt<B, C> a(IntFunction<C> $$0, zt<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zt<B, C> a(final IntFunction<C> $$0, final zt<? super B, V> $$1, final int $$2) {
      return new zt<B, C>() {
         public C a(B $$0x) {
            int $$1 = zr.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            zr.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zt.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> zt.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> zt.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zt<B, M> a(IntFunction<? extends M> $$0, zt<? super B, K> $$1, zt<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zt<B, M> a(
      final IntFunction<? extends M> $$0, final zt<? super B, K> $$1, final zt<? super B, V> $$2, final int $$3
   ) {
      return new zt<B, M>() {
         public void a(B $$0x, M $$1x) {
            zr.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = zr.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> zt<B, Either<L, R>> a(final zt<? super B, L> $$0, final zt<? super B, R> $$1) {
      return new zt<B, Either<L, R>>() {
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

   static <T> zt<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new zt<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = xm.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            xm.a($$0, $$2);
         }
      };
   }

   static <T> zt<ByteBuf, T> a(jv<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> zt<xg, R> a(final aly<? extends kd<T>> $$0, final Function<kd<T>, jv<R>> $$1) {
      return new zt<xg, R>() {
         private jv<R> b(xg $$0x) {
            return $$1.apply($$0.H().e($$0));
         }

         public R a(xg $$0x) {
            int $$1 = xm.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(xg $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            xm.a($$0, $$2);
         }
      };
   }

   static <T> zt<xg, T> a(aly<? extends kd<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> zt<xg, jq<T>> b(aly<? extends kd<T>> $$0) {
      return a($$0, kd::t);
   }

   static <T> zt<xg, jq<T>> a(final aly<? extends kd<T>> $$0, final zt<? super xg, T> $$1) {
      return new zt<xg, jq<T>>() {
         private static final int c = 0;

         private jv<jq<T>> b(xg $$0x) {
            return $$0.H().e($$0).t();
         }

         public jq<T> a(xg $$0x) {
            int $$1 = xm.a($$0);
            return $$1 == 0 ? jq.a($$1.decode($$0)) : (jq)this.b($$0).b($$1 - 1);
         }

         public void a(xg $$0x, jq<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  xm.a($$0, $$2 + 1);
                  break;
               case b:
                  xm.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> zt<xg, ju<T>> c(final aly<? extends kd<T>> $$0) {
      return new zt<xg, ju<T>>() {
         private static final int b = -1;
         private final zt<xg, jq<T>> c = zr.b($$0);

         public ju<T> a(xg $$0x) {
            int $$1 = xm.a($$0) - 1;
            if ($$1 == -1) {
               kd<T> $$2 = $$0.H().e($$0);
               return $$2.a(ayk.a($$0, alz.b.decode($$0))).orElseThrow();
            } else {
               List<jq<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return ju.a($$3);
            }
         }

         public void a(xg $$0x, ju<T> $$1) {
            Optional<ayk<T>> $$2 = $$1.e();
            if ($$2.isPresent()) {
               xm.a($$0, 0);
               alz.b.encode($$0, $$2.get().b());
            } else {
               xm.a($$0, $$1.b() + 1);

               for (jq<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
