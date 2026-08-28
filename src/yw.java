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

public interface yw {
   int a = 65536;
   yy<ByteBuf, Boolean> b = new yy<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   yy<ByteBuf, Byte> c = new yy<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   yy<ByteBuf, Float> d = c.a(azo::a, azo::g);
   yy<ByteBuf, Short> e = new yy<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   yy<ByteBuf, Integer> f = new yy<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readUnsignedShort();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeShort($$1);
      }
   };
   yy<ByteBuf, Integer> g = new yy<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   yy<ByteBuf, Integer> h = new yy<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wr.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wr.a($$0, $$1);
      }
   };
   yy<ByteBuf, OptionalInt> i = h.a($$0 -> $$0 == 0 ? OptionalInt.empty() : OptionalInt.of($$0 - 1), $$0 -> $$0.isPresent() ? $$0.getAsInt() + 1 : 0);
   yy<ByteBuf, Long> j = new yy<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return $$0.readLong();
      }

      public void a(ByteBuf $$0, Long $$1) {
         $$0.writeLong($$1);
      }
   };
   yy<ByteBuf, Long> k = new yy<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return ws.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         ws.a($$0, $$1);
      }
   };
   yy<ByteBuf, Float> l = new yy<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   yy<ByteBuf, Double> m = new yy<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   yy<ByteBuf, byte[]> n = new yy<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return vw.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         vw.a($$0, $$1);
      }
   };
   yy<ByteBuf, long[]> o = new yy<ByteBuf, long[]>() {
      public long[] a(ByteBuf $$0) {
         return vw.b($$0);
      }

      public void a(ByteBuf $$0, long[] $$1) {
         vw.a($$0, $$1);
      }
   };
   yy<ByteBuf, String> p = b(32767);
   yy<ByteBuf, uy> q = a((Supplier<ui>)(() -> ui.a(2097152L)));
   yy<ByteBuf, uy> r = a(ui::a);
   yy<ByteBuf, tz> s = b((Supplier<ui>)(() -> ui.a(2097152L)));
   yy<ByteBuf, tz> t = b(ui::a);
   yy<ByteBuf, Optional<tz>> u = new yy<ByteBuf, Optional<tz>>() {
      public Optional<tz> a(ByteBuf $$0) {
         return Optional.ofNullable(vw.i($$0));
      }

      public void a(ByteBuf $$0, Optional<tz> $$1) {
         vw.a($$0, $$1.orElse(null));
      }
   };
   yy<ByteBuf, Vector3f> v = new yy<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return vw.e($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         vw.a($$0, $$1);
      }
   };
   yy<ByteBuf, Quaternionf> w = new yy<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return vw.f($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         vw.a($$0, $$1);
      }
   };
   yy<ByteBuf, Integer> x = new yy<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return vw.j($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         vw.b($$0, $$1);
      }
   };
   yy<ByteBuf, PropertyMap> y = new yy<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = yw.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = wq.a($$0, 64);
            String $$5 = wq.a($$0, 32767);
            String $$6 = vw.a($$0, (yz<? super ByteBuf, String>)($$0x -> wq.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         yw.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            wq.a($$0, $$2.name(), 64);
            wq.a($$0, $$2.value(), 32767);
            vw.a($$0, $$2.signature(), ($$0x, $$1x) -> wq.a($$0x, $$1x, 1024));
         }
      }
   };
   yy<ByteBuf, GameProfile> z = new yy<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = jz.g.decode($$0);
         String $$2 = wq.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)yw.y.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         jz.g.encode($$0, $$1.getId());
         wq.a($$0, $$1.getName(), 16);
         yw.y.encode($$0, $$1.getProperties());
      }
   };

   static yy<ByteBuf, byte[]> a(final int $$0) {
      return new yy<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return vw.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               vw.a($$0, $$1);
            }
         }
      };
   }

   static yy<ByteBuf, String> b(final int $$0) {
      return new yy<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return wq.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            wq.a($$0, $$1, $$0);
         }
      };
   }

   static yy<ByteBuf, uy> a(final Supplier<ui> $$0) {
      return new yy<ByteBuf, uy>() {
         public uy a(ByteBuf $$0x) {
            uy $$1 = vw.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, uy $$1) {
            if ($$1 == ub.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               vw.a($$0, $$1);
            }
         }
      };
   }

   static yy<ByteBuf, tz> b(Supplier<ui> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof tz) {
            return (tz)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> yy<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, ui::a);
   }

   static <T> yy<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> ui.a(2097152L));
   }

   static <T> yy<ByteBuf, T> a(Codec<T> $$0, Supplier<ui> $$1) {
      return a($$1)
         .a(
            $$1x -> (T)$$0.parse(un.a, $$1x).getOrThrow($$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> (uy)$$0.encodeStart(un.a, $$1x).getOrThrow($$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> yy<wl, T> c(Codec<T> $$0) {
      return b($$0, ui::a);
   }

   static <T> yy<wl, T> d(Codec<T> $$0) {
      return b($$0, () -> ui.a(2097152L));
   }

   static <T> yy<wl, T> b(final Codec<T> $$0, Supplier<ui> $$1) {
      final yy<ByteBuf, uy> $$2 = a($$1);
      return new yy<wl, T>() {
         public T a(wl $$0x) {
            uy $$1 = $$2.decode($$0);
            alg<uy> $$2 = $$0.H().a(un.a);
            return (T)$$0.parse($$2, $$1).getOrThrow($$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(wl $$0x, T $$1) {
            alg<uy> $$2 = $$0.H().a(un.a);
            uy $$3 = (uy)$$0.encodeStart($$2, $$1).getOrThrow($$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> yy<B, Optional<V>> a(final yy<B, V> $$0) {
      return new yy<B, Optional<V>>() {
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
      int $$2 = wr.a($$0);
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
         wr.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yy<B, C> a(IntFunction<C> $$0, yy<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yy<B, C> a(final IntFunction<C> $$0, final yy<? super B, V> $$1, final int $$2) {
      return new yy<B, C>() {
         public C a(B $$0x) {
            int $$1 = yw.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            yw.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yy.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> yy.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> yy.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> yy<B, M> a(IntFunction<? extends M> $$0, yy<? super B, K> $$1, yy<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> yy<B, M> a(
      final IntFunction<? extends M> $$0, final yy<? super B, K> $$1, final yy<? super B, V> $$2, final int $$3
   ) {
      return new yy<B, M>() {
         public void a(B $$0x, M $$1x) {
            yw.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = yw.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> yy<B, Either<L, R>> a(final yy<? super B, L> $$0, final yy<? super B, R> $$1) {
      return new yy<B, Either<L, R>>() {
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

   static <T> yy<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new yy<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = wr.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            wr.a($$0, $$2);
         }
      };
   }

   static <T> yy<ByteBuf, T> a(jk<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> yy<wl, R> a(final alh<? extends js<T>> $$0, final Function<js<T>, jk<R>> $$1) {
      return new yy<wl, R>() {
         private jk<R> b(wl $$0x) {
            return $$1.apply($$0.H().f($$0));
         }

         public R a(wl $$0x) {
            int $$1 = wr.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(wl $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            wr.a($$0, $$2);
         }
      };
   }

   static <T> yy<wl, T> a(alh<? extends js<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> yy<wl, jf<T>> b(alh<? extends js<T>> $$0) {
      return a($$0, js::t);
   }

   static <T> yy<wl, jf<T>> a(final alh<? extends js<T>> $$0, final yy<? super wl, T> $$1) {
      return new yy<wl, jf<T>>() {
         private static final int c = 0;

         private jk<jf<T>> b(wl $$0x) {
            return $$0.H().f($$0).t();
         }

         public jf<T> a(wl $$0x) {
            int $$1 = wr.a($$0);
            return $$1 == 0 ? jf.a($$1.decode($$0)) : (jf)this.b($$0).b($$1 - 1);
         }

         public void a(wl $$0x, jf<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  wr.a($$0, $$2 + 1);
                  break;
               case b:
                  wr.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> yy<wl, jj<T>> c(final alh<? extends js<T>> $$0) {
      return new yy<wl, jj<T>>() {
         private static final int b = -1;
         private final yy<wl, jf<T>> c = yw.b($$0);

         public jj<T> a(wl $$0x) {
            int $$1 = wr.a($$0) - 1;
            if ($$1 == -1) {
               js<T> $$2 = $$0.H().f($$0);
               return $$2.a(axt.a($$0, ali.b.decode($$0))).orElseThrow();
            } else {
               List<jf<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return jj.a($$3);
            }
         }

         public void a(wl $$0x, jj<T> $$1) {
            Optional<axt<T>> $$2 = $$1.e();
            if ($$2.isPresent()) {
               wr.a($$0, 0);
               ali.b.encode($$0, $$2.get().b());
            } else {
               wr.a($$0, $$1.b() + 1);

               for (jf<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
