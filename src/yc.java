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

public interface yc {
   int a = 65536;
   ye<ByteBuf, Boolean> b = new ye<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   ye<ByteBuf, Byte> c = new ye<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   ye<ByteBuf, Short> d = new ye<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   ye<ByteBuf, Integer> e = new ye<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   ye<ByteBuf, Integer> f = new ye<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return vx.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         vx.a($$0, $$1);
      }
   };
   ye<ByteBuf, Long> g = new ye<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return vy.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         vy.a($$0, $$1);
      }
   };
   ye<ByteBuf, Float> h = new ye<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   ye<ByteBuf, Double> i = new ye<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   ye<ByteBuf, byte[]> j = new ye<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return vg.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         vg.a($$0, $$1);
      }
   };
   ye<ByteBuf, String> k = b(32767);
   ye<ByteBuf, uj> l = a((Supplier<tv>)(() -> tv.a(2097152L)));
   ye<ByteBuf, uj> m = a(tv::a);
   ye<ByteBuf, tm> n = b((Supplier<tv>)(() -> tv.a(2097152L)));
   ye<ByteBuf, tm> o = b(tv::a);
   ye<ByteBuf, Optional<tm>> p = new ye<ByteBuf, Optional<tm>>() {
      public Optional<tm> a(ByteBuf $$0) {
         return Optional.ofNullable(vg.f($$0));
      }

      public void a(ByteBuf $$0, Optional<tm> $$1) {
         vg.a($$0, $$1.orElse(null));
      }
   };
   ye<ByteBuf, Vector3f> q = new ye<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return vg.c($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         vg.a($$0, $$1);
      }
   };
   ye<ByteBuf, Quaternionf> r = new ye<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return vg.d($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         vg.a($$0, $$1);
      }
   };
   ye<ByteBuf, PropertyMap> s = new ye<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = yc.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = vw.a($$0, 64);
            String $$5 = vw.a($$0, 32767);
            String $$6 = vg.a($$0, (yf<? super ByteBuf, String>)($$0x -> vw.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         yc.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            vw.a($$0, $$2.name(), 64);
            vw.a($$0, $$2.value(), 32767);
            vg.a($$0, $$2.signature(), ($$0x, $$1x) -> vw.a($$0x, $$1x, 1024));
         }
      }
   };
   ye<ByteBuf, GameProfile> t = new ye<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = jf.g.decode($$0);
         String $$2 = vw.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)yc.s.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         jf.g.encode($$0, $$1.getId());
         vw.a($$0, $$1.getName(), 16);
         yc.s.encode($$0, $$1.getProperties());
      }
   };

   static ye<ByteBuf, byte[]> a(final int $$0) {
      return new ye<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return vg.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               vg.a($$0, $$1);
            }
         }
      };
   }

   static ye<ByteBuf, String> b(final int $$0) {
      return new ye<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return vw.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            vw.a($$0, $$1, $$0);
         }
      };
   }

   static ye<ByteBuf, uj> a(final Supplier<tv> $$0) {
      return new ye<ByteBuf, uj>() {
         public uj a(ByteBuf $$0x) {
            uj $$1 = vg.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, uj $$1) {
            if ($$1 == to.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               vg.a($$0, $$1);
            }
         }
      };
   }

   static ye<ByteBuf, tm> b(Supplier<tv> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof tm) {
            return (tm)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> ye<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, tv::a);
   }

   static <T> ye<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> tv.a(2097152L));
   }

   static <T> ye<ByteBuf, T> a(Codec<T> $$0, Supplier<tv> $$1) {
      return a($$1)
         .a(
            $$1x -> ac.a($$0.parse(ua.a, $$1x), $$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> ac.a($$0.encodeStart(ua.a, $$1x), $$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> ye<vr, T> c(Codec<T> $$0) {
      return b($$0, tv::a);
   }

   static <T> ye<vr, T> d(Codec<T> $$0) {
      return b($$0, () -> tv.a(2097152L));
   }

   static <T> ye<vr, T> b(final Codec<T> $$0, Supplier<tv> $$1) {
      final ye<ByteBuf, uj> $$2 = a($$1);
      return new ye<vr, T>() {
         public T a(vr $$0x) {
            uj $$1 = $$2.decode($$0);
            ajr<uj> $$2 = $$0.G().a(ua.a);
            return ac.a($$0.parse($$2, $$1), $$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(vr $$0x, T $$1) {
            ajr<uj> $$2 = $$0.G().a(ua.a);
            uj $$3 = ac.a($$0.encodeStart($$2, $$1), $$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> ye<B, Optional<V>> a(final ye<B, V> $$0) {
      return new ye<B, Optional<V>>() {
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
      int $$2 = vx.a($$0);
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
         vx.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> ye<B, C> a(IntFunction<C> $$0, ye<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> ye<B, C> a(final IntFunction<C> $$0, final ye<? super B, V> $$1, final int $$2) {
      return new ye<B, C>() {
         public C a(B $$0x) {
            int $$1 = yc.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            yc.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> ye.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> ye.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> ye.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> ye<B, M> a(IntFunction<? extends M> $$0, ye<? super B, K> $$1, ye<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> ye<B, M> a(
      final IntFunction<? extends M> $$0, final ye<? super B, K> $$1, final ye<? super B, V> $$2, final int $$3
   ) {
      return new ye<B, M>() {
         public void a(B $$0x, M $$1x) {
            yc.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = yc.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> ye<B, Either<L, R>> a(final ye<? super B, L> $$0, final ye<? super B, R> $$1) {
      return new ye<B, Either<L, R>>() {
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

   static <T> ye<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new ye<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = vx.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            vx.a($$0, $$2);
         }
      };
   }

   static <T> ye<ByteBuf, T> a(iq<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> ye<vr, R> a(final ajs<? extends iy<T>> $$0, final Function<iy<T>, iq<R>> $$1) {
      return new ye<vr, R>() {
         private iq<R> b(vr $$0x) {
            return $$1.apply($$0.G().d($$0));
         }

         public R a(vr $$0x) {
            int $$1 = vx.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(vr $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            vx.a($$0, $$2);
         }
      };
   }

   static <T> ye<vr, T> a(ajs<? extends iy<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> ye<vr, il<T>> b(ajs<? extends iy<T>> $$0) {
      return a($$0, iy::t);
   }

   static <T> ye<vr, il<T>> a(final ajs<? extends iy<T>> $$0, final ye<? super vr, T> $$1) {
      return new ye<vr, il<T>>() {
         private static final int c = 0;

         private iq<il<T>> b(vr $$0x) {
            return $$0.G().d($$0).t();
         }

         public il<T> a(vr $$0x) {
            int $$1 = vx.a($$0);
            return $$1 == 0 ? il.a($$1.decode($$0)) : (il)this.b($$0).b($$1 - 1);
         }

         public void a(vr $$0x, il<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  vx.a($$0, $$2 + 1);
                  break;
               case b:
                  vx.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> ye<vr, ip<T>> c(final ajs<? extends iy<T>> $$0) {
      return new ye<vr, ip<T>>() {
         private static final int b = -1;
         private final ye<vr, il<T>> c = yc.b($$0);

         public ip<T> a(vr $$0x) {
            int $$1 = vx.a($$0) - 1;
            if ($$1 == -1) {
               iy<T> $$2 = $$0.G().d($$0);
               return $$2.b(avr.a($$0, ajt.b.decode($$0))).orElseThrow();
            } else {
               List<il<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return ip.a($$3);
            }
         }

         public void a(vr $$0x, ip<T> $$1) {
            Optional<avr<T>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               vx.a($$0, 0);
               ajt.b.encode($$0, $$2.get().b());
            } else {
               vx.a($$0, $$1.b() + 1);

               for (il<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
