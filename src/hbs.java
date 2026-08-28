import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class hbs {
   static final Map<String, hbs> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hbs> a = Codec.STRING.comapFlatMap($$0 -> {
      hbs $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hbs::a);
   private static final List<hbu<?>> i = List.of(hbu.a, hbu.b, hbu.c, hbu.d, hbu.e, hbu.f, hbu.g, hbu.h, hbu.m, hbu.l);
   private static final List<hbu<?>> j = Stream.concat(i.stream(), Stream.of(hbu.i, hbu.j, hbu.k)).toList();
   public static final hbs b = a("world_loaded", "WorldLoaded").a(j).a(hbu.n).a(hbu.o).b();
   public static final hbs c = a("performance_metrics", "PerformanceMetrics").a(j).a(hbu.r).a(hbu.s).a(hbu.t).a(hbu.u).a(hbu.v).a(hbu.w).a().b();
   public static final hbs d = a("world_load_times", "WorldLoadTimes").a(j).a(hbu.x).a(hbu.y).a().b();
   public static final hbs e = a("world_unloaded", "WorldUnloaded").a(j).a(hbu.p).a(hbu.q).b();
   public static final hbs f = a("advancement_made", "AdvancementMade").a(j).a(hbu.D).a(hbu.E).a().b();
   public static final hbs g = a("game_load_times", "GameLoadTimes").a(i).a(hbu.z).a(hbu.A).a(hbu.B).a(hbu.C).a().b();
   private final String k;
   private final String l;
   private final List<hbu<?>> m;
   private final boolean n;
   private final MapCodec<hbo> o;

   hbs(String $$0, String $$1, List<hbu<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hbv.a($$2).xmap($$0x -> new hbo(this, $$0x), hbo::b);
   }

   public static hbs.a a(String $$0, String $$1) {
      return new hbs.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hbu<?>> b() {
      return this.m;
   }

   public MapCodec<hbo> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hbv $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hbu<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hbu<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xr e() {
      return this.a("title");
   }

   public xr f() {
      return this.a("description");
   }

   private xr a(String $$0) {
      return xd.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hbs> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hbu<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hbs.a a(List<hbu<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hbs.a a(hbu<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hbs.a a() {
         this.d = true;
         return this;
      }

      public hbs b() {
         hbs $$0 = new hbs(this.a, this.b, List.copyOf(this.c), this.d);
         if (hbs.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
