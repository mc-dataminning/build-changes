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

public class hbw implements hbp {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<hbw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.list(alz.a).fieldOf("textures").forGetter($$0x -> $$0x.d),
               alz.a.fieldOf("palette_key").forGetter($$0x -> $$0x.f),
               Codec.unboundedMap(Codec.STRING, alz.a).fieldOf("permutations").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, hbw::new)
   );
   private final List<alz> d;
   private final Map<String, alz> e;
   private final alz f;

   private hbw(List<alz> $$0, alz $$1, Map<String, alz> $$2) {
      this.d = $$0;
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public void a(avv $$0, hbp.a $$1) {
      Supplier<int[]> $$2 = Suppliers.memoize(() -> a($$0, this.f));
      Map<String, Supplier<IntUnaryOperator>> $$3 = new HashMap<>();
      this.e.forEach(($$3x, $$4x) -> $$3.put($$3x, Suppliers.memoize(() -> a($$2.get(), a($$0, $$4x)))));

      for (alz $$4 : this.d) {
         alz $$5 = a.a($$4);
         Optional<avt> $$6 = $$0.getResource($$5);
         if ($$6.isEmpty()) {
            c.warn("Unable to find texture {}", $$5);
         } else {
            hbv $$7 = new hbv($$5, $$6.get(), $$3.size());

            for (Entry<String, Supplier<IntUnaryOperator>> $$8 : $$3.entrySet()) {
               alz $$9 = $$4.g("_" + $$8.getKey());
               $$1.a($$9, new hbw.a($$7, $$8.getValue(), $$9));
            }
         }
      }
   }

   private static IntUnaryOperator a(int[] $$0, int[] $$1) {
      if ($$1.length != $$0.length) {
         c.warn("Palette mapping has different sizes: {} and {}", $$0.length, $$1.length);
         throw new IllegalArgumentException();
      } else {
         Int2IntMap $$2 = new Int2IntOpenHashMap($$1.length);

         for (int $$3 = 0; $$3 < $$0.length; $$3++) {
            int $$4 = $$0[$$3];
            if (ayp.a($$4) != 0) {
               $$2.put(ayp.g($$4), $$1[$$3]);
            }
         }

         return $$1x -> {
            int $$2x = ayp.a($$1x);
            if ($$2x == 0) {
               return $$1x;
            } else {
               int $$3x = ayp.g($$1x);
               int $$4x = $$2.getOrDefault($$3x, ayp.f($$3x));
               int $$5 = ayp.a($$4x);
               return ayp.c($$2x * $$5 / 255, $$4x);
            }
         };
      }
   }

   private static int[] a(avv $$0, alz $$1) {
      Optional<avt> $$2 = $$0.getResource(a.a($$1));
      if ($$2.isEmpty()) {
         c.error("Failed to load palette image {}", $$1);
         throw new IllegalArgumentException();
      } else {
         try {
            int[] var5;
            try (
               InputStream $$3 = $$2.get().d();
               ffs $$4 = ffs.a($$3);
            ) {
               var5 = $$4.e();
            }

            return var5;
         } catch (Exception var11) {
            c.error("Couldn't load texture {}", $$1, var11);
            throw new IllegalArgumentException();
         }
      }
   }

   @Override
   public hbr a() {
      return hbs.e;
   }

   static record a(hbv a, Supplier<IntUnaryOperator> b, alz c) implements hbp.b {
      @Nullable
      public hbf a(hbo $$0) {
         Object var3;
         try {
            ffs $$1 = this.a.a().a(this.b.get());
            return new hbf(this.c, new hcz($$1.a(), $$1.b()), $$1, avx.a);
         } catch (IllegalArgumentException | IOException var7) {
            hbw.c.error("unable to apply palette to {}", this.c, var7);
            var3 = null;
         } finally {
            this.a.b();
         }

         return (hbf)var3;
      }

      @Override
      public void a() {
         this.a.b();
      }

      public hbv b() {
         return this.a;
      }

      public Supplier<IntUnaryOperator> c() {
         return this.b;
      }

      public alz d() {
         return this.c;
      }
   }
}
