import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ggu {
   static final Map<String, ggu> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<ggu> a = Codec.STRING.comapFlatMap($$0 -> {
      ggu $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, ggu::a);
   private static final List<ggw<?>> i = List.of(ggw.a, ggw.b, ggw.c, ggw.d, ggw.e, ggw.f, ggw.g, ggw.h, ggw.m, ggw.l);
   private static final List<ggw<?>> j = Stream.concat(i.stream(), Stream.of(ggw.i, ggw.j, ggw.k)).toList();
   public static final ggu b = a("world_loaded", "WorldLoaded").a(j).a(ggw.n).a(ggw.o).b();
   public static final ggu c = a("performance_metrics", "PerformanceMetrics").a(j).a(ggw.r).a(ggw.s).a(ggw.t).a(ggw.u).a(ggw.v).a(ggw.w).a().b();
   public static final ggu d = a("world_load_times", "WorldLoadTimes").a(j).a(ggw.x).a(ggw.y).a().b();
   public static final ggu e = a("world_unloaded", "WorldUnloaded").a(j).a(ggw.p).a(ggw.q).b();
   public static final ggu f = a("advancement_made", "AdvancementMade").a(j).a(ggw.D).a(ggw.E).a().b();
   public static final ggu g = a("game_load_times", "GameLoadTimes").a(i).a(ggw.z).a(ggw.A).a(ggw.B).a(ggw.C).a().b();
   private final String k;
   private final String l;
   private final List<ggw<?>> m;
   private final boolean n;
   private final Codec<ggq> o;

   ggu(String $$0, String $$1, List<ggw<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = ggx.a($$2).xmap($$0x -> new ggq(this, $$0x), ggq::b);
   }

   public static ggu.a a(String $$0, String $$1) {
      return new ggu.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<ggw<?>> b() {
      return this.m;
   }

   public Codec<ggq> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, ggx $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (ggw<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(ggw<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public vj e() {
      return this.a("title");
   }

   public vj f() {
      return this.a("description");
   }

   private vj a(String $$0) {
      return uv.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<ggu> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<ggw<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ggu.a a(List<ggw<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> ggu.a a(ggw<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public ggu.a a() {
         this.d = true;
         return this;
      }

      public ggu b() {
         ggu $$0 = new ggu(this.a, this.b, List.copyOf(this.c), this.d);
         if (ggu.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
