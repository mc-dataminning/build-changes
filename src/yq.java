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

public interface yq {
   int a = 65536;
   ys<ByteBuf, Boolean> b = new ys<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   ys<ByteBuf, Byte> c = new ys<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   ys<ByteBuf, Short> d = new ys<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   ys<ByteBuf, Integer> e = new ys<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   ys<ByteBuf, Integer> f = new ys<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wl.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wl.a($$0, $$1);
      }
   };
   ys<ByteBuf, Long> g = new ys<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return wm.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         wm.a($$0, $$1);
      }
   };
   ys<ByteBuf, Float> h = new ys<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   ys<ByteBuf, Double> i = new ys<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   ys<ByteBuf, byte[]> j = new ys<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return vu.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         vu.a($$0, $$1);
      }
   };
   ys<ByteBuf, String> k = b(32767);
   ys<ByteBuf, ux> l = a((Supplier<uj>)(() -> uj.a(2097152L)));
   ys<ByteBuf, ux> m = a(uj::a);
   ys<ByteBuf, ua> n = b((Supplier<uj>)(() -> uj.a(2097152L)));
   ys<ByteBuf, ua> o = b(uj::a);
   ys<ByteBuf, Optional<ua>> p = new ys<ByteBuf, Optional<ua>>() {
      public Optional<ua> a(ByteBuf $$0) {
         return Optional.ofNullable(vu.f($$0));
      }

      public void a(ByteBuf $$0, Optional<ua> $$1) {
         vu.a($$0, $$1.orElse(null));
      }
   };
   ys<ByteBuf, Vector3f> q = new ys<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return vu.c($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         vu.a($$0, $$1);
      }
   };
   ys<ByteBuf, Quaternionf> r = new ys<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return vu.d($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         vu.a($$0, $$1);
      }
   };
   ys<ByteBuf, PropertyMap> s = new ys<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = yq.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = wk.a($$0, 64);
            String $$5 = wk.a($$0, 32767);
            String $$6 = vu.a($$0, (yt<? super ByteBuf, String>)($$0x -> wk.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         yq.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            wk.a($$0, $$2.name(), 64);
            wk.a($$0, $$2.value(), 32767);
            vu.a($$0, $$2.signature(), ($$0x, $$1x) -> wk.a($$0x, $$1x, 1024));
         }
      }
   };
   ys<ByteBuf, GameProfile> t = new ys<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = jq.g.decode($$0);
         String $$2 = wk.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)yq.s.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         jq.g.encode($$0, $$1.getId());
         wk.a($$0, $$1.getName(), 16);
         yq.s.encode($$0, $$1.getProperties());
      }
   };

   static ys<ByteBuf, byte[]> a(final int $$0) {
      return new ys<ByteBuf, byte[]>() {
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

   static ys<ByteBuf, String> b(final int $$0) {
      return new ys<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return wk.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            wk.a($$0, $$1, $$0);
         }
      };
   }

   static ys<ByteBuf, ux> a(final Supplier<uj> $$0) {
      return new ys<ByteBuf, ux>() {
         public ux a(ByteBuf $$0x) {
            ux $$1 = vu.a($$0, $$0.get());
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
               vu.a($$0, $$1);
            }
         }
      };
   }

   static ys<ByteBuf, ua> b(Supplier<uj> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof ua) {
            return (ua)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> ys<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, uj::a);
   }

   static <T> ys<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> uj.a(2097152L));
   }

   static <T> ys<ByteBuf, T> a(Codec<T> $$0, Supplier<uj> $$1) {
      return a($$1)
         .a(
            $$1x -> ac.a($$0.parse(uo.a, $$1x), $$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> ac.a($$0.encodeStart(uo.a, $$1x), $$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> ys<wf, T> c(Codec<T> $$0) {
      return b($$0, uj::a);
   }

   static <T> ys<wf, T> d(Codec<T> $$0) {
      return b($$0, () -> uj.a(2097152L));
   }

   static <T> ys<wf, T> b(final Codec<T> $$0, Supplier<uj> $$1) {
      final ys<ByteBuf, ux> $$2 = a($$1);
      return new ys<wf, T>() {
         public T a(wf $$0x) {
            ux $$1 = $$2.decode($$0);
            akf<ux> $$2 = $$0.G().a(uo.a);
            return ac.a($$0.parse($$2, $$1), $$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(wf $$0x, T $$1) {
            akf<ux> $$2 = $$0.G().a(uo.a);
            ux $$3 = ac.a($$0.encodeStart($$2, $$1), $$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> ys<B, Optional<V>> a(final ys<B, V> $$0) {
      return new ys<B, Optional<V>>() {
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
      int $$2 = wl.a($$0);
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
         wl.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> ys<B, C> a(IntFunction<C> $$0, ys<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> ys<B, C> a(final IntFunction<C> $$0, final ys<? super B, V> $$1, final int $$2) {
      return new ys<B, C>() {
         public C a(B $$0x) {
            int $$1 = yq.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            yq.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> ys.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> ys.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> ys.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> ys<B, M> a(IntFunction<? extends M> $$0, ys<? super B, K> $$1, ys<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> ys<B, M> a(
      final IntFunction<? extends M> $$0, final ys<? super B, K> $$1, final ys<? super B, V> $$2, final int $$3
   ) {
      return new ys<B, M>() {
         public void a(B $$0x, M $$1x) {
            yq.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = yq.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> ys<B, Either<L, R>> a(final ys<? super B, L> $$0, final ys<? super B, R> $$1) {
      return new ys<B, Either<L, R>>() {
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

   static <T> ys<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new ys<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = wl.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            wl.a($$0, $$2);
         }
      };
   }

   static <T> ys<ByteBuf, T> a(jb<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> ys<wf, R> a(final akg<? extends jj<T>> $$0, final Function<jj<T>, jb<R>> $$1) {
      return new ys<wf, R>() {
         private jb<R> b(wf $$0x) {
            return $$1.apply($$0.G().d($$0));
         }

         public R a(wf $$0x) {
            int $$1 = wl.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(wf $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            wl.a($$0, $$2);
         }
      };
   }

   static <T> ys<wf, T> a(akg<? extends jj<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> ys<wf, iw<T>> b(akg<? extends jj<T>> $$0) {
      return a($$0, jj::t);
   }

   static <T> ys<wf, iw<T>> a(final akg<? extends jj<T>> $$0, final ys<? super wf, T> $$1) {
      return new ys<wf, iw<T>>() {
         private static final int c = 0;

         private jb<iw<T>> b(wf $$0x) {
            return $$0.G().d($$0).t();
         }

         public iw<T> a(wf $$0x) {
            int $$1 = wl.a($$0);
            return $$1 == 0 ? iw.a($$1.decode($$0)) : (iw)this.b($$0).b($$1 - 1);
         }

         public void a(wf $$0x, iw<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  wl.a($$0, $$2 + 1);
                  break;
               case b:
                  wl.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> ys<wf, ja<T>> c(final akg<? extends jj<T>> $$0) {
      return new ys<wf, ja<T>>() {
         private static final int b = -1;
         private final ys<wf, iw<T>> c = yq.b($$0);

         public ja<T> a(wf $$0x) {
            int $$1 = wl.a($$0) - 1;
            if ($$1 == -1) {
               jj<T> $$2 = $$0.G().d($$0);
               return $$2.b(awg.a($$0, akh.b.decode($$0))).orElseThrow();
            } else {
               List<iw<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return ja.a($$3);
            }
         }

         public void a(wf $$0x, ja<T> $$1) {
            Optional<awg<T>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               wl.a($$0, 0);
               akh.b.encode($$0, $$2.get().b());
            } else {
               wl.a($$0, $$1.b() + 1);

               for (iw<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
