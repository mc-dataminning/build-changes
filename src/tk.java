import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public interface tk {
   Codec<tk> a = mf.aB.q().dispatch(tk::a, $$0 -> $$0);
   Codec<je<tk>> b = ala.a(mg.be, a);

   static MapCodec<? extends tk> a(jr<MapCodec<? extends tk>> $$0) {
      jr.a($$0, "all_of", tk.a.c);
      jr.a($$0, "game_rules", tk.c.c);
      jr.a($$0, "time_of_day", tk.d.c);
      jr.a($$0, "weather", tk.e.c);
      return jr.a($$0, "function", tk.b.c);
   }

   void a(aro var1);

   default void b(aro $$0) {
   }

   MapCodec<? extends tk> a();

   public static record a(List<je<tk>> d) implements tk {
      public static final MapCodec<tk.a> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(tk.b.listOf().fieldOf("definitions").forGetter(tk.a::b)).apply($$0, tk.a::new)
      );

      public a(tk... $$0) {
         this(Arrays.stream($$0).map(je::a).toList());
      }

      @Override
      public void a(aro $$0) {
         this.d.forEach($$1 -> $$1.a().a($$0));
      }

      @Override
      public void b(aro $$0) {
         this.d.forEach($$1 -> $$1.a().b($$0));
      }

      @Override
      public MapCodec<tk.a> a() {
         return c;
      }

      public List<je<tk>> b() {
         return this.d;
      }
   }

   public static record b(Optional<ale> d, Optional<ale> e) implements tk {
      private static final Logger f = LogUtils.getLogger();
      public static final MapCodec<tk.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ale.a.optionalFieldOf("setup").forGetter(tk.b::b), ale.a.optionalFieldOf("teardown").forGetter(tk.b::c)).apply($$0, tk.b::new)
      );

      @Override
      public void a(aro $$0) {
         this.d.ifPresent($$1 -> a($$0, $$1));
      }

      @Override
      public void b(aro $$0) {
         this.e.ifPresent($$1 -> a($$0, $$1));
      }

      private static void a(aro $$0, ale $$1) {
         MinecraftServer $$2 = $$0.p();
         alt $$3 = $$2.aE();
         Optional<hw<ei>> $$4 = $$3.a($$1);
         if ($$4.isPresent()) {
            ei $$5 = $$2.aH().a(2).a().a($$0);
            $$3.a($$4.get(), $$5);
         } else {
            f.error("Test Batch failed for non-existent function {}", $$1);
         }
      }

      @Override
      public MapCodec<tk.b> a() {
         return c;
      }

      public Optional<ale> b() {
         return this.d;
      }

      public Optional<ale> c() {
         return this.e;
      }
   }

   public static record c(List<tk.c.a<Boolean, dil.a>> d, List<tk.c.a<Integer, dil.d>> e) implements tk {
      public static final MapCodec<tk.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  tk.c.a.a(dil.a.class, Codec.BOOL).listOf().fieldOf("bool_rules").forGetter(tk.c::b),
                  tk.c.a.a(dil.d.class, Codec.INT).listOf().fieldOf("int_rules").forGetter(tk.c::c)
               )
               .apply($$0, tk.c::new)
      );

      @Override
      public void a(aro $$0) {
         dil $$1 = $$0.O();
         MinecraftServer $$2 = $$0.p();

         for (tk.c.a<Boolean, dil.a> $$3 : this.d) {
            $$1.b($$3.a()).a($$3.b(), $$2);
         }

         for (tk.c.a<Integer, dil.d> $$4 : this.e) {
            $$1.b($$4.a()).a($$4.b(), $$2);
         }
      }

      @Override
      public void b(aro $$0) {
         dil $$1 = $$0.O();
         MinecraftServer $$2 = $$0.p();

         for (tk.c.a<Boolean, dil.a> $$3 : this.d) {
            $$1.b($$3.a()).a(dil.a($$3.a()).a(), $$2);
         }

         for (tk.c.a<Integer, dil.d> $$4 : this.e) {
            $$1.b($$4.a()).a(dil.a($$4.a()).a(), $$2);
         }
      }

      @Override
      public MapCodec<tk.c> a() {
         return c;
      }

      public static <S, T extends dil.g<T>> tk.c.a<S, T> a(dil.e<T> $$0, S $$1) {
         return new tk.c.a<>($$0, $$1);
      }

      public List<tk.c.a<Boolean, dil.a>> b() {
         return this.d;
      }

      public List<tk.c.a<Integer, dil.d>> c() {
         return this.e;
      }

      public static record a<S, T extends dil.g<T>>(dil.e<T> a, S b) {
         public static <S, T extends dil.g<T>> Codec<tk.c.a<S, T>> a(Class<T> $$0, Codec<S> $$1) {
            return RecordCodecBuilder.create(
               $$2 -> $$2.group(dil.a($$0).fieldOf("rule").forGetter(tk.c.a::a), $$1.fieldOf("value").forGetter(tk.c.a::b)).apply($$2, tk.c.a::new)
            );
         }
      }
   }

   public static record d(int d) implements tk {
      public static final MapCodec<tk.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.l.fieldOf("time").forGetter(tk.d::b)).apply($$0, tk.d::new));

      @Override
      public void a(aro $$0) {
         $$0.b((long)this.d);
      }

      @Override
      public MapCodec<tk.d> a() {
         return c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record e(tk.e.a d) implements tk {
      public static final MapCodec<tk.e> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tk.e.a.d.fieldOf("weather").forGetter(tk.e::b)).apply($$0, tk.e::new));

      @Override
      public void a(aro $$0) {
         this.d.a($$0);
      }

      @Override
      public void b(aro $$0) {
         $$0.h();
      }

      @Override
      public MapCodec<tk.e> a() {
         return c;
      }

      public tk.e.a b() {
         return this.d;
      }

      public static enum a implements bai {
         a("clear", 100000, 0, false, false),
         b("rain", 0, 100000, true, false),
         c("thunder", 0, 100000, true, true);

         public static final Codec<tk.e.a> d = bai.a(tk.e.a::values);
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

         void a(aro $$0) {
            $$0.a(this.f, this.g, this.h, this.i);
         }

         @Override
         public String c() {
            return this.e;
         }
      }
   }
}
