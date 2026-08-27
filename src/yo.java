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

public interface yo {
   int a = 65536;
   yq<ByteBuf, Boolean> b = new yq<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   yq<ByteBuf, Byte> c = new yq<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   yq<ByteBuf, Short> d = new yq<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   yq<ByteBuf, Integer> e = new yq<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   yq<ByteBuf, Integer> f = new yq<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wj.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wj.a($$0, $$1);
      }
   };
   yq<ByteBuf, Long> g = new yq<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return wk.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         wk.a($$0, $$1);
      }
   };
   yq<ByteBuf, Float> h = new yq<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   yq<ByteBuf, Double> i = new yq<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   yq<ByteBuf, byte[]> j = new yq<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return vs.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         vs.a($$0, $$1);
      }
   };
   yq<ByteBuf, String> k = b(32767);
   yq<ByteBuf, uv> l = a((Supplier<uh>)(() -> uh.a(2097152L)));
   yq<ByteBuf, uv> m = a(uh::a);
   yq<ByteBuf, ty> n = b((Supplier<uh>)(() -> uh.a(2097152L)));
   yq<ByteBuf, ty> o = b(uh::a);
   yq<ByteBuf, Optional<ty>> p = new yq<ByteBuf, Optional<ty>>() {
      public Optional<ty> a(ByteBuf $$0) {
         return Optional.ofNullable(vs.f($$0));
      }

      public void a(ByteBuf $$0, Optional<ty> $$1) {
         vs.a($$0, $$1.orElse(null));
      }
   };
   yq<ByteBuf, Vector3f> q = new yq<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return vs.c($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         vs.a($$0, $$1);
      }
   };
   yq<ByteBuf, Quaternionf> r = new yq<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return vs.d($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         vs.a($$0, $$1);
      }
   };
   yq<ByteBuf, PropertyMap> s = new yq<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = yo.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = wi.a($$0, 64);
            String $$5 = wi.a($$0, 32767);
            String $$6 = vs.a($$0, (yr<? super ByteBuf, String>)($$0x -> wi.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         yo.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            wi.a($$0, $$2.name(), 64);
            wi.a($$0, $$2.value(), 32767);
            vs.a($$0, $$2.signature(), ($$0x, $$1x) -> wi.a($$0x, $$1x, 1024));
         }
      }
   };
   yq<ByteBuf, GameProfile> t = new yq<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = jp.g.decode($$0);
         String $$2 = wi.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)yo.s.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         jp.g.encode($$0, $$1.getId());
         wi.a($$0, $$1.getName(), 16);
         yo.s.encode($$0, $$1.getProperties());
      }
   };

   static yq<ByteBuf, byte[]> a(final int $$0) {
      return new yq<ByteBuf, byte[]>() {
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

   static yq<ByteBuf, String> b(final int $$0) {
      return new yq<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return wi.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            wi.a($$0, $$1, $$0);
         }
      };
   }

   static yq<ByteBuf, uv> a(final Supplier<uh> $$0) {
      return new yq<ByteBuf, uv>() {
         public uv a(ByteBuf $$0x) {
            uv $$1 = vs.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, uv $$1) {
            if ($$1 == ua.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               vs.a($$0, $$1);
            }
         }
      };
   }

   static yq<ByteBuf, ty> b(Supplier<uh> $$0) {
      return a($$0).a($$0x -> {
         if ($$0x instanceof ty) {
            return (ty)$$0x;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> yq<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, uh::a);
   }

   static <T> yq<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> uh.a(2097152L));
   }

   static <T> yq<ByteBuf, T> a(Codec<T> $$0, Supplier<uh> $$1) {
      return a($$1)
         .a(
            $$1x -> ac.a($$0.parse(um.a, $$1x), $$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1x)),
            $$1x -> ac.a($$0.encodeStart(um.a, $$1x), $$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1x))
         );
   }

   static <T> yq<wd, T> c(Codec<T> $$0) {
      return b($$0, uh::a);
   }

   static <T> yq<wd, T> d(Codec<T> $$0) {
      return b($$0, () -> uh.a(2097152L));
   }

   static <T> yq<wd, T> b(final Codec<T> $$0, Supplier<uh> $$1) {
      final yq<ByteBuf, uv> $$2 = a($$1);
      return new yq<wd, T>() {
         public T a(wd $$0x) {
            uv $$1 = $$2.decode($$0);
            akd<uv> $$2 = $$0.G().a(um.a);
            return ac.a($$0.parse($$2, $$1), $$1x -> new DecoderException("Failed to decode: " + $$1x + " " + $$1));
         }

         public void a(wd $$0x, T $$1) {
            akd<uv> $$2 = $$0.G().a(um.a);
            uv $$3 = ac.a($$0.encodeStart($$2, $$1), $$1x -> new EncoderException("Failed to encode: " + $$1x + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> yq<B, Optional<V>> a(final yq<B, V> $$0) {
      return new yq<B, Optional<V>>() {
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
      int $$2 = wj.a($$0);
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
         wj.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yq<B, C> a(IntFunction<C> $$0, yq<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yq<B, C> a(final IntFunction<C> $$0, final yq<? super B, V> $$1, final int $$2) {
      return new yq<B, C>() {
         public C a(B $$0x) {
            int $$1 = yo.a($$0, $$2);
            C $$2 = $$0.apply(Math.min($$1, 65536));

            for (int $$3 = 0; $$3 < $$1; $$3++) {
               $$2.add($$1.decode($$0));
            }

            return $$2;
         }

         public void a(B $$0x, C $$1x) {
            yo.a($$0, $$1.size(), $$2);

            for (V $$2 : $$1) {
               $$1.encode($$0, $$2);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> yq.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> yq.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> yq.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> yq<B, M> a(IntFunction<? extends M> $$0, yq<? super B, K> $$1, yq<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> yq<B, M> a(
      final IntFunction<? extends M> $$0, final yq<? super B, K> $$1, final yq<? super B, V> $$2, final int $$3
   ) {
      return new yq<B, M>() {
         public void a(B $$0x, M $$1x) {
            yo.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1 = yo.a($$0, $$3);
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

   static <B extends ByteBuf, L, R> yq<B, Either<L, R>> a(final yq<? super B, L> $$0, final yq<? super B, R> $$1) {
      return new yq<B, Either<L, R>>() {
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

   static <T> yq<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new yq<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1 = wj.a($$0);
            return $$0.apply($$1);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            wj.a($$0, $$2);
         }
      };
   }

   static <T> yq<ByteBuf, T> a(ja<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> yq<wd, R> a(final ake<? extends ji<T>> $$0, final Function<ji<T>, ja<R>> $$1) {
      return new yq<wd, R>() {
         private ja<R> b(wd $$0x) {
            return $$1.apply($$0.G().d($$0));
         }

         public R a(wd $$0x) {
            int $$1 = wj.a($$0);
            return (R)this.b($$0).b($$1);
         }

         public void a(wd $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            wj.a($$0, $$2);
         }
      };
   }

   static <T> yq<wd, T> a(ake<? extends ji<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> yq<wd, iv<T>> b(ake<? extends ji<T>> $$0) {
      return a($$0, ji::t);
   }

   static <T> yq<wd, iv<T>> a(final ake<? extends ji<T>> $$0, final yq<? super wd, T> $$1) {
      return new yq<wd, iv<T>>() {
         private static final int c = 0;

         private ja<iv<T>> b(wd $$0x) {
            return $$0.G().d($$0).t();
         }

         public iv<T> a(wd $$0x) {
            int $$1 = wj.a($$0);
            return $$1 == 0 ? iv.a($$1.decode($$0)) : (iv)this.b($$0).b($$1 - 1);
         }

         public void a(wd $$0x, iv<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  wj.a($$0, $$2 + 1);
                  break;
               case b:
                  wj.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> yq<wd, iz<T>> c(final ake<? extends ji<T>> $$0) {
      return new yq<wd, iz<T>>() {
         private static final int b = -1;
         private final yq<wd, iv<T>> c = yo.b($$0);

         public iz<T> a(wd $$0x) {
            int $$1 = wj.a($$0) - 1;
            if ($$1 == -1) {
               ji<T> $$2 = $$0.G().d($$0);
               return $$2.b(awd.a($$0, akf.b.decode($$0))).orElseThrow();
            } else {
               List<iv<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return iz.a($$3);
            }
         }

         public void a(wd $$0x, iz<T> $$1) {
            Optional<awd<T>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               wj.a($$0, 0);
               akf.b.encode($$0, $$2.get().b());
            } else {
               wj.a($$0, $$1.b() + 1);

               for (iv<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }
}
