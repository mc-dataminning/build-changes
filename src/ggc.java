import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ggc {
   static final Map<String, ggc> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<ggc> a = Codec.STRING.comapFlatMap($$0 -> {
      ggc $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, ggc::a);
   private static final List<gge<?>> i = List.of(gge.a, gge.b, gge.c, gge.d, gge.e, gge.f, gge.g, gge.h, gge.m, gge.l);
   private static final List<gge<?>> j = Stream.concat(i.stream(), Stream.of(gge.i, gge.j, gge.k)).toList();
   public static final ggc b = a("world_loaded", "WorldLoaded").a(j).a(gge.n).a(gge.o).b();
   public static final ggc c = a("performance_metrics", "PerformanceMetrics").a(j).a(gge.r).a(gge.s).a(gge.t).a(gge.u).a(gge.v).a(gge.w).a().b();
   public static final ggc d = a("world_load_times", "WorldLoadTimes").a(j).a(gge.x).a(gge.y).a().b();
   public static final ggc e = a("world_unloaded", "WorldUnloaded").a(j).a(gge.p).a(gge.q).b();
   public static final ggc f = a("advancement_made", "AdvancementMade").a(j).a(gge.D).a(gge.E).a().b();
   public static final ggc g = a("game_load_times", "GameLoadTimes").a(i).a(gge.z).a(gge.A).a(gge.B).a(gge.C).a().b();
   private final String k;
   private final String l;
   private final List<gge<?>> m;
   private final boolean n;
   private final Codec<gfy> o;

   ggc(String $$0, String $$1, List<gge<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = ggf.a($$2).xmap($$0x -> new gfy(this, $$0x), gfy::b);
   }

   public static ggc.a a(String $$0, String $$1) {
      return new ggc.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gge<?>> b() {
      return this.m;
   }

   public Codec<gfy> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, ggf $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gge<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gge<T> $$0) {
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

   public static List<ggc> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gge<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ggc.a a(List<gge<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> ggc.a a(gge<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public ggc.a a() {
         this.d = true;
         return this;
      }

      public ggc b() {
         ggc $$0 = new ggc(this.a, this.b, List.copyOf(this.c), this.d);
         if (ggc.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
