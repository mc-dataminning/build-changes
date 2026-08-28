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

public interface ys {
   int a = 65536;
   yu<ByteBuf, Boolean> b = new yu<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   yu<ByteBuf, Byte> c = new yu<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   yu<ByteBuf, Float> d = c.a(azk::a, azk::g);
   yu<ByteBuf, Short> e = new yu<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   yu<ByteBuf, Integer> f = new yu<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readUnsignedShort();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeShort($$1);
      }
   };
   yu<ByteBuf, Integer> g = new yu<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   yu<ByteBuf, Integer> h = new yu<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wn.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wn.a($$0, $$1);
      }
   };
   yu<ByteBuf, OptionalInt> i = h.a($$0 -> $$0 == 0 ? OptionalInt.empty() : OptionalInt.of($$0 - 1), $$0 -> $$0.isPresent() ? $$0.getAsInt() + 1 : 0);
   yu<ByteBuf, Long> j = new yu<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return $$0.readLong();
      }

      public void a(ByteBuf $$0, Long $$1) {
         $$0.writeLong($$1);
      }
   };
   yu<ByteBuf, Long> k = new yu<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return wo.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         wo.a($$0, $$1);
      }
   };
   yu<ByteBuf, Float> l = new yu<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   yu<ByteBuf, Double> m = new yu<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   yu<ByteBuf, byte[]> n = new yu<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return vs.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         vs.a($$0, $$1);
      }
   };
   yu<ByteBuf, String> o = b(32767);
   yu<ByteBuf, uu> p = a((Supplier<ug>)(() -> ug.a(2097152L)));
   yu<ByteBuf, uu> q = a(ug::a);
   yu<ByteBuf, tx> r = b((Supplier<ug>)(() -> ug.a(2097152L)));
   yu<ByteBuf, tx> s = b(ug::a);
   yu<ByteBuf, Optional<tx>> t = new yu<ByteBuf, Optional<tx>>() {
      public Optional<tx> a(ByteBuf $$0) {
         return Optional.ofNullable(vs.h($$0));
      }

      public void a(ByteBuf $$0, Optional<tx> $$1) {
         vs.a($$0, $$1.orElse(null));
      }
   };
   yu<ByteBuf, Vector3f> u = new yu<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return vs.d($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         vs.a($$0, $$1);
      }
   };
   yu<ByteBuf, Quaternionf> v = new yu<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return vs.e($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         vs.a($$0, $$1);
      }
   };
   yu<ByteBuf, Integer> w = new yu<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return vs.i($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         vs.b($$0, $$1);
      }
   };
   yu<ByteBuf, PropertyMap> x = new yu<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = ys.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = wm.a($$0, 64);
            String $$5 = wm.a($$0, 32767);
            String $$6 = vs.a($$0, (yv<? super ByteBuf, String>)($$0x -> wm.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         ys.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            wm.a($$0, $$2.name(), 64);
            wm.a($$0, $$2.value(), 32767);
            vs.a($$0, $$2.signature(), ($$0x, $$1x) -> wm.a($$0x, $$1x, 1024));
         }
      }
   };
   yu<ByteBuf, GameProfile> y = new yu<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = jy.g.decode($$0);
         String $$2 = wm.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)ys.x.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         jy.g.encode($$0, $$1.getId());
         wm.a($$0, $$1.getName(), 16);
         ys.x.encode($$0, $$1.getProperties());
      }
   };

   static yu<ByteBuf, byte[]> a(final int $$0) {
      return new yu<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return vs.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               vs.a($$0, $$1);
            }
         }
      };
   }

   static yu<ByteBuf, String> b(final int $$0) {
      return new yu<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return wm.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            wm.a($$0, $$1, $$0);
         }
      };
   }

   static yu<ByteBuf, uu> a(final Supplier<ug> $$0) {
      return new yu<ByteBuf, uu>() {
         public uu a(ByteBuf $$0x) {
            uu $$1 = vs.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, uu $$1) {
            if ($$1 == tz.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               vs.a($$0, $$1);
            }
         }
      };
   }

   static yu<ByteBuf, tx> b(Supplier<ug> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof tx) {
            return (tx)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> yu<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, ug::a);
   }

   static <T> yu<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> ug.a(2097152L));
   }

   static <T> yu<ByteBuf, T> a(Codec<T> $$0, Supplier<ug> $$1) {
      return a($$1)
         .a(
            $$1x -> (T)$$0.parse(ul.a, $$1x).getOrThrow($$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> (uu)$$0.encodeStart(ul.a, $$1x).getOrThrow($$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> yu<wh, T> c(Codec<T> $$0) {
      return b($$0, ug::a);
   }

   static <T> yu<wh, T> d(Codec<T> $$0) {
      return b($$0, () -> ug.a(2097152L));
   }

   static <T> yu<wh, T> b(final Codec<T> $$0, Supplier<ug> $$1) {
      final yu<ByteBuf, uu> $$2 = a($$1);
      return new yu<wh, T>() {
         public T a(wh $$0x) {
            uu $$1 = $$2.decode($$0);
            alc<uu> $$2 = $$0.H().a(ul.a);
            return (T)$$0.parse($$2, $$1).getOrThrow($$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(wh $$0x, T $$1) {
            alc<uu> $$2 = $$0.H().a(ul.a);
            uu $$3 = (uu)$$0.encodeStart($$2, $$1).getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> yu<B, Optional<V>> a(final yu<B, V> $$0) {
      return new yu<B, Optional<V>>() {
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
      int $$2 = wn.a($$0);
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
         wn.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yu<B, C> a(IntFunction<C> $$0, yu<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yu<B, C> a(final IntFunction<C> $$0, final yu<? super B, V> $$1, final int $$2) {
      return new yu<B, C>() {
         public C a(B $$0x) {
            int $$1 = ys.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            ys.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yu.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> yu.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> yu.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> yu<B, M> a(IntFunction<? extends M> $$0, yu<? super B, K> $$1, yu<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> yu<B, M> a(
      final IntFunction<? extends M> $$0, final yu<? super B, K> $$1, final yu<? super B, V> $$2, final int $$3
   ) {
      return new yu<B, M>() {
         public void a(B $$0x, M $$1x) {
            ys.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = ys.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> yu<B, Either<L, R>> a(final yu<? super B, L> $$0, final yu<? super B, R> $$1) {
      return new yu<B, Either<L, R>>() {
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

   static <T> yu<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new yu<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = wn.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            wn.a($$0, $$2);
         }
      };
   }

   static <T> yu<ByteBuf, T> a(jj<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> yu<wh, R> a(final ald<? extends jr<T>> $$0, final Function<jr<T>, jj<R>> $$1) {
      return new yu<wh, R>() {
         private jj<R> b(wh $$0x) {
            return $$1.apply($$0.H().f($$0));
         }

         public R a(wh $$0x) {
            int $$1 = wn.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(wh $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            wn.a($$0, $$2);
         }
      };
   }

   static <T> yu<wh, T> a(ald<? extends jr<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> yu<wh, je<T>> b(ald<? extends jr<T>> $$0) {
      return a($$0, jr::t);
   }

   static <T> yu<wh, je<T>> a(final ald<? extends jr<T>> $$0, final yu<? super wh, T> $$1) {
      return new yu<wh, je<T>>() {
         private static final int c = 0;

         private jj<je<T>> b(wh $$0x) {
            return $$0.H().f($$0).t();
         }

         public je<T> a(wh $$0x) {
            int $$1 = wn.a($$0);
            return $$1 == 0 ? je.a($$1.decode($$0)) : (je)this.b($$0).b($$1 - 1);
         }

         public void a(wh $$0x, je<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  wn.a($$0, $$2 + 1);
                  break;
               case b:
                  wn.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> yu<wh, ji<T>> c(final ald<? extends jr<T>> $$0) {
      return new yu<wh, ji<T>>() {
         private static final int b = -1;
         private final yu<wh, je<T>> c = ys.b($$0);

         public ji<T> a(wh $$0x) {
            int $$1 = wn.a($$0) - 1;
            if ($$1 == -1) {
               jr<T> $$2 = $$0.H().f($$0);
               return $$2.a(axp.a($$0, ale.b.decode($$0))).orElseThrow();
            } else {
               List<je<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return ji.a($$3);
            }
         }

         public void a(wh $$0x, ji<T> $$1) {
            Optional<axp<T>> $$2 = $$1.e();
            if ($$2.isPresent()) {
               wn.a($$0, 0);
               ale.b.encode($$0, $$2.get().b());
            } else {
               wn.a($$0, $$1.b() + 1);

               for (je<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
