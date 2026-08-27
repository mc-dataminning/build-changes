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

public interface yt {
   int a = 65536;
   yv<ByteBuf, Boolean> b = new yv<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   yv<ByteBuf, Byte> c = new yv<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   yv<ByteBuf, Short> d = new yv<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   yv<ByteBuf, Integer> e = new yv<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   yv<ByteBuf, Integer> f = new yv<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wo.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wo.a($$0, $$1);
      }
   };
   yv<ByteBuf, Long> g = new yv<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return wp.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         wp.a($$0, $$1);
      }
   };
   yv<ByteBuf, Float> h = new yv<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   yv<ByteBuf, Double> i = new yv<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   yv<ByteBuf, byte[]> j = new yv<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return vx.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         vx.a($$0, $$1);
      }
   };
   yv<ByteBuf, String> k = b(32767);
   yv<ByteBuf, va> l = a((Supplier<um>)(() -> um.a(2097152L)));
   yv<ByteBuf, va> m = a(um::a);
   yv<ByteBuf, ud> n = b((Supplier<um>)(() -> um.a(2097152L)));
   yv<ByteBuf, ud> o = b(um::a);
   yv<ByteBuf, Optional<ud>> p = new yv<ByteBuf, Optional<ud>>() {
      public Optional<ud> a(ByteBuf $$0) {
         return Optional.ofNullable(vx.f($$0));
      }

      public void a(ByteBuf $$0, Optional<ud> $$1) {
         vx.a($$0, $$1.orElse(null));
      }
   };
   yv<ByteBuf, Vector3f> q = new yv<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return vx.c($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         vx.a($$0, $$1);
      }
   };
   yv<ByteBuf, Quaternionf> r = new yv<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return vx.d($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         vx.a($$0, $$1);
      }
   };
   yv<ByteBuf, PropertyMap> s = new yv<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = yt.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = wn.a($$0, 64);
            String $$5 = wn.a($$0, 32767);
            String $$6 = vx.a($$0, (yw<? super ByteBuf, String>)($$0x -> wn.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         yt.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            wn.a($$0, $$2.name(), 64);
            wn.a($$0, $$2.value(), 32767);
            vx.a($$0, $$2.signature(), ($$0x, $$1x) -> wn.a($$0x, $$1x, 1024));
         }
      }
   };
   yv<ByteBuf, GameProfile> t = new yv<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = jr.g.decode($$0);
         String $$2 = wn.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)yt.s.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         jr.g.encode($$0, $$1.getId());
         wn.a($$0, $$1.getName(), 16);
         yt.s.encode($$0, $$1.getProperties());
      }
   };

   static yv<ByteBuf, byte[]> a(final int $$0) {
      return new yv<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return vx.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               vx.a($$0, $$1);
            }
         }
      };
   }

   static yv<ByteBuf, String> b(final int $$0) {
      return new yv<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return wn.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            wn.a($$0, $$1, $$0);
         }
      };
   }

   static yv<ByteBuf, va> a(final Supplier<um> $$0) {
      return new yv<ByteBuf, va>() {
         public va a(ByteBuf $$0x) {
            va $$1 = vx.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, va $$1) {
            if ($$1 == uf.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               vx.a($$0, $$1);
            }
         }
      };
   }

   static yv<ByteBuf, ud> b(Supplier<um> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof ud) {
            return (ud)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> yv<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, um::a);
   }

   static <T> yv<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> um.a(2097152L));
   }

   static <T> yv<ByteBuf, T> a(Codec<T> $$0, Supplier<um> $$1) {
      return a($$1)
         .a(
            $$1x -> (T)$$0.parse(ur.a, $$1x).getOrThrow($$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> (va)$$0.encodeStart(ur.a, $$1x).getOrThrow($$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> yv<wi, T> c(Codec<T> $$0) {
      return b($$0, um::a);
   }

   static <T> yv<wi, T> d(Codec<T> $$0) {
      return b($$0, () -> um.a(2097152L));
   }

   static <T> yv<wi, T> b(final Codec<T> $$0, Supplier<um> $$1) {
      final yv<ByteBuf, va> $$2 = a($$1);
      return new yv<wi, T>() {
         public T a(wi $$0x) {
            va $$1 = $$2.decode($$0);
            akl<va> $$2 = $$0.G().a(ur.a);
            return (T)$$0.parse($$2, $$1).getOrThrow($$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(wi $$0x, T $$1) {
            akl<va> $$2 = $$0.G().a(ur.a);
            va $$3 = (va)$$0.encodeStart($$2, $$1).getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> yv<B, Optional<V>> a(final yv<B, V> $$0) {
      return new yv<B, Optional<V>>() {
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
      int $$2 = wo.a($$0);
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
         wo.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yv<B, C> a(IntFunction<C> $$0, yv<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yv<B, C> a(final IntFunction<C> $$0, final yv<? super B, V> $$1, final int $$2) {
      return new yv<B, C>() {
         public C a(B $$0x) {
            int $$1 = yt.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            yt.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yv.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> yv.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> yv.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> yv<B, M> a(IntFunction<? extends M> $$0, yv<? super B, K> $$1, yv<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> yv<B, M> a(
      final IntFunction<? extends M> $$0, final yv<? super B, K> $$1, final yv<? super B, V> $$2, final int $$3
   ) {
      return new yv<B, M>() {
         public void a(B $$0x, M $$1x) {
            yt.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = yt.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> yv<B, Either<L, R>> a(final yv<? super B, L> $$0, final yv<? super B, R> $$1) {
      return new yv<B, Either<L, R>>() {
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

   static <T> yv<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new yv<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = wo.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            wo.a($$0, $$2);
         }
      };
   }

   static <T> yv<ByteBuf, T> a(jc<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> yv<wi, R> a(final akm<? extends jk<T>> $$0, final Function<jk<T>, jc<R>> $$1) {
      return new yv<wi, R>() {
         private jc<R> b(wi $$0x) {
            return $$1.apply($$0.G().d($$0));
         }

         public R a(wi $$0x) {
            int $$1 = wo.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(wi $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            wo.a($$0, $$2);
         }
      };
   }

   static <T> yv<wi, T> a(akm<? extends jk<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> yv<wi, ix<T>> b(akm<? extends jk<T>> $$0) {
      return a($$0, jk::t);
   }

   static <T> yv<wi, ix<T>> a(final akm<? extends jk<T>> $$0, final yv<? super wi, T> $$1) {
      return new yv<wi, ix<T>>() {
         private static final int c = 0;

         private jc<ix<T>> b(wi $$0x) {
            return $$0.G().d($$0).t();
         }

         public ix<T> a(wi $$0x) {
            int $$1 = wo.a($$0);
            return $$1 == 0 ? ix.a($$1.decode($$0)) : (ix)this.b($$0).b($$1 - 1);
         }

         public void a(wi $$0x, ix<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  wo.a($$0, $$2 + 1);
                  break;
               case b:
                  wo.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> yv<wi, jb<T>> c(final akm<? extends jk<T>> $$0) {
      return new yv<wi, jb<T>>() {
         private static final int b = -1;
         private final yv<wi, ix<T>> c = yt.b($$0);

         public jb<T> a(wi $$0x) {
            int $$1 = wo.a($$0) - 1;
            if ($$1 == -1) {
               jk<T> $$2 = $$0.G().d($$0);
               return $$2.b(awm.a($$0, akn.b.decode($$0))).orElseThrow();
            } else {
               List<ix<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return jb.a($$3);
            }
         }

         public void a(wi $$0x, jb<T> $$1) {
            Optional<awm<T>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               wo.a($$0, 0);
               akn.b.encode($$0, $$2.get().b());
            } else {
               wo.a($$0, $$1.b() + 1);

               for (ix<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
