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

public interface ye {
   int a = 65536;
   yg<ByteBuf, Boolean> b = new yg<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   yg<ByteBuf, Byte> c = new yg<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   yg<ByteBuf, Short> d = new yg<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   yg<ByteBuf, Integer> e = new yg<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   yg<ByteBuf, Integer> f = new yg<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return vz.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         vz.a($$0, $$1);
      }
   };
   yg<ByteBuf, Long> g = new yg<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return wa.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         wa.a($$0, $$1);
      }
   };
   yg<ByteBuf, Float> h = new yg<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   yg<ByteBuf, Double> i = new yg<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   yg<ByteBuf, byte[]> j = new yg<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return vi.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         vi.a($$0, $$1);
      }
   };
   yg<ByteBuf, String> k = b(32767);
   yg<ByteBuf, ul> l = a((Supplier<tx>)(() -> tx.a(2097152L)));
   yg<ByteBuf, ul> m = a(tx::a);
   yg<ByteBuf, to> n = b((Supplier<tx>)(() -> tx.a(2097152L)));
   yg<ByteBuf, to> o = b(tx::a);
   yg<ByteBuf, Optional<to>> p = new yg<ByteBuf, Optional<to>>() {
      public Optional<to> a(ByteBuf $$0) {
         return Optional.ofNullable(vi.f($$0));
      }

      public void a(ByteBuf $$0, Optional<to> $$1) {
         vi.a($$0, $$1.orElse(null));
      }
   };
   yg<ByteBuf, Vector3f> q = new yg<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return vi.c($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         vi.a($$0, $$1);
      }
   };
   yg<ByteBuf, Quaternionf> r = new yg<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return vi.d($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         vi.a($$0, $$1);
      }
   };
   yg<ByteBuf, PropertyMap> s = new yg<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = ye.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = vy.a($$0, 64);
            String $$5 = vy.a($$0, 32767);
            String $$6 = vi.a($$0, (yh<? super ByteBuf, String>)($$0x -> vy.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         ye.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            vy.a($$0, $$2.name(), 64);
            vy.a($$0, $$2.value(), 32767);
            vi.a($$0, $$2.signature(), ($$0x, $$1x) -> vy.a($$0x, $$1x, 1024));
         }
      }
   };
   yg<ByteBuf, GameProfile> t = new yg<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = jh.g.decode($$0);
         String $$2 = vy.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)ye.s.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         jh.g.encode($$0, $$1.getId());
         vy.a($$0, $$1.getName(), 16);
         ye.s.encode($$0, $$1.getProperties());
      }
   };

   static yg<ByteBuf, byte[]> a(final int $$0) {
      return new yg<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return vi.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               vi.a($$0, $$1);
            }
         }
      };
   }

   static yg<ByteBuf, String> b(final int $$0) {
      return new yg<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return vy.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            vy.a($$0, $$1, $$0);
         }
      };
   }

   static yg<ByteBuf, ul> a(final Supplier<tx> $$0) {
      return new yg<ByteBuf, ul>() {
         public ul a(ByteBuf $$0x) {
            ul $$1 = vi.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, ul $$1) {
            if ($$1 == tq.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               vi.a($$0, $$1);
            }
         }
      };
   }

   static yg<ByteBuf, to> b(Supplier<tx> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof to) {
            return (to)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> yg<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, tx::a);
   }

   static <T> yg<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> tx.a(2097152L));
   }

   static <T> yg<ByteBuf, T> a(Codec<T> $$0, Supplier<tx> $$1) {
      return a($$1)
         .a(
            $$1x -> ac.a($$0.parse(uc.a, $$1x), $$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> ac.a($$0.encodeStart(uc.a, $$1x), $$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> yg<vt, T> c(Codec<T> $$0) {
      return b($$0, tx::a);
   }

   static <T> yg<vt, T> d(Codec<T> $$0) {
      return b($$0, () -> tx.a(2097152L));
   }

   static <T> yg<vt, T> b(final Codec<T> $$0, Supplier<tx> $$1) {
      final yg<ByteBuf, ul> $$2 = a($$1);
      return new yg<vt, T>() {
         public T a(vt $$0x) {
            ul $$1 = $$2.decode($$0);
            ajt<ul> $$2 = $$0.G().a(uc.a);
            return ac.a($$0.parse($$2, $$1), $$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(vt $$0x, T $$1) {
            ajt<ul> $$2 = $$0.G().a(uc.a);
            ul $$3 = ac.a($$0.encodeStart($$2, $$1), $$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> yg<B, Optional<V>> a(final yg<B, V> $$0) {
      return new yg<B, Optional<V>>() {
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
      int $$2 = vz.a($$0);
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
         vz.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yg<B, C> a(IntFunction<C> $$0, yg<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yg<B, C> a(final IntFunction<C> $$0, final yg<? super B, V> $$1, final int $$2) {
      return new yg<B, C>() {
         public C a(B $$0x) {
            int $$1 = ye.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            ye.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yg.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> yg.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> yg.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> yg<B, M> a(IntFunction<? extends M> $$0, yg<? super B, K> $$1, yg<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> yg<B, M> a(
      final IntFunction<? extends M> $$0, final yg<? super B, K> $$1, final yg<? super B, V> $$2, final int $$3
   ) {
      return new yg<B, M>() {
         public void a(B $$0x, M $$1x) {
            ye.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = ye.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> yg<B, Either<L, R>> a(final yg<? super B, L> $$0, final yg<? super B, R> $$1) {
      return new yg<B, Either<L, R>>() {
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

   static <T> yg<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new yg<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = vz.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            vz.a($$0, $$2);
         }
      };
   }

   static <T> yg<ByteBuf, T> a(is<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> yg<vt, R> a(final aju<? extends ja<T>> $$0, final Function<ja<T>, is<R>> $$1) {
      return new yg<vt, R>() {
         private is<R> b(vt $$0x) {
            return $$1.apply($$0.G().d($$0));
         }

         public R a(vt $$0x) {
            int $$1 = vz.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(vt $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            vz.a($$0, $$2);
         }
      };
   }

   static <T> yg<vt, T> a(aju<? extends ja<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> yg<vt, in<T>> b(aju<? extends ja<T>> $$0) {
      return a($$0, ja::t);
   }

   static <T> yg<vt, in<T>> a(final aju<? extends ja<T>> $$0, final yg<? super vt, T> $$1) {
      return new yg<vt, in<T>>() {
         private static final int c = 0;

         private is<in<T>> b(vt $$0x) {
            return $$0.G().d($$0).t();
         }

         public in<T> a(vt $$0x) {
            int $$1 = vz.a($$0);
            return $$1 == 0 ? in.a($$1.decode($$0)) : (in)this.b($$0).b($$1 - 1);
         }

         public void a(vt $$0x, in<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  vz.a($$0, $$2 + 1);
                  break;
               case b:
                  vz.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> yg<vt, ir<T>> c(final aju<? extends ja<T>> $$0) {
      return new yg<vt, ir<T>>() {
         private static final int b = -1;
         private final yg<vt, in<T>> c = ye.b($$0);

         public ir<T> a(vt $$0x) {
            int $$1 = vz.a($$0) - 1;
            if ($$1 == -1) {
               ja<T> $$2 = $$0.G().d($$0);
               return $$2.b(avt.a($$0, ajv.b.decode($$0))).orElseThrow();
            } else {
               List<in<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return ir.a($$3);
            }
         }

         public void a(vt $$0x, ir<T> $$1) {
            Optional<avt<T>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               vz.a($$0, 0);
               ajv.b.encode($$0, $$2.get().b());
            } else {
               vz.a($$0, $$1.b() + 1);

               for (in<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
