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

public class gwv implements gwo {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gwv> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.list(alb.a).fieldOf("textures").forGetter($$0x -> $$0x.d),
               alb.a.fieldOf("palette_key").forGetter($$0x -> $$0x.f),
               Codec.unboundedMap(Codec.STRING, alb.a).fieldOf("permutations").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, gwv::new)
   );
   private final List<alb> d;
   private final Map<String, alb> e;
   private final alb f;

   private gwv(List<alb> $$0, alb $$1, Map<String, alb> $$2) {
      this.d = $$0;
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public void a(aus $$0, gwo.a $$1) {
      Supplier<int[]> $$2 = Suppliers.memoize(() -> a($$0, this.f));
      Map<String, Supplier<IntUnaryOperator>> $$3 = new HashMap<>();
      this.e.forEach(($$3x, $$4x) -> $$3.put($$3x, Suppliers.memoize(() -> a($$2.get(), a($$0, $$4x)))));

      for (alb $$4 : this.d) {
         alb $$5 = a.a($$4);
         Optional<auq> $$6 = $$0.getResource($$5);
         if ($$6.isEmpty()) {
            c.warn("Unable to find texture {}", $$5);
         } else {
            gwu $$7 = new gwu($$5, $$6.get(), $$3.size());

            for (Entry<String, Supplier<IntUnaryOperator>> $$8 : $$3.entrySet()) {
               alb $$9 = $$4.g("_" + $$8.getKey());
               $$1.a($$9, new gwv.a($$7, $$8.getValue(), $$9));
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
            if (axn.a($$4) != 0) {
               $$2.put(axn.g($$4), $$1[$$3]);
            }
         }

         return $$1x -> {
            int $$2x = axn.a($$1x);
            if ($$2x == 0) {
               return $$1x;
            } else {
               int $$3x = axn.g($$1x);
               int $$4x = $$2.getOrDefault($$3x, axn.f($$3x));
               int $$5 = axn.a($$4x);
               return axn.c($$2x * $$5 / 255, $$4x);
            }
         };
      }
   }

   private static int[] a(aus $$0, alb $$1) {
      Optional<auq> $$2 = $$0.getResource(a.a($$1));
      if ($$2.isEmpty()) {
         c.error("Failed to load palette image {}", $$1);
         throw new IllegalArgumentException();
      } else {
         try {
            int[] var5;
            try (
               InputStream $$3 = $$2.get().d();
               fbp $$4 = fbp.a($$3);
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
   public gwq a() {
      return gwr.e;
   }

   static record a(gwu a, Supplier<IntUnaryOperator> b, alb c) implements gwo.b {
      @Nullable
      public gwe a(gwn $$0) {
         Object var3;
         try {
            fbp $$1 = this.a.a().a(this.b.get());
            return new gwe(this.c, new gxy($$1.a(), $$1.b()), $$1, auu.a);
         } catch (IllegalArgumentException | IOException var7) {
            gwv.c.error("unable to apply palette to {}", this.c, var7);
            var3 = null;
         } finally {
            this.a.b();
         }

         return (gwe)var3;
      }

      @Override
      public void a() {
         this.a.b();
      }

      public gwu b() {
         return this.a;
      }

      public Supplier<IntUnaryOperator> c() {
         return this.b;
      }

      public alb d() {
         return this.c;
      }
   }
}
