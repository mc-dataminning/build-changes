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

public class gue {
   static final Map<String, gue> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gue> a = Codec.STRING.comapFlatMap($$0 -> {
      gue $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gue::a);
   private static final List<gug<?>> i = List.of(gug.a, gug.b, gug.c, gug.d, gug.e, gug.f, gug.g, gug.h, gug.m, gug.l);
   private static final List<gug<?>> j = Stream.concat(i.stream(), Stream.of(gug.i, gug.j, gug.k)).toList();
   public static final gue b = a("world_loaded", "WorldLoaded").a(j).a(gug.n).a(gug.o).b();
   public static final gue c = a("performance_metrics", "PerformanceMetrics").a(j).a(gug.r).a(gug.s).a(gug.t).a(gug.u).a(gug.v).a(gug.w).a().b();
   public static final gue d = a("world_load_times", "WorldLoadTimes").a(j).a(gug.x).a(gug.y).a().b();
   public static final gue e = a("world_unloaded", "WorldUnloaded").a(j).a(gug.p).a(gug.q).b();
   public static final gue f = a("advancement_made", "AdvancementMade").a(j).a(gug.D).a(gug.E).a().b();
   public static final gue g = a("game_load_times", "GameLoadTimes").a(i).a(gug.z).a(gug.A).a(gug.B).a(gug.C).a().b();
   private final String k;
   private final String l;
   private final List<gug<?>> m;
   private final boolean n;
   private final MapCodec<gua> o;

   gue(String $$0, String $$1, List<gug<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = guh.a($$2).xmap($$0x -> new gua(this, $$0x), gua::b);
   }

   public static gue.a a(String $$0, String $$1) {
      return new gue.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gug<?>> b() {
      return this.m;
   }

   public MapCodec<gua> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, guh $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gug<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gug<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public yd e() {
      return this.a("title");
   }

   public yd f() {
      return this.a("description");
   }

   private yd a(String $$0) {
      return xp.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gue> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gug<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gue.a a(List<gug<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gue.a a(gug<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gue.a a() {
         this.d = true;
         return this;
      }

      public gue b() {
         gue $$0 = new gue(this.a, this.b, List.copyOf(this.c), this.d);
         if (gue.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
