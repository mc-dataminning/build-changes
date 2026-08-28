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

public class gqq implements gqj {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gqq> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.list(akq.a).fieldOf("textures").forGetter($$0x -> $$0x.d),
               akq.a.fieldOf("palette_key").forGetter($$0x -> $$0x.f),
               Codec.unboundedMap(Codec.STRING, akq.a).fieldOf("permutations").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, gqq::new)
   );
   private final List<akq> d;
   private final Map<String, akq> e;
   private final akq f;

   private gqq(List<akq> $$0, akq $$1, Map<String, akq> $$2) {
      this.d = $$0;
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public void a(aud $$0, gqj.a $$1) {
      Supplier<int[]> $$2 = Suppliers.memoize(() -> a($$0, this.f));
      Map<String, Supplier<IntUnaryOperator>> $$3 = new HashMap<>();
      this.e.forEach(($$3x, $$4x) -> $$3.put($$3x, Suppliers.memoize(() -> a($$2.get(), a($$0, $$4x)))));

      for (akq $$4 : this.d) {
         akq $$5 = a.a($$4);
         Optional<aub> $$6 = $$0.getResource($$5);
         if ($$6.isEmpty()) {
            c.warn("Unable to find texture {}", $$5);
         } else {
            gqp $$7 = new gqp($$5, $$6.get(), $$3.size());

            for (Entry<String, Supplier<IntUnaryOperator>> $$8 : $$3.entrySet()) {
               akq $$9 = $$4.g("_" + $$8.getKey());
               $$1.a($$9, new gqq.a($$7, $$8.getValue(), $$9));
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
            if (axx.a.a($$4) != 0) {
               $$2.put(axx.a.e($$4), $$1[$$3]);
            }
         }

         return $$1x -> {
            int $$2x = axx.a.a($$1x);
            if ($$2x == 0) {
               return $$1x;
            } else {
               int $$3x = axx.a.e($$1x);
               int $$4x = $$2.getOrDefault($$3x, axx.a.f($$3x));
               int $$5 = axx.a.a($$4x);
               return axx.a.a($$2x * $$5 / 255, $$4x);
            }
         };
      }
   }

   public static int[] a(aud $$0, akq $$1) {
      Optional<aub> $$2 = $$0.getResource(a.a($$1));
      if ($$2.isEmpty()) {
         c.error("Failed to load palette image {}", $$1);
         throw new IllegalArgumentException();
      } else {
         try {
            int[] var5;
            try (
               InputStream $$3 = $$2.get().d();
               fad $$4 = fad.a($$3);
            ) {
               var5 = $$4.d();
            }

            return var5;
         } catch (Exception var11) {
            c.error("Couldn't load texture {}", $$1, var11);
            throw new IllegalArgumentException();
         }
      }
   }

   @Override
   public gql a() {
      return gqm.e;
   }

   static record a(gqp a, Supplier<IntUnaryOperator> b, akq c) implements gqj.b {
      @Nullable
      public gpz a(gqi $$0) {
         Object var3;
         try {
            fad $$1 = this.a.a().a(this.b.get());
            return new gpz(this.c, new grs($$1.a(), $$1.b()), $$1, auf.a);
         } catch (IllegalArgumentException | IOException var7) {
            gqq.c.error("unable to apply palette to {}", this.c, var7);
            var3 = null;
         } finally {
            this.a.b();
         }

         return (gpz)var3;
      }

      @Override
      public void a() {
         this.a.b();
      }

      public gqp b() {
         return this.a;
      }

      public Supplier<IntUnaryOperator> c() {
         return this.b;
      }

      public akq d() {
         return this.c;
      }
   }
}
