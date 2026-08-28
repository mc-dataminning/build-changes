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
   yw<ByteBuf, Short> d = new yw<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   yw<ByteBuf, Integer> e = new yw<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readUnsignedShort();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeShort($$1);
      }
   };
   yw<ByteBuf, Integer> f = new yw<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   yw<ByteBuf, Integer> g = new yw<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wp.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wp.a($$0, $$1);
      }
   };
   yw<ByteBuf, Long> h = new yw<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return wq.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         wq.a($$0, $$1);
      }
   };
   yw<ByteBuf, Float> i = new yw<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   yw<ByteBuf, Double> j = new yw<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   yw<ByteBuf, byte[]> k = new yw<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return vv.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         vv.a($$0, $$1);
      }
   };
   yw<ByteBuf, String> l = b(32767);
   yw<ByteBuf, ux> m = a((Supplier<uj>)(() -> uj.a(2097152L)));
   yw<ByteBuf, ux> n = a(uj::a);
   yw<ByteBuf, ua> o = b((Supplier<uj>)(() -> uj.a(2097152L)));
   yw<ByteBuf, ua> p = b(uj::a);
   yw<ByteBuf, Optional<ua>> q = new yw<ByteBuf, Optional<ua>>() {
      public Optional<ua> a(ByteBuf $$0) {
         return Optional.ofNullable(vv.f($$0));
      }

      public void a(ByteBuf $$0, Optional<ua> $$1) {
         vv.a($$0, $$1.orElse(null));
      }
   };
   yw<ByteBuf, Vector3f> r = new yw<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return vv.c($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         vv.a($$0, $$1);
      }
   };
   yw<ByteBuf, Quaternionf> s = new yw<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return vv.d($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         vv.a($$0, $$1);
      }
   };
   yw<ByteBuf, PropertyMap> t = new yw<ByteBuf, PropertyMap>() {
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
            String $$6 = vv.a($$0, (yx<? super ByteBuf, String>)($$0x -> wo.a($$0x, 1024)));
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
            vv.a($$0, $$2.signature(), ($$0x, $$1x) -> wo.a($$0x, $$1x, 1024));
         }
      }
   };
   yw<ByteBuf, GameProfile> u = new yw<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = kg.g.decode($$0);
         String $$2 = wo.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)yu.t.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         kg.g.encode($$0, $$1.getId());
         wo.a($$0, $$1.getName(), 16);
         yu.t.encode($$0, $$1.getProperties());
      }
   };

   static yw<ByteBuf, byte[]> a(final int $$0) {
      return new yw<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return vv.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               vv.a($$0, $$1);
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

   static yw<ByteBuf, ux> a(final Supplier<uj> $$0) {
      return new yw<ByteBuf, ux>() {
         public ux a(ByteBuf $$0x) {
            ux $$1 = vv.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, ux $$1) {
            if ($$1 == uc.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               vv.a($$0, $$1);
            }
         }
      };
   }

   static yw<ByteBuf, ua> b(Supplier<uj> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof ua) {
            return (ua)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> yw<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, uj::a);
   }

   static <T> yw<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> uj.a(2097152L));
   }

   static <T> yw<ByteBuf, T> a(Codec<T> $$0, Supplier<uj> $$1) {
      return a($$1)
         .a(
            $$1x -> (T)$$0.parse(uo.a, $$1x).getOrThrow($$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> (ux)$$0.encodeStart(uo.a, $$1x).getOrThrow($$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> yw<wj, T> c(Codec<T> $$0) {
      return b($$0, uj::a);
   }

   static <T> yw<wj, T> d(Codec<T> $$0) {
      return b($$0, () -> uj.a(2097152L));
   }

   static <T> yw<wj, T> b(final Codec<T> $$0, Supplier<uj> $$1) {
      final yw<ByteBuf, ux> $$2 = a($$1);
      return new yw<wj, T>() {
         public T a(wj $$0x) {
            ux $$1 = $$2.decode($$0);
            ako<ux> $$2 = $$0.G().a(uo.a);
            return (T)$$0.parse($$2, $$1).getOrThrow($$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(wj $$0x, T $$1) {
            ako<ux> $$2 = $$0.G().a(uo.a);
            ux $$3 = (ux)$$0.encodeStart($$2, $$1).getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
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

   static <T> yw<ByteBuf, T> a(jr<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> yw<wj, R> a(final akp<? extends jz<T>> $$0, final Function<jz<T>, jr<R>> $$1) {
      return new yw<wj, R>() {
         private jr<R> b(wj $$0x) {
            return $$1.apply($$0.G().d($$0));
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

   static <T> yw<wj, T> a(akp<? extends jz<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> yw<wj, jm<T>> b(akp<? extends jz<T>> $$0) {
      return a($$0, jz::u);
   }

   static <T> yw<wj, jm<T>> a(final akp<? extends jz<T>> $$0, final yw<? super wj, T> $$1) {
      return new yw<wj, jm<T>>() {
         private static final int c = 0;

         private jr<jm<T>> b(wj $$0x) {
            return $$0.G().d($$0).u();
         }

         public jm<T> a(wj $$0x) {
            int $$1 = wp.a($$0);
            return $$1 == 0 ? jm.a($$1.decode($$0)) : (jm)this.b($$0).b($$1 - 1);
         }

         public void a(wj $$0x, jm<T> $$1x) {
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

   static <T> yw<wj, jq<T>> c(final akp<? extends jz<T>> $$0) {
      return new yw<wj, jq<T>>() {
         private static final int b = -1;
         private final yw<wj, jm<T>> c = yu.b($$0);

         public jq<T> a(wj $$0x) {
            int $$1 = wp.a($$0) - 1;
            if ($$1 == -1) {
               jz<T> $$2 = $$0.G().d($$0);
               return $$2.b(awt.a($$0, akq.b.decode($$0))).orElseThrow();
            } else {
               List<jm<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return jq.a($$3);
            }
         }

         public void a(wj $$0x, jq<T> $$1) {
            Optional<awt<T>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               wp.a($$0, 0);
               akq.b.encode($$0, $$2.get().b());
            } else {
               wp.a($$0, $$1.b() + 1);

               for (jm<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
