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

public class hjx {
   static final Map<String, hjx> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hjx> a = Codec.STRING.comapFlatMap($$0 -> {
      hjx $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hjx::a);
   private static final List<hjz<?>> i = List.of(hjz.a, hjz.b, hjz.c, hjz.d, hjz.e, hjz.f, hjz.g, hjz.h, hjz.m, hjz.l);
   private static final List<hjz<?>> j = Stream.concat(i.stream(), Stream.of(hjz.i, hjz.j, hjz.k)).toList();
   public static final hjx b = a("world_loaded", "WorldLoaded").a(j).a(hjz.n).a(hjz.o).b();
   public static final hjx c = a("performance_metrics", "PerformanceMetrics").a(j).a(hjz.r).a(hjz.s).a(hjz.t).a(hjz.u).a(hjz.v).a(hjz.w).a().b();
   public static final hjx d = a("world_load_times", "WorldLoadTimes").a(j).a(hjz.x).a(hjz.y).a().b();
   public static final hjx e = a("world_unloaded", "WorldUnloaded").a(j).a(hjz.p).a(hjz.q).b();
   public static final hjx f = a("advancement_made", "AdvancementMade").a(j).a(hjz.D).a(hjz.E).a().b();
   public static final hjx g = a("game_load_times", "GameLoadTimes").a(i).a(hjz.z).a(hjz.A).a(hjz.B).a(hjz.C).a().b();
   private final String k;
   private final String l;
   private final List<hjz<?>> m;
   private final boolean n;
   private final MapCodec<hjt> o;

   hjx(String $$0, String $$1, List<hjz<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hka.a($$2).xmap($$0x -> new hjt(this, $$0x), hjt::b);
   }

   public static hjx.a a(String $$0, String $$1) {
      return new hjx.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hjz<?>> b() {
      return this.m;
   }

   public MapCodec<hjt> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hka $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hjz<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hjz<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xc e() {
      return this.a("title");
   }

   public xc f() {
      return this.a("description");
   }

   private xc a(String $$0) {
      return wo.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hjx> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hjz<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hjx.a a(List<hjz<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hjx.a a(hjz<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hjx.a a() {
         this.d = true;
         return this;
      }

      public hjx b() {
         hjx $$0 = new hjx(this.a, this.b, List.copyOf(this.c), this.d);
         if (hjx.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
