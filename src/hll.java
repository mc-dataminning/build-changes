import com.google.common.base.Suppliers;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record hll(List<ali> d, ali e, Map<String, ali> f, String g) implements hlf {
   static final Logger h = LogUtils.getLogger();
   public static final String b = "_";
   public static final MapCodec<hll> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.list(ali.a).fieldOf("textures").forGetter(hll::b),
               ali.a.fieldOf("palette_key").forGetter(hll::c),
               Codec.unboundedMap(Codec.STRING, ali.a).fieldOf("permutations").forGetter(hll::d),
               Codec.STRING.optionalFieldOf("separator", "_").forGetter(hll::e)
            )
            .apply($$0, hll::new)
   );

   public hll(List<ali> $$0, ali $$1, Map<String, ali> $$2) {
      this($$0, $$1, $$2, "_");
   }

   @Override
   public void a(avf $$0, hlf.a $$1) {
      Supplier<int[]> $$2 = Suppliers.memoize(() -> a($$0, this.e));
      Map<String, Supplier<IntUnaryOperator>> $$3 = new HashMap<>();
      this.f.forEach(($$3x, $$4x) -> $$3.put($$3x, Suppliers.memoize(() -> a($$2.get(), a($$0, $$4x)))));

      for (ali $$4 : this.d) {
         ali $$5 = a.a($$4);
         Optional<avd> $$6 = $$0.getResource($$5);
         if ($$6.isEmpty()) {
            h.warn("Unable to find texture {}", $$5);
         } else {
            hlk $$7 = new hlk($$5, $$6.get(), $$3.size());

            for (Entry<String, Supplier<IntUnaryOperator>> $$8 : $$3.entrySet()) {
               ali $$9 = $$4.g(this.g + $$8.getKey());
               $$1.a($$9, new hll.a($$7, $$8.getValue(), $$9));
            }
         }
      }
   }

   private static IntUnaryOperator a(int[] $$0, int[] $$1) {
      if ($$1.length != $$0.length) {
         h.warn("Palette mapping has different sizes: {} and {}", $$0.length, $$1.length);
         throw new IllegalArgumentException();
      } else {
         Int2IntMap $$2 = new Int2IntOpenHashMap($$1.length);

         for (int $$3 = 0; $$3 < $$0.length; $$3++) {
            int $$4 = $$0[$$3];
            if (axy.a($$4) != 0) {
               $$2.put(axy.g($$4), $$1[$$3]);
            }
         }

         return $$1x -> {
            int $$2x = axy.a($$1x);
            if ($$2x == 0) {
               return $$1x;
            } else {
               int $$3x = axy.g($$1x);
               int $$4x = $$2.getOrDefault($$3x, axy.f($$3x));
               int $$5 = axy.a($$4x);
               return axy.c($$2x * $$5 / 255, $$4x);
            }
         };
      }
   }

   private static int[] a(avf $$0, ali $$1) {
      Optional<avd> $$2 = $$0.getResource(a.a($$1));
      if ($$2.isEmpty()) {
         h.error("Failed to load palette image {}", $$1);
         throw new IllegalArgumentException();
      } else {
         try {
            int[] var5;
            try (
               InputStream $$3 = $$2.get().d();
               fkg $$4 = fkg.a($$3);
            ) {
               var5 = $$4.e();
            }

            return var5;
         } catch (Exception var11) {
            h.error("Couldn't load texture {}", $$1, var11);
            throw new IllegalArgumentException();
         }
      }
   }

   @Override
   public MapCodec<hll> a() {
      return c;
   }

   public List<ali> b() {
      return this.d;
   }

   public ali c() {
      return this.e;
   }

   public Map<String, ali> d() {
      return this.f;
   }

   public String e() {
      return this.g;
   }

   static record a(hlk a, Supplier<IntUnaryOperator> b, ali c) implements hlf.b {
      @Nullable
      public hku a(hle $$0) {
         Object var3;
         try {
            fkg $$1 = this.a.a().a(this.b.get());
            return new hku(this.c, new hmo($$1.a(), $$1.b()), $$1, avh.a);
         } catch (IllegalArgumentException | IOException var7) {
            hll.h.error("unable to apply palette to {}", this.c, var7);
            var3 = null;
         } finally {
            this.a.b();
         }

         return (hku)var3;
      }

      @Override
      public void a() {
         this.a.b();
      }

      public hlk b() {
         return this.a;
      }

      public Supplier<IntUnaryOperator> c() {
         return this.b;
      }

      public ali d() {
         return this.c;
      }
   }
}
