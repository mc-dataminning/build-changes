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

public class how {
   static final Map<String, how> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<how> a = Codec.STRING.comapFlatMap($$0 -> {
      how $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, how::a);
   private static final List<hoy<?>> i = List.of(hoy.a, hoy.b, hoy.c, hoy.d, hoy.e, hoy.f, hoy.g, hoy.h, hoy.m, hoy.l);
   private static final List<hoy<?>> j = Stream.concat(i.stream(), Stream.of(hoy.i, hoy.j, hoy.k)).toList();
   public static final how b = a("world_loaded", "WorldLoaded").a(j).a(hoy.n).a(hoy.o).b();
   public static final how c = a("performance_metrics", "PerformanceMetrics").a(j).a(hoy.r).a(hoy.s).a(hoy.t).a(hoy.u).a(hoy.v).a(hoy.w).a().b();
   public static final how d = a("world_load_times", "WorldLoadTimes").a(j).a(hoy.x).a(hoy.y).a().b();
   public static final how e = a("world_unloaded", "WorldUnloaded").a(j).a(hoy.p).a(hoy.q).b();
   public static final how f = a("advancement_made", "AdvancementMade").a(j).a(hoy.D).a(hoy.E).a().b();
   public static final how g = a("game_load_times", "GameLoadTimes").a(i).a(hoy.z).a(hoy.A).a(hoy.B).a(hoy.C).a().b();
   private final String k;
   private final String l;
   private final List<hoy<?>> m;
   private final boolean n;
   private final MapCodec<hos> o;

   how(String $$0, String $$1, List<hoy<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hoz.a($$2).xmap($$0x -> new hos(this, $$0x), hos::b);
   }

   public static how.a a(String $$0, String $$1) {
      return new how.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hoy<?>> b() {
      return this.m;
   }

   public MapCodec<hos> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hoz $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hoy<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hoy<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xm e() {
      return this.a("title");
   }

   public xm f() {
      return this.a("description");
   }

   private xm a(String $$0) {
      return wy.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<how> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hoy<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public how.a a(List<hoy<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> how.a a(hoy<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public how.a a() {
         this.d = true;
         return this;
      }

      public how b() {
         how $$0 = new how(this.a, this.b, List.copyOf(this.c), this.d);
         if (how.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
