import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public interface tm {
   Codec<tm> a = mh.aB.q().dispatch(tm::a, $$0 -> $$0);
   Codec<jg<tm>> b = alg.a(mi.bg, a);

   static MapCodec<? extends tm> a(jt<MapCodec<? extends tm>> $$0) {
      jt.a($$0, "all_of", tm.a.c);
      jt.a($$0, "game_rules", tm.c.c);
      jt.a($$0, "time_of_day", tm.d.c);
      jt.a($$0, "weather", tm.e.c);
      return jt.a($$0, "function", tm.b.c);
   }

   void a(aru var1);

   default void b(aru $$0) {
   }

   MapCodec<? extends tm> a();

   public static record a(List<jg<tm>> d) implements tm {
      public static final MapCodec<tm.a> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(tm.b.listOf().fieldOf("definitions").forGetter(tm.a::b)).apply($$0, tm.a::new)
      );

      public a(tm... $$0) {
         this(Arrays.stream($$0).map(jg::a).toList());
      }

      @Override
      public void a(aru $$0) {
         this.d.forEach($$1 -> $$1.a().a($$0));
      }

      @Override
      public void b(aru $$0) {
         this.d.forEach($$1 -> $$1.a().b($$0));
      }

      @Override
      public MapCodec<tm.a> a() {
         return c;
      }

      public List<jg<tm>> b() {
         return this.d;
      }
   }

   public static record b(Optional<alk> d, Optional<alk> e) implements tm {
      private static final Logger f = LogUtils.getLogger();
      public static final MapCodec<tm.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alk.a.optionalFieldOf("setup").forGetter(tm.b::b), alk.a.optionalFieldOf("teardown").forGetter(tm.b::c)).apply($$0, tm.b::new)
      );

      @Override
      public void a(aru $$0) {
         this.d.ifPresent($$1 -> a($$0, $$1));
      }

      @Override
      public void b(aru $$0) {
         this.e.ifPresent($$1 -> a($$0, $$1));
      }

      private static void a(aru $$0, alk $$1) {
         MinecraftServer $$2 = $$0.p();
         alz $$3 = $$2.aE();
         Optional<hy<ek>> $$4 = $$3.a($$1);
         if ($$4.isPresent()) {
            ek $$5 = $$2.aH().a(2).a().a($$0);
            $$3.a($$4.get(), $$5);
         } else {
            f.error("Test Batch failed for non-existent function {}", $$1);
         }
      }

      @Override
      public MapCodec<tm.b> a() {
         return c;
      }

      public Optional<alk> b() {
         return this.d;
      }

      public Optional<alk> c() {
         return this.e;
      }
   }

   public static record c(List<tm.c.a<Boolean, djv.a>> d, List<tm.c.a<Integer, djv.d>> e) implements tm {
      public static final MapCodec<tm.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  tm.c.a.a(djv.a.class, Codec.BOOL).listOf().fieldOf("bool_rules").forGetter(tm.c::b),
                  tm.c.a.a(djv.d.class, Codec.INT).listOf().fieldOf("int_rules").forGetter(tm.c::c)
               )
               .apply($$0, tm.c::new)
      );

      @Override
      public void a(aru $$0) {
         djv $$1 = $$0.O();
         MinecraftServer $$2 = $$0.p();

         for (tm.c.a<Boolean, djv.a> $$3 : this.d) {
            $$1.b($$3.a()).a($$3.b(), $$2);
         }

         for (tm.c.a<Integer, djv.d> $$4 : this.e) {
            $$1.b($$4.a()).a($$4.b(), $$2);
         }
      }

      @Override
      public void b(aru $$0) {
         djv $$1 = $$0.O();
         MinecraftServer $$2 = $$0.p();

         for (tm.c.a<Boolean, djv.a> $$3 : this.d) {
            $$1.b($$3.a()).a(djv.a($$3.a()).a(), $$2);
         }

         for (tm.c.a<Integer, djv.d> $$4 : this.e) {
            $$1.b($$4.a()).a(djv.a($$4.a()).a(), $$2);
         }
      }

      @Override
      public MapCodec<tm.c> a() {
         return c;
      }

      public static <S, T extends djv.g<T>> tm.c.a<S, T> a(djv.e<T> $$0, S $$1) {
         return new tm.c.a<>($$0, $$1);
      }

      public List<tm.c.a<Boolean, djv.a>> b() {
         return this.d;
      }

      public List<tm.c.a<Integer, djv.d>> c() {
         return this.e;
      }

      public static record a<S, T extends djv.g<T>>(djv.e<T> a, S b) {
         public static <S, T extends djv.g<T>> Codec<tm.c.a<S, T>> a(Class<T> $$0, Codec<S> $$1) {
            return RecordCodecBuilder.create(
               $$2 -> $$2.group(djv.a($$0).fieldOf("rule").forGetter(tm.c.a::a), $$1.fieldOf("value").forGetter(tm.c.a::b)).apply($$2, tm.c.a::new)
            );
         }
      }
   }

   public static record d(int d) implements tm {
      public static final MapCodec<tm.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayy.l.fieldOf("time").forGetter(tm.d::b)).apply($$0, tm.d::new));

      @Override
      public void a(aru $$0) {
         $$0.b((long)this.d);
      }

      @Override
      public MapCodec<tm.d> a() {
         return c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record e(tm.e.a d) implements tm {
      public static final MapCodec<tm.e> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tm.e.a.d.fieldOf("weather").forGetter(tm.e::b)).apply($$0, tm.e::new));

      @Override
      public void a(aru $$0) {
         this.d.a($$0);
      }

      @Override
      public void b(aru $$0) {
         $$0.h();
      }

      @Override
      public MapCodec<tm.e> a() {
         return c;
      }

      public tm.e.a b() {
         return this.d;
      }

      public static enum a implements bao {
         a("clear", 100000, 0, false, false),
         b("rain", 0, 100000, true, false),
         c("thunder", 0, 100000, true, true);

         public static final Codec<tm.e.a> d = bao.a(tm.e.a::values);
         private final String e;
         private final int f;
         private final int g;
         private final boolean h;
         private final boolean i;

         private a(final String $$0, final int $$1, final int $$2, final boolean $$3, final boolean $$4) {
            this.e = $$0;
            this.f = $$1;
            this.g = $$2;
            this.h = $$3;
            this.i = $$4;
         }

         void a(aru $$0) {
            $$0.a(this.f, this.g, this.h, this.i);
         }

         @Override
         public String c() {
            return this.e;
         }
      }
   }
}
