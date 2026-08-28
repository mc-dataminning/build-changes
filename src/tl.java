import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public interface tl {
   Codec<tl> a = mg.aB.q().dispatch(tl::a, $$0 -> $$0);
   Codec<jf<tl>> b = alc.a(mh.bg, a);

   static MapCodec<? extends tl> a(js<MapCodec<? extends tl>> $$0) {
      js.a($$0, "all_of", tl.a.c);
      js.a($$0, "game_rules", tl.c.c);
      js.a($$0, "time_of_day", tl.d.c);
      js.a($$0, "weather", tl.e.c);
      return js.a($$0, "function", tl.b.c);
   }

   void a(arq var1);

   default void b(arq $$0) {
   }

   MapCodec<? extends tl> a();

   public static record a(List<jf<tl>> d) implements tl {
      public static final MapCodec<tl.a> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(tl.b.listOf().fieldOf("definitions").forGetter(tl.a::b)).apply($$0, tl.a::new)
      );

      public a(tl... $$0) {
         this(Arrays.stream($$0).map(jf::a).toList());
      }

      @Override
      public void a(arq $$0) {
         this.d.forEach($$1 -> $$1.a().a($$0));
      }

      @Override
      public void b(arq $$0) {
         this.d.forEach($$1 -> $$1.a().b($$0));
      }

      @Override
      public MapCodec<tl.a> a() {
         return c;
      }

      public List<jf<tl>> b() {
         return this.d;
      }
   }

   public static record b(Optional<alg> d, Optional<alg> e) implements tl {
      private static final Logger f = LogUtils.getLogger();
      public static final MapCodec<tl.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alg.a.optionalFieldOf("setup").forGetter(tl.b::b), alg.a.optionalFieldOf("teardown").forGetter(tl.b::c)).apply($$0, tl.b::new)
      );

      @Override
      public void a(arq $$0) {
         this.d.ifPresent($$1 -> a($$0, $$1));
      }

      @Override
      public void b(arq $$0) {
         this.e.ifPresent($$1 -> a($$0, $$1));
      }

      private static void a(arq $$0, alg $$1) {
         MinecraftServer $$2 = $$0.p();
         alv $$3 = $$2.aE();
         Optional<hx<ej>> $$4 = $$3.a($$1);
         if ($$4.isPresent()) {
            ej $$5 = $$2.aH().a(2).a().a($$0);
            $$3.a($$4.get(), $$5);
         } else {
            f.error("Test Batch failed for non-existent function {}", $$1);
         }
      }

      @Override
      public MapCodec<tl.b> a() {
         return c;
      }

      public Optional<alg> b() {
         return this.d;
      }

      public Optional<alg> c() {
         return this.e;
      }
   }

   public static record c(List<tl.c.a<Boolean, dji.a>> d, List<tl.c.a<Integer, dji.d>> e) implements tl {
      public static final MapCodec<tl.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  tl.c.a.a(dji.a.class, Codec.BOOL).listOf().fieldOf("bool_rules").forGetter(tl.c::b),
                  tl.c.a.a(dji.d.class, Codec.INT).listOf().fieldOf("int_rules").forGetter(tl.c::c)
               )
               .apply($$0, tl.c::new)
      );

      @Override
      public void a(arq $$0) {
         dji $$1 = $$0.O();
         MinecraftServer $$2 = $$0.p();

         for (tl.c.a<Boolean, dji.a> $$3 : this.d) {
            $$1.b($$3.a()).a($$3.b(), $$2);
         }

         for (tl.c.a<Integer, dji.d> $$4 : this.e) {
            $$1.b($$4.a()).a($$4.b(), $$2);
         }
      }

      @Override
      public void b(arq $$0) {
         dji $$1 = $$0.O();
         MinecraftServer $$2 = $$0.p();

         for (tl.c.a<Boolean, dji.a> $$3 : this.d) {
            $$1.b($$3.a()).a(dji.a($$3.a()).a(), $$2);
         }

         for (tl.c.a<Integer, dji.d> $$4 : this.e) {
            $$1.b($$4.a()).a(dji.a($$4.a()).a(), $$2);
         }
      }

      @Override
      public MapCodec<tl.c> a() {
         return c;
      }

      public static <S, T extends dji.g<T>> tl.c.a<S, T> a(dji.e<T> $$0, S $$1) {
         return new tl.c.a<>($$0, $$1);
      }

      public List<tl.c.a<Boolean, dji.a>> b() {
         return this.d;
      }

      public List<tl.c.a<Integer, dji.d>> c() {
         return this.e;
      }

      public static record a<S, T extends dji.g<T>>(dji.e<T> a, S b) {
         public static <S, T extends dji.g<T>> Codec<tl.c.a<S, T>> a(Class<T> $$0, Codec<S> $$1) {
            return RecordCodecBuilder.create(
               $$2 -> $$2.group(dji.a($$0).fieldOf("rule").forGetter(tl.c.a::a), $$1.fieldOf("value").forGetter(tl.c.a::b)).apply($$2, tl.c.a::new)
            );
         }
      }
   }

   public static record d(int d) implements tl {
      public static final MapCodec<tl.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.l.fieldOf("time").forGetter(tl.d::b)).apply($$0, tl.d::new));

      @Override
      public void a(arq $$0) {
         $$0.b((long)this.d);
      }

      @Override
      public MapCodec<tl.d> a() {
         return c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record e(tl.e.a d) implements tl {
      public static final MapCodec<tl.e> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tl.e.a.d.fieldOf("weather").forGetter(tl.e::b)).apply($$0, tl.e::new));

      @Override
      public void a(arq $$0) {
         this.d.a($$0);
      }

      @Override
      public void b(arq $$0) {
         $$0.h();
      }

      @Override
      public MapCodec<tl.e> a() {
         return c;
      }

      public tl.e.a b() {
         return this.d;
      }

      public static enum a implements bak {
         a("clear", 100000, 0, false, false),
         b("rain", 0, 100000, true, false),
         c("thunder", 0, 100000, true, true);

         public static final Codec<tl.e.a> d = bak.a(tl.e.a::values);
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

         void a(arq $$0) {
            $$0.a(this.f, this.g, this.h, this.i);
         }

         @Override
         public String c() {
            return this.e;
         }
      }
   }
}
