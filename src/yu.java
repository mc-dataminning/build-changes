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

public interface yu {
   int a = 65536;
   yw<ByteBuf, Boolean> b = new yw<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   yw<ByteBuf, Byte> c = new yw<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   yw<ByteBuf, Float> d = c.a(azm::a, azm::g);
   yw<ByteBuf, Short> e = new yw<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   yw<ByteBuf, Integer> f = new yw<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readUnsignedShort();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeShort($$1);
      }
   };
   yw<ByteBuf, Integer> g = new yw<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   yw<ByteBuf, Integer> h = new yw<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wp.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wp.a($$0, $$1);
      }
   };
   yw<ByteBuf, OptionalInt> i = h.a($$0 -> $$0 == 0 ? OptionalInt.empty() : OptionalInt.of($$0 - 1), $$0 -> $$0.isPresent() ? $$0.getAsInt() + 1 : 0);
   yw<ByteBuf, Long> j = new yw<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return $$0.readLong();
      }

      public void a(ByteBuf $$0, Long $$1) {
         $$0.writeLong($$1);
      }
   };
   yw<ByteBuf, Long> k = new yw<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return wq.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         wq.a($$0, $$1);
      }
   };
   yw<ByteBuf, Float> l = new yw<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   yw<ByteBuf, Double> m = new yw<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   yw<ByteBuf, byte[]> n = new yw<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return vu.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         vu.a($$0, $$1);
      }
   };
   yw<ByteBuf, String> o = b(32767);
   yw<ByteBuf, uw> p = a((Supplier<ui>)(() -> ui.a(2097152L)));
   yw<ByteBuf, uw> q = a(ui::a);
   yw<ByteBuf, tz> r = b((Supplier<ui>)(() -> ui.a(2097152L)));
   yw<ByteBuf, tz> s = b(ui::a);
   yw<ByteBuf, Optional<tz>> t = new yw<ByteBuf, Optional<tz>>() {
      public Optional<tz> a(ByteBuf $$0) {
         return Optional.ofNullable(vu.h($$0));
      }

      public void a(ByteBuf $$0, Optional<tz> $$1) {
         vu.a($$0, $$1.orElse(null));
      }
   };
   yw<ByteBuf, Vector3f> u = new yw<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return vu.d($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         vu.a($$0, $$1);
      }
   };
   yw<ByteBuf, Quaternionf> v = new yw<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return vu.e($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         vu.a($$0, $$1);
      }
   };
   yw<ByteBuf, Integer> w = new yw<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return vu.i($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         vu.b($$0, $$1);
      }
   };
   yw<ByteBuf, PropertyMap> x = new yw<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = yu.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = wo.a($$0, 64);
            String $$5 = wo.a($$0, 32767);
            String $$6 = vu.a($$0, (yx<? super ByteBuf, String>)($$0x -> wo.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         yu.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            wo.a($$0, $$2.name(), 64);
            wo.a($$0, $$2.value(), 32767);
            vu.a($$0, $$2.signature(), ($$0x, $$1x) -> wo.a($$0x, $$1x, 1024));
         }
      }
   };
   yw<ByteBuf, GameProfile> y = new yw<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = jy.g.decode($$0);
         String $$2 = wo.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)yu.x.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         jy.g.encode($$0, $$1.getId());
         wo.a($$0, $$1.getName(), 16);
         yu.x.encode($$0, $$1.getProperties());
      }
   };

   static yw<ByteBuf, byte[]> a(final int $$0) {
      return new yw<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return vu.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               vu.a($$0, $$1);
            }
         }
      };
   }

   static yw<ByteBuf, String> b(final int $$0) {
      return new yw<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return wo.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            wo.a($$0, $$1, $$0);
         }
      };
   }

   static yw<ByteBuf, uw> a(final Supplier<ui> $$0) {
      return new yw<ByteBuf, uw>() {
         public uw a(ByteBuf $$0x) {
            uw $$1 = vu.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, uw $$1) {
            if ($$1 == ub.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               vu.a($$0, $$1);
            }
         }
      };
   }

   static yw<ByteBuf, tz> b(Supplier<ui> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof tz) {
            return (tz)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> yw<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, ui::a);
   }

   static <T> yw<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> ui.a(2097152L));
   }

   static <T> yw<ByteBuf, T> a(Codec<T> $$0, Supplier<ui> $$1) {
      return a($$1)
         .a(
            $$1x -> (T)$$0.parse(un.a, $$1x).getOrThrow($$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> (uw)$$0.encodeStart(un.a, $$1x).getOrThrow($$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> yw<wj, T> c(Codec<T> $$0) {
      return b($$0, ui::a);
   }

   static <T> yw<wj, T> d(Codec<T> $$0) {
      return b($$0, () -> ui.a(2097152L));
   }

   static <T> yw<wj, T> b(final Codec<T> $$0, Supplier<ui> $$1) {
      final yw<ByteBuf, uw> $$2 = a($$1);
      return new yw<wj, T>() {
         public T a(wj $$0x) {
            uw $$1 = $$2.decode($$0);
            ale<uw> $$2 = $$0.H().a(un.a);
            return (T)$$0.parse($$2, $$1).getOrThrow($$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(wj $$0x, T $$1) {
            ale<uw> $$2 = $$0.H().a(un.a);
            uw $$3 = (uw)$$0.encodeStart($$2, $$1).getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> yw<B, Optional<V>> a(final yw<B, V> $$0) {
      return new yw<B, Optional<V>>() {
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
      int $$2 = wp.a($$0);
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
         wp.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yw<B, C> a(IntFunction<C> $$0, yw<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yw<B, C> a(final IntFunction<C> $$0, final yw<? super B, V> $$1, final int $$2) {
      return new yw<B, C>() {
         public C a(B $$0x) {
            int $$1 = yu.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            yu.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yw.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> yw.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> yw.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> yw<B, M> a(IntFunction<? extends M> $$0, yw<? super B, K> $$1, yw<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> yw<B, M> a(
      final IntFunction<? extends M> $$0, final yw<? super B, K> $$1, final yw<? super B, V> $$2, final int $$3
   ) {
      return new yw<B, M>() {
         public void a(B $$0x, M $$1x) {
            yu.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = yu.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> yw<B, Either<L, R>> a(final yw<? super B, L> $$0, final yw<? super B, R> $$1) {
      return new yw<B, Either<L, R>>() {
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

   static <T> yw<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new yw<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = wp.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            wp.a($$0, $$2);
         }
      };
   }

   static <T> yw<ByteBuf, T> a(jj<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> yw<wj, R> a(final alf<? extends jr<T>> $$0, final Function<jr<T>, jj<R>> $$1) {
      return new yw<wj, R>() {
         private jj<R> b(wj $$0x) {
            return $$1.apply($$0.H().f($$0));
         }

         public R a(wj $$0x) {
            int $$1 = wp.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(wj $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            wp.a($$0, $$2);
         }
      };
   }

   static <T> yw<wj, T> a(alf<? extends jr<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> yw<wj, je<T>> b(alf<? extends jr<T>> $$0) {
      return a($$0, jr::t);
   }

   static <T> yw<wj, je<T>> a(final alf<? extends jr<T>> $$0, final yw<? super wj, T> $$1) {
      return new yw<wj, je<T>>() {
         private static final int c = 0;

         private jj<je<T>> b(wj $$0x) {
            return $$0.H().f($$0).t();
         }

         public je<T> a(wj $$0x) {
            int $$1 = wp.a($$0);
            return $$1 == 0 ? je.a($$1.decode($$0)) : (je)this.b($$0).b($$1 - 1);
         }

         public void a(wj $$0x, je<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  wp.a($$0, $$2 + 1);
                  break;
               case b:
                  wp.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> yw<wj, ji<T>> c(final alf<? extends jr<T>> $$0) {
      return new yw<wj, ji<T>>() {
         private static final int b = -1;
         private final yw<wj, je<T>> c = yu.b($$0);

         public ji<T> a(wj $$0x) {
            int $$1 = wp.a($$0) - 1;
            if ($$1 == -1) {
               jr<T> $$2 = $$0.H().f($$0);
               return $$2.a(axr.a($$0, alg.b.decode($$0))).orElseThrow();
            } else {
               List<je<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return ji.a($$3);
            }
         }

         public void a(wj $$0x, ji<T> $$1) {
            Optional<axr<T>> $$2 = $$1.e();
            if ($$2.isPresent()) {
               wp.a($$0, 0);
               alg.b.encode($$0, $$2.get().b());
            } else {
               wp.a($$0, $$1.b() + 1);

               for (je<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
