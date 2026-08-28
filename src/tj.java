import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public interface tj {
   Codec<tj> a = md.aD.q().dispatch(tj::a, $$0 -> $$0);
   Codec<js<tj>> b = akz.a(me.be, a);

   static MapCodec<? extends tj> a(kf<MapCodec<? extends tj>> $$0) {
      kf.a($$0, "all_of", tj.a.c);
      kf.a($$0, "game_rules", tj.c.c);
      kf.a($$0, "time_of_day", tj.d.c);
      kf.a($$0, "raining", tj.e.c);
      return kf.a($$0, "function", tj.b.c);
   }

   void a(arn var1);

   default void b(arn $$0) {
   }

   MapCodec<? extends tj> a();

   public static record a(List<js<tj>> d) implements tj {
      public static final MapCodec<tj.a> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(tj.b.listOf().fieldOf("definitions").forGetter(tj.a::b)).apply($$0, tj.a::new)
      );

      public a(tj... $$0) {
         this(Arrays.stream($$0).map(js::a).toList());
      }

      @Override
      public void a(arn $$0) {
         this.d.forEach($$1 -> $$1.a().a($$0));
      }

      @Override
      public void b(arn $$0) {
         this.d.forEach($$1 -> $$1.a().b($$0));
      }

      @Override
      public MapCodec<tj.a> a() {
         return c;
      }

      public List<js<tj>> b() {
         return this.d;
      }
   }

   public static record b(Optional<ald> d, Optional<ald> e) implements tj {
      private static final Logger f = LogUtils.getLogger();
      public static final MapCodec<tj.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ald.a.optionalFieldOf("setup").forGetter(tj.b::b), ald.a.optionalFieldOf("teardown").forGetter(tj.b::c)).apply($$0, tj.b::new)
      );

      @Override
      public void a(arn $$0) {
         this.d.ifPresent($$1 -> a($$0, $$1));
      }

      @Override
      public void b(arn $$0) {
         this.e.ifPresent($$1 -> a($$0, $$1));
      }

      private static void a(arn $$0, ald $$1) {
         MinecraftServer $$2 = $$0.p();
         als $$3 = $$2.aE();
         Optional<im<ex>> $$4 = $$3.a($$1);
         if ($$4.isPresent()) {
            ex $$5 = $$2.aH().a(2).a().a($$0);
            $$3.a($$4.get(), $$5);
         } else {
            f.error("Test Batch failed for non-existent function {}", $$1);
         }
      }

      @Override
      public MapCodec<tj.b> a() {
         return c;
      }

      public Optional<ald> b() {
         return this.d;
      }

      public Optional<ald> c() {
         return this.e;
      }
   }

   public static record c(List<tj.c.a<Boolean, dhl.a>> d, List<tj.c.a<Integer, dhl.d>> e) implements tj {
      public static final MapCodec<tj.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  tj.c.a.a(dhl.a.class, Codec.BOOL).listOf().fieldOf("bool_rules").forGetter(tj.c::b),
                  tj.c.a.a(dhl.d.class, Codec.INT).listOf().fieldOf("int_rules").forGetter(tj.c::c)
               )
               .apply($$0, tj.c::new)
      );

      @Override
      public void a(arn $$0) {
         dhl $$1 = $$0.O();
         MinecraftServer $$2 = $$0.p();

         for (tj.c.a<Boolean, dhl.a> $$3 : this.d) {
            $$1.b($$3.a()).a($$3.b(), $$2);
         }

         for (tj.c.a<Integer, dhl.d> $$4 : this.e) {
            $$1.b($$4.a()).a($$4.b(), $$2);
         }
      }

      @Override
      public void b(arn $$0) {
         dhl $$1 = $$0.O();
         MinecraftServer $$2 = $$0.p();

         for (tj.c.a<Boolean, dhl.a> $$3 : this.d) {
            $$1.b($$3.a()).a(dhl.a($$3.a()).a(), $$2);
         }

         for (tj.c.a<Integer, dhl.d> $$4 : this.e) {
            $$1.b($$4.a()).a(dhl.a($$4.a()).a(), $$2);
         }
      }

      @Override
      public MapCodec<tj.c> a() {
         return c;
      }

      public static <S, T extends dhl.g<T>> tj.c.a<S, T> a(dhl.e<T> $$0, S $$1) {
         return new tj.c.a<>($$0, $$1);
      }

      public List<tj.c.a<Boolean, dhl.a>> b() {
         return this.d;
      }

      public List<tj.c.a<Integer, dhl.d>> c() {
         return this.e;
      }

      public static record a<S, T extends dhl.g<T>>(dhl.e<T> a, S b) {
         public static <S, T extends dhl.g<T>> Codec<tj.c.a<S, T>> a(Class<T> $$0, Codec<S> $$1) {
            return RecordCodecBuilder.create(
               $$2 -> $$2.group(dhl.a($$0).fieldOf("rule").forGetter(tj.c.a::a), $$1.fieldOf("value").forGetter(tj.c.a::b)).apply($$2, tj.c.a::new)
            );
         }
      }
   }

   public static record d(int d) implements tj {
      public static final MapCodec<tj.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.l.fieldOf("time").forGetter(tj.d::b)).apply($$0, tj.d::new));

      @Override
      public void a(arn $$0) {
         $$0.b((long)this.d);
      }

      @Override
      public MapCodec<tj.d> a() {
         return c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record e(tj.e.a d) implements tj {
      public static final MapCodec<tj.e> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tj.e.a.d.fieldOf("weather").forGetter(tj.e::b)).apply($$0, tj.e::new));

      @Override
      public void a(arn $$0) {
         this.d.a($$0);
      }

      @Override
      public void b(arn $$0) {
         $$0.h();
      }

      @Override
      public MapCodec<tj.e> a() {
         return c;
      }

      public tj.e.a b() {
         return this.d;
      }

      public static enum a implements bag {
         a("clear", 100000, 0, false, false),
         b("rain", 0, 100000, true, false),
         c("thunder", 0, 100000, true, true);

         public static final Codec<tj.e.a> d = bag.a(tj.e.a::values);
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

         void a(arn $$0) {
            $$0.a(this.f, this.g, this.h, this.i);
         }

         @Override
         public String c() {
            return this.e;
         }
      }
   }
}
