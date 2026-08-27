import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ggp {
   static final Map<String, ggp> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<ggp> a = Codec.STRING.comapFlatMap($$0 -> {
      ggp $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, ggp::a);
   private static final List<ggr<?>> i = List.of(ggr.a, ggr.b, ggr.c, ggr.d, ggr.e, ggr.f, ggr.g, ggr.h, ggr.m, ggr.l);
   private static final List<ggr<?>> j = Stream.concat(i.stream(), Stream.of(ggr.i, ggr.j, ggr.k)).toList();
   public static final ggp b = a("world_loaded", "WorldLoaded").a(j).a(ggr.n).a(ggr.o).b();
   public static final ggp c = a("performance_metrics", "PerformanceMetrics").a(j).a(ggr.r).a(ggr.s).a(ggr.t).a(ggr.u).a(ggr.v).a(ggr.w).a().b();
   public static final ggp d = a("world_load_times", "WorldLoadTimes").a(j).a(ggr.x).a(ggr.y).a().b();
   public static final ggp e = a("world_unloaded", "WorldUnloaded").a(j).a(ggr.p).a(ggr.q).b();
   public static final ggp f = a("advancement_made", "AdvancementMade").a(j).a(ggr.D).a(ggr.E).a().b();
   public static final ggp g = a("game_load_times", "GameLoadTimes").a(i).a(ggr.z).a(ggr.A).a(ggr.B).a(ggr.C).a().b();
   private final String k;
   private final String l;
   private final List<ggr<?>> m;
   private final boolean n;
   private final Codec<ggl> o;

   ggp(String $$0, String $$1, List<ggr<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = ggs.a($$2).xmap($$0x -> new ggl(this, $$0x), ggl::b);
   }

   public static ggp.a a(String $$0, String $$1) {
      return new ggp.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<ggr<?>> b() {
      return this.m;
   }

   public Codec<ggl> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, ggs $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (ggr<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(ggr<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public vf e() {
      return this.a("title");
   }

   public vf f() {
      return this.a("description");
   }

   private vf a(String $$0) {
      return ur.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<ggp> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<ggr<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ggp.a a(List<ggr<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> ggp.a a(ggr<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public ggp.a a() {
         this.d = true;
         return this;
      }

      public ggp b() {
         ggp $$0 = new ggp(this.a, this.b, List.copyOf(this.c), this.d);
         if (ggp.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
