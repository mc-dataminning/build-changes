import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gdg {
   static final Map<String, gdg> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gdg> a = Codec.STRING.comapFlatMap($$0 -> {
      gdg $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gdg::a);
   private static final List<gdi<?>> i = List.of(gdi.a, gdi.b, gdi.c, gdi.d, gdi.e, gdi.f, gdi.g, gdi.h, gdi.m, gdi.l);
   private static final List<gdi<?>> j = Stream.concat(i.stream(), Stream.of(gdi.i, gdi.j, gdi.k)).toList();
   public static final gdg b = a("world_loaded", "WorldLoaded").a(j).a(gdi.n).a(gdi.o).b();
   public static final gdg c = a("performance_metrics", "PerformanceMetrics").a(j).a(gdi.r).a(gdi.s).a(gdi.t).a(gdi.u).a(gdi.v).a(gdi.w).a().b();
   public static final gdg d = a("world_load_times", "WorldLoadTimes").a(j).a(gdi.x).a(gdi.y).a().b();
   public static final gdg e = a("world_unloaded", "WorldUnloaded").a(j).a(gdi.p).a(gdi.q).b();
   public static final gdg f = a("advancement_made", "AdvancementMade").a(j).a(gdi.D).a(gdi.E).a().b();
   public static final gdg g = a("game_load_times", "GameLoadTimes").a(i).a(gdi.z).a(gdi.A).a(gdi.B).a(gdi.C).a().b();
   private final String k;
   private final String l;
   private final List<gdi<?>> m;
   private final boolean n;
   private final Codec<gdc> o;

   gdg(String $$0, String $$1, List<gdi<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gdj.a($$2).xmap($$0x -> new gdc(this, $$0x), gdc::b);
   }

   public static gdg.a a(String $$0, String $$1) {
      return new gdg.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gdi<?>> b() {
      return this.m;
   }

   public Codec<gdc> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gdj $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gdi<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gdi<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public ts e() {
      return this.a("title");
   }

   public ts f() {
      return this.a("description");
   }

   private ts a(String $$0) {
      return tf.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gdg> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gdi<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gdg.a a(List<gdi<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gdg.a a(gdi<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gdg.a a() {
         this.d = true;
         return this;
      }

      public gdg b() {
         gdg $$0 = new gdg(this.a, this.b, List.copyOf(this.c), this.d);
         if (gdg.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
