import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gdu {
   static final Map<String, gdu> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gdu> a = Codec.STRING.comapFlatMap($$0 -> {
      gdu $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gdu::a);
   private static final List<gdw<?>> i = List.of(gdw.a, gdw.b, gdw.c, gdw.d, gdw.e, gdw.f, gdw.g, gdw.h, gdw.m, gdw.l);
   private static final List<gdw<?>> j = Stream.concat(i.stream(), Stream.of(gdw.i, gdw.j, gdw.k)).toList();
   public static final gdu b = a("world_loaded", "WorldLoaded").a(j).a(gdw.n).a(gdw.o).b();
   public static final gdu c = a("performance_metrics", "PerformanceMetrics").a(j).a(gdw.r).a(gdw.s).a(gdw.t).a(gdw.u).a(gdw.v).a(gdw.w).a().b();
   public static final gdu d = a("world_load_times", "WorldLoadTimes").a(j).a(gdw.x).a(gdw.y).a().b();
   public static final gdu e = a("world_unloaded", "WorldUnloaded").a(j).a(gdw.p).a(gdw.q).b();
   public static final gdu f = a("advancement_made", "AdvancementMade").a(j).a(gdw.D).a(gdw.E).a().b();
   public static final gdu g = a("game_load_times", "GameLoadTimes").a(i).a(gdw.z).a(gdw.A).a(gdw.B).a(gdw.C).a().b();
   private final String k;
   private final String l;
   private final List<gdw<?>> m;
   private final boolean n;
   private final Codec<gdq> o;

   gdu(String $$0, String $$1, List<gdw<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gdx.a($$2).xmap($$0x -> new gdq(this, $$0x), gdq::b);
   }

   public static gdu.a a(String $$0, String $$1) {
      return new gdu.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gdw<?>> b() {
      return this.m;
   }

   public Codec<gdq> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gdx $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gdw<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gdw<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public tv e() {
      return this.a("title");
   }

   public tv f() {
      return this.a("description");
   }

   private tv a(String $$0) {
      return ti.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gdu> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gdw<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gdu.a a(List<gdw<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gdu.a a(gdw<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gdu.a a() {
         this.d = true;
         return this;
      }

      public gdu b() {
         gdu $$0 = new gdu(this.a, this.b, List.copyOf(this.c), this.d);
         if (gdu.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
