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

public class gus {
   static final Map<String, gus> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gus> a = Codec.STRING.comapFlatMap($$0 -> {
      gus $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gus::a);
   private static final List<guu<?>> i = List.of(guu.a, guu.b, guu.c, guu.d, guu.e, guu.f, guu.g, guu.h, guu.m, guu.l);
   private static final List<guu<?>> j = Stream.concat(i.stream(), Stream.of(guu.i, guu.j, guu.k)).toList();
   public static final gus b = a("world_loaded", "WorldLoaded").a(j).a(guu.n).a(guu.o).b();
   public static final gus c = a("performance_metrics", "PerformanceMetrics").a(j).a(guu.r).a(guu.s).a(guu.t).a(guu.u).a(guu.v).a(guu.w).a().b();
   public static final gus d = a("world_load_times", "WorldLoadTimes").a(j).a(guu.x).a(guu.y).a().b();
   public static final gus e = a("world_unloaded", "WorldUnloaded").a(j).a(guu.p).a(guu.q).b();
   public static final gus f = a("advancement_made", "AdvancementMade").a(j).a(guu.D).a(guu.E).a().b();
   public static final gus g = a("game_load_times", "GameLoadTimes").a(i).a(guu.z).a(guu.A).a(guu.B).a(guu.C).a().b();
   private final String k;
   private final String l;
   private final List<guu<?>> m;
   private final boolean n;
   private final MapCodec<guo> o;

   gus(String $$0, String $$1, List<guu<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = guv.a($$2).xmap($$0x -> new guo(this, $$0x), guo::b);
   }

   public static gus.a a(String $$0, String $$1) {
      return new gus.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<guu<?>> b() {
      return this.m;
   }

   public MapCodec<guo> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, guv $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (guu<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(guu<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xi e() {
      return this.a("title");
   }

   public xi f() {
      return this.a("description");
   }

   private xi a(String $$0) {
      return wu.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gus> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<guu<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gus.a a(List<guu<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gus.a a(guu<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gus.a a() {
         this.d = true;
         return this;
      }

      public gus b() {
         gus $$0 = new gus(this.a, this.b, List.copyOf(this.c), this.d);
         if (gus.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
